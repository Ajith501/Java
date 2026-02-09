public class SwitchCase {
    public static void main(String[] args) {
        String videoCategory = "sports";
        switch (videoCategory) {
            case "music":
                System.out.println("Display music related videos.");
                break;
            case "sports":
                System.out.println("Display sports related videos");
                break;
            case "coding":
                System.out.println("Display Coding related videos");
            break;
                default:
                System.out.println("Display random videos");
                break;
        }
    }
}
