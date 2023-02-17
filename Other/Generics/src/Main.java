public class Main {
    public static void main(String[] args) {

        Backpack<Book> nikePack= new Backpack<>("Nike", new Book("Java for pandas"));
        System.out.println(nikePack);

        Backpack<Book> addidasPack = new Backpack<>("Addidas", new Ficrion("LOTR"));
        System.out.println(addidasPack);
    }
}