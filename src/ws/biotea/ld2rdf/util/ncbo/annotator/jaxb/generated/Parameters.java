//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.10.29 at 08:42:42 PM BST 
//


package ws.biotea.ld2rdf.util.ncbo.annotator.jaxb.generated;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}longestOnly"/>
 *         &lt;element ref="{}wholeWordOnly"/>
 *         &lt;element ref="{}filterNumber"/>
 *         &lt;element ref="{}withDefaultStopWords"/>
 *         &lt;element ref="{}isStopWordsCaseSenstive"/>
 *         &lt;element ref="{}withSynonyms"/>
 *         &lt;element ref="{}minTermSize"/>
 *         &lt;element ref="{}withContext"/>
 *         &lt;element ref="{}semanticTypes"/>
 *         &lt;element ref="{}stopWords"/>
 *         &lt;element ref="{}ontologiesToExpand"/>
 *         &lt;element ref="{}ontologiesToKeepInResult"/>
 *         &lt;element ref="{}isVirtualOntologyId"/>
 *         &lt;element ref="{}levelMax"/>
 *         &lt;element ref="{}mappingTypes"/>
 *         &lt;element ref="{}textToAnnotate"/>
 *         &lt;element ref="{}outputFormat"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "longestOnly",
    "wholeWordOnly",
    "filterNumber",
    "withDefaultStopWords",
    "isStopWordsCaseSenstive",
    "withSynonyms",
    "minTermSize",
    "withContext",
    "semanticTypes",
    "stopWords",
    "ontologiesToExpand",
    "ontologiesToKeepInResult",
    "isVirtualOntologyId",
    "levelMax",
    "mappingTypes",
    "textToAnnotate",
    "outputFormat"
})
@XmlRootElement(name = "parameters")
public class Parameters {

    protected boolean longestOnly;
    protected boolean wholeWordOnly;
    protected boolean filterNumber;
    protected boolean withDefaultStopWords;
    protected boolean isStopWordsCaseSenstive;
    protected boolean withSynonyms;
    @XmlElement(required = true)
    protected BigInteger minTermSize;
    protected boolean withContext;
    @XmlElement(required = true)
    protected SemanticTypes semanticTypes;
    @XmlElement(required = true)
    protected StopWords stopWords;
    @XmlElement(required = true)
    protected OntologiesToExpand ontologiesToExpand;
    @XmlElement(required = true)
    protected OntologiesToKeepInResult ontologiesToKeepInResult;
    protected boolean isVirtualOntologyId;
    @XmlElement(required = true)
    protected BigInteger levelMax;
    @XmlElement(required = true)
    protected MappingTypes mappingTypes;
    @XmlElement(required = true)
    protected String textToAnnotate;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String outputFormat;

    /**
     * Gets the value of the longestOnly property.
     * 
     */
    public boolean isLongestOnly() {
        return longestOnly;
    }

    /**
     * Sets the value of the longestOnly property.
     * 
     */
    public void setLongestOnly(boolean value) {
        this.longestOnly = value;
    }

    /**
     * Gets the value of the wholeWordOnly property.
     * 
     */
    public boolean isWholeWordOnly() {
        return wholeWordOnly;
    }

    /**
     * Sets the value of the wholeWordOnly property.
     * 
     */
    public void setWholeWordOnly(boolean value) {
        this.wholeWordOnly = value;
    }

    /**
     * Gets the value of the filterNumber property.
     * 
     */
    public boolean isFilterNumber() {
        return filterNumber;
    }

    /**
     * Sets the value of the filterNumber property.
     * 
     */
    public void setFilterNumber(boolean value) {
        this.filterNumber = value;
    }

    /**
     * Gets the value of the withDefaultStopWords property.
     * 
     */
    public boolean isWithDefaultStopWords() {
        return withDefaultStopWords;
    }

    /**
     * Sets the value of the withDefaultStopWords property.
     * 
     */
    public void setWithDefaultStopWords(boolean value) {
        this.withDefaultStopWords = value;
    }

    /**
     * Gets the value of the isStopWordsCaseSenstive property.
     * 
     */
    public boolean isIsStopWordsCaseSenstive() {
        return isStopWordsCaseSenstive;
    }

