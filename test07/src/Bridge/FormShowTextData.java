package Bridge;

import Adapter.CollectAPI;

public class FormShowTextData extends FormShowAbstract {
    //初始化FormShowTextData 以及调用父类的构造方法实例化成员变量
    public FormShowTextData(FormShow formShow) {
        super(formShow);
    }
    //报表展示方法，里边调用了桥接抽象类的showFrom方法，传入具体的收集方式参数，这个参数就是我们写的适配器，适配多个数据源
    public void showForm() {
        super.showForm((new CollectAPI("text")).collect("text"));
    }
}