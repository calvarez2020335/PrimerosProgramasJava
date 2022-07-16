import java.util.*;//---------------------------------------------------------------En esta parte importamos las librerias que ofrece java 

public class Velocidad{//-----------------------------------------------------------En este apartado abrimos el program ponieno de que clase va a hacer y el nombre del programa

	public static void main(String[] args) {//--------------------------------------Aqui especifica que vamos a ejecutar este programa 

		System.out.println("Programa que convierte de kilometros a metros");//------Damos una explicacion de sobre que va a trartar el programa

		int k,e=1000,s=3600;//------------------------------------------------------Asignamos una variable y le damos valor a dos variables
		
		Scanner n=new Scanner(System.in);//-----------------------------------------Usamos las libreria Scanner que nos permite que el usuario ingrese datos

		System.out.print("ingrese la velocidad del automovil: ");//-----------------Aqui el usuario nos tiene que proporcionar un numero natural que es la velocidad del automovil segun el problema 

		k=n.nextInt();//------------------------------------------------------------A la ingognita k le asignamos todos los valores que hemos metido anterior mente que esten despue del comando Scanner 

		double resultado = (k*e/s);//--------------------------------------------------En este lugar ya toca hacer las operaciones logicas que son K(velocidad del automovil) e(que es la convercion de kilometros a metros(1000)) s(Convercion de horas a segundos(3600)) eso se multiplica y se divide

		System.out.println("La conversion de kilometros a metros es: "+resultado);//Damos el resultado de la conversio 

		System.out.println("Gracias por usar el programa");//-----------------------Agradecimiento por el uso del programa  

		
	}
}