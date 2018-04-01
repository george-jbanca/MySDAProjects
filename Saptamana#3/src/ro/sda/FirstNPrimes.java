package ro.sda;
import java.util.Scanner;
//Prints out first N primes.

public class FirstNPrimes {
    public static void printArray(int[] myArray ){
        for(int k=0;k < myArray.length; k++){
            System.out.print(myArray[k]+" ");
        }
    }
    public static void printFirstNPrimes(int n){
        int primesFound = 0;
        int i = 2;
        int [] primes = new int [n];
        while(primesFound<n){
            int divisors=0;
            int j=2;
            while(j<=(i/2)&&divisors==0){
                if(i%j==0) {
                    divisors++;
                }
                j++;
            }
            if(divisors==0){
                primes[primesFound]=i;
                primesFound++;
            }
            /*if(divisors==0){
                System.out.println("Numarul "+ i + " este prim");
                primesFound++;
            }*/
            i++;
        }
        System.out.println("Numere prime gasite :");
       /* for(int k=0;k<n;k++){
            System.out.print(primes[k]);
            System.out.print(" ");
        }*/
        printArray(primes);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter n: ");
        int n=scanner.nextInt();
        System.out.println("Determining first "+ n + " n primes");

        printFirstNPrimes(n);

    }
}