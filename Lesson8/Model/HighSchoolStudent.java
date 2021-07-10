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
public class HighSchoolStudent extends GeneralStudent {

    private int math;
    private int physic;
    private int chemical;

    public HighSchoolStudent() {
    }


    public HighSchoolStudent(int math, int physic, int chemical, int ID, String name, String address) {
        super(ID, name, address);
        this.math = math;
        this.physic = physic;
        this.chemical = chemical;
    }

    public int getMath() {
        return math;
    }

    public int getPhysic() {
        return physic;
    }

    public int getChemical() {
        return chemical;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public void setPhysic(int physic) {
        this.physic = physic;
    }

    public void setChemical(int chemical) {
        this.chemical = chemical;
    }

    @Override
    public String toString() {
        return "HighSchoolStudent{" + "ID : "+ID +", name : "+name+", address : "+address+", math=" + math + ", physic=" + physic + ", chemical=" + chemical + '}';
    }
    
    
}
