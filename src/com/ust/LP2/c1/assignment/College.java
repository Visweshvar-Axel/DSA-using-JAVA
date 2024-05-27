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

public class College {

}
