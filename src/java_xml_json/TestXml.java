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
			System.out.println(pays.getDonnee_demographiques());
			System.out.println("Donnes démographiuqes : " + pays.getDonnee_demographiques().getFecondites() + " et ensuite la population " + pays.getDonnee_demographiques().getPopulation());
			System.out.println("Donnes economiques : " + pays.getDonnee_economiques().getMonnaie() + " et le pib de ce pays est  " + pays.getDonnee_economiques().getPib());
			
		}

	}
}
