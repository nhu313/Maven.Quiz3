package rocks.zipcode.io.quiz3.collections;

import rocks.zipcode.io.quiz3.objectorientation.enums.LabStatus;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author leon on 10/12/2018.
 */
public class Student {
    private Map<Lab, LabStatus> statuses;

    public Student() {
        this.statuses = new TreeMap<>();
    }

    public Student(Map<Lab, LabStatus> map) {
        this.statuses = map;
    }

    public Lab getLab(String labName) {
        for(Lab lab : statuses.keySet()) {
            if (labName.equals(lab.getName())) {
                return lab;
            }
        }

        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        Lab lab = getLab(labName);
        if (lab == null) {
            throw new UnsupportedOperationException();
        }
        statuses.put(lab, labStatus);
    }


    public void forkLab(Lab lab) {
        statuses.put(lab, LabStatus.PENDING);
    }

    public LabStatus getLabStatus(String labName) {
        Lab lab = getLab(labName);
        return statuses.get(lab);
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();

        for (Map.Entry<Lab, LabStatus> entry : statuses.entrySet()) {
            builder.append(entry.getKey().getName());
            builder.append(" > ");
            builder.append(entry.getValue().toString());
            builder.append("\n");
        }

        builder.deleteCharAt(builder.length() - 1);
        return builder.toString();
    }
}
