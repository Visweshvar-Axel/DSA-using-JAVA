package com.ust.LP2.c2.a1;

import com.ust.LP2.c2.serialization.GameCharacter;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class BackAccountTesting {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("1234567891234","Viswa",2000.0,"vISWA123");
        BankAccount acc2 = new BankAccount("1234463567856","Axel",3000.0,"AxEl123");
        BankAccount acc3 = new BankAccount("8790364576865","Anu",1500.0,"Anu123");
        try {
            FileOutputStream file = new FileOutputStream("BankAcc.ser");
            ObjectOutputStream objSer = new ObjectOutputStream(file);
            objSer.writeObject(acc1);
            objSer.writeObject(acc2);
            objSer.writeObject(acc3);
            objSer.close();
        }catch (Exception e){e.printStackTrace();}
        acc1 = acc2 = acc3 = null;
        try {
            FileInputStream file = new FileInputStream("BankAcc.ser");
            ObjectInputStream objInp = new ObjectInputStream(file);
            BankAccount acc1Restore = (BankAccount) objInp.readObject();
            BankAccount acc2Restore = (BankAccount) objInp.readObject();
            BankAccount acc3Restore = (BankAccount) objInp.readObject();
            System.out.println("one's account number and name is "+acc1Restore.getAccNo()+" & "+acc1Restore.getName());
            System.out.println("two's account number and name is "+acc2Restore.getAccNo()+" & "+acc2Restore.getName());
            System.out.println("three's account number and name is "+acc3Restore.getAccNo()+" & "+acc3Restore.getName());
        } catch (Exception e){e.printStackTrace();}

    }
}
