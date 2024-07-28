package com.ust.LP6.c6_MODULAR.Composition;

import java.util.ArrayList;
import java.util.List;

public class PersonNested {
    //composition has a
    private Job job;
    private List<Skill> skills = new ArrayList<>();

    public PersonNested() {
        job = new Job("Software devloper",500000,123124);
        skills.add(new Skill("java developer","IT",1));
        skills.add(new Skill("project manager","IT",1));
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "job=" + job +
                ", skills=" + skills +
                '}';
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    class Job {
        private String role;
        private long salary;
        private int id;

        public Job(String role, long salary, int id) {
            this.role = role;
            this.salary = salary;
            this.id = id;
        }

        public String getRole() {
            return role;
        }

        public void setRole(String role) {
            this.role = role;
        }

        public long getSalary() {
            return salary;
        }

        public void setSalary(long salary) {
            this.salary = salary;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return "Job{" +
                    "role='" + role + '\'' +
                    ", salary=" + salary +
                    ", id=" + id +
                    '}';
        }
    }

    class Skill {
        private String skillName;
        private String skillCategory;
        private int skillRank;

        public Skill(String skillName, String skillCategory, int skillRank) {
            this.skillName = skillName;
            this.skillCategory = skillCategory;
            this.skillRank = skillRank;
        }

        public String getSkillName() {
            return skillName;
        }

        public void setSkillName(String skillName) {
            this.skillName = skillName;
        }

        public String getSkillCategory() {
            return skillCategory;
        }

        public void setSkillCategory(String skillCategory) {
            this.skillCategory = skillCategory;
        }

        public int getSkillRank() {
            return skillRank;
        }

        public void setSkillRank(int skillRank) {
            this.skillRank = skillRank;
        }

        @Override
        public String toString() {
            return "Skill{" +
                    "skillName='" + skillName + '\'' +
                    ", skillCategory='" + skillCategory + '\'' +
                    ", skillRank=" + skillRank +
                    '}';
        }
    }

}
