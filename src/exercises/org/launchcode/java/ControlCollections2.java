package exercises.org.launchcode.java;

public class ControlCollections2 {
    public static void main(String[] args){

        //creating array
        int[] numArray = {1, 1, 2, 3, 5, 8};

        for (int i = 0; i < numArray.length; i++) {
            if(!((i%2) ==0))
                System.out.println(numArray[i]);
        }

    }
}
