import java.util.ArrayList;
import java.util.List;

abstract class LibraryManagement {
  
  protected List<String> books = new ArrayList<>();

  public void addBook(String bookName) {
    books.add(bookName);
  }

  public void getBookNames() {
    System.out.println("Books:");
    for(String book : books) {
      System.out.println(book); 
    }
  }

  public abstract void decrementBook(String bookName);

  public abstract void incrementBook(String bookName);

  public void searchBook(String query) {
    for(String book : books) {
      if(book.contains(query)) {
        System.out.println("Found: " + book);
      }
    }
  }
}

class Issue extends LibraryManagement {

  @Override
  public void decrementBook(String bookName) {
    int index = books.indexOf(bookName);
    if(index != -1) {
      books.remove(index);
      System.out.println(bookName + " issued successfully!");
    } else {
      System.out.println(bookName + " is not available.");
    }
  }

  @Override
  public void incrementBook(String bookName) {
    // Do nothing
  }

}

class Return extends LibraryManagement {

  @Override
  public void decrementBook(String bookName) {
    // Do nothing 
  }

  @Override
  public void incrementBook(String bookName) {
    books.add(bookName);
    System.out.println(bookName + " returned successfully!");
  }

}

public class Main {
  public static void main(String[] args) {
    // Usage
    Issue issue = new Issue();
    issue.addBook("Harry Potter");
    issue.addBook("The Alchemist");
    issue.addBook("The Da Vinci Code");
    issue.getBookNames();
    issue.decrementBook("Harry Potter");
    issue.getBookNames();
    issue.searchBook("The");
    Return returnBook = new Return();
    returnBook.addBook("Harry Potter");
    returnBook.addBook("The Alchemist");
    
  }
}