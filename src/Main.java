import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int k, total=0,numbers=0;
        double average;
        Scanner inp = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        k = inp.nextInt();

        for(int i=0; i<=k; i++){
            if ((i%3==0)&&(i%4==0)){
                total += i;
                numbers++;
            }
        }average = total / numbers;
        System.out.println("Ortalamanız: " + average);
    }
}