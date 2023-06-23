// A
// AB
// ABC
// ABCD
// ABCDE


class Solution {

    void printTriangle(int n) {
        // code here
        for(int i=0;i<n;i++){
            for(char j='A';j<='A'+i;j++){
                System.out.print(j);
            }
              System.out.println("");
        }
    }
}