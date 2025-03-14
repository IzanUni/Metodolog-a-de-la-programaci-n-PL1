package es.uah.matcomp.mp.e2.ejerciciosclases;
public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        if (gender == 'm' || gender == 'f'){
            this.gender = gender;
        }
        else {
            System.out.println("Error: Invalid gender");
            this.gender = 'm';
        }
    }

    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public char getGender() {
        return gender;
    }
    public String toString(){
        return "Author[name= " + this.name + ",email= " + this.email + ",gener= " + this.gender + "]";
    }
}