package com.deloitte.lab4.ex3;

abstract class Item {
    private int id;
    private String title;
    private int numCopies;

    public Item(int id, String title, int numCopies) {
        this.id = id;
        this.title = title;
        this.numCopies = numCopies;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getNumCopies() {
        return numCopies;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setNumCopies(int numCopies) {
        this.numCopies = numCopies;
    }

    public void checkIn() {
        numCopies++;
    }

    public void checkOut() {
        if (numCopies > 0) {
            numCopies--;
        }
    }

    public void addItem(int count) {
        numCopies += count;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Item item = (Item) obj;
        return id == item.id;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Title: " + title + ", Copies: " + numCopies;
    }

    public abstract void print();
}
