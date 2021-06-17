public class IdentityCardNo {
    private static IdentityCardNo instance=null;  //静态私有自身变量
    private String no;

    private IdentityCardNo(){    //私有构造方法

    }

    public static IdentityCardNo getInstance(){    //静态公有方法
        if(instance==null){
            System.out.println("第一次办理身份证，分配新号码！");
            instance=new IdentityCardNo();
            instance.setIdentityCardNo("No12345");
        }
        else{
            System.out.println("重复办理身份证，获取旧号码！");
        }
        return instance;
    }

    private void setIdentityCardNo(String no){
        this.no=no;
    }
    public String getIdentityCardNo(){
        return this.no;
    }
}
