public class Schoolboy extends Educated{
    int classNumber;
    String classLetter;

    public Schoolboy(String surname, String name, String gender, int age, int classNumber, String classLetter) {
        super(surname, name, gender, age);
        this.classNumber = classNumber;
        this.classLetter = classLetter;
    }

    public Schoolboy(String surname, String name, String gender, int age) {
        super(surname, name, gender, age);
        classNumber = 11;
        classLetter = "V";
    }

    public Schoolboy() {
        super();
        classNumber = 11;
        classLetter="V";
    }

    public int getClassNumber() {
        return classNumber;
    }

    public String getClassLetter() {
        return classLetter;
    }
    public void educationalInstitution(){
        System.out.println("Study at school");
    }
}
