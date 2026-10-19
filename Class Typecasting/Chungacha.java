class Cola2{
    int f = 56;

}
class Chungacha extends Cola2{
    int d = 45;

    public static void main(String[] args) {
        Cola2 c1 = new Chungacha();
        System.out.println(c1.f);
        Chungacha c2 = (Chungacha)c1;
        System.out.println(c2.d);
    }}
