package com.deloitte.lab4.ex3;

public class Lab4Ex3 {
    public static void main(String[] args) {
        Book book = new Book(1, "Java Programming", 10, "James Gosling");
        JournalPaper journal = new JournalPaper(2, "AI Research", 5, "John McCarthy", 2020);
        Video video = new Video(3, "The Matrix", 3, 136, "Wachowskis", "Sci-Fi", 1999);
        CD cd = new CD(4, "Thriller", 7, 42, "Michael Jackson", "Pop");

        book.checkOut();
        journal.checkIn();
        cd.addItem(3);

        book.print();
        journal.print();
        video.print();
        cd.print();
    }
}

