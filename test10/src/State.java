public class State implements Cloneable{
    private int version;

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        // clone() 方法对属性进行逐个复制，但引用类型属性只会浅拷贝，需要深拷贝则重写
        return super.clone();
    }
}
