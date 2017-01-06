# Java-for-Android-Developers
Java for Android Developers (10h)
 
## Programación orientada a Objetos POO (2h)

 - ####Conceptos básicos:

  a. Qué es POO?

	Programación Orientada a Objetos (POO) es un paradigma de programacion en donde se modela la data en objetos los cuales tienen un estado y un comportamiento.
	 
	b. Qué es una clase?

	Una clase es la representacion del estado y comportamiento de un objeto.

	c. Qué es un objeto?

	Es una instancia de una clase.

	d. Qué es un metodo?

	Un método es una "funcion" que define el comportamiento del objeto. Este puede modificar las propiedades (estado) del objeto o puede generar un nuevo evento con un mensaje para otro objeto del sistema.

	e. Qué es una propiedad?

	Son los "campos" que definen el estado del objeto.

	f. Qué es un evento?

	Es un suceso del sistema (interacción del usuario o mensaje enviado por algún otro objeto) el cual es manejado por este y derivado al objeto pertinente.

 - ####Ejemplo:


		public class Persona {

			private String name;
		    private String lastname;
		    private Date birthdate;
		    private int age;
		    private Double height;
		    private boolean alive;

		    public String getName() {
		        return name;
		    }

		    public void setName(String name) {
		        this.name = name;
		    }

		    public String getLastname() {
		        return lastname;
		    }

		    public void setLastname(String lastname) {
		        this.lastname = lastname;
		    }

		    public Date getBirthdate() {
		        return birthdate;
		    }

		    public void setBirthdate(Date birthdate) {
		        this.birthdate = birthdate;
		    }

		    public int getAge() {
		        return age;
		    }

		    public void setAge(int age) {
		        this.age = age;
		    }

		    public Double getHeight() {
		        return height;
		    }

		    public void setHeight(Double height) {
		        this.height = height;
		    }

		    public boolean isAlive() {
		        return alive;
		    }

		    public void setAlive(boolean alive) {
		        this.alive = alive;
		    }
		}
	


  Como instanciar una clase? 

  Persona persona = **new** Persona();


 - ####Caracteristicas de POO

   a. Herencia: 
     POO permite que clases hereden el comportamiento y estado de otras clases. En Java solo se permite heredar de una clase.


	     public class Trabajador extends Persona{
	    
		    private String id;
		    private String tutorName;

		    public String getId() {
		        return id;
		    }

		    public void setId(String id) {
		        this.id = id;
		    }

		    public String getTutorName() {
		        return tutorName;
		    }

		    public void setTutorName(String tutorName) {
		        this.tutorName = tutorName;
		    }
		 }

   b. Polimorfismo:
	  El polimorfismo permite que comportamientos diferentes asociados a objetos distintos puedan llevar el mismo nombre. 
   
		public abstract class Trabajador extends Persona {
		
		    private String id;
		    private String tutorName;
		
		    public String getId() {
		        return id;
		    }
		
		    public void setId(String id) {
		        this.id = id;
		    }
		
		    public String getTutorName() {
		        return tutorName;
		    }
		
		    public void setTutorName(String tutorName) {
		        this.tutorName = tutorName;
		    }
		
		    public abstract void trabajar();
		    
			}



		public class TrabajadorCocina extends Trabajador{
		
		    @Override
		    public void trabajar() {
		        System.out.println("Estoy cocinando!!");
		    }
		}

		public class TrabajadorLimpieza extends Trabajador {
		    @Override
		    public void trabajar() {
		        System.out.println("Estoy limpiando!!");
		    }
		}
		
   c. Encapsulación: 
   Significa reunir todas los elementos que podrian considerarse parte de una misma entidad y ponerlos a un mismo nivel de abstracción.

   d. Abstracción: 
   Abstrae el cómo del qué. Cada objeto puede realizar su función sin revelar cómo lo hace. De esta manera la parte que invoca al objeto no tiene que preocuparse por cómo hará su trabajo.
   

 - ####Modificadores de acceso
Un modificador de acceso es una palabra restringida que restringe la privacidad del componente al que precede.
En Java tenemos los siguientes modificadores de acceso:

	![Access Modifiers](https://github.com/BelatrixTraining/Java-for-Android-Developers/blob/Lesson2/images/AccessModifiers.png)

  Otros modificadores:
  
	Native: Indica que un método esta escrito en un lenguaje distinto a Java (C o C++ por ejemplo)

	Transient: Indica que el atributo no es parte persistente del objeto.
	
	Volatile: Se utiliza para indicar que el atributo puede ser modificado por varios threats de forma simultanea y asincrona. No proporciona atomicidad.

	Synchronized: Similar a volatile pero se aplica a métodos o bloques de código. 

	Abstract: Indica que la implementación del método no estará en la clase actual sino en las clase que la implementen. Una clase con uno o mas métodos abstractos debe ser declarada abstracta.

	Final: Si precede a una variable indica que el valor de esta no se puede modificar, si precede a un método indica que este no se puede sobreescribir y si precede a una clase indica que la clase no se puede extender.
	
  
 - ####Ejercicios


 	Un objeto tiene ___ y ___. (estado y comportamiento)
 	
	El estado de un objeto se guarda en ___. (propiedades)
	
	El comportamiento de un objecto se visualiza mediante sus ___. (métodos)
	
	Esconder data interna del mundo exterior y solo acceder a ella a través de metodos públicos se conoce como ___. (encapsulación de data)
	
	Una radiografia (blueprint) de un SW es llamada una ___. (clase)
	
	Un comportamiento comun puede ser definido en una ___ y puede ser heredado en una ___ usando la palabra ___. (superclase - subclase - extends)
	
	Una colección de métodos sin implementación se le llama a una ___. (interface)
	
	Un nombre de espacio (namespace) que organiza clases e interfaces es llamado ___. (paquete)
	
	El término API significa ___? (application programming interface)
 
## Referencias 

 - https://www.edx.org/course/java-fundamentals-android-development-galileox-caad001x
 - https://docs.oracle.com/javase/tutorial/java/concepts/object.html
 - https://sourcemaking.com/antipatterns

	
