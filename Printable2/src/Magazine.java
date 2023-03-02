public class Magazine implements Printable{
    String name = null;
    Magazine(String name){
        this.name = name;
    }
    public void print() {
    }
    public static void printMagazines(Printable[] printable){
        for (Printable printable1: printable){
            if (printable1 instanceof Magazine){
                System.out.println(((Magazine) printable1).name);
            }
        }
    }
}

