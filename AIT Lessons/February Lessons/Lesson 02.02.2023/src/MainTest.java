import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BooleanSupplier;

public class MainTest {
    @Test

    void listOfCarsByYear(){
        List<Car> list = List.of(
                new Car("Audi",2012, 35_000, 12_000),
                new Car("BMW",2016, 85_000, 8_000),
                new Car("Opel",2020, 11_800, 20_500),
                new Car("Mercedes",2022, 5_000, 120_000)
        );
        List<Car> actualResult =Main.listOfCarsByYear(list, 2018);
        List<Car> expectedResult = new ArrayList<>();

        expectedResult.add(new Car("Audi",2012, 35_000, 12_000));
        expectedResult.add(new Car("BMW",2016, 85_000, 8_000));

        Assertions.assertEquals(actualResult,expectedResult);
    }
@Test
    void listOfCarsByLetter(){
        List<Car> list = List.of(
                new Car("Audi",2012, 35_000, 12_000),
                new Car("BMW",2016, 85_000, 8_000),
                new Car("Opel",2020, 11_800, 20_500),
                new Car("Mercedes",2022, 5_000, 120_000)
        );
        List<Car> actualResult =Main.listOfCarsByLetter(list, 'B');
        List<Car> expectedResult = new ArrayList<>();

        expectedResult.add(new Car("BMW",2016, 85_000, 8_000));

        Assertions.assertEquals(actualResult,expectedResult);
    }

    @Test

    void newListOfCars(){




        List<Car> actualResult =Main.newListOfCars(list, new MyPredicate() {
            @Override
            public boolean test(Car car) {
                return car.getYear()<= 2020;
            }
        });
        List<Car> expectedResult = new ArrayList<>();

        expectedResult.add(new Car("Audi",2012, 35_000, 12_000));
        expectedResult.add(new Car("BMW",2016, 85_000, 8_000));

        Assertions.assertEquals(actualResult,expectedResult);
    }

    void newListOfCars1(){
        List<Car> list = List.of(
                new Car("Audi",2012, 35_000, 12_000),
                new Car("BMW",2016, 85_000, 8_000),
                new Car("Opel",2020, 11_800, 20_500),
                new Car("Mercedes",2022, 5_000, 120_000)
        );
        List<Car> actualResult =Main.newListOfCars(list, new MyPredicate() {
            @Override
            public boolean test(Car car) {
                return car.getModel().charAt(0)=='B';
            }
        });
        List<Car> expectedResult = new ArrayList<>();

        expectedResult.add(new Car("BMW",2016, 85_000, 8_000));

        Assertions.assertEquals(actualResult,expectedResult);
    }

}
