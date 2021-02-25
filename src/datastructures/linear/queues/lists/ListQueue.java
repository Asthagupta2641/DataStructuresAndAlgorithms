package datastructures.linear.queues.lists;

import datastructures.linear.queues.QueueADT;

import java.util.LinkedList;
import java.util.NoSuchElementException;
/*
public class ListQueue<E> implements QueueADT<Boolean> {

    private LinkedList<Boolean> queue;
    private int front = 0;
    private int rear = -1;

    public ListQueue() {
        this.queue = new LinkedList<Boolean>();
    }

    @Override
    public boolean enqueue(Boolean item) {
        queue.addLast(item);
        rear++;
        return true;
    }

    @Override
    public Boolean dequeue() throws NoSuchElementException {
        front++;
        return queue.removeFirst();
    }

    @Override
    public boolean offer(Boolean item) {
        queue.addLast(item);
        return true;
    }


    @Override
    public Boolean remove() throws NoSuchElementException{
        if (queue.isEmpty()) {
            throw new NoSuchElementException();
        }queue.removeFirst();
        return null;
        */