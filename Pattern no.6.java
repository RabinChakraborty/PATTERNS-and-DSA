//   *
//  * *
//  * **
//  * ***
//  * ****
//  * ****
//  *  * **
//  *  * *
//  * *
//  * 


class Solution {

    void printDiamond(int n) {
        // Your code here
        for(int i=0;i<n;i++){
            //space bfr
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            //straight
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
         for(int i=n;i>0;i--){
              //space bfr
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            //reverse
            for(int j=i;j>0;j--){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}