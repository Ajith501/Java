public class Arrays {
    public static void main(String[] args) {
        String product1Title = "Apple iPhone 13 Blue";
        String product12Title = "Apple iPhone 13 Black";
        String product13Title = "Apple iPhone 15 Black";
        //System.out.println(product12Title);

        String[] titles = {"Apple iPhone 13 Blue","Apple iPhone 13 Black","Apple iPhone 15 Black"};
        System.out.println(titles[0]);
        System.out.println(titles[1]);
        System.out.println(titles[2]);
        // 0,1,2 -> position numbers - Index
        titles[0] = "Apple iPhone 13 Red";
        titles[2] = "Apple iPhone 15 Red";
        System.out.println(titles[0]);
        System.out.println(titles[2]);

        int[] price = {10000,20000,30000,45000,12000};
        System.out.println(price[1]);
        System.out.println(price[3]);
        price[3] = 50000;
        System.out.println(price[3]);
        System.out.println(price.length);
        System.out.println(titles.length);
    }

    public static void stream(String[] courses) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'stream'");
    }
}
