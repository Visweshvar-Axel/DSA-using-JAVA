package com.ust.LP6.c6_MODULAR.Composition;

public class Skill {
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
