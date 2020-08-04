
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
    "amount",
    "id",
    "diagnosisCodes",
    "fromDate",
    "toDate",
    "relativeValueUnit",
    "originalAmount",
    "outstandingAmount",
    "procedureCode",
    "modifiers",
    "units",
    "note",
    "unlistedPxException",
    "printable",
    "epsdtFlag",
    "officeVisitFlag",
    "anesthesiaTimeSheetData",
    "epsdt",
    "status",
    "transactions",
    "submissionOverrides",
    "clia",
    "revenueCode"
})
public class Charge {

    @JsonProperty("amount")
    private Integer amount;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("diagnosisCodes")
    private List<String> diagnosisCodes = new ArrayList<String>();
    @JsonProperty("fromDate")
    private String fromDate;
    @JsonProperty("toDate")
    private String toDate;
    @JsonProperty("relativeValueUnit")
    private Integer relativeValueUnit;
    @JsonProperty("originalAmount")
    private Integer originalAmount;
    @JsonProperty("outstandingAmount")
    private Integer outstandingAmount;
    @JsonProperty("procedureCode")
    private String procedureCode;
    @JsonProperty("modifiers")
    private List<Modifier> modifiers = new ArrayList<Modifier>();
    @JsonProperty("units")
    private Integer units;
    @JsonProperty("note")
    private String note;
    @JsonProperty("unlistedPxException")
    private String unlistedPxException;
    @JsonProperty("printable")
    private String printable;
    @JsonProperty("epsdtFlag")
    private String epsdtFlag;
    @JsonProperty("officeVisitFlag")
    private String officeVisitFlag;
    @JsonProperty("anesthesiaTimeSheetData")
    private AnesthesiaTimeSheetData anesthesiaTimeSheetData;
    @JsonProperty("epsdt")
    private String epsdt;
    @JsonProperty("status")
    private Status status;
    @JsonProperty("transactions")
    private List<Transaction> transactions = new ArrayList<Transaction>();
    @JsonProperty("submissionOverrides")
    private List<SubmissionOverride> submissionOverrides = new ArrayList<SubmissionOverride>();
    @JsonProperty("clia")
    private Clia clia;
    @JsonProperty("revenueCode")
    private String revenueCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("amount")
    public Integer getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("diagnosisCodes")
    public List<String> getDiagnosisCodes() {
        return diagnosisCodes;
    }

    @JsonProperty("diagnosisCodes")
    public void setDiagnosisCodes(List<String> diagnosisCodes) {
        this.diagnosisCodes = diagnosisCodes;
    }

    @JsonProperty("fromDate")
    public String getFromDate() {
        return fromDate;
    }

    @JsonProperty("fromDate")
    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    @JsonProperty("toDate")
    public String getToDate() {
        return toDate;
    }

    @JsonProperty("toDate")
    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    @JsonProperty("relativeValueUnit")
    public Integer getRelativeValueUnit() {
        return relativeValueUnit;
    }

    @JsonProperty("relativeValueUnit")
    public void setRelativeValueUnit(Integer relativeValueUnit) {
        this.relativeValueUnit = relativeValueUnit;
    }

    @JsonProperty("originalAmount")
    public Integer getOriginalAmount() {
        return originalAmount;
    }

    @JsonProperty("originalAmount")
    public void setOriginalAmount(Integer originalAmount) {
        this.originalAmount = originalAmount;
    }

    @JsonProperty("outstandingAmount")
    public Integer getOutstandingAmount() {
        return outstandingAmount;
    }

    @JsonProperty("outstandingAmount")
    public void setOutstandingAmount(Integer outstandingAmount) {
        this.outstandingAmount = outstandingAmount;
    }

    @JsonProperty("procedureCode")
    public String getProcedureCode() {
        return procedureCode;
    }

    @JsonProperty("procedureCode")
    public void setProcedureCode(String procedureCode) {
        this.procedureCode = procedureCode;
    }

