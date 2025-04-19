package BuilderDesignPattern;

public class Client {

    public static void main(String[] args) {
        Student student = Student.getBuilder()
                .setName("Aksh")
                .setAge(30)
//                .setAddress("1234 Ave")
//                .setEmail("a@gmail.com")
                .setPhone("98457473838")
                .build();

        student.display();
    }
}
