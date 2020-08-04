
package claim.claimrules;

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
    "id",
    "chargeable",
    "printable"
})
public class Modifier {

    @JsonProperty("id")
    private String id;
    @JsonProperty("chargeable")
    private String chargeable;
    @JsonProperty("printable")
    private String printable;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("chargeable")
    public String getChargeable() {
        return chargeable;
    }

    @JsonProperty("chargeable")
    public void setChargeable(String chargeable) {
        this.chargeable = chargeable;
    }

    @JsonProperty("printable")
    public String getPrintable() {
        return printable;
    }

    @JsonProperty("printable")
    public void setPrintable(String printable) {
        this.printable = printable;
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
        sb.append(Modifier.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("chargeable");
        sb.append('=');
        sb.append(((this.chargeable == null)?"<null>":this.chargeable));
        sb.append(',');
        sb.append("printable");
        sb.append('=');
        sb.append(((this.printable == null)?"<null>":this.printable));
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
        result = ((result* 31)+((this.chargeable == null)? 0 :this.chargeable.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.printable == null)? 0 :this.printable.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Modifier) == false) {
            return false;
        }
        Modifier rhs = ((Modifier) other);
        return (((((this.chargeable == rhs.chargeable)||((this.chargeable!= null)&&this.chargeable.equals(rhs.chargeable)))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.printable == rhs.printable)||((this.printable!= null)&&this.printable.equals(rhs.printable))));
    }

}
