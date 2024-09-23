package com.deloitte.lab4.ex1;

class Person {
 private String name;
 private float age;

 public Person(String name, float age) {
     this.name = name;
     this.age = age;
 }

 public String getName() {
     return name;
 }

 public void setName(String name) {
     this.name = name;
 }

 public float getAge() {
     return age;
 }

 public void setAge(float age) {
     this.age = age;
 }
}

class Account {
 private static long accNumCounter = 1000; 
 private long accNum;
 private double balance;
 private Person accHolder;

 public Account(Person accHolder, double initialBalance) {
     this.accNum = ++accNumCounter;
     this.balance = initialBalance;
     this.accHolder = accHolder;
 }

 public void deposit(double amount) {
     balance += amount;
     System.out.println("Deposited INR " + amount + ". Updated balance: " + balance);
 }

 public boolean withdraw(double amount) {
     if (balance >= amount) {
         balance -= amount;
         System.out.println("Withdrew INR " + amount + ". Updated balance: " + balance);
         return true;
     } else {
         System.out.println("Insufficient balance to withdraw INR " + amount);
         return false;
     }
 }

 public double getBalance() {
     return balance;
 }

 
 public long getAccNum() {
     return accNum;
 }

 public Person getAccHolder() {
     return accHolder;
 }

 public void setAccHolder(Person accHolder) {
     this.accHolder = accHolder;
 }

 public void setBalance(double balance) {
     this.balance = balance;
 }
}


class SavingsAccount extends Account {
 private final double minimumBalance = 500;

 public SavingsAccount(Person accHolder, double initialBalance) {
     super(accHolder, initialBalance);
 }

 @Override
 public boolean withdraw(double amount) {
     if (getBalance() - amount >= minimumBalance) {
         return super.withdraw(amount);
     } else {
         System.out.println("Withdrawal denied! Minimum balance of INR " + minimumBalance + " required.");
         return false;
     }
 }
}

class CurrentAccount extends Account {
 private double overdraftLimit = 2000;

 public CurrentAccount(Person accHolder, double initialBalance) {
     super(accHolder, initialBalance);
 }

 @Override
 public boolean withdraw(double amount) {
     if (getBalance() + overdraftLimit >= amount) {
         return super.withdraw(amount);
     } else {
         System.out.println("Withdrawal denied! Overdraft limit reached.");
         return false;
     }
 }

 public double getOverdraftLimit() {
     return overdraftLimit;
 }

 public void setOverdraftLimit(double overdraftLimit) {
     this.overdraftLimit = overdraftLimit;
 }
}


public class Lab4Ex1 {
 public static void main(String[] args) {
     Person smith = new Person("Smith", 30.5f);
     Person kathy = new Person("Kathy", 25.5f);

     SavingsAccount smithAccount = new SavingsAccount(smith, 2000);
     CurrentAccount kathyAccount = new CurrentAccount(kathy, 3000);

     smithAccount.deposit(2000);

     kathyAccount.withdraw(2000);

     System.out.println(smith.getName() + "'s account balance: INR " + smithAccount.getBalance());
     System.out.println(kathy.getName() + "'s account balance: INR " + kathyAccount.getBalance());
 }
}

