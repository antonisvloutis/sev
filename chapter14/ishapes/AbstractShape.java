package gr.aueb.sev.chapter14.ishapes;

public abstract class AbstractShape implements IShape{
    private long id;
    @Override
    public long getID() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
