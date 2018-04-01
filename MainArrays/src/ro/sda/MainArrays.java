package ro.sda;
import java.util.Scanner;
public class MainArrays {

    public static void printArray(int[] myArray){
        for(int i=0;i<myArray.length;i++){
            System.out.println(myArray[i] + " ");
        }
    }

    public static int positionOfElementInArray(int[] x,int n,int e){
        //Presupunem initial ca acesta nu exista in array;
        int position=-1;
        //parcurgem array si cautam elemntul;
//        for(int i=0;i<n;i++){
//            if(pozitie < 0 && a[i] == e){           For-ul asta este echivalent cu while-ul de mai jos;
//                pozitie=i;
//            }
//        }
        int i=0;
        while(position<0 && i<n){
            if(x[i] == e){
                position=i;
            }
            i++;
        }
        return position;
    }

    public static int[] removeDuplicates(int[] myArray, int n){
        int nrOfUniqueElements=0;
        int [] myUnique= new int[n];
        for(int i=0;i<n;i++){
            int e=myArray[i];
            int position = positionOfElementInArray(myArray,n,e);
            if(position==i){
                myUnique[nrOfUniqueElements] = e;
                nrOfUniqueElements++;
            }
        }
        return myUnique;
    }

    public static void main(String[] args){
                                                    //      Gasirea pozitiei unui element intr-un array;
                                                    //Citim n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cititi n :");
        int n= sc.nextInt();
                                                    //Citim array[n];
        System.out.println("Cititi " + n + " elemente: ");
        int[] a = new int[n];
                                                    //Afisam array[n];
//        for (int i=0;i<n;i++){
//            a[i]=sc.nextInt();
//        }
//        for(int i=0;i<n;i++){
//            System.out.println(a[i]+ " ");
//        }
                                                     //Citim elementul cautat;
        System.out.println("Cititi elementul cautat: ");
        int e=sc.nextInt();
        int pozitie=positionOfElementInArray(a,n,e);
                                                     //Afisam raspunsul
        if(pozitie >= 0){
            System.out.println("Pozitia lui " + e + " este " + pozitie );
        } else {
            System.out.println("Nu am gasit elementul "+ e );
        }

        int []aUnique=removeDuplicates(a,n);
        printArray(aUnique);
    }
}
