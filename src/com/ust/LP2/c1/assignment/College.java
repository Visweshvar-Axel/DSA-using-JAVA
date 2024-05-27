package com.ust.LP2.c1.assignment;

import java.util.Arrays;

class Department {
    private String deptCode;
    private String deptName;
    private String building;
    private String   foundedYear;

    public Department(String deptCode, String deptName, String building, String foundedYear) {
        this.deptCode = deptCode;
        this.deptName = deptName;
        this.building = building;
        this.foundedYear = foundedYear;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
    public void setBuilding(String building) {
        this.building = building;
    }

    public void setFoundedYear(String foundedYear) {
        this.foundedYear = foundedYear;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public String getDeptName() {
        return deptName;
    }

    public String getBuilding() {
        return building;
    }

    public String getFoundedYear() {
        return foundedYear;
    }
}
class TeachingStaff {
    private String ID;
    private String name;
    private String qualification;
    private String dateOfJoining;
    private String deptCode;
    public TeachingStaff(String ID, String name, String qualification, String dateOfJoining, String deptCode) {
        this.ID = ID;
        this.name = name;
        this.qualification = qualification;
        this.dateOfJoining = dateOfJoining;
        this.deptCode = deptCode;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setID(String ID) {
        this.ID = ID;
    }
    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public void setDateOfJoining(String dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getName() {
        return name;
    }

    public String getDateOfJoining() {
        return dateOfJoining;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public String getQualification() {
        return qualification;
    }

    public String getID() {
        return ID;
    }
}

public class College {

}
