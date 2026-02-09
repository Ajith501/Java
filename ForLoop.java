public class ForLoop {
    public static void main(String[] args) {
        String[] titles = {"Apple iPhone 13 Blue","Apple iPhone 13 Black","Apple iPhone 15 Black"};
        System.out.println(titles.length);
        for(int i = 0; i< titles.length; i++){
            // repeated task
            System.out.println(titles[i]);
        }
        int[] price = {10000,20000,30000,45000,12000,50000};
        for(int j =price.length -1 ; j>= 0;j--){
            System.out.println(price[j]);
        }
        
    }
}
