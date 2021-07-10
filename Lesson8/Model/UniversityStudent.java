/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson8.Model;

/**
 *
 * @author Vanh
 */
public class UniversityStudent extends GeneralStudent{
    private float CPA;
    private String major;

    public UniversityStudent() {
    }

    public UniversityStudent(float CPA, String major) {
        this.CPA = CPA;
        this.major = major;
    }

    public UniversityStudent(float CPA, String major, int ID, String name, String address) {
        super(ID, name, address);
        this.CPA = CPA;
        this.major = major;
    }

    public float getCPA() {
        return CPA;
    }

    public String getMajor() {
        return major;
    }

    public void setCPA(float CPA) {
        this.CPA = CPA;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "UniversityStudent{" + "ID : "+ID +", name : "+name+", address : "+address+ ", CPA=" + CPA + ", major=" + major + '}';
    }



    
}
