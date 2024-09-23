package com.deloitte.lab9.ex3;

public class Lab9Ex3 {

 public static void main(String[] args) {
     String correctUsername = "user123";
     String correctPassword = "pass123";

     Authenticator auth = (username, password) -> 
         username.equals(correctUsername) && password.equals(correctPassword);

     String testUsername = "user123";
     String testPassword = "pass123";

     boolean isAuthenticated = auth.authenticate(testUsername, testPassword);

     if (isAuthenticated) {
         System.out.println("Authentication successful!");
     } else {
         System.out.println("Authentication failed.");
     }
 }

 interface Authenticator {
     boolean authenticate(String username, String password);
 }
}
