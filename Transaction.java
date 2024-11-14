package BAITAPGIUAKY;

public class Transaction implements ITransaction{
	private String loaiGiaodich;
	private double soTien;
	private String ngayGiaodich;
	
	public Transaction(String loaiGiaodich, double soTien, String ngayGiaodich) {
		this.loaiGiaodich = loaiGiaodich;
		this.soTien = soTien;
		this.ngayGiaodich = ngayGiaodich;
	}
	public double tinhPhigiaodich() {
		if(loaiGiaodich=="napTien") {
			return 0;
		}
		else return soTien*0.5/100;
	}
	public void thucHiengiaodich(Account account) {
		if(loaiGiaodich=="napTien") {
			account.napTien(soTien);
			account.getDate(ngayGiaodich);
		}
		else {
			account.rutTien(soTien);
			account.getDate(ngayGiaodich);
		}
	}
	@Override
	public String toString() {
		return "Transaction [loaiGiaodich=" + loaiGiaodich + ", soTien=" + soTien + ", ngayGiaodich=" + ngayGiaodich
				+ "]";
	}
	
}
