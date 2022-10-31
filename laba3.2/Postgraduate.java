public class Postgraduate implements Educated, Object{
    protected String Surname=null;
    protected String Name=null;
    protected String Gender=null;
    protected  int Age=0;
    String scientificWork;
    String scientificSupervisor;

    public Postgraduate(String scientificWork, String scientificSupervisor) {
        this.scientificWork = scientificWork;
        this.scientificSupervisor = scientificSupervisor;
    }

    public String GetSurname() {
        return Surname;
    }
    public String GetName() {
        return Name;
    }
    public String GetGender() {return Gender;}
    public int GetAge() {return Age;}
    public String getScientificWork() {return scientificWork;}
    public String getScientificSupervisor() {return scientificSupervisor;}

    @Override
    public void educationalInstitution() {
        System.out.println("Prepare for scientific activity");
    }

    @Override
    public void printInfo() {
        System.out.println("Scientific work: " + scientificWork + " Scientific supervisor: " +scientificSupervisor);
    }
}
