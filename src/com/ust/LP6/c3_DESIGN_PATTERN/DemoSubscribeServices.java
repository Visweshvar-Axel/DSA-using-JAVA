package com.ust.LP6.c3_DESIGN_PATTERN;

public class DemoSubscribeServices {
    public static void main(String[] args) {
        Service guset = new Guest();
        guset = new OneToOneTraining(guset);

        Service member = new Member();
        member = new OneToOneTraining(member);
        member = new ProjectSupport(member);

        System.out.println("Guest details :\n" +
                guset.getDescription() +
                "Cost" + guset.getCost());

        System.out.println("member details :\n" +
                member.getDescription() +
                "Cost" + member.getCost());
    }
}
