/**
 * 
 */
package ws.biotea.ld2rdf.rdf.persistence.ao;

import java.net.URISyntaxException;


import ws.biotea.ld2rdf.rdf.model.ao.OffsetRangeTextSelector;
import ws.biotea.ld2rdf.rdf.model.ao.Selector;
import ws.biotea.ld2rdf.rdf.model.ao.StartEndElementSelector;
import ws.biotea.ld2rdf.util.Config;
import ws.biotea.ld2rdf.util.GenerateMD5;

import com.hp.hpl.jena.datatypes.xsd.XSDDatatype;
import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.rdf.model.AnonId;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.Resource;

import edu.stanford.smi.protegex.owl.jena.JenaOWLModel;
import edu.stanford.smi.protegex.owl.model.OWLIndividual;

/**
 * @author leylajael
 *
 */
public class OffsetRangeTextSelectorOWL implements SelectorDAO<OffsetRangeTextSelector>{
	/**
	 * Constructor.
	 * @param model Ontology model.
	 */
	public OffsetRangeTextSelectorOWL() {
	}
	public Resource addSelector(OffsetRangeTextSelector selector, String baseURL, Model model) throws URISyntaxException {
		Property opType = model.getProperty(Config.OP_RDF_TYPE);
		Property opOnResource = model.getProperty(Selector.SELECTOR_OP_ON_RESOURCE);
		Property dpOffset = model.getProperty(OffsetRangeTextSelector.OFFSET_RANGE_TEXT_SELECTOR_DP_OFFSET);
		Property dpRange = model.getProperty(OffsetRangeTextSelector.OFFSET_RANGE_TEXT_SELECTOR_DP_RANGE);
		Property opLocator = model.getProperty(StartEndElementSelector.START_END_ELEMENT_SELECTOR_DP_LOCATOR);
		
		if (selector.getId() == null) {
			selector.setId(
				GenerateMD5.getInstance().getMD5Hash(
					selector.getElementURI() + "_" + selector.getOffset() + "_" + 
					selector.getRange()
				) + "_" + selector.getSelector().replaceAll("[^A-Za-z0-9]", ""));
		}
		if (selector.getDocumentId() != null) {
			selector.setNodeId(selector.getDocumentId() + "_Selector_" + selector.getId());
		} else {
			selector.setNodeId("Selector_" + selector.getId());
		}
		selector.setUri(null);
		
		//Selector
		Resource selectorClass = model.createResource(OffsetRangeTextSelector.OFFSET_RANGE_TEXT_SELECTOR_CLASS);
		Resource selectorRes = model.createResource(new AnonId(selector.getNodeId()));
		selectorRes.addProperty(opType, selectorClass);
		
		Resource resDocument = model.createResource(selector.getDocument().getUri().toString()); 
		selectorRes.addProperty(opOnResource, resDocument);
		
		selectorRes.addProperty(dpOffset, "" + selector.getOffset(), XSDDatatype.XSDint);
		selectorRes.addProperty(dpRange, "" + selector.getRange(), XSDDatatype.XSDint);
		
		Resource resLocator = model.createResource(selector.getElementURI());
		model.add(selectorRes, opLocator, resLocator);
		return selectorRes;	
	}
	/**
	 * Adds an offsetRangeTextSelector to the model.
	 * @param orTextSelector
	 * @return
	 * @throws URISyntaxException
	 */
	public Resource addSelector(OffsetRangeTextSelector selector, OntModel model) throws URISyntaxException {
		// TODO Auto-generated method stub
		return null;	
	}
	
	public void deleteSelector(long id, JenaOWLModel owlModel) throws Exception {
		String resourceURI = LDConfiguration.LD_BASE + "ORTextSelector_" + id;
		//Delete
		OWLIndividual ind = owlModel.getOWLIndividual(resourceURI);
		ind.delete();
	}
	public void deleteAnnotationSelector(long id, JenaOWLModel owlModel)
			throws Exception {
		//TODO
		/*ConnectionLDModel conn = new ConnectionLDModel();
		OntModel model = conn.openJenaModel();
		
		String queryString = 
			Prefix.PREFIXES.getValue() +
			" SELECT ?selector  " +
			" WHERE {" +
			" ?selector a " + Prefix.AO_SELECTORS_NS.getValue() + ":OffsetRangeTextSelector . " +
			" ?selector " + Prefix.AO_CORE_NS.getValue() + ":xpointer 'XXX'" +   
			" } "; 
		System.out.println("BIOTEA - deleteAnnotationSelector " + queryString);
		
		Query query = QueryFactory.create(queryString, Syntax.syntaxARQ);

		// Execute the query and obtain results
		QueryExecution qe = QueryExecutionFactory.create(query, model);
		ResultSet rs = qe.execSelect();
		
		// Output query results	
		//ResultSetFormatter.out(System.out, rs, query);
		while (rs.hasNext()) {
			QuerySolution qs = rs.nextSolution(); //id, creator annotation <>, date
			String uri = qs.getResource("selector").getURI();
			OWLIndividual ind = owlModel.getOWLIndividual(uri);
			ind.delete();
		}
		// Important - free up resources used running the query
		qe.close();*/
	}	
}
