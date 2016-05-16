package com.goit.gojavaonline.practice.practicum3;

public class BinaryHeap {
    public int[] heap;
    int heapSize = 0;

    public BinaryHeap(int size) {
        heap = new int[size];
    }

    public void insert(int val) {
        heap[heapSize] = val;

        int i = heapSize;
        int node = (i - 1) / 2;
        while (i > 0 && (heap[i] > heap[node])) {
            int temp = heap[i];
            heap[i] = heap[node];
            heap[node] = temp;

            i = node;
            node = (i - 1) / 2;
        }

        if (heapSize < heap.length - 1) {
            heapSize++;
        }
    }
    public int poll() {
        int result = heap[0];
        heap[0] = 0;

        int i = 0;
        while(true) {
            int parent = i;
            int left = i * 2 + 1;
            int right = i * 2 + 2;

            if (right < heap.length && heap[parent] < heap[right]) {
                parent = right;
            }
            if (left < heap.length && heap[parent] < heap[left]) {
                parent = left;
            }
            if (parent == i) {
                break;
            }

            int temp = heap[i];
            heap[i] = heap[parent];
            heap[parent] = temp;

            i = parent;
        }
        return result;
    }

    public void print() {
        for (int element : heap) {
            System.out.print(element + ", ");
        }
        System.out.println();
    }
}
