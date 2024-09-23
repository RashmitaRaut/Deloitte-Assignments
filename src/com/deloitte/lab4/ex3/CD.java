package com.deloitte.lab4.ex3;

class CD extends MediaItem {
    private String artist;
    private String genre;

    public CD(int id, String title, int numCopies, int runtime, String artist, String genre) {
        super(id, title, numCopies, runtime);
        this.artist = artist;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return super.toString() + ", Artist: " + artist + ", Genre: " + genre;
    }

    @Override
    public void print() {
        System.out.println("CD: " + this);
    }
}
