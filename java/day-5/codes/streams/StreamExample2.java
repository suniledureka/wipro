import java.util.List;
import java.util.Optional;

public class StreamExample2 {

	public static void main(String[] args) {
		List<Book> books = new BooksDAO().getAllBooks();
		
		//search a book based on book ID
		int bid = 4625;
		
		Optional<Book> optBook = books.stream()
									  .filter(bk -> bk.getBookId()==bid)
									  .findFirst();
		if(optBook.isPresent()) {
			System.out.println(optBook.get());
		}else {
			System.out.println("no matching book found with Book ID: " + bid);
		}
		

		//another approach
		Book matchingBook = books.stream()
				  						.filter(bk -> bk.getBookId()==bid)
				  						.findFirst()
				  						.orElse(null);
		System.out.println(matchingBook);

		//another approach
		Book matchingBook1 = books.stream()
				  						.filter(bk -> bk.getBookId()==bid)
				  						.findFirst()
				  						.orElse(new Book());
		System.out.println(matchingBook1);	
		
		//another approach
		Book matchingBook2 = books.stream()
				  						.filter(bk -> bk.getBookId()==bid)
				  						.findFirst()
				  						.orElseThrow();
		System.out.println(matchingBook2);		
	}

}
