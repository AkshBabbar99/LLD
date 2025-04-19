package PrototypeAndRegistry;

class Student implements Prototype<Student> {
    private int id;
    private String name;
    private int age;

    public Student(){}

    public Student(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Student(Student student){
        this.id = student.id;
        this.name = student.name;
        this.age = student.age;
    }

    @Override
    public Student copy(){
        return new Student(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
