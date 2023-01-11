public class Main {
    public static void main(String[] args) {

    Persona Juan = new Persona();

    Juan.setEdad(21);
    Juan.setNombre("Juan Carlos Almeida");
    Juan.setPhone(123456789);

    System.out.println(Juan.getEdad());
    System.out.println(Juan.getNombre());
    System.out.println(Juan.getPhone());

    }
}

class Persona{
    private int edad;
    private String nombre;
    private int phone;

    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
    return this.edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }

    public void setPhone(int phone){
        this.phone = phone;
    }
    public int getPhone(){
        return this.phone;
    }
}