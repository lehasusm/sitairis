public class Main {
    public static void main(String[] args) {
        FullTimeStudent student1 = new FullTimeStudent("Sinitskaya", "Ksenia","woman",19, "IEF", "programmer-logistician", 5);
        student1.printInfo();
        student1.educationalInstitution();
        PartTimeStudent student2 = new PartTimeStudent("Stolyarova", "Elina","woman",19, "BA", "business analyst", "Minsk");
        student2.printInfo();
    }
}