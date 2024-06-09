package livesession.IOExample;

import java.io.*;
import java.util.Scanner;

public class ManipulateFiles {
    static void insert(String fname,String userList) throws IOException {
        File f = new File(fname);
        FileWriter fw = new FileWriter(f,true);
        fw.append(",\n"+userList);
        fw.close();
    }
    static void viewUser(String fname) throws IOException {
        File f = new File(fname);
        BufferedReader br = new BufferedReader(new FileReader(f));
        String buffer;
        while((buffer = br.readLine())!= null){
            System.out.println(buffer);
        }
        br.close();
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String fileName = "C:\\Users\\VISWA\\IdeaProjects\\JAVA_UST\\src\\livesession\\IOExample\\team.txt"
        int choice = 1;
        String user = "User list:\nViswa,\nSaran,\nJeswin,\nJanani";
        insert("C:\\Users\\VISWA\\IdeaProjects\\JAVA_UST\\src\\livesession\\IOExample\\team.txt",user);
        viewUser("C:\\Users\\VISWA\\IdeaProjects\\JAVA_UST\\src\\livesession\\IOExample\\team.txt");
        do{
            System.out.println("Enter your choice \n1 - insert user \n2 - view user\n3 - exit");
            choice = sc.nextInt();
            sc.nextLine();
            if(choice == 1){
                System.out.println("enter user:");
                String temp = sc.nextLine();
                insert("C:\\Users\\VISWA\\IdeaProjects\\JAVA_UST\\src\\livesession\\IOExample\\team.txt",temp);
            } else if (choice == 2) {
                viewUser("C:\\Users\\VISWA\\IdeaProjects\\JAVA_UST\\src\\livesession\\IOExample\\team.txt");
            } else {
                System.out.println("Invalid");
                break;
            }
        } while (choice != 0);
        insert("C:\\Users\\VISWA\\IdeaProjects\\JAVA_UST\\src\\livesession\\IOExample\\team.txt","Dinesh");
        viewUser("C:\\Users\\VISWA\\IdeaProjects\\JAVA_UST\\src\\livesession\\IOExample\\team.txt");
//        File f = new File("team.txt");
//        FileWriter fw = new FileWriter(f);
//        String user = "User list:\nviswa,\nsaran,\njeswin,\njanani";
//        fw.append(user);
//        fw.close();
//        BufferedReader br = new BufferedReader(new FileReader(f));
//        String buffer;
//        while((buffer = br.readLine())!= null){
//            System.out.println(buffer);
//        }
//        br.close();
    }
}
