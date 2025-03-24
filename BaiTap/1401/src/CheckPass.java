import java.util.Scanner;

public class CheckPass {
    public static int check(String name, String pass){
        if(name.equalsIgnoreCase("hello") && pass.length()>0){
            return 0;
        }
        return 1;

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username: ");
        String username = sc.nextLine();
        System.out.println("Enter password: ");
        String password = sc.nextLine();

        int d = 0;
        while(check(username, password) ==1 && d<3){
            System.out.println("Failed!!!!!");
            System.out.println("Enter username: ");
            username = sc.nextLine();
            System.out.println("Enter password: ");
            password = sc.nextLine();
            d++;

        }
        if (check(username, password)==0){
            System.out.println("OK");
        }
        else{
            System.out.println("Error");
        }


    }
}
