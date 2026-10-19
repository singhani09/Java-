class Netflix{
    private String pwd = "aniisak@123";

    public String getpwd(){
        return pwd;
    }
    public void setpwd(String pwd){
        this.pwd=pwd;
    }
}
class Mainclass7{
    public static void main(String[] args){
       Netflix net = new Netflix();
        System.out.println(net.getpwd());
        net.setpwd("Sehanazzz3");
        System.out.println(net.getpwd());

    }
    
}
