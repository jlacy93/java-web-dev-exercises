package exercises.technology;

public abstract class AbstractEntity {
    static int IDCount;
    private int ID;

    public void setID() {
        this.ID = IDCount++;
    }
}
