public class Financias {
    // Zona de Atributos
    private int id; //id del trabajador
    private String firstName; //Nombre del trabajador
    private String lastName; //Apellido del trabajador
    private int salary; //Salario del trabajador

    // Zona de Metodos
    public Financias(int id, String firstName, String lastName, int salary){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId(){
        return id;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getSalary(){
        return salary;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public int getAnnualSalary(){
        return 12 * salary;
    }

    public int raiseSalary(int percent){
        return salary + (percent * salary / 100);
    }

    public String toString(){
        return "Financias[id = " + id + ", firtsName = " + firstName + ", lastName = " + lastName + ", salary = " + salary + "]";
    }

}

