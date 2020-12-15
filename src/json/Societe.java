package json;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Societe {

	protected String nom;
	@JsonProperty("siegeSocial")
	protected List<String> siegeSocial;
	@JsonProperty("fondateur")
	protected List<Fondateur> fondateur;
	@JsonProperty("chiffreDaffaires")
	protected List<ChiffreDaffaires> chiffreDaffaires;
	
	
	
	public Societe(String nom) {
		super();
		this.nom = nom;
	}
	public Societe() {
		// TODO Auto-generated constructor stub
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public List<String> getSiegeSocial() {
		return siegeSocial;
	}
	public void setSiegeSocial(List<String> siegeSocial) {
		this.siegeSocial = siegeSocial;
	}
	public List<Fondateur> getFondateur() {
		return fondateur;
	}
	public void setFondateur(List<Fondateur> fondateur) {
		this.fondateur = fondateur;
	}
	public List<ChiffreDaffaires> getChiffreDaffaires() {
		return chiffreDaffaires;
	}
	public void setChiffreDaffaires(List<ChiffreDaffaires> chiffreDaffaires) {
		this.chiffreDaffaires = chiffreDaffaires;
	}
	
	
	
	
}
