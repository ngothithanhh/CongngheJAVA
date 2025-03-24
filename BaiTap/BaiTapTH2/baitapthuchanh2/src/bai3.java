import java.util.Scanner;

public class bai3 {
    public static final char SPACE = ' ';
    public static final char TAB = '\t';
    public static final char BREAK_LINE = '\n';

    public void run(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi ky tu: ");
        String str = sc.nextLine();
        int d = 0;
        if(str == null){
            System.out.println("Error ! ! !");
        }
        else {

            int size = str.length();
            boolean notCounted = true;
            for(int i = 0; i < size; i++){
                if(str.charAt(i) != SPACE && str.charAt(i) != TAB && str.charAt(i) != BREAK_LINE){
                    if(notCounted){
                        d++;
                        notCounted = false;
                    }
                }
                else{
                    notCounted = true;
                }
            }
        }
        System.out.printf("Chuoi nhap vao co %d tu\n",d);



    }
}
