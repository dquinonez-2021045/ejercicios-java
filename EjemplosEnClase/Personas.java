public class Personas{
		String nombre;
		String apellido;
		int edad;
		String sexo;
		int id;
  
		public Personas(String nombre, String alumno, int edad, String sexo, int id){
			this.nombre=nombre;
			this.apellido=apellido;
			this.edad=edad;
			this.sexo=sexo;
			this.id=id;

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
		public void obtenerNombre(String nombre){
			this.nombre=nombre;
		}
		public void obtenerApellido(String apellido){
			this.apellido=apellido;
		}
		public void obtenerEdad(int edad){
			this.edad=edad;
		}
		public void obtenerSexo	(String sexo){
			this.sexo=sexo;
		}
		
		
		public void obtenerId(){
			this.id=id;
		}
	}