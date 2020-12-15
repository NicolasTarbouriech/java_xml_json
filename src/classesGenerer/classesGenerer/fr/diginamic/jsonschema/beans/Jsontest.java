
package classesGenerer.classesGenerer.fr.diginamic.jsonschema.beans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "nom",
    "siegeSocial",
    "fondateur",
    "chiffreDaffaires"
})
public class Jsontest {

    @JsonProperty("nom")
    private String nom;
    @JsonProperty("siegeSocial")
    private List<String> siegeSocial = new ArrayList<String>();
    @JsonProperty("fondateur")
    private List<Fondateur> fondateur = new ArrayList<Fondateur>();
    @JsonProperty("chiffreDaffaires")
    private List<ChiffreDaffaire> chiffreDaffaires = new ArrayList<ChiffreDaffaire>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("nom")
    public String getNom() {
        return nom;
    }

    @JsonProperty("nom")
    public void setNom(String nom) {
        this.nom = nom;
    }

    @JsonProperty("siegeSocial")
    public List<String> getSiegeSocial() {
        return siegeSocial;
    }

    @JsonProperty("siegeSocial")
    public void setSiegeSocial(List<String> siegeSocial) {
        this.siegeSocial = siegeSocial;
    }

    @JsonProperty("fondateur")
    public List<Fondateur> getFondateur() {
        return fondateur;
    }

    @JsonProperty("fondateur")
    public void setFondateur(List<Fondateur> fondateur) {
        this.fondateur = fondateur;
    }

    @JsonProperty("chiffreDaffaires")
    public List<ChiffreDaffaire> getChiffreDaffaires() {
        return chiffreDaffaires;
    }

    @JsonProperty("chiffreDaffaires")
    public void setChiffreDaffaires(List<ChiffreDaffaire> chiffreDaffaires) {
        this.chiffreDaffaires = chiffreDaffaires;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Jsontest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("nom");
        sb.append('=');
        sb.append(((this.nom == null)?"<null>":this.nom));
        sb.append(',');
        sb.append("siegeSocial");
        sb.append('=');
        sb.append(((this.siegeSocial == null)?"<null>":this.siegeSocial));
        sb.append(',');
        sb.append("fondateur");
        sb.append('=');
        sb.append(((this.fondateur == null)?"<null>":this.fondateur));
        sb.append(',');
        sb.append("chiffreDaffaires");
        sb.append('=');
        sb.append(((this.chiffreDaffaires == null)?"<null>":this.chiffreDaffaires));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.siegeSocial == null)? 0 :this.siegeSocial.hashCode()));
        result = ((result* 31)+((this.nom == null)? 0 :this.nom.hashCode()));
        result = ((result* 31)+((this.fondateur == null)? 0 :this.fondateur.hashCode()));
        result = ((result* 31)+((this.chiffreDaffaires == null)? 0 :this.chiffreDaffaires.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Jsontest) == false) {
            return false;
        }
        Jsontest rhs = ((Jsontest) other);
        return ((((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.siegeSocial == rhs.siegeSocial)||((this.siegeSocial!= null)&&this.siegeSocial.equals(rhs.siegeSocial))))&&((this.nom == rhs.nom)||((this.nom!= null)&&this.nom.equals(rhs.nom))))&&((this.fondateur == rhs.fondateur)||((this.fondateur!= null)&&this.fondateur.equals(rhs.fondateur))))&&((this.chiffreDaffaires == rhs.chiffreDaffaires)||((this.chiffreDaffaires!= null)&&this.chiffreDaffaires.equals(rhs.chiffreDaffaires))));
    }

}
