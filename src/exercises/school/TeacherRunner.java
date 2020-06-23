package school;

public class TeacherRunner {
    public static void main(String[] args){

        Teacher teacher1 = new Teacher();
        Teacher teacher2 = new Teacher();
        Teacher teacher3= new Teacher();
        teacher1.setFirstName("Sam");
        teacher1.setLastName("Athreya");
        teacher2.setFirstName("Tiger");
        teacher2.setLastName("chandra");
        teacher3.setFirstName("Marray");
        teacher3.setLastName("james");
       // System.out.println(teacher1.getFirstName());

        teacher1.setSubject("Maths");
        teacher1.setYearOfTeaching(5);
        teacher2.setSubject("Science");
        teacher2.setYearOfTeaching(7);
        teacher3.setSubject("computers");
        teacher3.setYearOfTeaching(3);

        teacher1.details();
        teacher2.details();
        teacher3.details();

    }
}
