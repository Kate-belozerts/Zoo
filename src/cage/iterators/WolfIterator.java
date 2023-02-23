package cage.iterators;

import animals.Wolf;

import java.util.Iterator;
import java.util.List;

public class WolfIterator implements Iterator<Wolf> {
    private List<Wolf> wolfs;
    private int cursor;

    public WolfIterator(List<Wolf> wolfs) {
        this.wolfs = wolfs;
    }

    @Override
    public boolean hasNext() {
        return cursor < wolfs.size();
    }

    @Override
    public Wolf next() {
        return wolfs.get(cursor++);
    }
}
