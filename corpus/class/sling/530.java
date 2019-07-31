package org.apache.sling.hapi.client;

/**
 * A composite object representing items in a {@see Document}
 */
public interface Items extends Iterable<Item>, Item {

    /**
     * Returns the item at one index
     */
    Item at(int index) throws IndexOutOfBoundsException;

    /**
     * Returns the amount of items contained in this collection.
     */
    int length();
}
