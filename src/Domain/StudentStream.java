package Domain;

import java.util.Iterator;
import java.util.List;

public class StudentStream implements Iterable<StudentGroup> {
    // список групп в потоке
    private List<StudentGroup> stream;
    // номер потока
    private Integer idStream;

    public StudentStream(List<StudentGroup> stream, Integer idStream) {
        this.stream = stream;
        this.idStream = idStream;
    }

    public List<StudentGroup> getStream() {
        return stream;
    }

    public void setStream(List<StudentGroup> stream) {
        this.stream = stream;
    }

    public Integer getIdStream() {
        return idStream;
    }

    public void setIdStream(Integer idStream) {
        this.idStream = idStream;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("idStream = ").append(idStream)
                .append(", number of groups = ").append(stream.size())
                .append(", groups: \n [ ");
        for (StudentGroup group : stream) {
            sb.append(group).append("\n");
        }
        sb.delete(sb.length() - 2, sb.length());
        sb.append(" ]");

        return sb.toString();
    }
    @Override
    public Iterator<StudentGroup> iterator() {
        return new StudentGroupIterator(stream);

    }
}
