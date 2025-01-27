
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class StreamExample3 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in); 
		
		List<Book> books = new BooksDAO().getAllBooks();
		
		System.out.print("search a book with title contains: ");
		String searchString = sc.next();
		
		/*
		Optional<Book> opt = books.stream().filter(book -> book.getBookTitle().toLowerCase().indexOf(searchString.toLowerCase()) >= 0).findAny();
		if(opt.isPresent())	{
			Book bk = opt.get();
			System.out.println(bk);
		}else {
			System.out.println("no book with title contains: " + searchString);
		}
		*/
		
		
		//Book bk = books.stream().filter(book -> book.getBookTitle().toLowerCase().indexOf(searchString.toLowerCase()) >= 0).findAny().orElse(new Book());
		//Book bk = books.stream().filter(book -> book.getBookTitle().toLowerCase().indexOf(searchString.toLowerCase()) >= 0).findAny().orElseThrow();
		
		//Book bk = books.stream().filter(book -> book.getBookTitle().toLowerCase().indexOf(searchString.toLowerCase()) >= 0).findAny().orElseThrow(() -> new RuntimeException("no book found!"));
		
		//Book bk = books.stream().filter(book -> book.getBookTitle().contains(searchString)).findAny().orElseThrow(() -> new RuntimeException("no book found!"));
		
		Book bk = books.stream().filter(book -> book.getBookTitle().toLowerCase().indexOf(searchString.toLowerCase()) > -1).findFirst().orElseGet(() -> new Book());
		System.out.println(bk);
		
		Optional<Book> bok = Optional.ofNullable(books.stream().filter(book -> book.getBookTitle().toLowerCase().indexOf(searchString.toLowerCase()) > -1).findFirst().orElseGet(() -> new Book()));
		if(bok.isPresent()) {
			System.out.println(bok.get());
		}
		else {
			System.out.println("no matching book");
		}
	}

}
