package school;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Teacher {

         private String firstName;
         private String lastName;
         private String subject;
         private int  yearOfTeaching;



        public void setFirstName(String fName){
            this.firstName = fName;
        }
        public String getFirstName()
       {
        return firstName;
       }

        public void setLastName(String lName)
        {
            this.lastName = lName;
        }
       public String getLastName()
       {
        return lastName;
       }
       public void setSubject(String subject)
       {
        this.subject = subject;
       }
       public String getSubject()
       {
        return subject;
       }
       public void setYearOfTeaching(int yearOfTeaching)
       {
        this.yearOfTeaching = yearOfTeaching;
       }
       public int getYearOfTeaching()
       {
        return yearOfTeaching;
       }

       public void details()
       {
          String name = firstName + " " +  lastName ;
          System.out.println("Teacher's Name: " + name + "   Subject: "+ subject + "   Experience: " +yearOfTeaching );
       }

    }
