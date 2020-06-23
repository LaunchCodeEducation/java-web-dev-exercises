
package school;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Course {

   public static void main(String[] args) {
      HashMap<String, Integer> course = new HashMap<>();
      String courseName;
      int duration;
      int numberOfClasses;

      course.put(" Java ", 6);
      course.put(" JavaScript ", 3);
      course.put(" typeScript ", 1);

      for (Map.Entry<String, Integer> cou: course.entrySet()) {
         System.out.println( cou. getKey() + "course duration: "+ cou.getValue()+"m");

      }

   }
}