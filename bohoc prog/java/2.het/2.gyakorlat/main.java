class Book
{
   public String title;
   public String author;
   public int pages;

   public Book(String title, String author, int pages)
   {
      this.title = title;
      this.author = author;
      this.pages = pages;
   }
} 
//Példányváltozók

public class main {
   public static void main(String[] args)
   {

     Book book1 = new Book();
     book1.title = "Book1";
     book1.author = "Bruh";
     book1.pages = 100;
     System.out.println("Szerzo: " + book1.author);

     Book book2 = new Book();
     book2.title = "ALapitvany";
     book2.author = "asimov";
     book2.pages = 200;
   }
}
