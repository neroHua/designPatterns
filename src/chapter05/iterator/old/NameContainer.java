package chapter05.iterator.old;

public class NameContainer implements Container {
    
    private NameIterator nameIterator;
    private String[] nameArray;
    private int size;
    
    public NameContainer(int length) {
        this.nameArray = new String[length];
        this.size = 0;
        this.nameIterator = new NameIterator(0);
    }
    
    public int addName(String name) {
        if (size >= nameArray.length || name == null) {
            return -1;
        }
        
        nameArray[size] = name;
        size++;

        return size - 1;
    }
    
    @Override
    public Iterator getIterator() {
        return this.nameIterator;
    }

    public class NameIterator implements Iterator {
        int index;

        public NameIterator(int index) {
            this.index = index;
        }

        @Override
        public boolean hasNext() {
            return this.index < size;
        }

        @Override
        public Object next() {
            index++;
            return nameArray[index - 1];
        }

    }
}
