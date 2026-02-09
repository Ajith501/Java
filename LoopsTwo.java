public class LoopsTwo {
    public static void main(String[] args) {
        int[] price = {10000,200000,30000,25000,50000};
        // 0,1,2,3,4
        // for(int i = 0 ; i < price.length; i++){
        //     System.out.println(price[i]);
        //     if (price[i] == 25000) {
        //         break;
        //     }

        // }
        for(int i = 0 ; i < price.length; i++){
            
            if (price[i] == 25000) {
                continue;
                
            }
            System.out.println(price[i]);

        }
    }
}
