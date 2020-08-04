
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
    "practiceId",
    "correlationId",
    "explain",
    "activeInsurancePrefix",
    "version",
    "transferType",
    "scrubId",
    "claim"
})
public class DecisionRequest {

    @JsonProperty("practiceId")
    public Integer practiceId;
    @JsonProperty("correlationId")
    public String correlationId;
    @JsonProperty("explain")
    public String explain;
    @JsonProperty("activeInsurancePrefix")
    public String activeInsurancePrefix;
    @JsonProperty("version")
    public String version;
    @JsonProperty("transferType")
    public String transferType;
    @JsonProperty("scrubId")
    public String scrubId;
    @JsonProperty("claim")
    public Claim claim;
    @JsonIgnore
    public Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("practiceId")
    public Integer getPracticeId() {
        return practiceId;
    }

    @JsonProperty("practiceId")
    public void setPracticeId(Integer practiceId) {
        this.practiceId = practiceId;
    }

    @JsonProperty("correlationId")
    public String getCorrelationId() {
        return correlationId;
    }

    @JsonProperty("correlationId")
    public void setCorrelationId(String correlationId) {
        this.correlationId = correlationId;
    }

    @JsonProperty("explain")
    public String getExplain() {
        return explain;
    }

    @JsonProperty("explain")
    public void setExplain(String explain) {
        this.explain = explain;
    }

    @JsonProperty("activeInsurancePrefix")
    public String getActiveInsurancePrefix() {
        return activeInsurancePrefix;
    }

    @JsonProperty("activeInsurancePrefix")
    public void setActiveInsurancePrefix(String activeInsurancePrefix) {
        this.activeInsurancePrefix = activeInsurancePrefix;
    }

    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    @JsonProperty("transferType")
    public String getTransferType() {
        return transferType;
    }

    @JsonProperty("transferType")
    public void setTransferType(String transferType) {
        this.transferType = transferType;
    }

    @JsonProperty("scrubId")
    public String getScrubId() {
        return scrubId;
    }

    @JsonProperty("scrubId")
    public void setScrubId(String scrubId) {
        this.scrubId = scrubId;
    }

    @JsonProperty("claim")
    public Claim getClaim() {
        return claim;
    }

    @JsonProperty("claim")
    public void setClaim(Claim claim) {
        this.claim = claim;
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
        sb.append(DecisionRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("practiceId");
        sb.append('=');
        sb.append(((this.practiceId == null)?"<null>":this.practiceId));
        sb.append(',');
        sb.append("correlationId");
        sb.append('=');
        sb.append(((this.correlationId == null)?"<null>":this.correlationId));
        sb.append(',');
        sb.append("explain");
        sb.append('=');
        sb.append(((this.explain == null)?"<null>":this.explain));
        sb.append(',');
        sb.append("activeInsurancePrefix");
        sb.append('=');
        sb.append(((this.activeInsurancePrefix == null)?"<null>":this.activeInsurancePrefix));
        sb.append(',');
        sb.append("version");
        sb.append('=');
        sb.append(((this.version == null)?"<null>":this.version));
        sb.append(',');
        sb.append("transferType");
        sb.append('=');
        sb.append(((this.transferType == null)?"<null>":this.transferType));
        sb.append(',');
        sb.append("scrubId");
        sb.append('=');
        sb.append(((this.scrubId == null)?"<null>":this.scrubId));
          sb.append(',');
          /*   sb.append("claim");
        sb.append('=');
        sb.append(((this.claim == null)?"<null>":this.claim));
        sb.append(',');
       sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }*/
          sb.append(']');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.explain == null)? 0 :this.explain.hashCode()));
        result = ((result* 31)+((this.scrubId == null)? 0 :this.scrubId.hashCode()));
        result = ((result* 31)+((this.practiceId == null)? 0 :this.practiceId.hashCode()));
        result = ((result* 31)+((this.activeInsurancePrefix == null)? 0 :this.activeInsurancePrefix.hashCode()));
        result = ((result* 31)+((this.transferType == null)? 0 :this.transferType.hashCode()));
        result = ((result* 31)+((this.claim == null)? 0 :this.claim.hashCode()));
        result = ((result* 31)+((this.correlationId == null)? 0 :this.correlationId.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.version == null)? 0 :this.version.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DecisionRequest) == false) {
            return false;
        }
        DecisionRequest rhs = ((DecisionRequest) other);
        return ((((((((((this.explain == rhs.explain)||((this.explain!= null)&&this.explain.equals(rhs.explain)))&&((this.scrubId == rhs.scrubId)||((this.scrubId!= null)&&this.scrubId.equals(rhs.scrubId))))&&((this.practiceId == rhs.practiceId)||((this.practiceId!= null)&&this.practiceId.equals(rhs.practiceId))))&&((this.activeInsurancePrefix == rhs.activeInsurancePrefix)||((this.activeInsurancePrefix!= null)&&this.activeInsurancePrefix.equals(rhs.activeInsurancePrefix))))&&((this.transferType == rhs.transferType)||((this.transferType!= null)&&this.transferType.equals(rhs.transferType))))&&((this.claim == rhs.claim)||((this.claim!= null)&&this.claim.equals(rhs.claim))))&&((this.correlationId == rhs.correlationId)||((this.correlationId!= null)&&this.correlationId.equals(rhs.correlationId))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.version == rhs.version)||((this.version!= null)&&this.version.equals(rhs.version))));
    }

}
