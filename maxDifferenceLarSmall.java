 class maxDifferenceLarSmall {
    public static void main(String args[]) {
        int arr[]= {-3,-5,1,6,-7,8,11};
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        int difference = largest - smallest;
        System.out.println(difference);
    }
}
