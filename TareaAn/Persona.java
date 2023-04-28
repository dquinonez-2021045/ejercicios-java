public class Persona{
    Datos bf=new Datos();
    String nombre;
    String apellido;
    int edad;
    char sexo;
    public Persona (){
    String nombre=" ";
    String apellido=" ";
    int edad=0;
    char sexo=' ';
}   
    public Persona (String n, String a, int e, char s){
    nombre= n;
    apellido= a;
    edad= e;
    sexo= s;
    }
    public String retornarNombre(){
        return nombre;

    }
    public String retornarApellido(){
        return apellido;

    }
    public int retornarEdad(){
        return edad;

    }
    public char retornarSexo(){
        return sexo;

    }
    public void obtenerNombre(String n){
        nombre=n;

    }
    public void obtenerApellido(String a){
        apellido=a;
    }
    public void obtenerEdad(int e){
        edad=e;
    }
    public void obtenerSexo(char s){
        sexo=s;
    }
}