package edu.wctc.property.lab1;

import java.time.LocalDate;

/**
 * Fix the code in this class to do PROPERTY encapsulation correctly. Also
 * consider if any of the properties should be mandatory and use a constructor
 * to enforce that. Review the tips in the document "EncapCheckList.pdf" if
 * needed.
 *
 * @author Jim Lombardo
 * @version 1.02
 */
public class Employee {

    private String firstName;
    private String lastName;
    private final String ssn;
    private boolean metWithHr;
    private boolean metDeptStaff;
    private boolean reviewedDeptPolicies;
    private boolean movedIn;
    private String cubeId;
    private LocalDate orientationDate;

    public Employee(String firstName, String lastName, String ssn) {
        if (ssn.isEmpty()) {
            throw new IllegalArgumentException("SSN cannot be empty");
        }
        if (ssn.length() != 9) {
            throw new IllegalArgumentException("SSN must have 9 digits");
        }
        if (firstName.isEmpty() || lastName.isEmpty()) {
            throw new IllegalArgumentException("First and Last Name cannot be empty.");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    public void MetWithHr() {
        this.metWithHr = true;
    }

    public void MetDeptStaff() {
        this.metDeptStaff = true;
    }

    public void ReviewedDeptPolicies() {
        this.reviewedDeptPolicies = true;
    }

    public void MovedIn() {
        this.movedIn = true;
    }

    public void MovedOut() {
        this.movedIn = false;
    }

    public void setCubeId(String cubeId) {
        if (cubeId.isEmpty()) {
            throw new IllegalArgumentException("Cube ID can not be empty.");
        }
        this.cubeId = cubeId;
    }

    public void setOrientationDate(LocalDate orientationDate) {
        if (orientationDate.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("Orientation Date must be today or in the future.");
        }
        this.orientationDate = orientationDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSsn() {
        return ssn;
    }

    public boolean isMetWithHr() {
        return metWithHr;
    }

    public boolean isMetDeptStaff() {
        return metDeptStaff;
    }

    public boolean isReviewedDeptPolicies() {
        return reviewedDeptPolicies;
    }

    public boolean isMovedIn() {
        return movedIn;
    }

    public String getCubeId() {
        return cubeId;
    }

    public LocalDate getOrientationDate() {
        return orientationDate;
    }
}
