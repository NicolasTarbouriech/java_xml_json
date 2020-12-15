
package classesGenerer.classesGenerer.fr.diginamic.jsonschema.beans;

import java.util.HashMap;
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
    "date_naissance",
    "lieu",
    "pays"
})
public class Fondateur {

    @JsonProperty("nom")
    private String nom;
    @JsonProperty("date_naissance")
    private String dateNaissance;
    @JsonProperty("lieu")
    private String lieu;
    @JsonProperty("pays")
    private String pays;
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

    @JsonProperty("date_naissance")
    public String getDateNaissance() {
        return dateNaissance;
    }

    @JsonProperty("date_naissance")
    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    @JsonProperty("lieu")
    public String getLieu() {
        return lieu;
    }

    @JsonProperty("lieu")
    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    @JsonProperty("pays")
    public String getPays() {
        return pays;
    }

    @JsonProperty("pays")
    public void setPays(String pays) {
        this.pays = pays;
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
        sb.append(Fondateur.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("nom");
        sb.append('=');
        sb.append(((this.nom == null)?"<null>":this.nom));
        sb.append(',');
        sb.append("dateNaissance");
        sb.append('=');
        sb.append(((this.dateNaissance == null)?"<null>":this.dateNaissance));
        sb.append(',');
        sb.append("lieu");
        sb.append('=');
        sb.append(((this.lieu == null)?"<null>":this.lieu));
        sb.append(',');
        sb.append("pays");
        sb.append('=');
        sb.append(((this.pays == null)?"<null>":this.pays));
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
        result = ((result* 31)+((this.nom == null)? 0 :this.nom.hashCode()));
        result = ((result* 31)+((this.dateNaissance == null)? 0 :this.dateNaissance.hashCode()));
        result = ((result* 31)+((this.lieu == null)? 0 :this.lieu.hashCode()));
        result = ((result* 31)+((this.pays == null)? 0 :this.pays.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Fondateur) == false) {
            return false;
        }
        Fondateur rhs = ((Fondateur) other);
        return ((((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.nom == rhs.nom)||((this.nom!= null)&&this.nom.equals(rhs.nom))))&&((this.dateNaissance == rhs.dateNaissance)||((this.dateNaissance!= null)&&this.dateNaissance.equals(rhs.dateNaissance))))&&((this.lieu == rhs.lieu)||((this.lieu!= null)&&this.lieu.equals(rhs.lieu))))&&((this.pays == rhs.pays)||((this.pays!= null)&&this.pays.equals(rhs.pays))));
    }

}
