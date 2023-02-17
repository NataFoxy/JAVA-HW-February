package SecondTusk;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Main2Test {

    @Test

    void homeWorkList(){
        List<Student> testList = List.of(
                new Student("Alex", 5),
                new Student("Alla", 3),
                new Student("Ivan", 2),
                new Student("Sam", 5),
                new Student("Alex", 1)
        );

        List<Student> actualResult = Main2.homeWorkList(testList);

        List<Student> expectedResult = List.of(
                new Student("Alex", 5),
                new Student("Sam", 5),
                new Student("Alla", 3),
                new Student("Ivan", 2),
                new Student("Alex", 1)
        );

        Assertions.assertEquals(actualResult,expectedResult);

    }
}
