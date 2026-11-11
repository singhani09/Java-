// Multi threading executing multiple threads simultaneously
class Songs {
    public static void song1(){
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Tara tara tara tara");
            
        }
    }
     public static void songs2(){
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(500);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("de dana dan");
            
        }
    }
}
class Thread1 extends Thread{
    public void run(){
        Songs.song1();
    }
}
class Thread2 extends Thread{
    public void run(){
        Songs.songs2();
    }
}
class Mainclass3{
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
    }
}