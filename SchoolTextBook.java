/*
Kelvin Penn
Bellevue University
Intermediate Java 
This program allows a user to choose how they woud like to view the books that
a library has within there system by typing a number corresponding with the 
function written
*/
import java.util.Comparator;
import java.util.Scanner;

public class SchoolTextBook {
  
   private String author;  //initiate variables to be used
   private String title;
   private int pageCount;
   private String ISBN;
   private double price;

   public SchoolTextBook() {
      
   }
  
   public SchoolTextBook(String author, String title, int pageCount,
           String iSBN, double price) { //create method to return instance variables
       this.author = author;
       this.title = title;
       this.pageCount = pageCount;
       ISBN = iSBN;
       this.price = price;
   }

   public String getAuthor() { //create the getters and setters for said method
       return author;
   }

   public void setAuthor(String author) {
       this.author = author;
   }

   public String getTitle() {
       return title;
   }

   public void setTitle(String title) {
       this.title = title;
   }

   public int getPageCount() {
       return pageCount;
   }

   public void setPageCount(int pageCount) {
       this.pageCount = pageCount;
   }

   public String getISBN() {
       return ISBN;
   }

   public void setISBN(String iSBN) {
       ISBN = iSBN;
   }

   public double getPrice() {
       return price;
   }

   public void setPrice(double price) {
       this.price = price;
   }

   //comparator allows for the items entered to be compared against
   //one another for sorting later in the program
   public static Comparator<SchoolTextBook> sortByAuthor = new Comparator<SchoolTextBook>() {
  
public int compare(SchoolTextBook s1, SchoolTextBook s2) {
               return s1.getAuthor().compareTo(s2.getAuthor());
       }
   };
      
   public static Comparator<SchoolTextBook> sortByTitle = new Comparator<SchoolTextBook>() {
  
       public int compare(SchoolTextBook s1, SchoolTextBook s2) {
               return s1.getTitle().compareTo(s2.getTitle());
       }
   };
  
   public static Comparator<SchoolTextBook> sortByPageCount = new Comparator<SchoolTextBook>() {
  
       public int compare(SchoolTextBook s1, SchoolTextBook s2) {
               return s1.pageCount - s2.pageCount;
       }
   };

   public static Comparator<SchoolTextBook> sortByISBN = new Comparator<SchoolTextBook>() {
  
       public int compare(SchoolTextBook s1, SchoolTextBook s2) {
               return s1.getISBN().compareTo(s2.getISBN());
       }
   };
  
   public static Comparator<SchoolTextBook> sortByPrice = new Comparator<SchoolTextBook>() {
  
       public int compare(SchoolTextBook s1, SchoolTextBook s2) {
               return new Double(s1.price).compareTo(new Double(s2.price));
       }
   };
  
   public String toString() //create a return method format to instance variables
   {
       return " Author: " + getAuthor() + 
           "Title: " + getTitle()+ 
           "Page Count: " + getPageCount()+ 
           "ISBN: " + getISBN()+ 
           "Price: " +getPrice();
   }
}


public class SchoolTextBookSort { //creat main method for out put

   public static void main(String[] args) {
       String ch;
       Scanner a = new Scanner(System.in);
       SchoolTextBook[] textBooks = new SchoolTextBook[5]; //create an array ready to hold 5 itmes
       //create the test books to be used to display 
       textBooks[0] = new SchoolTextBook("J.K. Rowling", "Harry Potter and The Half Blood Prince",890, "I2658", 50.0);
       textBooks[1] = new SchoolTextBook("Earnest Hemingway", "Tom Sawyer", 200, "IN5001",50.0);
       textBooks[2] = new SchoolTextBook("James Brown", "The DaVinci Code", 600, "I7896",45.0);
       textBooks[3] = new SchoolTextBook("Jenny Nimmo", "Charlie Bone",755, "I6363", 30.0);
       textBooks[4] = new SchoolTextBook("Lemony Snicket", "C Programming",653, "ISJ450", 30.0);

       
       do { //ask user how they would like to sort the books in the list

           System.out.println("How would you like to search?: ");
           System.out.println("1. Sort By Author");
           System.out.println("2. Sort By Title");
           System.out.println("3. Sort By Page Count");
           System.out.println("4. Sort By ISBN Numnber");
           System.out.println("5. Sort By Price");
           int option = a.nextInt();

           switch (option) { //make switch statements for output the user has chosen

               case 1:
                   Arrays.sort(textBooks, SchoolTextBook.sortByAuthor);
                   System.out.println("Sort By Author result");
  
                   for (int i = 0; i < 5; i++) {
  
                       System.out.println(textBooks[i]);
                   }
  
                   break;
  
               case 2:
  
                   Arrays.sort(textBooks, SchoolTextBook.sortByTitle);
                   System.out.println("Sort By Title result");
  
                   for (int i = 0; i < 5; i++) {
  
                       System.out.println(textBooks[i]);
                   }
                   break;
  
               case 3:
  
                   Arrays.sort(textBooks, SchoolTextBook.sortByPageCount);
                   System.out.println("Sort By Page Count result");
  
                   for (int i = 0; i < 5; i++) {
  
                       System.out.println(textBooks[i]);
                   }
                   break;
               case 4:
  
                   Arrays.sort(textBooks, SchoolTextBook.sortByISBN);
                   System.out.println("Sort By ISBN result");
  
                   for (int i = 0; i < 5; i++) {
  
                       System.out.println(textBooks[i]);
                   }
                   break;
               case 5:
  
                   Arrays.sort(textBooks, SchoolTextBook.sortByPrice);
                   System.out.println("Sort By Price result");
  
                   for (int i = 0; i < 5; i++) {
  
                       System.out.println(textBooks[i]);
                   }
                   break;
  
               default:
                   System.out.println("Unspecified option, please try again");
           }

           System.out.println("Press Y to continue");

           ch = a.next();
       } while (ch.equalsIgnoreCase("Y"));

       System.out.println("Thank You"); //thank the user for using the program
   }
}