package Assignment5;

public class BookDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book Book = new Book();
		Book.setBookNo(244);
		Book.setTitle("Concepts of C");
		Book.setAuthor("Dennis Ritchie");
		Book.setPrice(499);
		System.out.println("BookNo : "+Book.getBookNo() +"\n"+"Title : "+Book.getTitle() +"\n"+"Author : "+ Book.getAuthor()+"\n"+"Price : "+Book.getPrice());
		System.out.println("...........Creating New Object..............");
		EngineeringBook eng = new EngineeringBook();
		eng.setBookNo(300);
		eng.setTitle("DBMS");
		eng.setAuthor("Raghu Ramakrishnan");
		eng.setPrice(1500);
		eng.setCategory("B");
		System.out.println("BookNo : "+Book.getBookNo() +"\n"+"Title : "+Book.getTitle() +"\n"+"Author : "+ Book.getAuthor()+"\n"+"Price : "+Book.getPrice()+"\n"+"Category : "+ eng.getCategory());
	}

}
