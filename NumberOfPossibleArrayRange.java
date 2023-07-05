/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class CandidateCode {
	static int singlePossibleArray(int N, int K, String arrayVal)
	{

        String result = "";
        char[] cArray = arrayVal.toCharArray();
        int totCharacters = cArray.length;
        int numOfPossibleArrays = 0;
        for (int i = 0; i < K; i++) {
            if (totCharacters == K) {
                    if (i == totCharacters - 1)
                        result += "\"" + cArray[i] + "\"";
                    else
                        result += "\"" + cArray[i] + "\"" + ',';
                numOfPossibleArrays = 1;    
            } else if (totCharacters < K) {
                for (int j = 0; j < totCharacters; j++) {
                    if (j == 0) {
                        result += "\n" + "\"" + cArray[j] + "\"" + "," + "\"" + arrayVal.substring(j+1) + "\""  + "\n";
                    } else if (j <= totCharacters - 2) {
                        result += "\"" + arrayVal.substring(0,j+1) + "\"" + "," + "\"" + arrayVal.substring(j+1) + "\"" + "\n";
                    } else if (j == totCharacters - 1) {
                        result += "\"" + cArray[0] + "\"" + "," + "\"" + arrayVal.substring(1) + "\"" + "\n";
                    }
                    numOfPossibleArrays++;
                }
                result += "," + "\"" + arrayVal + "\"" ;
                numOfPossibleArrays++;
                break;
            }
        }
        return numOfPossibleArrays;
	}

   public static void main(String args[] ) throws Exception {
	{
	  int N;  
      Scanner sc=new Scanner(System.in);  
      //reading the number of People whose weight needs to be ranked 
      N=sc.nextInt();  
      int K;  
      //reading the number of People whose weight needs to be ranked 
      K=sc.nextInt();
      String arrayVal;
      arrayVal = sc.nextLine();
      String enterChar = sc.nextLine();
	  int numberOfPossibleArrays = singlePossibleArray(N, K, enterChar);
	  System.out.println(numberOfPossibleArrays);	
	}
  }
   
}


