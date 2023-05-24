package student_package;
public class Tiket extends Person { //inheritance dari parent class person
    public String noTiket; // atribut yang dibikin

    public void setTiket(String noTiket){ //pengimplementasian enkapsulasi dengan metode setter
        this.noTiket = noTiket;
    }
    public String getTiket(){
        return noTiket;
    }

    @Override
    public void tentangTiket(){
        System.out.println("Tiket Tersedia"); // Polymorphism dari parent class Person
    }    
}