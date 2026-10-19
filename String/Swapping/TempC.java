class TempC{
    public static void main(String[] args) {
        char a = 'A';
        char b = 'Z';
        char c = 'B';
        char temp = a;
        a = b;
        b = temp;
        temp = c;
        c = a ;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}