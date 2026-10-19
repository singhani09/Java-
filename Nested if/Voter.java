class Voter{
    public static void main(String[] args) {
        int age = 16;
        boolean isCitizen=true;
        if (age>=18){
            if(isCitizen){
                System.out.println("Allowed to vote");
            }else{
                System.out.println("Not a citizen cannot vote");
            }
        } else {
            System.out.println("underage cannot vote");
        }
    }
}