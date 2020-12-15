package java_xml_json.bean;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;



public class TestXml {
	public static void main(String[] args) throws JAXBException {

		JAXBContext jc = JAXBContext.newInstance(ListePays.class);
		Unmarshaller unmarshaller = jc.createUnmarshaller();

		ListePays racine = (ListePays) unmarshaller.unmarshal(new File("C:/Users/tarbo/Downloads/formatage.xml"));

		List<ListePays.Pays> listepays = racine.getPays();

		for (ListePays.Pays pays : listepays) {

			System.out.println("Nom du pays : " + pays.getNom());
			System.out.println("La date est le : " + pays.getDateDeReleve().getValue());
			System.out.println("Pour les données démographiques, la fécondité est de " + pays.getDonneesDemographiques().getFecondites().getValue() + " et ensuite la population  est de " + pays.getDonneesDemographiques().getPopulation().getValue());
			System.out.println("Pour les données économiques, la monnaie du pays est le : " + pays.getDonneesEconomiques().getMonnaie() + " et le pib de ce pays est de " + pays.getDonneesEconomiques().getPib().getValue());
			
		}

	}
}
