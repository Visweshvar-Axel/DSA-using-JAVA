package com.ust.LP2.c2.serialization;

public class StudyDemo {

    //serialization interface is known as an marker or tag interface
    //because the interface doesn't have any methods to implement

    // its sole purpose is to announce that the class implementing it is,well serializable

    // in other words object of that type are saveable through the serialization mechanism! I

    // if any superclass implements is serializable, the subclass is automatically becomes serializable even if the subclass doesn't explicitly declares implement serialization.

    // serialization is all or nothing!!!

    //can you imagine what would happen if some of the object's state didn't save correctly!!

    //Either the entire object graph would be serialized correctly or serialization fails

    /* *
    * Mark the instance variable as transient, if if can't be saved
    * if you have an instance variable that can't be saved because it isn't serializable, you can mark that
    * variable with the transient keyword and the serialization process will skip right over it.
    *
    * why would a variable not be serialized. ?
    *
    * 1) it could be that the class designer simply forgot to make the class serializable
    * 2) it might be because the object relies on runtime-specific information that simply can't be saved.
    * Although most of the things in java class libraries are serializable, but you can't save things like network connection.
    * threads or file objects
    * they all are dependent on a particular run time experience
    * in other words, they are instantiated in a way that's unique to a particular run of your program, on a particular platform,
    * in a particular JVM
    * once the program shuts down, there is no way to bring those things back to life in any meaningful way!!
    *
    *  they have to be created from scratch! II
    *
    * */


}
