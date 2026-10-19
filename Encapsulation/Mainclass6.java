class Youtube{
    private String pwd = "ani@123";

    public String getpwd(){
        return pwd;
    }
    public void setpwd(String pwd){
        this.pwd=pwd;
    }
}
class Mainclass6{
    public static void main(String[] args){
        Youtube you = new Youtube();
        System.out.println(you.getpwd());
        you.setpwd("Sehansha33");
        System.out.println(you.getpwd());

    }
    
}
  