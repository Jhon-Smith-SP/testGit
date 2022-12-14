package com.object.account;

//定义一个账户类
public class Accout {
    //账户名称
    private String name;
    //账户余额
    private long balance;
    //余额单位
    private String unit;

    //账户的构造方法
    public Accout(String name) {
        this.name = name;
        this.balance = 0;
    }

    //获取账户的名称
    public String getName() {
        return this.name;
    }

    //设置账户的名称
    public void setName(String name) {
        this.name = name;
    }

    //获取账户的余额
    public long getBalance() {
        return this.balance;
    }

    //设置账户的余额
    public void setBalance(long balance) {
        this.balance = balance;
    }

    //获取余额的单位
    public String getUnit() {
        return this.unit;
    }

    //设置余额的单位
    public void setUnit(String unit) {
        this.unit = unit;
    }

    //存入操作。返回true表示买入成功，false表示买入失败
    public boolean saveIn(long amount) {
        if (amount > 0) {
            //余额增加
            this.balance += amount;
            return true;
        } else {
            return false;
        }
    }

    //取出操作。返回true表示取出成功，false表示取出失败
    public boolean takeOut(long amount) {
        if (amount > 0) {
            this.balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    //输出账户信息
    @Override
    public String toString() {
        String dese = String.format("名称为%s，余额为%d%s", this.name, this.balance, this.unit);
        return dese;
    }
}
