package student_package;
public class Person {
    private String nama; // atribut di class ini
    private String NoHp;

    public void setNama(String nama){ // pengimplementasian enkapsulasi dengan method setter getter 
        this.nama = nama;
    }
    public void setNoHp(String NoHp){
        this.NoHp = NoHp;
    }
    public String getNama(){
        return nama;
    }
    public String getNoHp(){
        return NoHp;
    }

    public void tentangTiket(){ //pembuatan method
        System.out.println("Informasi Tiket");
    }
    
}
