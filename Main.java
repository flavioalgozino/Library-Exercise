package com.company;

public class Main {
    public static void main(String[] args) {
	Book b1= new Book ("Rowling", "Harry Potter 1");
        Book b2= new Book ("Rowling", "Harry Potter 2");
        Book b3= new Book ("Rowling", "Harry Potter 3");
        Book b4= new Book ("Tolkien", "Il signore degli anelli");
       
        Shelf shelf = new Shelf(10);
        shelf.setBookAt(0, b3);
        shelf.setBookAt(1, b4);
        shelf.setBookAt(5, b2);
        shelf.setBookAt(8, b1);

        System.out.println(shelf.findBookByTitle("Harry Potter 1"));
        System.out.println(shelf.showBooks());
        System.out.println(shelf.availablePlace());
       
        
        
    }
}
