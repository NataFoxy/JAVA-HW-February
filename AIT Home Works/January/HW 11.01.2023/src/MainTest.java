import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class MainTest {

    @Test
    public void combineTest(){

        List<String> testList = new ArrayList<>();
        testList.add(0, "I");
        testList.add(1, "do");
        testList.add(2, "my");
        testList.add(3, "homework");

        String expectedResult = "I do my homework"; // ожидается строка без пробела после последнего слова

        String actualResult = Main.combine(testList);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void combineTest2(){
        List<String> testList = new ArrayList<>();
        testList.add(0, "I");
        testList.add(1, null);
        testList.add(2, "my");
        testList.add(3, "homework");

        String expectedResult = "I my homework";
        String actualResult = Main.combine(testList);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void combineTest3(){
        List<String> testList = new ArrayList<>();
        testList.add(0, "I");
        testList.add(1, "");
        testList.add(2, "my");
        testList.add(3, "homework");

        String expectedResult = "I my homework";
        String actualResult = Main.combine(testList);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void rearrangeNameTest(){

        List<User> users = new ArrayList<>();
        users.add(0, new User("Johny", "Depp", 59));
        users.add(1, new User("Christian", "Bale", 48));
        users.add(2, new User("Meryl", "Streep", 73));
        users.add(3, new User("Cate", "Blanchett",53));

        String actualResult =

    }


}
