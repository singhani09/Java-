// create a thread by implementing the properties from runnable
class Sample implements Runnable{
    public void run(){
        for(int i = 1; i <=10;i++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}
class Mainclass1{
    public static void main(String[] args) {
        Sample s1 = new Sample();
        Thread t1 = new Thread(s1);
        t1.start();
    }
}