    @JsonProperty("modifiers")
    public List<Modifier> getModifiers() {
        return modifiers;
    }

    @JsonProperty("modifiers")
    public void setModifiers(List<Modifier> modifiers) {
        this.modifiers = modifiers;
    }

    @JsonProperty("units")
    public Integer getUnits() {
        return units;
    }

    @JsonProperty("units")
    public void setUnits(Integer units) {
        this.units = units;
    }

    @JsonProperty("note")
    public String getNote() {
        return note;
    }

    @JsonProperty("note")
    public void setNote(String note) {
        this.note = note;
    }

    @JsonProperty("unlistedPxException")
    public String getUnlistedPxException() {
        return unlistedPxException;
    }

    @JsonProperty("unlistedPxException")
    public void setUnlistedPxException(String unlistedPxException) {
        this.unlistedPxException = unlistedPxException;
    }

    @JsonProperty("printable")
    public String getPrintable() {
        return printable;
    }

    @JsonProperty("printable")
    public void setPrintable(String printable) {
        this.printable = printable;
    }

    @JsonProperty("epsdtFlag")
    public String getEpsdtFlag() {
        return epsdtFlag;
    }

    @JsonProperty("epsdtFlag")
    public void setEpsdtFlag(String epsdtFlag) {
        this.epsdtFlag = epsdtFlag;
    }

    @JsonProperty("officeVisitFlag")
    public String getOfficeVisitFlag() {
        return officeVisitFlag;
    }

    @JsonProperty("officeVisitFlag")
    public void setOfficeVisitFlag(String officeVisitFlag) {
        this.officeVisitFlag = officeVisitFlag;
    }

    @JsonProperty("anesthesiaTimeSheetData")
    public AnesthesiaTimeSheetData getAnesthesiaTimeSheetData() {
        return anesthesiaTimeSheetData;
    }

    @JsonProperty("anesthesiaTimeSheetData")
    public void setAnesthesiaTimeSheetData(AnesthesiaTimeSheetData anesthesiaTimeSheetData) {
        this.anesthesiaTimeSheetData = anesthesiaTimeSheetData;
    }

    @JsonProperty("epsdt")
    public String getEpsdt() {
        return epsdt;
    }

    @JsonProperty("epsdt")
    public void setEpsdt(String epsdt) {
        this.epsdt = epsdt;
    }

    @JsonProperty("status")
    public Status getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(Status status) {
        this.status = status;
    }

    @JsonProperty("transactions")
    public List<Transaction> getTransactions() {
        return transactions;
    }

    @JsonProperty("transactions")
    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    @JsonProperty("submissionOverrides")
    public List<SubmissionOverride> getSubmissionOverrides() {
        return submissionOverrides;
    }

    @JsonProperty("submissionOverrides")
    public void setSubmissionOverrides(List<SubmissionOverride> submissionOverrides) {
        this.submissionOverrides = submissionOverrides;
    }

    @JsonProperty("clia")
    public Clia getClia() {
        return clia;
    }

    @JsonProperty("clia")
    public void setClia(Clia clia) {
        this.clia = clia;
    }

    @JsonProperty("revenueCode")
    public String getRevenueCode() {
        return revenueCode;
    }

