package java_xml_json;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "pays")
public class Pays {

	@XmlElement
	protected String nom;

	@XmlElement
	protected String date_de_releve;
	@XmlElement(name="donnees_demographiques")
	protected DonneeDemographiques donnee_demographiques;
	@XmlElement(name="donnees_economiques")
	protected DonneeEconomiques donnee_economiques;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDate_de_releve() {
		return date_de_releve;
	}

	public void setDate_de_releve(String date_de_releve) {
		this.date_de_releve = date_de_releve;
	}

	
	public DonneeDemographiques getDonnee_demographiques() {
		return donnee_demographiques;
	}

	public void setDonnee_demographiques(DonneeDemographiques donnee_demographiques) {
		this.donnee_demographiques = donnee_demographiques;
	}

	public DonneeEconomiques getDonnee_economiques() {
		return donnee_economiques;
	}

	public void setDonnee_economiques(DonneeEconomiques donnee_economiques) {
		this.donnee_economiques = donnee_economiques;
	}

}
