//
// This file was pubmed.openAccess.jaxb.generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.06.04 at 07:58:30 PM BST 
//


package pubmed.openAccess.jaxb.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{}article-title"/>
 *         &lt;element ref="{}subtitle" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}trans-title-group" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}alt-title" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}fn-group" minOccurs="0"/>
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
    "articleTitle",
    "subtitles",
    "transTitleGroups",
    "altTitles",
    "fnGroup"
})
@XmlRootElement(name = "title-group")
public class TitleGroup {

    @XmlElement(name = "article-title", required = true)
    protected ArticleTitle articleTitle;
    @XmlElement(name = "subtitle")
    protected List<Subtitle> subtitles;
    @XmlElement(name = "trans-title-group")
    protected List<TransTitleGroup> transTitleGroups;
    @XmlElement(name = "alt-title")
    protected List<AltTitle> altTitles;
    @XmlElement(name = "fn-group")
    protected FnGroup fnGroup;

    /**
     * Gets the value of the articleTitle property.
     * 
     * @return
     *     possible object is
     *     {@link ArticleTitle }
     *     
     */
    public ArticleTitle getArticleTitle() {
        return articleTitle;
    }

    /**
     * Sets the value of the articleTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArticleTitle }
     *     
     */
    public void setArticleTitle(ArticleTitle value) {
        this.articleTitle = value;
    }

    /**
     * Gets the value of the subtitles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subtitles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubtitles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Subtitle }
     * 
     * 
     */
    public List<Subtitle> getSubtitles() {
        if (subtitles == null) {
            subtitles = new ArrayList<Subtitle>();
        }
        return this.subtitles;
    }

    /**
     * Gets the value of the transTitleGroups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transTitleGroups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransTitleGroups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransTitleGroup }
     * 
     * 
     */
    public List<TransTitleGroup> getTransTitleGroups() {
        if (transTitleGroups == null) {
            transTitleGroups = new ArrayList<TransTitleGroup>();
        }
        return this.transTitleGroups;
    }

    /**
     * Gets the value of the altTitles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the altTitles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAltTitles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AltTitle }
     * 
     * 
     */
    public List<AltTitle> getAltTitles() {
        if (altTitles == null) {
            altTitles = new ArrayList<AltTitle>();
        }
        return this.altTitles;
    }

    /**
     * Gets the value of the fnGroup property.
     * 
     * @return
     *     possible object is
     *     {@link FnGroup }
     *     
     */
    public FnGroup getFnGroup() {
        return fnGroup;
    }

    /**
     * Sets the value of the fnGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link FnGroup }
     *     
     */
    public void setFnGroup(FnGroup value) {
        this.fnGroup = value;
    }

}
