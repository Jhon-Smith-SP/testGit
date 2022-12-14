package com.object.account;

//定义一个现金账户类
public class CashAccount extends Accout {
    public final static int RMB = 0;//人民币
    public final static int HKD = 1;//港币
    public final static int USD = 2;//美元
    public final static int EUR = 3;//欧元
    public final static int GBP = 4;//英镑
    public final static int JPY = 5;//日元
    public final static String[] typeNames = new String[]{"人民币", "港币", "美元", "欧元", "英镑", "美元"};
    private int cashType;//现金类型

    //现金账户的构造方法
    public CashAccount(int cashType, String cashName) {
        super(cashName);
        this.cashType = cashType;
        setUnit(cashType == GBP ? "镑" : "元");//设置余额单位
    }

    //设置现金的类型
    public void setCashType(int cashType) {
        this.cashType = cashType;
    }

    //输出现金账户信息
    @Override
    public String toString() {
        String desc = String.format("现金类型为%s，%s", typeNames[this.cashType], super.toString());
        return desc;
    }
}
