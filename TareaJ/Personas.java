public class Personas{
		String nombre;
		String apellido;
		int edad;
		String sexo;

		public Personas(String n, String a, int e, String s){
			nombre=n;
			apellido=a;
			edad=e;
			sexo=s;
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
		public String retornarSexo(){
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
		public void obtenerSexo	(String s){
			sexo=s;
		}
	}