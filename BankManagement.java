package BAITAPGIUAKY;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class BankManagement {
	ArrayList<Account> arr=new ArrayList<>();
	public void themTaikhoan(Account account) {
		arr.add(account);
	}
	public void suaTentaikhoan(Account account, String name) {
		account.setName(name);
	}
	public void suaIdtaikhoan(Account account, int id) {
		account.setSoTaikhoan(id);
	}
	public void suaSoDu(Account account, double soDu) {
		account.setSoDu(soDu);
	}
	public void xoaTaikhoan(Account account) {
		for(Account x: arr) {
			if(x==account) {
		     arr.remove(x);
			}
		}
	}
	public void timtaikhoantheoID(int id) {
		for(Account x: arr) {
			if(x.getSoTaikhoan()==id) {
				System.out.print("Tai khoan do la:");
				System.out.println(x);
			}
		}
	}
	public double tongSodu()
	{
		double s=0;
		for(Account x:arr) {
			s+=x.getSoDu();
		}
		return s;
	}
	public void timtakhoantheoTen(String name) {
		for(Account x:arr) {
			if(x.getName()==name) {
				System.out.print("Tai khoan do la:");
				System.out.println(x);
			}
		}
	}
	public void QuanlygiaoDich()
	{
		for(Account x:arr) {
			System.out.println("Lich su giao dich cua : "+x);
			x.LichSuGiaodich();
			System.out.println("...........................");
		}
	}
	public void sapXeptaikhoan()
	{
		Collections.sort(arr, new Comparator<Account>() {
    		public int compare(Account a, Account b) {
    			if(a.getSodu()!=b.getSodu())
    			{
    				return (int) (b.getSodu()-a.getSodu());
    			}
    			else 
    		return a.getName().compareTo(b.getName());
    		}
    	});
        System.out.println("Danh sach:");
        for (Account account : arr) {
            System.out.println(account);
        }
	}
}	
