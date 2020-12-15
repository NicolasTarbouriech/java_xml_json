package old;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)

@XmlRootElement(name = "donnees_economiques")

public class DonneeEconomiques {

	@XmlElement
	protected int pib;
	
	@XmlElement
	protected String monnaie;

	public int getPib() {
		return pib;
	}

	public void setPib(int pib) {
		this.pib = pib;
	}

	public String getMonnaie() {
		return monnaie;
	}

	public void setMonnaie(String monnaie) {
		this.monnaie = monnaie;
	}

}
