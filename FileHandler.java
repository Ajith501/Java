import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {
    public static void main(String[] args) {
        // File file = new File("uploads");
        // file.mkdir();
        // file = new File("uploads/txt");
        // file.mkdir();
       try {
        File fileObj = new File("uploads/txt/productinfo.txt");
        //fileObj.delete();
        // FileWriter writerobj = new FileWriter(fileObj);
        // String[] titles = {"Apple iPhone 13 Blue","Apple iPhone 13 Black","Apple iPhone 15 Black","Samsung S25","Google Pixel 9", "Air frier", 
        // "Apple Macbook PRO M1", "Lenovo Thinkpad T14"};
        // writerobj.write("ProductTitles\n");
        // for(int i = 0; i< titles.length;i++){
        // writerobj.write(titles[i] + "\n");
        Scanner scn = new Scanner(fileObj);
            ArrayList<String> productList = new ArrayList<String>();
            System.out.println(productList.size());
            while (scn.hasNext() == true) {
                System.out.println( productList.add(scn.nextLine()));
            }
            System.out.println(productList.size());
                scn.close();
                
        //writerobj.write("John@gmail.com");
       // writerobj.close();;
       } catch(Exception E) {
        System.out.println(E.getMessage());
       }
        
    }
}
