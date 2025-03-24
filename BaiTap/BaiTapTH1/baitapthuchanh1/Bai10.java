package baitap.baitapthuchanh1;

public class Bai10 {
    public void run(){
        int max_cho = 100/4;
//        int max_ga = 100/2;

        for(int i = max_cho; i > 0; i--){
            int j = 36-i;
            if((i*4)+(j*2)==100){
                System.out.printf("So ga: %d\n",j);
                System.out.printf("So cho: %d\n",i);
                break;
            }
        }
    }
}
