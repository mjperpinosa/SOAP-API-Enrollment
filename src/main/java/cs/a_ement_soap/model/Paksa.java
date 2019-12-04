

package cs.a_ement_soap.model;

public class Paksa {

    protected String name;
    protected String paksaCode;
    protected String description;
    protected int units;
    protected int status;


    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public String getSubjectCode() {
        return paksaCode;
    }

    public void setSubjectCode(String value) {
        this.paksaCode = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String value) {
        this.description = value;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int value) {
        this.units = value;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int value) {
        this.status = value;
    }

}
