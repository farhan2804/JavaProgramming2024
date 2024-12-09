 class sumOfTable {
    public static void main(String args[]) {
        int n = 10;
        int sum = 0;
        int multiplication = 1;
        for (int i = 1; i <= 10; i++) {
            multiplication = n * i;
            sum += multiplication;
        }
        System.out.println(sum);
    }
}
