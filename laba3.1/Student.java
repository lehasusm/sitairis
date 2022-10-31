public class Student extends Educated{
String faculty;
String specialization;
int groupNumber;

    public Student(String surname, String name, String gender, int age, String faculty, String specialization, int groupNumber) {
        super(surname, name, gender, age);
        this.faculty = faculty;
        this.specialization = specialization;
        this.groupNumber = groupNumber;
    }
    public Student() {
        super();
        faculty = "IEF";
        specialization = "programmer-logistician";
        groupNumber = 073601;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getSpecialization() {
        return specialization;
    }

    public int getGroupNumber() {
        return groupNumber;
    }
    public void educationalInstitution(){
        System.out.println("Study at university");
    }
}
