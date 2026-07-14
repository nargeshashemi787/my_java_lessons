package session2;

public class Student2 {
    String name;
    int code;
    int age;

    // این متد باعث می‌شود وقتی شیء را چاپ می‌کنید، به جای آدرس، مقادیر چاپ شوند

    public String toString() {
        return "Student Info [Name: " + name + ", Code: " + code + ", Age: " + age + "]";
    }
}