    /**
     * Sets the value of the isStopWordsCaseSenstive property.
     * 
     */
    public void setIsStopWordsCaseSenstive(boolean value) {
        this.isStopWordsCaseSenstive = value;
    }

    /**
     * Gets the value of the withSynonyms property.
     * 
     */
    public boolean isWithSynonyms() {
        return withSynonyms;
    }

    /**
     * Sets the value of the withSynonyms property.
     * 
     */
    public void setWithSynonyms(boolean value) {
        this.withSynonyms = value;
    }

    /**
     * Gets the value of the minTermSize property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinTermSize() {
        return minTermSize;
    }

    /**
     * Sets the value of the minTermSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinTermSize(BigInteger value) {
        this.minTermSize = value;
    }

    /**
     * Gets the value of the withContext property.
     * 
     */
    public boolean isWithContext() {
        return withContext;
    }

    /**
     * Sets the value of the withContext property.
     * 
     */
    public void setWithContext(boolean value) {
        this.withContext = value;
    }

    /**
     * Gets the value of the semanticTypes property.
     * 
     * @return
     *     possible object is
     *     {@link SemanticTypes }
     *     
     */
    public SemanticTypes getSemanticTypes() {
        return semanticTypes;
    }

    /**
     * Sets the value of the semanticTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SemanticTypes }
     *     
     */
    public void setSemanticTypes(SemanticTypes value) {
        this.semanticTypes = value;
    }

    /**
     * Gets the value of the stopWords property.
     * 
     * @return
     *     possible object is
     *     {@link StopWords }
     *     
     */
    public StopWords getStopWords() {
        return stopWords;
    }

    /**
     * Sets the value of the stopWords property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopWords }
     *     
     */
    public void setStopWords(StopWords value) {
        this.stopWords = value;
    }

    /**
     * Gets the value of the ontologiesToExpand property.
     * 
     * @return
     *     possible object is
     *     {@link OntologiesToExpand }
     *     
     */
    public OntologiesToExpand getOntologiesToExpand() {
        return ontologiesToExpand;
    }

    /**
     * Sets the value of the ontologiesToExpand property.
     * 
     * @param value
     *     allowed object is
     *     {@link OntologiesToExpand }
     *     
     */
    public void setOntologiesToExpand(OntologiesToExpand value) {
        this.ontologiesToExpand = value;
    }

    /**
     * Gets the value of the ontologiesToKeepInResult property.
     * 
     * @return
     *     possible object is
     *     {@link OntologiesToKeepInResult }
     *     
     */
    public OntologiesToKeepInResult getOntologiesToKeepInResult() {
        return ontologiesToKeepInResult;
    }

    /**
     * Sets the value of the ontologiesToKeepInResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link OntologiesToKeepInResult }
     *     
     */
    public void setOntologiesToKeepInResult(OntologiesToKeepInResult value) {
        this.ontologiesToKeepInResult = value;
    }

    /**
     * Gets the value of the isVirtualOntologyId property.
     * 
     */
    public boolean isIsVirtualOntologyId() {
        return isVirtualOntologyId;
    }

    /**
     * Sets the value of the isVirtualOntologyId property.
     * 
     */
    public void setIsVirtualOntologyId(boolean value) {
        this.isVirtualOntologyId = value;
    }

    /**
     * Gets the value of the levelMax property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLevelMax() {
        return levelMax;
    }

    /**
     * Sets the value of the levelMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLevelMax(BigInteger value) {
        this.levelMax = value;
    }

    /**
     * Gets the value of the mappingTypes property.
     * 
     * @return
     *     possible object is
     *     {@link MappingTypes }
     *     
     */
    public MappingTypes getMappingTypes() {
        return mappingTypes;
    }

    /**
     * Sets the value of the mappingTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link MappingTypes }
     *     
     */
    public void setMappingTypes(MappingTypes value) {
        this.mappingTypes = value;
    }

    /**
     * Gets the value of the textToAnnotate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextToAnnotate() {
        return textToAnnotate;
    }

    /**
     * Sets the value of the textToAnnotate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextToAnnotate(String value) {
        this.textToAnnotate = value;
    }

    /**
     * Gets the value of the outputFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputFormat() {
        return outputFormat;
    }

    /**
     * Sets the value of the outputFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputFormat(String value) {
        this.outputFormat = value;
    }

}
