package PrototypeAndRegistry;

public class IntelligentStudent extends Student {
    private int iq;

    public IntelligentStudent(){
        this.iq = 50;
    }

    public IntelligentStudent(IntelligentStudent student){
        super(student);
        this.iq = student.iq;
    }

    public IntelligentStudent copy() {
        return new IntelligentStudent(this);
    }
}
