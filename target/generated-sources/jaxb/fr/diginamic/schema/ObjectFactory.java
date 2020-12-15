//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.12.15 at 03:46:35 PM CET 
//


package fr.diginamic.schema;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fr.diginamic.schema package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.diginamic.schema
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListePays }
     * 
     */
    public ListePays createListePays() {
        return new ListePays();
    }

    /**
     * Create an instance of {@link ListePays.Pays }
     * 
     */
    public ListePays.Pays createListePaysPays() {
        return new ListePays.Pays();
    }

    /**
     * Create an instance of {@link ListePays.Pays.DonneesEconomiques }
     * 
     */
    public ListePays.Pays.DonneesEconomiques createListePaysPaysDonneesEconomiques() {
        return new ListePays.Pays.DonneesEconomiques();
    }

    /**
     * Create an instance of {@link ListePays.Pays.DonneesDemographiques }
     * 
     */
    public ListePays.Pays.DonneesDemographiques createListePaysPaysDonneesDemographiques() {
        return new ListePays.Pays.DonneesDemographiques();
    }

    /**
     * Create an instance of {@link ListePays.Pays.DateDeReleve }
     * 
     */
    public ListePays.Pays.DateDeReleve createListePaysPaysDateDeReleve() {
        return new ListePays.Pays.DateDeReleve();
    }

    /**
     * Create an instance of {@link ListePays.Pays.DonneesEconomiques.Pib }
     * 
     */
    public ListePays.Pays.DonneesEconomiques.Pib createListePaysPaysDonneesEconomiquesPib() {
        return new ListePays.Pays.DonneesEconomiques.Pib();
    }

    /**
     * Create an instance of {@link ListePays.Pays.DonneesDemographiques.Population }
     * 
     */
    public ListePays.Pays.DonneesDemographiques.Population createListePaysPaysDonneesDemographiquesPopulation() {
        return new ListePays.Pays.DonneesDemographiques.Population();
    }

    /**
     * Create an instance of {@link ListePays.Pays.DonneesDemographiques.Fecondites }
     * 
     */
    public ListePays.Pays.DonneesDemographiques.Fecondites createListePaysPaysDonneesDemographiquesFecondites() {
        return new ListePays.Pays.DonneesDemographiques.Fecondites();
    }

}
