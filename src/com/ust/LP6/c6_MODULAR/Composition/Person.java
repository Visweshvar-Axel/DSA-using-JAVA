package com.ust.LP6.c6_MODULAR.Composition;

import java.util.ArrayList;
import java.util.List;

public class Person {
    //composition has a
    private Job job;
    private List<Skill> skills = new ArrayList<>();

    public Person() {
        job = new Job("Software devloper",500000,123124);
        skills.add(new Skill("java developer","IT",1));
        skills.add(new Skill("project manager","IT",1));
    }
}
