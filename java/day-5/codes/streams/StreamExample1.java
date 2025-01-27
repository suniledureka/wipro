
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamExample1 {

	public static void main(String[] args) {
		BooksDAO dao = new BooksDAO();
		List<Book> books = dao.getAllBooks();
		
		//display the book titles using stream API
		List<String> bookTitles = books.stream()
									   .map(book -> book.getBookTitle())
									   .collect(Collectors.toList());
		bookTitles.forEach(title -> System.out.println("---> " + title));
		System.out.println();
		
		//display the Book with the least price
		
		System.out.println("==== Book with least Price =======");
		Optional<Book> optBook = books.stream()
									  .min((bk1,bk2)->bk1.getBookPrice() > bk2.getBookPrice() ? 1 : -1);
		System.out.println(optBook.get());
		
		System.out.println();
		
		System.out.println("==== Book with least Price =======");

		Optional<Book> optBook1 = books.stream().min(Comparator.comparing(Book::getBookPrice));
		System.out.println(optBook1.get());
		System.out.println();
		
		//display all the books with the least price
		
		System.out.println("==== BOOKS WITH LEAST PRICE =======");
		float leastBookPrice = books.stream()
									.map(bk -> bk.getBookPrice())
									.min((p1,p2) -> p1>p2 ? 1 : -1)
									.get();
		
		List<Book> booksWithLeastPrice = books.stream()
											  .filter(bk -> bk.getBookPrice() == leastBookPrice)
											  .collect(Collectors.toList());
		
		booksWithLeastPrice.forEach(bk -> System.out.println(bk));
		
	}

}
