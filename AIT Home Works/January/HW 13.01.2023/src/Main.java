//Создайте классы товаров: Food, Electronics, Clothes …….
//Создайте родительский класс, например Product объединяющий все товары
//Создайте массив Product[]
//Создайте несколько классов, которые implements Comparator<Product>
//Создайте метод который в качестве параметра получает массив (или лист) из Product и Comparator<Product>
// и вызывает сортировку используя переданный компаратор.
//Реализуйте метод, который предлагает пользователю выбрать способ сортировки и создает соответствующий объект класса,
// имплементирующего Comparator<Product>

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
                products.add(new Food("Meat", 14.5, "f001", false));
                products.add(new Food("VeganMeat", 21.3, "F002", true));
                products.add(new Clothes("Jacket", 89.90, "J001"));
                products.add(new Food("Milk", 0.99, "F003", false));
                products.add(new Food("Cucumbers", 1.69, "F004", true));
                products.add(new Clothes("shirt", 39.59, "C001"));

        System.out.println(products);
                ProductComparator[]comparators = {
                        new ProductComparatorByName(),
                        new ProductComparatorByPrice()
                };

        ComparatorSelector comparatorSelector = new ComparatorSelector(comparators);
        ProductComparator comparator = comparatorSelector.select();

        if(comparator!=null){
            System.out.println("-------------- sort by " + comparator.name() + " ----------------------");
            products.sort(comparator);
        }
        else{
            System.out.println("-------------- sort---------------------");
            Collections.sort(products);
        }
        System.out.println(products);



    }
}