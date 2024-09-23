package com.deloitte.lab4.ex3;

class JournalPaper extends WrittenItem {
    private int yearPublished;

    public JournalPaper(int id, String title, int numCopies, String author, int yearPublished) {
        super(id, title, numCopies, author);
        this.yearPublished = yearPublished;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    @Override
    public String toString() {
        return super.toString() + ", Year Published: " + yearPublished;
    }

    @Override
    public void print() {
        System.out.println("Journal Paper: " + this);
    }
}

