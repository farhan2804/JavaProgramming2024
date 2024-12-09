 class sumOfNtermsFibonacci {
    public static void main(String args[]) {
        int n= 5;
        int a = 0;
        int b = 1;
        int sum = a + b;
        while( n-2 > 0) {
            int c = a + b;
            sum += c;
            a = b;
            b = c;
            n--;
        }
        System.out.println(sum);
    }
}
