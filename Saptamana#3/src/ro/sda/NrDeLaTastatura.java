package ro.sda;
import java.util.Scanner;
public class NrDeLaTastatura {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int max=0;
        int min=0;
        int nr=0;

        while (counter < 5) {
            System.out.println("Introduceti numarul:");
            int x = scanner.nextInt();
            if (x > 0) {
                counter = counter + 1;
                System.out.println("Numarul" +" " + x +" "+ "este pozitiv");
            }
            else {
                System.out.println("Numarul" +" " + x +" "+ "este negativ");
            }
            if (counter<=1){
                max=x;
                min=x;
            }
            if(x>max){
                max=x;
            }
            if(x<min){
                min=x;
            }
            nr++;
        }
        System.out.println("-------------------");
        System.out.println("Maximul este :" + max);
        System.out.println("-------------------");
        System.out.println("Numarul de numere introduse este :" + nr);
        System.out.println("-------------------");
        System.out.println("Minimul este :"+min);
    }
}