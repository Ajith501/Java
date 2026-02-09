public class OopsThree extends OOPSFour{
    public static void main(String[] args) {
        // int a = 10;
        // int b = 15;
        // System.out.println(a+b);

        OopsThree objone = new OopsThree();
        objone.add(3,4,10); // Method Overloading
        objone.add(10,20); // Method Overloading
        objone.add("java", 17);
        objone.add(10, 12);

        OOPSFour obj2  = new OOPSFour();
        obj2.add(12, 15);

    }
    @Override
    public void add(int a,int b){
        System.out.println(a + b);
    }

    public void add(int a, int b, int c){
        System.out.println(a+b+c);
    }

    public void add(String x, int y){
            System.out.println(x+y);
    }
}
