class Sample10{
    public static void main(String[] args) {
        System.out.println("Main starts");
        try {
            int x = 1/0;
        } catch (Exception e) {
            System.out.println("handled");
        }
        System.out.println("Main ends");
    }
}