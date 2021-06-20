/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson6_OOP;

/**
 *
 * @author Vanh
 */
public class HamPhanSo {

    public static void main(String[] args) {
        Phanso a = new Phanso();
        Phanso b = new Phanso();
        a.tu = 2;
        a.mau = 4;
        b.tu = 3;
        b.mau = 5;
        a.HienThiTuMau();
        a.HienThiTruocvaSauRutGon();
        a.CongPS(b);
        a.TruPS(b);
        a.NhanPS(b);
        a.ChiaPS(b);
        a.ThapPhan();
        a.Nghichdao();
    }

}

class Phanso {

    int tu;
    int mau;

    public void show(Phanso re) {
        System.out.println("" + re.tu + "/" + re.mau);
    }

    void HienThiTuMau() {
        System.out.println("Tu so la : " + this.tu);
        System.out.println("Mau so la : " + this.mau);
    }

    void HienThiTruocvaSauRutGon() {
        System.out.print("Phan so chua rut gon : ");
        show(this);
        Rutgon(this);
    }

    void Rutgon(Phanso p) {

        for (int i = 1; i < p.mau; i++) {
            if (p.tu % i == 0 && p.mau % i == 0) {
                p.tu = p.tu / i;
                p.mau = p.mau / i;
            }
        }
        System.out.print("Ket qua : ");
        show(p);
    }

    void CongPS(Phanso p) {
        System.out.println("Cong Phan So :");
        Phanso re = new Phanso();
        re.tu = p.tu * this.mau + p.mau * this.tu;
        re.mau = p.mau * this.mau;
        Rutgon(re);
    }

    void TruPS(Phanso p) {
        System.out.println("Tru Phan So :");
        Phanso re = new Phanso();
        re.tu = p.tu * this.mau - p.mau * this.tu;
        re.mau = p.mau * this.mau;
        Rutgon(re);
    }

    void NhanPS(Phanso p) {
        System.out.println("Nhan Phan So :");
        Phanso re = new Phanso();
        re.tu = p.tu * this.tu;
        re.mau = p.mau * this.mau;
        Rutgon(re);
    }

    void ChiaPS(Phanso p) {
        System.out.println("Chia Phan So :");
        Phanso re = new Phanso();
        re.tu = p.mau * this.tu;
        re.mau = p.tu * this.mau;
        Rutgon(re);
    }

    void ThapPhan() {
        System.out.println("Chuyen Ve Thap Phan :");
        float re = (float) this.tu / (float) this.mau;
        System.out.println("Ket qua : " + re);
    }

    void Nghichdao() {
        System.out.println("Nghich dao :");
        int temp = this.tu;
        this.tu = this.mau;
        this.mau = temp;
        show(this);
    }
}
