package es.uah.matcomp.mp.e2.ejerciciosclases;

public class customer {
    private int id;
    private String name;
    private char gender;

    public customer(int id, String name, char gender){
        this.id = id;
        this.name = name;
        if (gender == 'm' || gender == 'f'){
            this.gender = gender;
        }
        else{
            System.out.println("Invalid gender");
            this.gender = 'f';
        }
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public char getGender(){
        return gender;
    }

    public String toString(){
        return name + "(" + id + ")";
    }

}
