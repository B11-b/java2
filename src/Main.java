import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the number of the day you want from 1 to 7 : ");
        int Day = in.nextInt();

        switch (Day) {
            case 1:
                System.out.print("Saturday "+"\n");
                Saturday();
                break;
            case 2:
                System.out.print("Sunday"+"\n");
                Sunday_Monday();
                break;
            case 3:
                System.out.print("Monday"+"\n");
                Sunday_Monday();
                break;
            case 4:
                System.out.print("Tuesday");
                break;
            case 5:
                System.out.print("Wednesday"+"\n");
                Wednesday();
                break;
            case 6:
                System.out.print("Thursday"+"\n");
                Thursday();
                break;
            case 7:
                System.out.print("Friday"+"\n");
                Friday();
                break;
        }
    }
        public static void Saturday()
        {
            for (int row = 0; row <= 6; row++) //outer loop
            {
                if (row == 2) //check row 2
                {
                    System.out.println();
                    row++;
                }
                for (int columns = 6 - row; columns > 0; columns--) //space
                {
                    System.out.print(" ");
                }
                for (int s = 1; s <= row + (row - 1); s++) //star numbers
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
      public static void Sunday_Monday (){
         Scanner in = new Scanner(System.in);
         System.out.print("Enter the size of array = ");
         int size = in.nextInt();
         int array[] = new int [size];
         System.out.println("Enter the elements of the array one by one ");
         for(int i=0; i<size; i++) {
             array[i] = in.nextInt();
         }
         int length = array.length;
         int sum = 0;
           for (int i = 0; i < array.length; i++) {
             sum += array[i];
           }
            int average = sum / length;
            System.out.println("Average of array : "+average);
         }
     public static void Wednesday() {
         System.out.print("Enter 2D array size : ");
         Scanner in = new Scanner(System.in);
         int rows = in.nextInt();
         int columns = in.nextInt();
         System.out.println("Enter array elements : ");
         int twoD[][] = new int[rows][columns];
         for (int i = 0; i < rows; i++) {
             for (int j = 0; j < columns; j++) {
                 twoD[i][j] = in.nextInt();
             }
         }
         System.out.print("Array you entered : " +"\n");
         for (int[] x : twoD) {
             for (int y : x) {
                 System.out.print(y + "    ");
             }
             System.out.println();
         }
     } 
     public static void Thursday (){
         int array[]=new int[]{1,2,3,4};
         add5(array);
         for (int i=0; i < array.length ;i++){
             System.out.println("Numbers = " +array[i]);
         }
     }
     public static void add5(int array[]){

         for (int i=0; i < array.length ;i++){
              array[i]+=5;
         }
     }
     public static void Friday(){
      fr(5);
      fr(2.0f);
      fr("y");
     }
     public static void fr(int N){
         for (int i=1; i <N ;i++){
         System.out.println("OOP");
         }
     }
     public static void fr(Float x){
       float y=x*3;
         System.out.println(+y);
     }
     public static void fr(String F){
         System.out.println("Hello "   +F);
     }

}



