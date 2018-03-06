package com.kleinpix;

/*
    Name    :   Heinrich Klein
    Student#:   195032659
    Date    :   01 March 2018
    Descript:   Application containing Springframework and multiple implemetation of interfaces
 */

public interface ATMInterface
{
    double checkBalance(double balance);
    double withdrawal(double balance, int amount);
    double deposit(double balance, int amount);
    double transfer(double balance, int amount);
    double purchasePrepaid(double balance, int amount);
}
