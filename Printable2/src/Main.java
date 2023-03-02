public class Main {
    public static void main(String[] args) {
        Book Book1 = new Book("Мертвые души");
        Book Book2 = new Book("Капитанская дочка");
        Magazine Magazine1 = new Magazine("Вести");
        Magazine Magazine2 = new Magazine("Новости Владимир");

        Printable[] printables = {Book1, Book2, Magazine1, Magazine2};
        for (Printable print : printables) {
            print.print();
        }
        Book.printBooks(printables);
        Magazine.printMagazines(printables);
    }
}