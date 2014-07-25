package ws.biotea.ld2rdf.rdf.persistence.ao;

import java.net.URISyntaxException;


import ws.biotea.ld2rdf.rdf.model.ao.Selector;
import ws.biotea.ld2rdf.rdf.model.ao.StartEndElementSelector;
import ws.biotea.ld2rdf.util.GenerateMD5;
import ws.biotea.ld2rdf.util.Config;

import com.hp.hpl.jena.datatypes.xsd.XSDDatatype;
import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.rdf.model.AnonId;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.Resource;

import edu.stanford.smi.protegex.owl.jena.JenaOWLModel;

public class StartEndElementSelectorOWL implements SelectorDAO<StartEndElementSelector>{

	public Resource addSelector(StartEndElementSelector selector, String baseURL, Model model)
			throws URISyntaxException {
		Property opType = model.getProperty(Config.OP_RDF_TYPE);
		Property opOnResource = model.getProperty(Selector.SELECTOR_OP_ON_RESOURCE);
		Property dpStart = model.getProperty(StartEndElementSelector.START_END_ELEMENT_SELECTOR_DP_INIT);
		Property dpEnd = model.getProperty(StartEndElementSelector.START_END_ELEMENT_SELECTOR_DP_END);
		Property opLocator = model.getProperty(StartEndElementSelector.START_END_ELEMENT_SELECTOR_DP_LOCATOR);
		if (selector.getId() == null) {
			selector.setId(
				GenerateMD5.getInstance().getMD5Hash(
					selector.getElementURI() + "_" + selector.getStart() + "_" + 
					selector.getEnd()
				) + "_" + selector.getSelector().replaceAll("[^A-Za-z0-9]", ""));
		}
		//System.out.println("ID: " + selector.getId());
//		String resourceURI = baseURL + "Selector_" + selector.getId();
//		selector.setUri(new URI(resourceURI));
		if (selector.getDocumentId() != null) {
			selector.setNodeId(selector.getDocumentId() + "_Selector_" + selector.getId());
		} else {
			selector.setNodeId("Selector_" + selector.getId());
		}
		selector.setUri(null);
		
		Resource selectorClass = model.createResource(StartEndElementSelector.START_END_ELEMENT_SELECTOR_CLASS);
//		Resource selectorRes = model.createResource(selector.getUri().toString(), selectorClass);
		Resource selectorRes = model.createResource(new AnonId(selector.getNodeId()));
		selectorRes.addProperty(opType, selectorClass);
		
		Resource resDocument = model.createResource(selector.getDocument().getUri().toString()); 
		selectorRes.addProperty(opOnResource, resDocument);
		
		selectorRes.addProperty(dpStart, "" + selector.getStart(), XSDDatatype.XSDint);
		selectorRes.addProperty(dpEnd, "" + selector.getEnd(), XSDDatatype.XSDint);
		
		Resource resLocator = model.createResource(selector.getElementURI());
		model.add(selectorRes, opLocator, resLocator);
		return selectorRes;
	}

	public void deleteSelector(long id, JenaOWLModel owlModel) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void deleteAnnotationSelector(long id, JenaOWLModel owlModel)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	public Resource addSelector(StartEndElementSelector selector, OntModel model)
			throws URISyntaxException {
		// TODO Auto-generated method stub
		return null;
	}
}
