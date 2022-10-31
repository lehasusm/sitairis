public class Postgraduate extends Educated{
    String scientificWork;
    String scientificSupervisor;

    public Postgraduate(String surname, String name, String gender, int age, String scientificWork, String scientificSupervisor) {
        super(surname, name, gender, age);
        this.scientificWork = scientificWork;
        this.scientificSupervisor = scientificSupervisor;
    }

    public Postgraduate() {
        super();
        scientificWork = "Warehouse accounting for production";
        scientificSupervisor = "Krupskaya";
    }

    public String getScientificWork() {
        return scientificWork;
    }

    public String getScientificSupervisor() {
        return scientificSupervisor;
    }

    public void educationalInstitution(){
        System.out.println("Prepare for scientific activity");
    }
}
