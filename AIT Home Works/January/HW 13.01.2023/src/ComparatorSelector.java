import java.util.Scanner;

public class ComparatorSelector {

    ProductComparator [] comparators;

    public ComparatorSelector(ProductComparator[] comparators) {
        this.comparators = comparators;
    }

    public ProductComparator select(){
        System.out.println("Select comparator:");
        for (int i = 0; i < comparators.length; i++) {
            System.out.printf("%d. %s %n", i, comparators[i].name());
        }
        Scanner sc =new Scanner(System.in);
        int choice = sc.nextInt();
        if(choice<0 || choice>=comparators.length){
            return null;
        }
        else {
            return comparators[choice];
        }
    }
}
