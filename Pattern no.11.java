// 1                 1
// 1 2             2 1
// 1 2 3         3 2 1
// 1 2 3 4     4 3 2 1
// 1 2 3 4 5 5 4 3 2 1


class Solution {

    void printTriangle(int n) {
        // code here
        int space=2*(n-1);
        for(int i=1;i<=n;i++){
            //number
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
        //spaces
        for(int j=1;j<=space;j++){
            System.out.print(" ");
        }
        //number
        for(int j=i;j>=1;j--){
            System.out.print(j);
        }
            space-=2;
            System.out.println("");
        }
    }
}