package old;

import java.io.File;
import java.time.LocalDate;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class testGenererXML {

	public static void main(String[] args) throws JAXBException {

		JAXBContext jc = JAXBContext.newInstance(Liste_pays.class);
		Marshaller marshaller = jc.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

		Liste_pays liste_pays = new Liste_pays();

		Pays pays = new Pays("Allemagne");

		liste_pays.getListPays().add(pays);
		pays.setDate_de_releve(LocalDate.of(2020, 8, 30));
		File os = new File("C:/Users/tarbo/Desktop/liste_pays.xml");

		marshaller.marshal(liste_pays, os);

	}

}
