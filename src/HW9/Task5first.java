package HW9;

import java.util.Objects;

public class Task5first {

    private int size1;
    private String text1;

    public Task5first(int size1,String text1) {
        this.size1=size1;
        this.text1=text1;
    }

    public int getSize1() {
        return size1;
    }

    public void setSize1(int size1) {
        this.size1 = size1;
    }

    public String getText1() {
        return text1;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task5first)) return false;
        Task5first that = (Task5first) o;
        return getSize1() == that.getSize1() && Objects.equals(getText1(), that.getText1());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSize1(), getText1());
    }
}
