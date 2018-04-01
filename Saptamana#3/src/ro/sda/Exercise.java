package ro.sda;

public class Exercise {

    public static int sum(int a,int b){
       return a+b;
    }

    public static int multiply(int a,int b){
       return a*b;
    }

    public static int sumArray(int[]myArray){

        int sumOfArray = 0;

        for(int i = 0; i < myArray.length; i++) {
            //sumOfArray = sumOfArray + myArray[i];
            sumOfArray=sum(sumOfArray,myArray[i]);
        }
        return sumOfArray;
    }

    public static void main(String[] args){

        int x=5;
        int y=3;
        int z=sum(x,y);

        System.out.println(z);

        System.out.println(multiply(x,y));

        int[] numbers={5,8,9,23};

        int sumOfArray=sumArray(numbers);

        System.out.println(sumOfArray);

    }
}
