package Assignment5;

public class TestMedicine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tablet t = new Tablet();
		t.setPrice(50);
		t.setExpirydate("03-08-2021");
		Syrup s = new Syrup();
		s.setPrice(80);
		s.setExpirydate("09-09-2022");
		Ointment o = new Ointment();
		o.setExpirydate("20-08-2023");
		o.setPrice(99);
		Medicine [] m = {t,s,o};
		for(int i=0;i<m.length;i++){
			m[i].getDetails();
			m[i].displayLabel();
		}
	}

}
