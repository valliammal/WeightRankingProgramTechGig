/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
import java.util.Arrays; 
public class Main {
   public static void main(String args[] ) throws Exception {

      int N;  
      Scanner sc=new Scanner(System.in);  
      //reading the number of People whose weight needs to be ranked 
      N=sc.nextInt();  
      int P;  
      //reading the number of People whose weight needs to be ranked 
      P=sc.nextInt();  

      //creates an array in the memory of length 10  
      Integer[] array = new Integer[N+P];  
      for(int i=0; i<N; i++)  
      {  
         //reading array elements from the user   
         array[i]=sc.nextInt();  
      }  

      Integer[] arr = new Integer[P];  
      for(int i=0; i<P; i++)  
      {  
         //reading array elements from the user   
         int temp = sc.nextInt(); 
         array[N+i]=temp;  
         arr[i] = temp;
      }  

      int[] rank = new int[P+N];  
      int[] rankP = new int[P];  
      int rankVal = 1;
      int prevRank = 0;
      Arrays.sort(array, Collections.reverseOrder());
      //prints array using the for loop  
      int j = 0;
      for (int i = 0; i < N+P; i++)   
      {    
         if (i == 0) {
            rank[j] = rankVal;
         } else if (array[i] < array[i-1]) {
                j++;
               rank[j] = rankVal + 1;
               rankVal = rankVal + 1;
        }  else if (array[i] == array[i-1]) {
                j++;
               rank[j] = rankVal;
               rankVal = rankVal;
         }
      }

      for (j = 0 ; j < P; j++) {
          for (int i=0; i < P+N; i++) {
            if (arr[j] == array[i]) 
                rankP[j] = rank[i];
          }    
      }
      for (int i = 0; i < P; i++) {
            System.out.println(rankP[i]);
      }
      
    }  
    
}
