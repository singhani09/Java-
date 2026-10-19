class Calculator{
    void add(int a , int b){
        System.out.println(a*b);

    }
    void add(int a, int b,int c){
        System.out.println(a+b+c);
    }
    void add(int a,int b, int c, int f){
        System.out.println(a*b+c/f);
    }
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.add(1,4);
        c1.add(1,4,7);
        c1.add(4,98,74,234);

        
    }
}