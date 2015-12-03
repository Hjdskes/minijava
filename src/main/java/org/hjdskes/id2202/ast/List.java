package org.hjdskes.id2202.ast;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * A generic list, using an {@link ArrayList} as backend.
 *
 * @param <T> The data type to encapsulate.
 */
public class List<T> implements Iterable<T> {
    private final ArrayList<T> elements;

    /**
     * Constructs a new {@link List}.
     */
    public List() {
        this.elements = new ArrayList<>();
    }

    /**
     * Adds an element to the list.
     * @param element The element to add.
     */
    public void add(T element) {
        elements.add(element);
    }

    /**
     * Returns the element at the specified index.
     *
     * @param index The index whose element to return.
     * @return The element found at the specified index.
     */
    public T get(int index) {
        return elements.get(index);
    }

    /**
     * Returns the size of this list.
     * @return The size of this list.
     */
    public int size() {
        return elements.size();
    }

    @Override
    public Iterator<T> iterator() {
        return elements.iterator();
    }
}
