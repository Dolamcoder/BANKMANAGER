package BAITAPGIUAKY;
public class Test {
	public static void main(String[] args) {
		ITransaction transaction1=new Transaction("napTien",1000, "20-9-2024");
		ITransaction transaction2=new Transaction("rutTien",200, "12-10-2024");
		Account account1 =new Account(1234,"DoLam",2000);
		System.out.println(account1);
		transaction1.thucHiengiaodich(account1);
		System.out.println("Phi giao dich: "+transaction1.tinhPhigiaodich());
		transaction2.thucHiengiaodich(account1);
		System.out.println("Phi giao dich: "+transaction2.tinhPhigiaodich());
		account1.LichSuGiaodich();
		        Account acc1 = new Account(11231, "Nguyen Van A", 1000);
		        Account acc2 = new Account(21313, "Tran Thi B", 2000);
		        Account acc3 = new Account(31312, "Le Thi C", 1500);
		        Account acc4 = new Account(43133, "Pham Minh D", 500);
		        Account acc5 = new Account(51323, "Nguyen Thi E", 2500);
		        Account acc6 = new Account(61313, "Trinh Quang F", 1000);
		        Account acc7 = new Account(71313, "Do Thi G", 3000);
		        Account acc8 = new Account(81313, "Nguyen Thanh H", 1200);
		        Account acc9 = new Account(91313, "Vu Thi I", 900);
		        Account acc10 = new Account(10136, "Bui Thi J", 1800);
		        BankManagement management= new BankManagement();
		        management.themTaikhoan(account1);
		        management.themTaikhoan(acc1);
		        management.themTaikhoan(acc2);
		        management.themTaikhoan(acc3);
		        management.themTaikhoan(acc4);
		        management.themTaikhoan(acc5);
		        management.themTaikhoan(acc6);
		        management.themTaikhoan(acc7);
		        management.themTaikhoan(acc8);
		        management.themTaikhoan(acc9);
		        management.themTaikhoan(acc10);
		        management.sapXeptaikhoan();
		        System.out.println(management.tongSodu());
		        management.QuanlygiaoDich();
		        
	}

}
