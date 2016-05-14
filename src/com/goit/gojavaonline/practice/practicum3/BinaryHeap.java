package com.goit.gojavaonline.practice.practicum3;

import java.util.Arrays;
import java.util.NoSuchElementException;

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

    private int parent(int childInd) {
        return (childInd - 1) / d;
    }

    private int kthChild(int i, int k) {
        return d * i + k;
    }

    private void heapifyUp(int childInd) {
        int temp = heap[childInd];
        while (childInd > 0 && temp < heap[parent(childInd)]) {
            heap[childInd] = heap[parent(childInd)];
            childInd = parent(childInd);
        }
        heap[childInd] = temp;
    }

    private void heapifyDown(int ind) {
        int child;
        int temp = heap[ind];
        while (kthChild(ind, 1) < heapSize) {
            child =  minChild(ind);
            if (heap[child] < temp) {
                heap[ind] = heap[child];
            } else {
                break;
            }
            ind = child;
        }
        heap[ind] = temp;
    }

    private int minChild(int ind) {
        int smallestChild = kthChild(ind, 1);
        int k = 2;
        int position = kthChild(ind, k);
        while ((k <= d) && (position < heapSize)){
            if (heap[position] < heap[smallestChild]) {
                smallestChild = position;
            }
            position = kthChild(ind, k++);
        }
        return smallestChild;
    }

    public int poll() {
        int keyItem = heap[0];
        delete(0);
        return keyItem;

//        if (heapSize == 0)
//            throw new NoSuchElementException();
//        return heap[0];
    }

    public int delete(int ind) {
        if (heapSize == 0)
            throw new NoSuchElementException("Underflow Exception");
        int keyItem = heap[ind];
        heap[ind] = heap[heapSize -1];
        heapSize--;
        heapifyDown(ind);
        return keyItem;
    }

    public void print() {
        for (int element : heap) {
            System.out.print(element + "   ");
        }
        System.out.println();
    }
}
