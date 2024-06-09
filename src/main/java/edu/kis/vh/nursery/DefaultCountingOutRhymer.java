package edu.kis.vh.nursery;

/**
 * DefaultCountingOutRhymer is a class that simulates a simple counting out rhymer.
 * It allows adding numbers, checking if it's empty or full, peeking the last number
 * and counting out (removing) the last number.
 */
public class DefaultCountingOutRhymer {

    private int[] NUMBERS = new int[12];

    private int total = -1;

    /**
     * Adds a number to the rhymer.
     *
     * @param in the number to be added
     */
    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    /**
     * Checks if the rhymer is empty.
     *
     * @return true if the rhymer is empty, false otherwise
     */
    public boolean callCheck() {
        return total == -1;
    }

    /**
     * Checks if the rhymer is full.
     *
     * @return true if the rhymer is full, false otherwise
     */
    public boolean isFull() {
        return total == 11;
    }

    /**
     * Peeks the last number added to the rhymer without removing it.
     *
     * @return the last number added to the rhymer, or -1 if the rhymer is empty
     */
    protected int peekaboo() {
        if (callCheck())
            return -1;
        return NUMBERS[total];
    }

    /**
     * Counts out (removes) the last number added to the rhymer.
     *
     * @return the last number added to the rhymer, or -1 if the rhymer is empty
     */
    public int countOut() {
        if (callCheck())
            return -1;
        return NUMBERS[total--];
    }

    /**
     * Gets the total number of elements in the rhymer.
     *
     * @return the total number of elements
     */
    public int getTotal() {
        return total;
    }
}