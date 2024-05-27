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
class StudentDetails{
    protected String studentId;
    protected String name;
    protected String mobileNumber;
    protected String email;
    protected String department;
    protected String[] teacherCode;

    public StudentDetails(String studentId, String name, String mobileNumber, String email, String department, String[] teacherCode) {
        this.studentId = studentId;
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.department = department;
        this.teacherCode = teacherCode;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setTeacherCode(String[] teacherCode) {
        this.teacherCode = teacherCode;
    }
    public String getName() {
        return name;
    }
    public String getStudentId() {
        return studentId;
    }
    public String getMobileNumber() {
        return mobileNumber;
    }
    public String getEmail() {
        return email;
    }
    public String getDepartment() {
        return department;
    }
    public String[] getTeacherCode() {
        return teacherCode;
    }

    @Override
    public String toString() {
        return "StudentDetails{" +
                "studentId='" + studentId + '\'' +
                ", name='" + name + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", email='" + email + '\'' +
                ", department='" + department + '\'' +
                ", teacherCode=" + Arrays.toString(teacherCode) +
                '}';
    }
}
class StudentMarks extends StudentDetails {
    private int semNumber;
    private int[] marks;

    public StudentMarks(String studentId, String name, String mobileNumber, String email, String department, String[] teacherCode, int semNumber, int[] marks) {
        super(studentId, name, mobileNumber, email, department, teacherCode);
        this.semNumber = semNumber;
        this.marks = marks;
    }

    public int getTotal(){
        int total =  0;
        for (int mark: marks) total += mark;
        return total;
    }
    public double getAverage(){
        return (double) getTotal() /marks.length;
    }

    @Override
    public String toString() {
        return "StudentDetails{" +
                "studentId='" + studentId + '\'' +
                ", name='" + name + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", email='" + email + '\'' +
                ", department='" + department + '\'' +
                ", teacherCode=" + Arrays.toString(teacherCode) +'}'+
                "StudentMarks{" +
                "getTotal" + getTotal() +
                ", getAverage" + getAverage() +
                ", semNumber=" + semNumber +
                ", marks=" + Arrays.toString(marks) +
                '}';
    }
}
public class College {

}
