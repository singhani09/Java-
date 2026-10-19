class Sample{
    void disp(){
        System.out.println("Upcasting seekho");
    }
}
class Ampulses extends Sample{
    void tata(){
        System.out.println("downcasting seekho");
    }
    public static void main(String[]args){
        Sample s1 = new Ampulses();
        s1.disp(); 
        Ampulses a1 = (Ampulses)s1;
        a1.tata();
    }

}