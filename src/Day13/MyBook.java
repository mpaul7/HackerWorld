package Day13;

public class MyBook extends Book {
int price; 
	MyBook(String t, String a, int p) {
		super(t, a);
		this.price = p;
		// TODO Auto-generated constructor stub
	}

	@Override
	void display() {
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Price: " + price);

	}

}
