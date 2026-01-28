/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.educationcenter;

/**
 *
 * @author NGHIANGUYEN
 */
class Student extends User {
    // attributes
    private String email;
    private String[] subjects = new String[3];

    // constructors
    public Student(String name, String tel, String role, String email, String subject1, String subject2, String subject3){
            super(name, tel, role);
            this.email = email;
            this.subjects[0] = subject1;
            this.subjects[1] = subject2;
            this.subjects[2] = subject3;
    }

    // helpers
    @Override
    public String getInfo(){
            return super.getInfo() + ", Email: " + email + ", Subject 1:" + subjects[0] + ", Subject 2: " + subjects[1] + ", Subject 3: " + subjects[2];
    }
}
