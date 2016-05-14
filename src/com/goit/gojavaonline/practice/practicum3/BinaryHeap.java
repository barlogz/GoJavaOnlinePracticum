package com.goit.gojavaonline.practice.practicum3;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Queue;

public class BinaryHeap {
    private static final int d = 2;
    private int heapSize;
    private int[] heap;

    public BinaryHeap(int size) {
        heapSize = 0;
        heap = new int[size + 1];
        Arrays.fill(heap, -1);

    }

    public void insert(int val) {
        if (heapSize == heap.length)
            throw new NoSuchElementException("Overflow Exception");
        heap[heapSize++] = val;
        heapifyUp(heapSize - 1);
    }

    private void heapifyUp(int childInd) {
        int temp = heap[childInd];
        while (childInd > 0 && temp < heap[parent(childInd)]){
            heap[childInd] = heap[parent(childInd)];
            childInd = parent(childInd);
        }
        heap[childInd] = temp;
    }

    private int parent(int childInd) {
        return (childInd - 1) /d;
    }

    public int poll() {
        Queue queue = new Queue;
        queue.poll()
    }
}
