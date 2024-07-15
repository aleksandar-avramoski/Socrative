import java.util.Scanner;

public class TeacherAccount {
    public static String firstName;
    public static String lastName;
    public static String email;
    public static long password;
    public static String country;

    public void teacherAccount(){

        Scanner scanner=new Scanner(System.in);
        Scanner scanner1=new Scanner(System.in);
        System.out.println(" ");

        //FIRST NAME
        System.out.println("First name:");
        firstName=scanner.nextLine();
        System.out.println(" ");

        //LAST NAME
        System.out.println("Last name:");
        lastName=scanner.nextLine();
        System.out.println(" ");

        //EMAIL
        System.out.println("Email:");
        email=scanner.nextLine();
        System.out.println(" ");

        //PASSWORD
        System.out.println("Password:");
        System.out.println("The password must have 6 numbers");

        for (; ; ) {
            password = scanner1.nextLong();

            String passwordLength = String.valueOf(password);

            if (passwordLength.length() == 6) {
                break;
            } else {
                System.out.println(" ");
                System.out.println("The password must have 6 numbers!");
            }
        }
        System.out.println(" ");

        //COUNTRY
        System.out.println("Country:");
        country=scanner.nextLine();
        System.out.println(" ");

        System.out.println("Account is created!");
        System.out.println(" ");

    }
}
