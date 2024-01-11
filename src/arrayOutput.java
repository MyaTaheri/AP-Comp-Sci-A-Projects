import java.util.Scanner;

public class arrayOutput {

  static void sortArray(int[] arr, int arrSize) {  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j]){  
                                 //swap elements  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }  
  
    }  
   public static void main(String[] args) {  

                 Scanner scnr = new Scanner (System.in);
      int listNum = scnr.nextInt();
                 int[] arr = new int[listNum];
      
            for (int i = 0; i < arr.length; ++i) 
             {
                 arr[i] = scnr.nextInt();
             }
                
                
                
                                  sortArray(arr, listNum);

                for (int i = 0; i < listNum; ++i) 
             {
                System.out.print(arr[i] + ",");
             }
               
               System.out.println();
                
                } 
 

}
