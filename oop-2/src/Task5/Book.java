package Task5;

import java.time.Year;
import java.util.Date;
import java.util.Scanner;

public class Book {
    public  String title;
    public String author;
    public  int year;
    private String publisher;
    public String genre;
    private int pagesCount;

    public int getPagesCount() {
        return pagesCount;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPagesCount(int pagesCount) {
        this.pagesCount = pagesCount;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Book(String title, String author, int year, String publisher, String genre, int pagesCount) {
        this.title = title;
        this.year = year;
        this.author = author;
        this.publisher = publisher;
        this.genre = genre;
        this.pagesCount = pagesCount;
    }

    public Book(String title, String author, String genre, int pagesCount) {
        this.title = title;
        this.year = Year.now().getValue();
        this.author = author;
        this.publisher = author;
        this.genre = genre;
        this.pagesCount = pagesCount;
    }


    public void output() {
        System.out.println("Title: " + title + ", author: " +author + ", year: " + year + ", publisher: "
                + publisher + ", genre:" + genre + ", count of pages: " + pagesCount);
    }

    public void  input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter title: ");
        this.title = scanner.nextLine();

        System.out.println("Enter author: ");
        this.author = scanner.nextLine();

        System.out.println("Enter year: ");
        this.year = scanner.nextInt();

        System.out.println("Enter publisher: ");
        this.publisher = scanner.nextLine();

        System.out.println("Enter genre: ");
        this.genre = scanner.nextLine();

        System.out.println("Enter count of pages: ");
        this.pagesCount = scanner.nextInt();
    }
}
