//sleep method (it delays the execution time)
class Sample1{
    public static void main(String[] args) {
        for(int i = 1; i<=10;i++){
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
System.err.println(i);
    }
}
}