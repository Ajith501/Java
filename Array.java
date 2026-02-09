import java.util.ArrayList;
import java.util.LinkedList;

public class Array {
    public static void main(String[] args) {
        // String[] users = {"Ajit","Kumar"};
        // System.out.println(users[0]);
        // System.out.println(users[1]);
            //ArrayList
        ArrayList<String> Users = new ArrayList<String>();
        System.out.println(Users.size());
            Users.add("Ajit");
            System.out.println(Users.size());
            Users.add("Aj1");
            System.out.println(Users.size());
            
            //INdex 
            for(int i =0; i < Users.size(); i++){
            System.out.println(Users.get(i));
         }
         Users.remove(1);
         System.out.println(Users.size());

         Users.add("12345");
         for(int i =0; i < Users.size(); i++){
            System.out.println(Users.get(i));
         }
        // Linked List
        LinkedList<String> titles = new LinkedList<String>();
        System.out.println(titles.size());

        titles.add("RRR");
        titles.add("Bahubali");

        for(int i = 0; i < titles.size();i++){
            System.out.println(titles.get(i));
        }
            titles.add(0,"KGF");
            for(int i = 0; i < titles.size();i++){
                System.out.println(titles.get(i));
            }
            titles.remove(0);
            for(int i = 0; i < titles.size();i++){
                System.out.println(titles.get(i));
            }
    }
}
