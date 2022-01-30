package java2.part2;

public class User1 {
    private int id;
    private String name;
    private String position;
    private int age;

    public User1(int id, String name, String position, int age) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.age = age;
    }

    public void info(){
        System.out.println("id: " + id + " ; Nutzername: " + name+ "; Position: " + position + "; Alter: " + age);
    }

    public void changeposition(String position) {
        this.position = position;
        System.out.println("Nutzer " + name + " hat die neue Position bekommen: " + position);
    }

    public void putMeInArray(User1[] company, int arrayIndex) {
        company[arrayIndex] = this;
    }

    public static void main(String[] args) {
        User1 user = new User1(5, "Rus", "Entwickler", 35);
        //User2 user2 = user;
        System.out.println("hello");

    }
}
