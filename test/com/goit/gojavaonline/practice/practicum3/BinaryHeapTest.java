package com.goit.gojavaonline.practice.practicum3;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryHeapTest {

    @Test
    public void binaryHeap1() throws Exception {
        BinaryHeap binaryHeap1 = new BinaryHeap(2);
        binaryHeap1.insert(0);
        binaryHeap1.insert(2);

        int[] testArr = {2, 0};
        binaryHeap1.print();
//        assertArrayEquals(testArr, binaryHeap1(2));

//        assertEquals(2, binaryHeap1.poll());
    }

    /*
    @Test
    public void binaryHeap2() throws Exception {
        BinaryHeap binaryHeap2 = new BinaryHeap(8);
        binaryHeap2.insert(0);
        binaryHeap2.print();
        binaryHeap2.insert(1);
        binaryHeap2.print();
        binaryHeap2.insert(2);
        binaryHeap2.print();
        binaryHeap2.insert(3);
        binaryHeap2.print();
        binaryHeap2.insert(4);
        binaryHeap2.print();
        binaryHeap2.insert(5);
        binaryHeap2.print();
        binaryHeap2.insert(6);
        binaryHeap2.print();
        binaryHeap2.insert(7);
        binaryHeap2.print();
        binaryHeap2.insert(8);
        binaryHeap2.print();

        int[] testArr = {8, 7, 5, 6, 2, 1, 4, 3};
        assertArrayEquals(testArr, binaryHeap2.binaryHeap);

        assertEquals(8, binaryHeap2.poll());
    }
    */
}