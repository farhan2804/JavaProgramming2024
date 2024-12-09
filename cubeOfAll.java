// Given two integers, find the sum of cubes of all numbers in the range 
// of n and m
// input n = 4; m = 9;
// output = 1989
 class cubeOfAll {
    public static void main(String args[]) {
        int n = 4;
        int m = 9;
        int sum = 0 ;
        int cube = 1;
        for (int i = n; i <= m; i++) {
            cube = i * i * i;
            sum += cube;
        }
        System.out.println(sum);
    }
}
