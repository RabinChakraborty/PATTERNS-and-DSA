// 1 
// 0 1 
// 1 0 1
// 0 1 0 1 
// 1 0 1 0 1


class Solution {

    void printTriangle(int n) {
        // code here
        int a=0;
        for(int i=0;i<n;i++){
            if(i%2==0) a=1;
            else a=0;
            
            for(int j=0;j<=i;j++){
             System.out.print(a+" ");
             a=1-a;
            }
            System.out.println("");
        }
    }
}