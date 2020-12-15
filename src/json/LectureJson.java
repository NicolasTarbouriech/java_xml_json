package json;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;

public class LectureJson {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {

		ObjectMapper mapper = new ObjectMapper();

		CollectionType collType = mapper.getTypeFactory().constructCollectionType(List.class, Societe.class);
		List<Societe> persons = mapper.readValue(new File("C:\\Users\\tarbo\\Desktop\\Workspace Spring\\java_xml_json\\jsontest.json"), collType);

		for (Societe p : persons) {
			System.out.println("L'entreprise que l'on va voir est : " + p.getNom());
		
			System.out.println("le siege social est : " + p.getSiegeSocial());
			System.out.println("");
			for (Fondateur f : p.getFondateur()) {
				System.out.println("le nom du pays du fondateur est : " + f.getPays());
				System.out.println("");
				System.out.println("la date de naissance du fondateur est : " + f.getDateDeNaissance());
				System.out.println("");
				System.out.println("le nom du lieu du fondateur est  " + f.getNom());
				System.out.println("");
				System.out.println("le lieu est : " + f.getLieu());
				System.out.println("");
				System.out.println("");
			}
			System.out.println("");
			for (ChiffreDaffaires ca : p.getChiffreDaffaires()) {
				System.out.println("L'annee de la valeur du Chiffre d'affaires est en : " + ca.getAnnee());
				System.out.println("");
				System.out.println("La valeur du Chiffres d'affaires cette année est de : " + ca.getValeur()
						+ " milliards d'euros.");
				System.out.println("");
			}
			System.out.println("--------------------------------------------");
		}
	}

}
