package json;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ChiffreDaffaires {
	@JsonProperty("annee")
	protected Integer annee;
	@JsonProperty("valeur")
	protected Double valeur;

	public ChiffreDaffaires(Integer annee, Double valeur) {
		super();
		this.annee = annee;
		this.valeur = valeur;
	}

	public ChiffreDaffaires() {
		// TODO Auto-generated constructor stub
	}

	public Integer getAnnee() {
		return annee;
	}

	public void setAnnee(Integer annee) {
		this.annee = annee;
	}

	public Double getValeur() {
		return valeur;
	}

	public void setValeur(Double valeur) {
		this.valeur = valeur;
	}

}
