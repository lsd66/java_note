package reflect_field;

public class Student {
    private String name;
    private int age;
    public static String schoolName;
    public static final String COUNTRY = "中国";

    public Student() {
        System.out.println("无参构造函数运行");
    }

    public Student(String name, int age) {
        System.out.println("有参构造函数运行");
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}