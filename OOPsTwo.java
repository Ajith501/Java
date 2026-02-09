public class OOPsTwo {
    String title = ""; // Global Variables
    int price = 0; //Global variables

public OOPsTwo(String inptitle, int inpprice){
title = inptitle;
price = inpprice;
}

    public static void main(String[] args) {
        OOPsTwo a1 = new OOPsTwo("Iphone 13 Blue", 40000);
        System.out.println(a1.title + ":" + a1.price);
    }
}
