package json;

import java.util.List;

public class Societe {

	protected String nom;
	protected List<String> siegeSocial;
	protected List<Fondateur> fondateur;
	protected List<ChiffreDaffaires> chiffreDaffaires;
	
	
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
