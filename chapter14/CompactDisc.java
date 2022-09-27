package gr.aueb.sev.chapter14;

public class CompactDisc implements Item{
    private long id;
    private String title;

    public CompactDisc(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "CompactDisc{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
