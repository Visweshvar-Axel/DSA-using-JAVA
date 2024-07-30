package EmployeeAndDepartmentDemo;

public class Department {
    private int id;
    private String name;
    private int rank;

    public Department(int id, String name, int rank) {
        this.id = id;
        this.name = name;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rank=" + rank +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}
