public class FullTimeStudent extends Student{
    int workingDays;

    public FullTimeStudent(String surname, String name, String gender, int age, String faculty, String specialization, int workingDays) {
        super(surname, name, gender, age, faculty, specialization);
        this.workingDays = workingDays;
    }

    public int getWorkingDays() {return workingDays;}

    public void  printInfo(){
        System.out.println ("Full-time student - Surname:" + Surname + ", Name:" + Name + " Gender:" + Gender +
                ", Age:" + Age + ", Faculty:" + Faculty + ", Specialization:" + Specialization + ", Working days:" + workingDays );
    }
    @Override
    public void educationalInstitution() {
        System.out.println("The training takes place at the university");
    }
}
