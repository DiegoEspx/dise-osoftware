package Ejemplo6;

public class MainBook {
	public static void main(String[]args) {
		//String name, double price,int qty, Author author
		Author authorone=new Author("España","sdsa.@gmail.com",'m');
		
		Book bookone=new Book("Diego",55000,2,authorone);
		
		System.out.println("information");
		System.out.println("author: "+ bookone.getAuthor());
		System.out.println("--------------------------------------------");
		System.out.println("comprador: "+bookone.getName()+" precio: "+bookone.getPrice()+" cantidad:"
				+ ""+bookone.getQty() );
		
		System.out.println("print: ");
	}
}
