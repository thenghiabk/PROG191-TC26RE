/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.educationcenter;

/**
 *
 * @author NGHIANGUYEN
 */
class Admin extends User implements ISpecialist{
    // attributes
    private String email;
    private double salary;

    // constructors
    public Admin(String name, String tel, String role, String email, double salary){
            super(name, tel, role);
            this.email = email;
            this.salary = salary;
    }

    // helpers
    @Override
    public String getInfo(){
            return super.getInfo() + ", Email: " + email + ", Salary: " + salary;
    }


    @Override
    public boolean hasCertificate () {
            return false;
    }
}