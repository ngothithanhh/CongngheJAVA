import java.util.Scanner;


public class DemTu {
    public static final char SPACE = ' ';
    public static final char TAB = '\t';
    public static final char BREAK_LINE = '\n';

    public static int countWords(String input){
        if(input == null){
            return -1;
        }
        int count = 0;
        int size = input.length();
        boolean notCounted = true;
        for(int i = 0; i < size; i++){
            if(input.charAt(i) != SPACE && input.charAt(i) != TAB && input.charAt(i) != BREAK_LINE){
                if(notCounted) {
                    count++;
                    notCounted = false;

                }
            }
            else notCounted = true;
        }
        return count;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        System.out.println("Chuoi da cho: " + input);
        if(countWords(input)!=-1) System.out.println("So tu co trong chuoi: " + countWords(input));
        else System.out.println("Khong co!!!!");


    }
}
