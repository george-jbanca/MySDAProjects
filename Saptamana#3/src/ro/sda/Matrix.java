package ro.sda;
import java.util.Scanner;
public class Matrix {

    public static void printMatrix(int[][] myMatrix) {
        for(int i=0; i < myMatrix.length; i++){
            for(int j = 0; j < myMatrix[i].length; j++){
                System.out.print(myMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter matrix size :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Reading matrix " + n + " x " + n);
        int [][] a = new int[n][n];
        for(int i = 0; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                a[i][j] = sc.nextInt();
            }
        }
        printMatrix(a);
        sumLines(a);
        avarageLines(a);
        sumColumns(n, a);
        sumLines(n, a);
    }

    public static void sumLines(int[][] myMatrix ){

        for(int i=0;i<myMatrix.length;i++){
            int sum=0;
            for(int j=0;j<myMatrix[i].length;j++){

                sum=sum+myMatrix[i][j];
            }
            System.out.println("Suma elementelor pe linia " + (i+1) + " : " + sum);
        }

    }

    public static void avarageLines (int[][] myMatrix){


        for(int i = 0; i < myMatrix.length; i++){
            double avarage=0;
            double suma=0;
            for(int j = 0; j < myMatrix.length; j++){
                suma=suma+myMatrix[i][j];
                avarage=suma/(myMatrix[i].length);

            }
            System.out.println("Media elementelor din linia " + (i+1) + " : " + avarage);
        }
    }

    public static void sumLines(int size, int[][] myMatrix){
        for(int i = 0; i < size; i++){
            int sumL = 0;
            for (int j = 0; j < size; j++){
                sumL=sumL+myMatrix[i][j];
            }
            System.out.println("Suma elementelor de pe linia " + i + " este " + sumL);
        }
    }

    public static void sumColumns(int size, int[][] myMatrix){
        for(int j = 0; j < size; j++){
            int sumC = 0;
            for(int i= 0; i< size ;i++){
                sumC = sumC + myMatrix[i][j];
            }
            System.out.println("Suma elementelor de pe coloana " + j + " este " + sumC);
        }

    }
}