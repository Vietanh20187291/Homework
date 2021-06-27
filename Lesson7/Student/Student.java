/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Vanh
 */
public class Student {

    int MSSV;
    String name;
    int diemToan;
    int diemLy;
    int diemHoa;
    String diaChi;
    

    public Student(int MSSV, String name) {
        this.MSSV = MSSV;
        this.name = name;
    }
    public Student(String diaChi,String name){
    
    }
    public void setDiemToan(int diemToan) {
        this.diemToan = diemToan;
    }

    public void setDiemLy(int diemLy) {
        this.diemLy = diemLy;
    }

    public void setDiemHoa(int diemHoa) {
        this.diemHoa = diemHoa;
    }

    /**
     *
     * @param MSSV
     * @return
     */
    public float tinhTB() {
        return ((float) this.diemToan + (float) this.diemLy + (float) this.diemHoa) / 3;
    }

    public boolean check10() {
        if (this.diemToan + this.diemLy + this.diemHoa > 10) {
            return true;
        } else {
            return false;
        }
    }

    public static int check(int x) {
        if (x < 0) {
            return 0;
        }
        if (x > 10) {
            return 10;
        }
        return x;
    }
        public void addToan(int x){
        this.diemToan += x;
    }

    public static void main(String[] args) {
        Student s1 = new Student(2018, "Nguyen");
        s1.setDiemHoa(11);
        s1.setDiemLy(5);
        s1.setDiemToan(7);
        boolean c = s1.check10();
        System.out.println("Check 10 : "+c);
        s1.setDiemHoa(check(s1.diemHoa));
        System.out.println("Check Hoa :"+s1.diemHoa);
        s1.addToan(2);
        System.out.println("Add Toan :"+s1.diemToan);
    }

}
