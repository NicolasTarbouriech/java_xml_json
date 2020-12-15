//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.12.15 at 11:29:29 AM CET 
//


package fr.diginamic.schema;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pays" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="date_de_releve"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                           &lt;attribute name="format" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="donnees_demographiques"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="population"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;simpleContent&gt;
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;double"&gt;
 *                                     &lt;attribute name="unite" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/simpleContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="fecondites"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;simpleContent&gt;
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;double"&gt;
 *                                     &lt;attribute name="unite" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/simpleContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="donnees_economiques"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="pib"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;simpleContent&gt;
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;integer"&gt;
 *                                     &lt;attribute name="unite" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/simpleContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="monnaie" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pays"
})
@XmlRootElement(name = "liste_pays")
public class ListePays {

    @XmlElement(required = true)
    protected List<ListePays.Pays> pays;

    /**
     * Gets the value of the pays property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pays property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPays().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListePays.Pays }
     * 
     * 
     */
    public List<ListePays.Pays> getPays() {
        if (pays == null) {
            pays = new ArrayList<ListePays.Pays>();
        }
        return this.pays;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="date_de_releve"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                 &lt;attribute name="format" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="donnees_demographiques"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="population"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;simpleContent&gt;
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;double"&gt;
     *                           &lt;attribute name="unite" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/simpleContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="fecondites"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;simpleContent&gt;
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;double"&gt;
     *                           &lt;attribute name="unite" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/simpleContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="donnees_economiques"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="pib"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;simpleContent&gt;
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;integer"&gt;
     *                           &lt;attribute name="unite" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/simpleContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="monnaie" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "nom",
        "dateDeReleve",
        "donneesDemographiques",
        "donneesEconomiques"
    })
    public static class Pays {

        @XmlElement(required = true)
        protected String nom;
        @XmlElement(name = "date_de_releve", required = true)
        protected ListePays.Pays.DateDeReleve dateDeReleve;
        @XmlElement(name = "donnees_demographiques", required = true)
        protected ListePays.Pays.DonneesDemographiques donneesDemographiques;
        @XmlElement(name = "donnees_economiques", required = true)
        protected ListePays.Pays.DonneesEconomiques donneesEconomiques;

        /**
         * Gets the value of the nom property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNom() {
            return nom;
        }

        /**
         * Sets the value of the nom property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNom(String value) {
            this.nom = value;
        }

        /**
         * Gets the value of the dateDeReleve property.
         * 
         * @return
         *     possible object is
         *     {@link ListePays.Pays.DateDeReleve }
         *     
         */
        public ListePays.Pays.DateDeReleve getDateDeReleve() {
            return dateDeReleve;
        }

        /**
         * Sets the value of the dateDeReleve property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListePays.Pays.DateDeReleve }
         *     
         */
        public void setDateDeReleve(ListePays.Pays.DateDeReleve value) {
            this.dateDeReleve = value;
        }

        /**
         * Gets the value of the donneesDemographiques property.
         * 
         * @return
         *     possible object is
         *     {@link ListePays.Pays.DonneesDemographiques }
         *     
         */
        public ListePays.Pays.DonneesDemographiques getDonneesDemographiques() {
            return donneesDemographiques;
        }

        /**
         * Sets the value of the donneesDemographiques property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListePays.Pays.DonneesDemographiques }
         *     
         */
        public void setDonneesDemographiques(ListePays.Pays.DonneesDemographiques value) {
            this.donneesDemographiques = value;
        }

        /**
         * Gets the value of the donneesEconomiques property.
         * 
         * @return
         *     possible object is
         *     {@link ListePays.Pays.DonneesEconomiques }
         *     
         */
        public ListePays.Pays.DonneesEconomiques getDonneesEconomiques() {
            return donneesEconomiques;
        }

        /**
         * Sets the value of the donneesEconomiques property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListePays.Pays.DonneesEconomiques }
         *     
         */
        public void setDonneesEconomiques(ListePays.Pays.DonneesEconomiques value) {
            this.donneesEconomiques = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *       &lt;attribute name="format" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/simpleContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class DateDeReleve {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "format")
            protected String format;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the format property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFormat() {
                return format;
            }

            /**
             * Sets the value of the format property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFormat(String value) {
                this.format = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="population"&gt;
         *           &lt;complexType&gt;
         *             &lt;simpleContent&gt;
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;double"&gt;
         *                 &lt;attribute name="unite" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *               &lt;/extension&gt;
         *             &lt;/simpleContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="fecondites"&gt;
         *           &lt;complexType&gt;
         *             &lt;simpleContent&gt;
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;double"&gt;
         *                 &lt;attribute name="unite" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *               &lt;/extension&gt;
         *             &lt;/simpleContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "population",
            "fecondites"
        })
        public static class DonneesDemographiques {

            @XmlElement(required = true)
            protected ListePays.Pays.DonneesDemographiques.Population population;
            @XmlElement(required = true)
            protected ListePays.Pays.DonneesDemographiques.Fecondites fecondites;

            /**
             * Gets the value of the population property.
             * 
             * @return
             *     possible object is
             *     {@link ListePays.Pays.DonneesDemographiques.Population }
             *     
             */
            public ListePays.Pays.DonneesDemographiques.Population getPopulation() {
                return population;
            }

            /**
             * Sets the value of the population property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListePays.Pays.DonneesDemographiques.Population }
             *     
             */
            public void setPopulation(ListePays.Pays.DonneesDemographiques.Population value) {
                this.population = value;
            }

            /**
             * Gets the value of the fecondites property.
             * 
             * @return
             *     possible object is
             *     {@link ListePays.Pays.DonneesDemographiques.Fecondites }
             *     
             */
            public ListePays.Pays.DonneesDemographiques.Fecondites getFecondites() {
                return fecondites;
            }

            /**
             * Sets the value of the fecondites property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListePays.Pays.DonneesDemographiques.Fecondites }
             *     
             */
            public void setFecondites(ListePays.Pays.DonneesDemographiques.Fecondites value) {
                this.fecondites = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;simpleContent&gt;
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;double"&gt;
             *       &lt;attribute name="unite" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *     &lt;/extension&gt;
             *   &lt;/simpleContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class Fecondites {

                @XmlValue
                protected double value;
                @XmlAttribute(name = "unite")
                protected String unite;

                /**
                 * Gets the value of the value property.
                 * 
                 */
                public double getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 */
                public void setValue(double value) {
                    this.value = value;
                }

                /**
                 * Gets the value of the unite property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUnite() {
                    return unite;
                }

                /**
                 * Sets the value of the unite property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUnite(String value) {
                    this.unite = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;simpleContent&gt;
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;double"&gt;
             *       &lt;attribute name="unite" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *     &lt;/extension&gt;
             *   &lt;/simpleContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class Population {

                @XmlValue
                protected double value;
                @XmlAttribute(name = "unite")
                protected String unite;

                /**
                 * Gets the value of the value property.
                 * 
                 */
                public double getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 */
                public void setValue(double value) {
                    this.value = value;
                }

                /**
                 * Gets the value of the unite property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUnite() {
                    return unite;
                }

                /**
                 * Sets the value of the unite property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUnite(String value) {
                    this.unite = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="pib"&gt;
         *           &lt;complexType&gt;
         *             &lt;simpleContent&gt;
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;integer"&gt;
         *                 &lt;attribute name="unite" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *               &lt;/extension&gt;
         *             &lt;/simpleContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="monnaie" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "pib",
            "monnaie"
        })
        public static class DonneesEconomiques {

            @XmlElement(required = true)
            protected ListePays.Pays.DonneesEconomiques.Pib pib;
            @XmlElement(required = true)
            protected String monnaie;

            /**
             * Gets the value of the pib property.
             * 
             * @return
             *     possible object is
             *     {@link ListePays.Pays.DonneesEconomiques.Pib }
             *     
             */
            public ListePays.Pays.DonneesEconomiques.Pib getPib() {
                return pib;
            }

            /**
             * Sets the value of the pib property.
             * 
             * @param value
             *     allowed object is
             *     {@link ListePays.Pays.DonneesEconomiques.Pib }
             *     
             */
            public void setPib(ListePays.Pays.DonneesEconomiques.Pib value) {
                this.pib = value;
            }

            /**
             * Gets the value of the monnaie property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMonnaie() {
                return monnaie;
            }

            /**
             * Sets the value of the monnaie property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMonnaie(String value) {
                this.monnaie = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;simpleContent&gt;
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;integer"&gt;
             *       &lt;attribute name="unite" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *     &lt;/extension&gt;
             *   &lt;/simpleContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class Pib {

                @XmlValue
                protected BigInteger value;
                @XmlAttribute(name = "unite")
                protected String unite;

                /**
                 * Gets the value of the value property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setValue(BigInteger value) {
                    this.value = value;
                }

                /**
                 * Gets the value of the unite property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUnite() {
                    return unite;
                }

                /**
                 * Sets the value of the unite property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUnite(String value) {
                    this.unite = value;
                }

            }

        }

    }

}
