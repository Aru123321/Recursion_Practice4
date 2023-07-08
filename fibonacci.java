public class fibonacci {
    // return nth fibonacci number 
    public static int fibonacci(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int fnm1 = fibonacci(n-1);
        int fnm2 = fibonacci(n-2);
        int fn = fnm1+fnm2;
        return fn;
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(fibonacci(n));
    }
}
