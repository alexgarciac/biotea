/**
 * 
 */
package ws.biotea.ld2rdf.rdf.model.ao;

import ws.biotea.ld2rdf.util.Prefix;


/**
 * @author leylajael
 *
 */
public class Qualifier extends Annotation {
	private static final long serialVersionUID = 1L;
	/* OWL Descriptors */
	public final static String ANNOTATION_CLASS = Prefix.AO_TYPES.getURL() + "Qualifier";
	public final static String ANNOTATION_ID = "Qualifier_";
	public final static String ANNOTATION_TYPE = "Qualifier";
}
