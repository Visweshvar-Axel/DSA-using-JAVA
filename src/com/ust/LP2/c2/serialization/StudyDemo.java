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

}
