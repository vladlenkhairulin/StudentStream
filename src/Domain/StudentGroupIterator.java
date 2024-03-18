package Domain;

import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<StudentGroup> {
    private int number;
    private final List<StudentGroup> groups;

    public StudentGroupIterator(List<StudentGroup> groups) {
        this.groups = groups;
        this.number = 0;
    }

    /**
     * @return True, если проверяется студент с номером меньше, чем размер группы
     */
    @Override
    public boolean hasNext() {
        return number<groups.size();
    }

    /**
     * @return следующий элемент списка groups, если в списке еще остались элементы
     */
    @Override
    public StudentGroup next() {
        if(!hasNext())
        {
            return null;
        }
        //number++;
        return groups.get(number++);
    }
}
