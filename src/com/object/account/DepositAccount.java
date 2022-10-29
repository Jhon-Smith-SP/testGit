package com.object.account;

//定义一个定期存款账户类

/**
 * DepositAccount:定期存款账户类
 *
 * @author liuxu5
 */
public class DepositAccount extends Accout {
    /**
     * 存款期限，单位：月
     */
    private int depositTerm;

    /**
     * 存款账户的构造方法
     */
    public DepositAccount(int depositTerm, String depositName) {
        super(depositName);
        this.depositTerm = depositTerm;
        //设置余额的单位
        setUnit("元");
    }

    /**
     * 获取存款的期限
     *
     * @return this.depositTerm
     */
    public int getDepositTerm() {
        return this.depositTerm;
    }

    /**
     * 设置存款的期限
     *
     * @param depositTerm
     */
    public void setDepositTerm(int depositTerm) {
        this.depositTerm = depositTerm;
    }

    /**
     * 这里的定期存款只能一次性全部取出，不能分批取出，适合整存整取、零存整取。
     *
     * @param amount
     * @return super.takeOut(amount)/false
     */
    @Override
    public boolean takeOut(long amount) {
        //全部取出
        if (amount == getBalance()) {
            return super.takeOut(amount);
        } else {
            return false;
        }
    }

    /**
     * 输出存款现金账户信息
     *
     * @return desc
     */
    @Override
    public String toString() {
        String desc = String.format("存款期限为%d个月，%s", this.depositTerm, super.toString());
        return desc;
    }
}
