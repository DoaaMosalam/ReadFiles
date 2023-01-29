package Collage;

public class Student {
    private String name;
    private String department;
    private double computerScience;
    private double computerInformation;
    private double analyzise;

    //constructor;

    public Student(String name, String department,
                   double computerScience, double computerInformation, double analyzise) {
        this.name = name;
        this.department = department;
       setComputerScience(computerScience);
       setComputerInformation(computerInformation);
       setAnalyzise(analyzise);
    }
    //Getter and setter.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getComputerScience() {
        return computerScience;
    }

    public void setComputerScience(double computerScience) {
        this.computerScience = computerScience;
    }

    public double getComputerInformation() {
        return computerInformation;
    }

    public void setComputerInformation(double computerInformation) {
        this.computerInformation = computerInformation;
    }

    public double getAnalyzise() {
        return analyzise;
    }

    public void setAnalyzise(double analyzise) {
        this.analyzise = analyzise;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", computerScience=" + computerScience +
                ", computerInformation=" + computerInformation +
                ", analyzise=" + analyzise +
                '}';
    }
}
