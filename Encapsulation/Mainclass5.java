class Groww{
    private String pwd = "ani@123";

    public String getpwd(){
        return pwd;
    }
    public void setpwd(String pwd){
        this.pwd=pwd;
    }
}
class Mainclass5{
    public static void main(String[] args){
        Groww gro = new Groww();
        System.out.println(gro.getpwd());
        gro.setpwd("Sakshi4");
        System.out.println(gro.getpwd());

    }
    
}
   