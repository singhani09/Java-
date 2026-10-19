class Facebook{
    private String pwd = "Ani@123";

    public String getPwd(){
        return pwd;
    }
    public void setPwd(String pwd){
        this.pwd=pwd;
    }

}
class Mainclass1{
    public static void main(String[] args) {
        Facebook fb = new Facebook();
        System.out.println(fb.getPwd());
        fb.setPwd("Sak@123");
        System.out.println(fb.getPwd());

    }
}
