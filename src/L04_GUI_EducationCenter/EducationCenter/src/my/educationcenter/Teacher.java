/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.educationcenter;

/**
 *
 * @author NGHIANGUYEN
 */
class Teacher extends User {
    // attributes
    private String email;
    private String[] subjects = new String[2];

    // constructors
    public Teacher(String name, String tel, String role, String email, String subject1, String subject2){
            super(name, tel, role);
            this.email = email;
            this.subjects[0] = subject1;
            this.subjects[1] = subject2;
    }

    // helpers
    @Override
    public String getInfo(){
            return super.getInfo() + ", Email: " + email + ", Subject 1:" + subjects[0] + ", Subject 2: " + subjects[1];
    }
}