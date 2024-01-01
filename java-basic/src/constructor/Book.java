package constructor;

public class Book {
    String title;
    String author;
    int page;

    Book() {
        this(" "," ", 0); //기본초기화
    }
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    Book(String title, String author,int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    void displayInfo(){
        System.out.println("제목"+this.title+", 저자"+this.author+", 페이지"+this.page);

    }

    }
