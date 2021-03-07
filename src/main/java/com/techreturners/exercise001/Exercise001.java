package com.techreturners.exercise001;

import java.util.ArrayList;
import java.util.List;





public class Exercise001 {
    public String capitalizeWord(String word) {
        // Add your code here
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
      
        return firstName.substring(0,1) + "." + lastName.substring(0,1);
    
    }

    public double addVat(double originalPrice, double vatRate) {
       // double originalPrice , vatRate;
        double c = (vatRate*originalPrice)/100;  
        double a = c + originalPrice;
       
            String finalVat = String.format("%.2f", a);
            double d=Double.parseDouble(finalVat);
        return d;
    }

    public String reverse(String sentence) {

       
     // public static String reverse(String sentence) {
        if (sentence.isEmpty())
          return sentence;
    
        return reverse(sentence.substring(1)) + sentence.charAt(0);
      }
      public int countLinuxUsers(List<User> users) {
        List<User> linuxUsers = new ArrayList<User>();
        
        for (User u : users) {
        
        if (u.getType().compareToIgnoreCase("Linux") == 0) {
        linuxUsers.add(u);
      }
        }
        return linuxUsers.size();
        
    }
        
        
    }

    

        
