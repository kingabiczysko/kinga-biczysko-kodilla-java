package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.BookA;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookB;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {

//metoda biblioteki A
    @Override
    public int publicationYearMedian (Set<BookA> bookSet){
        HashMap<BookSignature, BookB> bookHashMap = new HashMap<>();

        for(BookA book: bookSet) {
            bookHashMap.put(new BookSignature(book.getSignature()),
                    new BookB(book.getAuthor(), book.getTitle(),
                            book.getPublicationYear()));
        }
    return medianPublicationYear(bookHashMap);
    }

}
