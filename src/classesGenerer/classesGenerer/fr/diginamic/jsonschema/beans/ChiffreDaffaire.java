
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
    "annee",
    "valeur"
})
public class ChiffreDaffaire {

    @JsonProperty("annee")
    private Integer annee;
    @JsonProperty("valeur")
    private Double valeur;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("annee")
    public Integer getAnnee() {
        return annee;
    }

    @JsonProperty("annee")
    public void setAnnee(Integer annee) {
        this.annee = annee;
    }

    @JsonProperty("valeur")
    public Double getValeur() {
        return valeur;
    }

    @JsonProperty("valeur")
    public void setValeur(Double valeur) {
        this.valeur = valeur;
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
        sb.append(ChiffreDaffaire.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("annee");
        sb.append('=');
        sb.append(((this.annee == null)?"<null>":this.annee));
        sb.append(',');
        sb.append("valeur");
        sb.append('=');
        sb.append(((this.valeur == null)?"<null>":this.valeur));
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
        result = ((result* 31)+((this.annee == null)? 0 :this.annee.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.valeur == null)? 0 :this.valeur.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ChiffreDaffaire) == false) {
            return false;
        }
        ChiffreDaffaire rhs = ((ChiffreDaffaire) other);
        return ((((this.annee == rhs.annee)||((this.annee!= null)&&this.annee.equals(rhs.annee)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.valeur == rhs.valeur)||((this.valeur!= null)&&this.valeur.equals(rhs.valeur))));
    }

}
