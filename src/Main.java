import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int age;
        String firstName;
        String favoriteFood;
        System.out.println("Enter.age");
        age= s.nextInt();
        s.nextLine();
        System.out.println("Enter your first name");
        firstName=s.nextLine();
        System.out.println("Enter your favorite food");
        favoriteFood=s.nextLine();
        System.out.println(age+firstName+favoriteFood);

    }

}