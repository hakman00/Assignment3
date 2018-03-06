package com.kleinpix;

/*
    Name    :   Heinrich Klein
    Student#:   195032659
    Date    :   01 March 2018
    Descript:   Application containing Springframework and multiple implemetation of interfaces
 */

import junit.framework.TestCase;
import org.junit.Test;
import org.testng.annotations.BeforeMethod;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.annotations.AfterMethod;

public class AppTest extends TestCase
{
    private ATMInterface atm;

    @BeforeMethod
    public void setUp() throws Exception
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ATMAppConfig.class);
        atm = (ATMInterface)ctx.getBean("ATM_0011");
    }

    @AfterMethod
    public void tearDown() throws Exception
    {

    }

    @Test
    public void testDepositAtm() throws Exception
    {
        ATMInterface machine = new ATMImpl();
        double balance = machine.checkBalance(8000);
        double amount = machine.deposit(balance, 12000);
        assertTrue(balance<amount);
    }

    @Test
    public void testDeposit()
    {
        ATMInterface machine = new ATMImpl();
        double balance = machine.checkBalance(8000);
        double amount = machine.deposit(balance, 12000);
        assertTrue(balance<amount);
    }
    @Test
    public void testWithdrawalAtm() throws Exception
    {
        ATMInterface machine = new ATMImpl();
        double balance = machine.checkBalance(8000);
        double amount = machine.withdrawal(balance, 2500);
        assertEquals(balance, amount);
    }

    @Test
    public void testWithdrawal()
    {
        ATMInterface machine = new ATMImpl();
        double balance = machine.checkBalance(8000);
        double amount = machine.withdrawal(balance, 2500);
        assertEquals(balance, amount);
    }

    @Test
    public void testPurchasePrepaidAtm() throws Exception
    {
        ATMInterface machine = new ATMImpl();
        double balance = machine.checkBalance(8000);
        double amount = machine.purchasePrepaid(balance, 29);
        assertTrue(balance>amount);
    }

    @Test
    public void testPurchasePrepaid()
    {
        ATMInterface machine = new ATMImpl();
        double balance = machine.checkBalance(8000);
        double amount = machine.purchasePrepaid(balance, 29);
        assertTrue(balance>amount);
    }

    @Test
    public void testTransferAtm() throws Exception
    {
        ATMInterface machine = new ATMImpl();
        machine = new ATMImpl();
        double balance = machine.checkBalance(8000);
        double amount = machine.transfer(balance, 35000);
        assertTrue(balance> amount);
    }

    @Test
    public void testTransfer()
    {
        ATMInterface machine = new ATMImpl();
        double balance = machine.checkBalance(8000);
        double amount = machine.transfer(balance, 35000);
        assertTrue(balance> amount);
    }

    @Test
    public void testCheckBalanceAtm() throws Exception
    {
        ATMInterface machine = new ATMImpl();
        double balance = machine.checkBalance(8000);
        assertNotNull(balance);
    }

    @Test
    public void testCheckBalance()
    {
        ATMInterface machine = new ATMImpl();
        double balance = machine.checkBalance(8000);
        assertNotNull(balance);
    }
}
