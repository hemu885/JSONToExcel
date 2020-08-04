
package claim.claimrules;

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
    "formName",
    "formAttributes"
})
public class SubmissionOverride {

    @JsonProperty("formName")
    private String formName;
    @JsonProperty("formAttributes")
    private List<FormAttribute> formAttributes = new ArrayList<FormAttribute>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("formName")
    public String getFormName() {
        return formName;
    }

    @JsonProperty("formName")
    public void setFormName(String formName) {
        this.formName = formName;
    }

    @JsonProperty("formAttributes")
    public List<FormAttribute> getFormAttributes() {
        return formAttributes;
    }

    @JsonProperty("formAttributes")
    public void setFormAttributes(List<FormAttribute> formAttributes) {
        this.formAttributes = formAttributes;
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
        sb.append(SubmissionOverride.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("formName");
        sb.append('=');
        sb.append(((this.formName == null)?"<null>":this.formName));
        sb.append(',');
        sb.append("formAttributes");
        sb.append('=');
        sb.append(((this.formAttributes == null)?"<null>":this.formAttributes));
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
        result = ((result* 31)+((this.formAttributes == null)? 0 :this.formAttributes.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.formName == null)? 0 :this.formName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SubmissionOverride) == false) {
            return false;
        }
        SubmissionOverride rhs = ((SubmissionOverride) other);
        return ((((this.formAttributes == rhs.formAttributes)||((this.formAttributes!= null)&&this.formAttributes.equals(rhs.formAttributes)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.formName == rhs.formName)||((this.formName!= null)&&this.formName.equals(rhs.formName))));
    }

}
