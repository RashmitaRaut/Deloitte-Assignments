package com.deloitte.lab4.ex3;

abstract class WrittenItem extends Item {
    private String author;

    public WrittenItem(int id, String title, int numCopies, String author) {
        super(id, title, numCopies);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return super.toString() + ", Author: " + author;
    }

    @Override
    public void print() {
        System.out.println(this);
    }
}
