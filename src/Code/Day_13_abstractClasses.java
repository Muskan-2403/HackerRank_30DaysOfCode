package Code;

public class Day_13_abstractClasses {
    abstract class Book {
        String title;
        String author;

        Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        abstract void display();
    }
    class MyBook extends Book
    {
        int price;
        MyBook(String t , String a , int p)
        {
            super(t,a);
            this.price =p;
        }
        void display()
        {
            System.out.println("Title: "+title);
            System.out.println("Author: "+author);
            System.out.println("Price: "+price);
        }
    }
}
