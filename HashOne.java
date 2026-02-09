import java.util.HashMap;
import java.util.HashSet;

public class HashOne {
    

    public static void main(String[] args) {
    //     String[] titles = {"Iphone 13","Iphone 14"};
    // int[] price = {100000,60000};
    // int [] reviews = {2345,2200};
    // title = "iPhone"
    // price = 120000
    // reviews = 22000
    // key  = value
    // HashMap<String, String> productone =  new HashMap<String, String>();
    // productone.put("title","IPhone");
    // productone.put("price", "52000");
    // productone.put("reviews","20000");
    // productone.put("imagepath","path");
    

    // System.out.println(productone.get("reviews"));

    // HashMap<String, String> video1 = new HashMap<String, String>();
    // video1.put("title", "Sunil Comedy Videos");
    // video1.put("ChannelName", "FunTV");
    // video1.put("Subscribers","4M");
    // video1.put("NoOfVideos", "100");

    // System.out.println(video1.get("NoOfVideos"));



    // to store Unique values
    HashSet<String> list = new HashSet<String>();

    System.out.println(list.size());
    list.add("Ajit@dbs.com");
    list.add("Ajit@dbs.com");
    list.add("Ajit@gmail.com");
    System.out.println(list.size());

    }
}
