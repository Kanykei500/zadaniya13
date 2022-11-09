public class Myclass {
    private String name;
    private String surname;
    private int age;
    private String[] lessons;
    private String food;

    public Myclass() {
    }

    public Myclass(String name, String surname, int age, String[] lessons, String food) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.lessons = lessons;
        this.food = food;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getLessons() {
        return lessons;
    }

    public void setLessons(String[] lessons) {
        this.lessons = lessons;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
}
