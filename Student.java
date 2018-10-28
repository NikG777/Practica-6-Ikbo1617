public class Student {
    public  int id;
    public Student()
    {
        id = 0;
    }

    public  int getId() {
        return id;
    }

    public  void setId(int id) {
        this.id = id;
    }

    public String toString()
    {
        return "Студент " + id ;
    }
}