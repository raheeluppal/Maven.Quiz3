package rocks.zipcode.io.quiz3.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author leon on 10/12/2018.
 */
public class Student {

    HashMap<String, Lab> labMap = new HashMap<>();

    public Student() {

    }

    public Student(List<Lab> labs) {
        for(Lab lab : labs){
            labMap.put(lab.getName(),lab);
        }

    }

    public Lab getLab(String labName) {
        return labMap.get(labName);
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        Lab any = this.getLab(labName);
        any.setStatus(labStatus);
        labMap.put(labName,any);
    }

    public void forkLab(Lab lab) {
        lab.setStatus(LabStatus.PENDING);
        labMap.put(lab.getName(),lab);
    }

    public LabStatus getLabStatus(String labName) {
        return getLab(labName).getStatus();
    }


}
