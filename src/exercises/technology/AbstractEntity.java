package exercises.technology;

public abstract class AbstractEntity {
    static int IDCount;
    private int ID;

    public void setID() {
        IDCount++;
        this.ID = IDCount++;
    }
}
