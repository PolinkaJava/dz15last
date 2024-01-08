public static class NewCollection<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;
    private int size;

    public NewCollection() {
        this.elements = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public NewCollection(int initialCapacity) {
        this.elements = new Object[initialCapacity];
        this.size = 0;
    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (T) elements[index];
    }

    public void add(T element) {
        if (size == elements.length) {
            increaseCapacity();
        }
        elements[size++] = element;
    }

    public boolean remove(Object obj) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(obj)) {
                int numMoved = size - i - 1;
                if (numMoved > 0) {
                    System.arraycopy(elements, i + 1, elements, i, numMoved);
                }
                elements[--size] = null;
                return true;
            }
        }
        return false;
    }

    public boolean contains(Object obj) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(obj)) {
                return true;
            }
        }
        return false;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    private void increaseCapacity() {
        int newCapacity = elements.length * 2;
        Object[] newElements = new Object[newCapacity];
        System.arraycopy(elements, 0, newElements, 0, size);
        elements = newElements;
    }
}
public static void main(String[] args) {
    NewCollection <String> customCollection = new NewCollection<>();

    customCollection.add("Element 1");
    customCollection.add("Element 2");
    customCollection.add("Element 3");

    System.out.println(customCollection.get(1));
    System.out.println(customCollection.contains("Element 4"));

    customCollection.remove(0);
    System.out.println(customCollection.get(0));

    customCollection.clear();
    System.out.println(customCollection.get(0));
}
