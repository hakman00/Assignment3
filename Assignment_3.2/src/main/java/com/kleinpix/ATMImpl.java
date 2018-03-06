package com.kleinpix;

/*
    Name    :   Heinrich Klein
    Student#:   195032659
    Date    :   01 March 2018
    Descript:   Application containing Springframework and multiple implemetation of interfaces
 */

public class ATMImpl implements ATMInterface
{
    @Override
    public double deposit(double balance, int amount)
    {
        return balance + amount;
    }

    @Override
    public double withdrawal(double balance, int amount)
    {
        return balance = balance - amount;
    }
    @Override
    public double checkBalance(double balance)
    {
        return balance;
    }
    @Override
    public double purchasePrepaid(double balance, int amount)
    {

        return balance - amount;
    }
    @Override
    public double transfer(double balance, int amount)
    {
        return balance - amount;
    }
}
