package com.object.account;

/**
 * 演示各类账户类的使用
 *
 * @author liuxu5
 */
public class TestAccount {

    public static void main(String[] args) {
        //演示银行账户的操作
        testBankAccount();
    }

    /**
     * 演示银行账户的操作
     */
    private static void testBankAccount() {
        //创建一个银行账户
        BankAccount bank = new BankAccount();
        //活期账户存入5000元
        bank.saveCurrent(5000);
        //存入6个月定期的5000元
        bank.saveDeposit(6, 5000);
        System.out.println("第一次存款操作之后," + bank);
        //活期账户取出2000元
        bank.takeCurrent(2000);
        //取出6个月定期存款
        bank.takeDeposit(6);
        //存入12个月定期的5000元
        bank.saveDeposit(12, 5000);
        System.out.println("第二次存款操作之后，" + bank);
    }
}