    @JsonProperty("revenueCode")
    public void setRevenueCode(String revenueCode) {
        this.revenueCode = revenueCode;
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
        sb.append(Charge.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("diagnosisCodes");
        sb.append('=');
        sb.append(((this.diagnosisCodes == null)?"<null>":this.diagnosisCodes));
        sb.append(',');
        sb.append("fromDate");
        sb.append('=');
        sb.append(((this.fromDate == null)?"<null>":this.fromDate));
        sb.append(',');
        sb.append("toDate");
        sb.append('=');
        sb.append(((this.toDate == null)?"<null>":this.toDate));
        sb.append(',');
        sb.append("relativeValueUnit");
        sb.append('=');
        sb.append(((this.relativeValueUnit == null)?"<null>":this.relativeValueUnit));
        sb.append(',');
        sb.append("originalAmount");
        sb.append('=');
        sb.append(((this.originalAmount == null)?"<null>":this.originalAmount));
        sb.append(',');
        sb.append("outstandingAmount");
        sb.append('=');
        sb.append(((this.outstandingAmount == null)?"<null>":this.outstandingAmount));
        sb.append(',');
        sb.append("procedureCode");
        sb.append('=');
        sb.append(((this.procedureCode == null)?"<null>":this.procedureCode));
        sb.append(',');
        sb.append("modifiers");
        sb.append('=');
        sb.append(((this.modifiers == null)?"<null>":this.modifiers));
        sb.append(',');
        sb.append("units");
        sb.append('=');
        sb.append(((this.units == null)?"<null>":this.units));
        sb.append(',');
        sb.append("note");
        sb.append('=');
        sb.append(((this.note == null)?"<null>":this.note));
        sb.append(',');
        sb.append("unlistedPxException");
        sb.append('=');
        sb.append(((this.unlistedPxException == null)?"<null>":this.unlistedPxException));
        sb.append(',');
        sb.append("printable");
        sb.append('=');
        sb.append(((this.printable == null)?"<null>":this.printable));
        sb.append(',');
        sb.append("epsdtFlag");
        sb.append('=');
        sb.append(((this.epsdtFlag == null)?"<null>":this.epsdtFlag));
        sb.append(',');
        sb.append("officeVisitFlag");
        sb.append('=');
        sb.append(((this.officeVisitFlag == null)?"<null>":this.officeVisitFlag));
        sb.append(',');
        sb.append("anesthesiaTimeSheetData");
        sb.append('=');
        sb.append(((this.anesthesiaTimeSheetData == null)?"<null>":this.anesthesiaTimeSheetData));
        sb.append(',');
        sb.append("epsdt");
        sb.append('=');
        sb.append(((this.epsdt == null)?"<null>":this.epsdt));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("transactions");
        sb.append('=');
        sb.append(((this.transactions == null)?"<null>":this.transactions));
        sb.append(',');
        sb.append("submissionOverrides");
        sb.append('=');
        sb.append(((this.submissionOverrides == null)?"<null>":this.submissionOverrides));
        sb.append(',');
        sb.append("clia");
        sb.append('=');
        sb.append(((this.clia == null)?"<null>":this.clia));
        sb.append(',');
        sb.append("revenueCode");
        sb.append('=');
        sb.append(((this.revenueCode == null)?"<null>":this.revenueCode));
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
        result = ((result* 31)+((this.note == null)? 0 :this.note.hashCode()));
        result = ((result* 31)+((this.outstandingAmount == null)? 0 :this.outstandingAmount.hashCode()));
        result = ((result* 31)+((this.procedureCode == null)? 0 :this.procedureCode.hashCode()));
        result = ((result* 31)+((this.officeVisitFlag == null)? 0 :this.officeVisitFlag.hashCode()));
        result = ((result* 31)+((this.units == null)? 0 :this.units.hashCode()));
        result = ((result* 31)+((this.modifiers == null)? 0 :this.modifiers.hashCode()));
        result = ((result* 31)+((this.diagnosisCodes == null)? 0 :this.diagnosisCodes.hashCode()));
        result = ((result* 31)+((this.relativeValueUnit == null)? 0 :this.relativeValueUnit.hashCode()));
        result = ((result* 31)+((this.submissionOverrides == null)? 0 :this.submissionOverrides.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.epsdtFlag == null)? 0 :this.epsdtFlag.hashCode()));
        result = ((result* 31)+((this.revenueCode == null)? 0 :this.revenueCode.hashCode()));
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        result = ((result* 31)+((this.toDate == null)? 0 :this.toDate.hashCode()));
        result = ((result* 31)+((this.unlistedPxException == null)? 0 :this.unlistedPxException.hashCode()));
        result = ((result* 31)+((this.transactions == null)? 0 :this.transactions.hashCode()));
        result = ((result* 31)+((this.printable == null)? 0 :this.printable.hashCode()));
        result = ((result* 31)+((this.anesthesiaTimeSheetData == null)? 0 :this.anesthesiaTimeSheetData.hashCode()));
        result = ((result* 31)+((this.clia == null)? 0 :this.clia.hashCode()));
        result = ((result* 31)+((this.fromDate == null)? 0 :this.fromDate.hashCode()));
        result = ((result* 31)+((this.originalAmount == null)? 0 :this.originalAmount.hashCode()));
        result = ((result* 31)+((this.epsdt == null)? 0 :this.epsdt.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Charge) == false) {
            return false;
        }
        Charge rhs = ((Charge) other);
        return (((((((((((((((((((((((((this.note == rhs.note)||((this.note!= null)&&this.note.equals(rhs.note)))&&((this.outstandingAmount == rhs.outstandingAmount)||((this.outstandingAmount!= null)&&this.outstandingAmount.equals(rhs.outstandingAmount))))&&((this.procedureCode == rhs.procedureCode)||((this.procedureCode!= null)&&this.procedureCode.equals(rhs.procedureCode))))&&((this.officeVisitFlag == rhs.officeVisitFlag)||((this.officeVisitFlag!= null)&&this.officeVisitFlag.equals(rhs.officeVisitFlag))))&&((this.units == rhs.units)||((this.units!= null)&&this.units.equals(rhs.units))))&&((this.modifiers == rhs.modifiers)||((this.modifiers!= null)&&this.modifiers.equals(rhs.modifiers))))&&((this.diagnosisCodes == rhs.diagnosisCodes)||((this.diagnosisCodes!= null)&&this.diagnosisCodes.equals(rhs.diagnosisCodes))))&&((this.relativeValueUnit == rhs.relativeValueUnit)||((this.relativeValueUnit!= null)&&this.relativeValueUnit.equals(rhs.relativeValueUnit))))&&((this.submissionOverrides == rhs.submissionOverrides)||((this.submissionOverrides!= null)&&this.submissionOverrides.equals(rhs.submissionOverrides))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.epsdtFlag == rhs.epsdtFlag)||((this.epsdtFlag!= null)&&this.epsdtFlag.equals(rhs.epsdtFlag))))&&((this.revenueCode == rhs.revenueCode)||((this.revenueCode!= null)&&this.revenueCode.equals(rhs.revenueCode))))&&((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount))))&&((this.toDate == rhs.toDate)||((this.toDate!= null)&&this.toDate.equals(rhs.toDate))))&&((this.unlistedPxException == rhs.unlistedPxException)||((this.unlistedPxException!= null)&&this.unlistedPxException.equals(rhs.unlistedPxException))))&&((this.transactions == rhs.transactions)||((this.transactions!= null)&&this.transactions.equals(rhs.transactions))))&&((this.printable == rhs.printable)||((this.printable!= null)&&this.printable.equals(rhs.printable))))&&((this.anesthesiaTimeSheetData == rhs.anesthesiaTimeSheetData)||((this.anesthesiaTimeSheetData!= null)&&this.anesthesiaTimeSheetData.equals(rhs.anesthesiaTimeSheetData))))&&((this.clia == rhs.clia)||((this.clia!= null)&&this.clia.equals(rhs.clia))))&&((this.fromDate == rhs.fromDate)||((this.fromDate!= null)&&this.fromDate.equals(rhs.fromDate))))&&((this.originalAmount == rhs.originalAmount)||((this.originalAmount!= null)&&this.originalAmount.equals(rhs.originalAmount))))&&((this.epsdt == rhs.epsdt)||((this.epsdt!= null)&&this.epsdt.equals(rhs.epsdt))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
