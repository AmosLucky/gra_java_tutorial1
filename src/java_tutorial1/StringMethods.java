/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_tutorial1;

/**
 *
 * @author macbook
 */
public class StringMethods {
    
    StringMethods(){
        
        String name  = new String("Amos");
        
        System.out.println(name);
        
        String nameUpper = name.toUpperCase();
        String nameLower = name.toLowerCase();
        
        String fullName = "Mark Obi ben";
        
        String surname = fullName.substring(0,4);
        String firstName  =  fullName.substring(4,8);
        String lastName  = fullName.substring(8,12);
        
        
        
        
    }
    
}
