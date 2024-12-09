 class missingNumber {
    public static void main(String args[]) {
        int arr[] = {1,2,4,5};
        int sum1= 0;
        int sum2= 0;
        for(int i = 0; i < arr.length; i++) {
            sum1 += arr[i];
        }
        for(int  i = 1; i <= arr.length + 1; i++) {
            sum2 += i;
        }
        int missingNumber = Math.abs(sum2 - sum1);
        System.out.println(missingNumber);
     }
}
