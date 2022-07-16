import java.util.*;//-----------Importamos la bibliotecas de java

public class Convertir{//-------------Asignamos la clase y el nombre del proyecto

	public static void main(String[] args) {//---------Ponemos que queremos ejecutar este proyecto

		System.out.println("Hola");//---------------Damos un saludo de bienvenida

		double f=3.28;//--------Asignamos valor a la variable

		double p;//-------------Asignamos una variable

		Scanner n=new Scanner(System.in);//-----------Asignos la biblioteca scanner

		System.out.print("Escribe el numero natural que quieres convertir de metros a pies: ");//Le damos instrucciones al usuario

		p=n.nextInt();// Asignamos la variable p para que almacene datos 

		double resultado = (f*p);//----------Hacemos los calculos correspondientes

		System.out.println("La conversion es: "+resultado+" pies");//----------Damos el resultado contatenando la variable resultado



	}
}