class Snapchat{
    private String pwd = "ani@123";

    public String getpwd(){
        return pwd;
    }
    public void setpwd(String pwd){
        this.pwd=pwd;
    }
}
class Mainclass4{
    public static void main(String[] args){
        Snapchat snap = new Snapchat();
        snap.getpwd();
        snap.setpwd("ani@34");
        System.out.println(snap.getpwd());

    }
    
}
    
