package BAITAPGIUAKY;

import java.util.ArrayList;

public class Account {
private int soTaikhoan;
private String name;
private double soDu;
private String date;
public Account(int soTaikhoan, String name, double soDu) {
	this.soTaikhoan = soTaikhoan;
	this.name = name;
	this.soDu = soDu;
}
ArrayList<Transaction> a=new ArrayList<>();
public void getDate(String date) {
	this.date=date;
	// muc dich la lay cai ngay giao dich ra
}
public void napTien(double tienNap)
{
	this.soDu+=tienNap;
	System.out.println("So du sau khi nap "+tienNap +" la "+this.soDu);
	a.add(new Transaction("napTien", tienNap, date));
}
public double getSodu()
{
	return this.soDu;
}
public int getSoTaikhoan() {
	return soTaikhoan;
}
public void setSoTaikhoan(int soTaikhoan) {
	this.soTaikhoan = soTaikhoan;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSoDu() {
	return soDu;
}
public void setSoDu(double soDu) {
	this.soDu = soDu;
}
public void rutTien(double tienRut) {
	this.soDu-=tienRut;
	System.out.println("So du sau khi rut "+tienRut +" la "+this.soDu);
	a.add(new Transaction("rutTien", tienRut, date));
}
public void LichSuGiaodich()
{
	if(a.isEmpty()) {
		System.out.println("Hien tai chua co giao dich nao");
	}
	else {
		for(Transaction x: a) {
		System.out.println(x);
		}
	}
}
@Override
public String toString() {
	return "Account [soTaikhoan=" + soTaikhoan + ", name=" + name + ", soDu=" + soDu + "]";
}

}
