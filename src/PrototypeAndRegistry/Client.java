package PrototypeAndRegistry;

class Client {

    public static void main(String[] args) {
        Student student = new Student(1, "Aksh", 25);

        //Copy
        Student st1 = student.copy();
    }
}
