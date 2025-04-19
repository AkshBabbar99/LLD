package BuilderDesignPattern;

public class Student {
    private String name;
    private int age;
    private String address;
    private String phone;
    private String email;

    private Student(StudentBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;
        this.phone = builder.phone;
        this.email = builder.email;
    }

    public static StudentBuilder getBuilder(){
        return new StudentBuilder();
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void display(){
        System.out.println("Here are the student details");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Address: " + this.address);
        System.out.println("Email: " + this.email);
        System.out.println("Phone: " + this.phone);
        System.out.println("------------------------------\n");
    }

    public static class StudentBuilder{
        private String name;
        private int age;
        private String address;
        private String phone;
        private String email;

        public Student build(){
            //validations//
            if(this.age < 18){
                throw new RuntimeException("Age cannot be less than 18");
            }
            if(this.phone.length() != 10){
                throw new RuntimeException("Phone number is not valid");
            }
            return new Student(this);
        }

        public String getName() {
            return name;
        }

        public StudentBuilder setName(String name){
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public StudentBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getAddress() {
            return address;
        }

        public StudentBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public String getPhone() {
            return phone;
        }

        public StudentBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public String getEmail() {
            return email;
        }

        public StudentBuilder setEmail(String email) {
            this.email = email;
            return this;
        }
    }
}
