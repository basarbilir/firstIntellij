import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Rectangle testJava1 = new Rectangle(2, 3);
        Factorial testJava3 = new Factorial();
        System.out.println("factorial "+testJava3.fac(4));

        /*Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter a number: ");
        int n = reader.nextInt();
        System.out.println("Girdiğin sayının 2 katı: " + n*2 +" dir." );*/

        Triangle t = new Triangle(5,2);
        Rectangle r = new Rectangle(12,3);
        Triangle t1 = new Triangle(8,9);

        List<Shape> shapes = new ArrayList<>();

        shapes.add(t);
        shapes.add(r);
        shapes.add(t1);

        shapes.forEach(s -> System.out.println(s.calculateArea()));

        System.out.println(getArea(t));

        Dog Mike = new Dog ("Mike");
        System.out.println(Mike.shout());

        Cat Pichu = new Cat ("Pichu");
        System.out.println(Pichu.shout());

        Cat Boncuk = new Cat ("Pichu", "Basar");
        System.out.println(Boncuk.callOwner());
        System.out.println(Boncuk.shoutOwnName());
        System.out.println(Boncuk.callOwnerName());

    }


    public static int getArea(Shape s){
        return s.calculateArea();
    }
}
