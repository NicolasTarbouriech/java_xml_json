package old;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)

@XmlRootElement(name = "donnees_demographiques")

public class DonneeDemographiques {

	@XmlElement
	protected double population;
	
	@XmlElement
	protected double fecondites;

	public double getPopulation() {
		return population;
	}

	public void setPopulation(double population) {
		this.population = population;
	}

	public double getFecondites() {
		return fecondites;
	}

	public void setFecondite(double fecondites) {
		this.fecondites = fecondites;
	}
	
	

}
