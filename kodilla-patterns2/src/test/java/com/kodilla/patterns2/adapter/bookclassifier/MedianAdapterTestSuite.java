package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.BookA;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest (){
        //Given

        HashSet<BookA> bookAHashSet = new HashSet<>();
        bookAHashSet.add(new BookA("Kinga Biczysko", "Book 1", 2012, "KB/1"));
        bookAHashSet.add(new BookA("Kinga Biczysko", "Book 2", 2013, "KB/2"));
        bookAHashSet.add(new BookA("Kinga Biczysko", "Book 3", 2014, "KB/3"));
        bookAHashSet.add(new BookA("Kinga Biczysko", "Book 4", 2018, "KB/4"));
        bookAHashSet.add(new BookA("Kinga Biczysko", "Book 5", 2018, "KB/5"));
        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int median = medianAdapter.publicationYearMedian(bookAHashSet);

        //Then
        Assert.assertEquals(2014, median);
    }
}
