public class PartTimeStudent extends Student{
    String residence;

    public PartTimeStudent(String surname, String name, String gender, int age, String faculty, String specialization, String residence) {
        super(surname, name, gender, age, faculty, specialization);
        this.residence = residence;
    }

    public String getResidence() {return residence;}

    public void  printInfo(){
        System.out.println ("Part-time student - Surname:" + Surname + ", Name:" + Name + " Gender:" + Gender +
                ", Age:" + Age + ", Faculty:" + Faculty + ", Specialization:" + Specialization + ", City of residence:" + residence );
    }
    @Override
    public void educationalInstitution() {
        System.out.println("The training takes place remotely");
    }
}
