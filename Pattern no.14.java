// ABCDE
// ABCD
// ABC
// AB
// A


class Solution {

    void printTriangle(int n) {
        // code here
        for(int i=0;i<n;i++){
            for(char j='A'; j<='A'+(n-i-1);j++ ){
                System.out.print(j);
            }
             System.out.println();
        }
    }
}