package Domain;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
    private List<Student> group;
    private Integer idGroup;

    public StudentGroup(List<Student> group, Integer idGroup) {
        this.group = group;
        this.idGroup = idGroup;
    }

    public List<Student> getGroup() {
        return group;
    }

    public void setGroup(List<Student> group) {
        this.group = group;
    }

    public Integer getIdGroup() {
        return idGroup;
    }


    /**
     * @param idGroup номер группы
     */
    public void setIdGroup(Integer idGroup) {
        this.idGroup = idGroup;
    }

    /**
     * @return количество учеников в группе
     */
    public int getGroupSize() {
        return group.size();
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator(group);

    }

    /**
     * @return особый формат вывода студентов в группе
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Group [ID=").append(idGroup).append("], ").append("number of students = ").append(group.size()).append(", ").append("Students:\n");
        for (Student student : group) {
            sb.append("\t").append(student).append("\n");
        }
        return sb.toString();
    }

    /**
     * @param o the object to be compared.
     * @return результат сравнения сначала по размеру группы, затем по номеру группы, если их размеры совпадают
     */
    @Override
    public int compareTo(StudentGroup o) {
        int sizeComparison = Integer.compare(this.getGroupSize(), o.getGroupSize());
        int idComparison = Integer.compare(this.getIdGroup(), o.getIdGroup());
        if (sizeComparison != 0) {
            return sizeComparison;
        } else {
            return idComparison;
        }
    }
}