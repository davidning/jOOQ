//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.02.01 at 09:32:08 PM MEZ 
//


package org.jooq.util.jaxb;

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
 *       &lt;all>
 *         &lt;element name="jdbc" type="{http://www.jooq.org/xsd/jooq-codegen-2.0.4.xsd}Jdbc"/>
 *         &lt;element name="generator" type="{http://www.jooq.org/xsd/jooq-codegen-2.0.4.xsd}Generator"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "configuration")
public class Configuration {

    @XmlElement(required = true)
    protected Jdbc jdbc;
    @XmlElement(required = true)
    protected Generator generator;

    /**
     * Gets the value of the jdbc property.
     * 
     * @return
     *     possible object is
     *     {@link Jdbc }
     *     
     */
    public Jdbc getJdbc() {
        return jdbc;
    }

    /**
     * Sets the value of the jdbc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Jdbc }
     *     
     */
    public void setJdbc(Jdbc value) {
        this.jdbc = value;
    }

    /**
     * Gets the value of the generator property.
     * 
     * @return
     *     possible object is
     *     {@link Generator }
     *     
     */
    public Generator getGenerator() {
        return generator;
    }

    /**
     * Sets the value of the generator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Generator }
     *     
     */
    public void setGenerator(Generator value) {
        this.generator = value;
    }

}