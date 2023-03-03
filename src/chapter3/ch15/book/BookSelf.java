package chapter3.ch15.book;

public class BookSelf extends Shelf implements Queue{
    @Override
    public void enQueue(String title) {
        shelf.add(title);
    }

    @Override
    public String deQueue() {
        return shelf.remove(0);
    }

    @Override
    public int getSize() {
        return getCont();
    }
}
