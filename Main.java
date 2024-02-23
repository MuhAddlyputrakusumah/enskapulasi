/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enkapulasi;


public class Main {
    public static void main(String[] args) {
       User user = new User("aaa","bbb");
        User user1 = new User();
        
        user1.setUsername("LoL");
        user1.setPassword("LiL");
        user.setStatus (true);
        user.setId(0);
        
        System.out.println("Username : "+user.getUsername());
        System.out.println("Password : "+user.getPassword());
        
   
}
  
        

    }