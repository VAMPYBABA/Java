import java.util.Scanner;


public class Reversearray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int size = sc.nextInt(); //array size input from user
        int array1[] = new int[size]; //declaring array size

        for(int i=0;i<size;i++)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
        {
            array1[i] = sc.nextInt(); //for loop to place input index wise
        }
        System.out.println();
        System.out.println("The reversed array is : ");
        for (int i = array1.length - 1; i >= 0; i--) { //reverse array loop
            System.out.print(array1[i] + " ");
        }
       
    }
}