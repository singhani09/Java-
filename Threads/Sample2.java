// run () and start() -- calling run method with start () it internally create a thread and calls the run() but we call run () directly it will act as a normal method and wont create any thread
class Demo extends Thread{
public void run(){
    for(int i = 0;i<=10;i++){
        try {
            Thread.sleep(500);
        } catch ( InterruptedException e) {
            e.printStackTrace();
        }
       System.out.println(i);
    }
}


}
class Sample2{
    public static void main(String[] args) {
        Demo d1 = new Demo();
        d1.start();
    }

}