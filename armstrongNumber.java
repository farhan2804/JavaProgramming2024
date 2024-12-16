// input = {153,371,108}; 
// return the armstrong numbers in the array
//output - 153, 371
class armstrongNumber {
    // function to check armstrong
    public static boolean findArmstrong(int n) {
        int length = 0;
        // one while loop for finding the length of number;
        int temp1 = n;
        int temp2 = n;
        while (temp1 > 0) {
            int dig = temp1 % 10;
            length++;
            temp1 /= 10;
        }
        //one while loop for sum of numbers
        int sum = 0;
        while (temp2 > 0) {
            int dig = temp2 % 10;
            sum += Math.pow(dig, length);
            temp2 /= 10;
        }
        if (n == sum) {
            return true;
        }
        return false;
    }

    public static void main(String args[]) {
        int arr[] ={153, 371, 108};
        System.out.println("Armstrong Numbers are");
        for (int i = 0; i < arr.length; i++) {
            if (findArmstrong(arr[i])) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
