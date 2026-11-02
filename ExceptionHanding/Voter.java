class Election extends Exception{
    private String warning ;
    Election(String warning){
        this.warning=warning;
    }
    public String getwarning(){
        return warning;
    }

}
class Poolingbooth {
    static int vage = 18;
    static void voting(int age) throws Election{
        if(vage<=age){
            System.out.println("you are elegible");
        }
        else{
            throw new Election("you are not eligible , invalid");
        }
    }
}
class Voter{
    public static void main(String[] args) {
        try {
            Poolingbooth.voting(15);
        } catch ( Election v) {
            System.out.println(v.getwarning());
        }
    }
}