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
    *
    *
    * -----------------------------------------------------------------------------------
    * 1) if serialization is so important, why isn't it the default for all the classes. ?
    * why doesn't class Object implement Serializable, and then all the subclasses will automatically Serializable. ?
    *
    *
    * Even though most classes will,and should implement Serializable,you always have a choice!!
    * and you must make a conscious decision on a class-by class basis, for each class you design,
    * to enable serialization by implementing the interface!
    * First of all, if serialization were the default, how could you turn it off..?
    * interfaces indicates functionality, not a lack of functionality
    * so the model of polymorphism would not work properly if you had to say "implements NonSerializable" to tell the world that you can't be saved! !
    *
    * why would you ever write a class that wasn't serializable.?
    *
    * there are very few reason, but you might, for example, have a security issue where you don't want a password object stored.
    * or you might have an object that makes no sense to save, because its key instances are not serializable, so there is no useful way for you to make your class serializable
    *
    * if a class i'm using isn't serializable, but there's no good reason except the designer forgot to implement, can i subclass the bad class and make the subclass serializable.?
    * yes! ! if the class is extendable(not final), you can make a serializable subclass, and just substitute the subclass everywhere your code is expecting the
    * super class!!
    *
    * what does it mean to have a serializable subclass of a non-serializable superclass..??
    * first we have to look at what happens when a class is deserialized.
    *
    * In a nutshell, when an object is deserialized and its super class is not serializable
    * then the super class constructor will run just as though a new object of that type were being created!
    *
    *
    * preserve an object's state:
    *
    * yes this is an issue, but fortunately there's a solution.
    * if we serialize an object, a transient reference instance variable will be brought back to life as a null
    * regardless of the value it had at the time it was saved!!
    * that means, the entire object graph connected to that particular instance variable won't be saved!!
    * that could be bad,obviously,because you probably need anon-null value for that variable
    *
    * we have got two options:
    * I) when the object is brought back, reinitialize the null instance variable back to some default state!
    * this works if your deserialized object isn't dependent on a particular value for that transient variable.
    * in other words, it might be important that the Dog have a collar, but perhanps all Collar objects are the same,
    * so it doesn't matter if you give Dog a new brand collar:nobody will know the differnce!!
    *
    * 2) if the value of transient variable matters, then you need to save the key values of the collar and use them when the Dog is brought back to essentially
    * re-create a brand-new collar that's identical to the original
    *
    * what happens if two objects in the object graph are the same object.?
    * excellent question!!
    * serialization is smart enough to know when two objects in the graph are the same.
    * in that case only one Of the objects is saved and during serialization any references to that single objects are restored.
    *
    *
    * -----------------------------------------------------------------------------------------------------
    *
    * Deserialization: restoring an object
    *
    * The whole point of seril_aizing an object is so that you can restore it back to its original state at some point later date,
    * in a different •run' of the JVM!!
    *
    * 
    *
    * */

}
