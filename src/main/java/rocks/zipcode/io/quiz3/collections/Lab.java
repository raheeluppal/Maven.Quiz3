package rocks.zipcode.io.quiz3.collections;

/**
 * @author leon on 10/12/2018.
 */
public class Lab {
    String labName;
    LabStatus newStatus;

    public Lab() {
        this(null);
    }

    public Lab(String labName) {
        this.labName = labName;
        this.newStatus = null;

    }

    public String getName() {
        return labName;
    }

    public void setStatus(LabStatus labStatus) {
        newStatus = labStatus;
    }

    public LabStatus getStatus() {
        return newStatus;
    }
}
