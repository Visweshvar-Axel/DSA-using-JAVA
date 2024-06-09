package livesession.IOExample;

import java.io.*;
import java.util.Scanner;

public class ManipulateFiles {
    static void insert(String fname,String userList) throws IOException {
        File f = new File(fname);
        FileWriter fw = new FileWriter(f,true);
        fw.append(userList);
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
        int choice = 1;
        String user = "User list:\nviswa,\nsaran,\njeswin,\njanani";
        insert("team.txt",user);
        viewUser("team.txt");
        do{
            System.out.println("Enter your choice 1 - insert user, 2 - view user, 3 - exit");
            choice = sc.nextInt();
            sc.nextLine();
            if(choice == 1){
                System.out.println("enter user:");
                String temp = sc.nextLine();
                insert("team.txt",temp);
            } else if (choice == 2) {
                viewUser("team.txt");
            } else {
                System.out.println("Invalid");
                break;
            }
        } while (choice != 0);
        insert("team.txt","dinesh");
        viewUser("team.txt");
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
