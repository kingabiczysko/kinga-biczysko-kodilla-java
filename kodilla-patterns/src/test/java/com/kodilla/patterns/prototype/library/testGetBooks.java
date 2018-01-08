package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class testGetBooks {

    @Test
            public void testGetBooks() {


        //Given


        Book book1 = new Book("ABC", "Jan Kowalski", LocalDate.now());
        Book book2 = new Book("DEF", "Ala Majewska", LocalDate.now());
        Book book3 = new Book("FGH", "Jas Fasola", LocalDate.now());

        Library library = new Library("Library in Koscino");

        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);



        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library in Koscino shallow copy");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }


        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library in Koscino deep copy");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }




        //When

       // library.getBooks().remove(book1);

        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);


        //Then
        Assert.assertEquals(3, library.getBooks().size());
        Assert.assertEquals(3, clonedLibrary.getBooks().size());
        Assert.assertEquals(3, deepClonedLibrary.getBooks().size());


    }

}
