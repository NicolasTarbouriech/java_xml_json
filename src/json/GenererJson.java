package json;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;

public class GenererJson {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {

		ObjectMapper mapper = new ObjectMapper();

		CollectionType collec = mapper.getTypeFactory().constructCollectionType(List.class, Societe.class);
		
		List<Societe> liste_societe = mapper.readValue(new File(
				"C:\\Users\\tarbo\\Desktop\\Workspace Spring\\java_xml_json\\jsontest.json"),collec);
		
	
		mapper.writeValue(new File("C:/Users/tarbo/Desktop/Workspace Spring/java_xml_json/fichier.json"), liste_societe);

	}

}
