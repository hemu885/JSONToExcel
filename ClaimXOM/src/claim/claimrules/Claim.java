
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
    "serviceDate",
    "claimFormat",
    "reserved19Note",
    "activeInsurancePrefix",
    "similarIllnessDate",
    "sterilization",
    "invoiceId",
    "charges"
})
public class Claim {

    @JsonProperty("serviceDate")
    private String serviceDate;
    @JsonProperty("claimFormat")
    private String claimFormat;
    @JsonProperty("reserved19Note")
    private String reserved19Note;
    @JsonProperty("activeInsurancePrefix")
    private String activeInsurancePrefix;
    @JsonProperty("similarIllnessDate")
    private String similarIllnessDate;
    @JsonProperty("sterilization")
    private String sterilization;
    @JsonProperty("invoiceId")
    private String invoiceId;
    @JsonProperty("charges")
    private List<Charge> charges = new ArrayList<Charge>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("serviceDate")
    public String getServiceDate() {
        return serviceDate;
    }

    @JsonProperty("serviceDate")
    public void setServiceDate(String serviceDate) {
        this.serviceDate = serviceDate;
    }

    @JsonProperty("claimFormat")
    public String getClaimFormat() {
        return claimFormat;
    }

    @JsonProperty("claimFormat")
    public void setClaimFormat(String claimFormat) {
        this.claimFormat = claimFormat;
    }

    @JsonProperty("reserved19Note")
    public String getReserved19Note() {
        return reserved19Note;
    }

    @JsonProperty("reserved19Note")
    public void setReserved19Note(String reserved19Note) {
        this.reserved19Note = reserved19Note;
    }

    @JsonProperty("activeInsurancePrefix")
    public String getActiveInsurancePrefix() {
        return activeInsurancePrefix;
    }

    @JsonProperty("activeInsurancePrefix")
    public void setActiveInsurancePrefix(String activeInsurancePrefix) {
        this.activeInsurancePrefix = activeInsurancePrefix;
    }

    @JsonProperty("similarIllnessDate")
    public String getSimilarIllnessDate() {
        return similarIllnessDate;
    }

    @JsonProperty("similarIllnessDate")
    public void setSimilarIllnessDate(String similarIllnessDate) {
        this.similarIllnessDate = similarIllnessDate;
    }

    @JsonProperty("sterilization")
    public String getSterilization() {
        return sterilization;
    }

    @JsonProperty("sterilization")
    public void setSterilization(String sterilization) {
        this.sterilization = sterilization;
    }

    @JsonProperty("invoiceId")
    public String getInvoiceId() {
        return invoiceId;
    }

    @JsonProperty("invoiceId")
    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    @JsonProperty("charges")
    public List<Charge> getCharges() {
        return charges;
    }

    @JsonProperty("charges")
    public void setCharges(List<Charge> charges) {
        this.charges = charges;
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
        sb.append(Claim.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("serviceDate");
        sb.append('=');
        sb.append(((this.serviceDate == null)?"<null>":this.serviceDate));
        sb.append(',');
        sb.append("claimFormat");
        sb.append('=');
        sb.append(((this.claimFormat == null)?"<null>":this.claimFormat));
        sb.append(',');
        sb.append("reserved19Note");
        sb.append('=');
        sb.append(((this.reserved19Note == null)?"<null>":this.reserved19Note));
        sb.append(',');
        sb.append("activeInsurancePrefix");
        sb.append('=');
        sb.append(((this.activeInsurancePrefix == null)?"<null>":this.activeInsurancePrefix));
        sb.append(',');
        sb.append("similarIllnessDate");
        sb.append('=');
        sb.append(((this.similarIllnessDate == null)?"<null>":this.similarIllnessDate));
        sb.append(',');
        sb.append("sterilization");
        sb.append('=');
        sb.append(((this.sterilization == null)?"<null>":this.sterilization));
        sb.append(',');
        sb.append("invoiceId");
        sb.append('=');
        sb.append(((this.invoiceId == null)?"<null>":this.invoiceId));
        sb.append(',');
        sb.append("charges");
        sb.append('=');
        sb.append(((this.charges == null)?"<null>":this.charges));
       /* sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        */
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.claimFormat == null)? 0 :this.claimFormat.hashCode()));
        result = ((result* 31)+((this.charges == null)? 0 :this.charges.hashCode()));
        result = ((result* 31)+((this.serviceDate == null)? 0 :this.serviceDate.hashCode()));
        result = ((result* 31)+((this.sterilization == null)? 0 :this.sterilization.hashCode()));
        result = ((result* 31)+((this.activeInsurancePrefix == null)? 0 :this.activeInsurancePrefix.hashCode()));
        result = ((result* 31)+((this.similarIllnessDate == null)? 0 :this.similarIllnessDate.hashCode()));
        result = ((result* 31)+((this.reserved19Note == null)? 0 :this.reserved19Note.hashCode()));
        result = ((result* 31)+((this.invoiceId == null)? 0 :this.invoiceId.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Claim) == false) {
            return false;
        }
        Claim rhs = ((Claim) other);
        return ((((((((((this.claimFormat == rhs.claimFormat)||((this.claimFormat!= null)&&this.claimFormat.equals(rhs.claimFormat)))&&((this.charges == rhs.charges)||((this.charges!= null)&&this.charges.equals(rhs.charges))))&&((this.serviceDate == rhs.serviceDate)||((this.serviceDate!= null)&&this.serviceDate.equals(rhs.serviceDate))))&&((this.sterilization == rhs.sterilization)||((this.sterilization!= null)&&this.sterilization.equals(rhs.sterilization))))&&((this.activeInsurancePrefix == rhs.activeInsurancePrefix)||((this.activeInsurancePrefix!= null)&&this.activeInsurancePrefix.equals(rhs.activeInsurancePrefix))))&&((this.similarIllnessDate == rhs.similarIllnessDate)||((this.similarIllnessDate!= null)&&this.similarIllnessDate.equals(rhs.similarIllnessDate))))&&((this.reserved19Note == rhs.reserved19Note)||((this.reserved19Note!= null)&&this.reserved19Note.equals(rhs.reserved19Note))))&&((this.invoiceId == rhs.invoiceId)||((this.invoiceId!= null)&&this.invoiceId.equals(rhs.invoiceId))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
