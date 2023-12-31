class Euclid {
    public static int gcd(int a, int b) {
        if(b == 0)
            return a;
        else 
            return gcd(b, a % b);
    }
    public static int gcd2(int a, int b) {
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = gcd(a, b);
        int c2 = gcd2(a,b);
        System.out.println("gcd(" + a + ", " + b + ")= " + c);
        System.out.println("gcd(" + a + ", " + b + ")= " + c2);
    }
}