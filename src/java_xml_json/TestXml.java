package java_xml_json;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;


public class TestXml {
	public static void main(String[] args) throws JAXBException {

		JAXBContext jc = JAXBContext.newInstance(Liste_pays.class);
		Unmarshaller unmarshaller = jc.createUnmarshaller();

		Liste_pays racine = (Liste_pays) unmarshaller.unmarshal(new File("C:/Users/tarbo/Downloads/formatage.xml"));

		List<Pays> listepays = racine.getListPays();

		for (Pays pays : listepays) {

			System.out.println("Nom pays : " + pays.getNom());
			System.out.println("la date est le : " + pays.getDate_de_releve());
			System.out.println("Donnes démographiques, la fecondite est de " + pays.getDonnee_demographiques().getFecondites() + " et ensuite la population  est de " + pays.getDonnee_demographiques().getPopulation());
			System.out.println("Donnes economiques, la monnaie du pays est le : " + pays.getDonnee_economiques().getMonnaie() + " et le pib de ce pays est de " + pays.getDonnee_economiques().getPib());
			
		}

	}
}
