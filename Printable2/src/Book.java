public class Book implements Printable{
    String name = null;
    Book(String name){
        this.name = name;
    }
    public void print() {
    }
    public static void printBooks(Printable[] printable){
        for (Printable printable1: printable){
            if (printable1 instanceof Book){
                System.out.println(((Book) printable1).name);
            }
        }
    }
}