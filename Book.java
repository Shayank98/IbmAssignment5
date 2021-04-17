package Assignment5;

public class Book {
	private int BookNo;
	private String title;
	private String author;
	private float price;

	public int getBookNo() {
		return BookNo;
	}
	public void setBookNo(int bookNo) {
		BookNo = bookNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	/*void getBookdetails(){
		System.out.println("Book No : "+ BookNo+"\n" +"Title : "+ title +"\n"+"Author : "+ author+"\n"+"Price : "+ price);
	}*/
	
}
