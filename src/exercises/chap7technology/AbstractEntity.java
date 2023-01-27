package exercises.chap7technology;
import java.lang.Math;
public abstract class AbstractEntity {
    // force every class to create an idNumber
    private Integer randomNum;
    //
    public abstract void idNumber();
    // each class needs to implement
    // this.randomNum = (int)(Math.random() * range) + min;
}
