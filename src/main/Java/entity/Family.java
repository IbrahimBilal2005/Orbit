package entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Entity representing a single Family in the systen
 */
public class Family {
    private final String familyId;
    private final String familyPin;
    private final List<Parent> parents;
    private final List<Child> children;

    public Family(String familyId, String familyPin) {
        this.familyId = familyId;
        this.familyPin = familyPin;
        this.parents = new ArrayList<>();
        this.children = new ArrayList<>();
    }

    public List<Parent> getParents() { return parents; }
    public List<Child> getChildren() { return children; }
    public String getFamilyId() { return familyId; }
    public String getFamilyPin() { return familyPin; }
}
