
import java.util.Arrays;
public class STreamOne {
    
    
    public static void main(String[] args) {
        String[] courses = {"Java","Java", "NodeJs","python", "SQL","pandas"};
        // for (int i = 0; i < courses.length; i++) {
        //     System.out.println(courses[i].toUpperCase());
        // }
        // Filter, Manupilate
        Arrays.stream(courses)
        .map(course -> course.toUpperCase()+ " " + "15000")
        .map(course -> course.toLowerCase())
        .distinct()
        .forEach(System.out::println );

         Arrays.stream(courses)
        .filter(course -> course.startsWith("p"))
        .map(course -> course.toUpperCase())
        .forEach(System.out::println);
      
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        Arrays.stream(nums).filter(n -> n % 2 == 0).forEach(System.out::println);

    }
}
