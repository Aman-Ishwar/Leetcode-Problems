class Solution {
    public int xorOperation(int n, int start) {
        int arr[]=new int[n];
        int bit_wise=start;
        for(int i=1;i<n;i++){
            arr[i]=start+(2*i);
           bit_wise^=arr[i] ;
        }
        // for(int i=0;i<n;i++){
        //     bitwise
        // }
        return bit_wise;
    }
}