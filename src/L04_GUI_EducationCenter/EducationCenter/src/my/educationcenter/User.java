/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.educationcenter;

/**
 *
 * @author NGHIANGUYEN
 */
class User implements IPerson {
    // attributes
    private String name;
    private String tel;
    private String role;

    // constructors
    public User(String name, String tel, String role){
            this.name = name;
            this.tel = tel;
            this.role = role;
    }

    // helpers
    public String getInfo(){
            return "Name: " + name.toUpperCase() + ", Tel: " + tel + ", Role: " + role;
    }

    public String getRole(){
            return role;
    }

    public String getTel(){
            return tel;
    }

    public String getName () {
            return name;
    }

    public void sayHello(String name){
            System.out.println("Hello " + name + ". How are you?");
    }
}