// *********
//  *******
//   *****
//    ***
//     *


class Solution {

    void printTriangle(int n) {
        // code here
    for(int i=0;i<n;i++){
        //space before
        for(int j=0;j<i;j++){
            System.out.print(" ");
        }
        //stars
         for(int j=0;j<n*2-(i*2+1);j++){
            System.out.print("*");
        }
        System.out.println("");
    }
    }
}