import java.util.*;//------------------------------------------------------------------Importamos librerias que nos ofrece java 

public class Calculadora{//------------------------------------------------------------Asignamos clase y nombre a nuestro proyecto

	public static void main(String[] args) {//-----------------------------------------Le decimos al programa que vamos a ejecutar este programa

		System.out.println("Programa para realizar calculos basicos");//---------------Breve explicacion sobre que hace el programa 

		int x,y,z,r;//--------------------------------------------------Asignamos variables 

		Scanner n=new Scanner(System.in);//-----------------------------Usamos la libreria Scanner para recibir datos del usuario

		System.out.print("Escribe el primer numero: ");//---------------Damos especificaciones para que el usuario ingrese un numero

		x=n.nextInt();//------------------------------------------------Lo que ingesa el usuario se almacena en la varible X

		System.out.print("Escribe el segundo numero: ");//--------------Le indicamos al usuario que ingrese otro numero para poder hacer la operacion

		y=n.nextInt();//------------------------------------------------Lo que escriba el usuario se almacena en la variable Y

		System.out.println("que deseas hacer");//-----------------------Le damos una instruccio al usuario sobre que desa realizar 

		System.out.println("1._suma, 2._resta, 3._multiplicacion, 4._division");//--------- El usuario elige que opcion quiere realizar 

		z=n.nextInt();//------------------------------------------------Lo escrito se almacena en la variable z

	switch(z){//--------------------------------------------------------Usamos el comando switch para poder asignar casos segun la opcion que eliga el usuario 

		case 1://-------------------------------------------------------Abrimos el primer caso 

				r=x+y;//------------------------------------------------Si elegimos el NO.1 el programa hara la suma y guardar la respuesta en la variable r

				System.out.println("El resultado es: "+r);//------------Nos dara el resultado por que usamos la funcion concatenar variable r 

				break;//------------------------------------------------utilizamos brake para parar la cadena de casos 

		case 2://------------------------------------------------------Abrimos el segundo caso

				r=x-y;//-----------------------------------------------Si elegimos el NO.2 haremos la resta y hara el mismo paso con la varible r

				System.out.println("El resultado es: "+r);//-----------Nos dara el resultado  y lo volvemos a cocatenar con la variable r

				break;//-----------------------------------------------Páramos la cadena de casos

		case 3://------------------------------------------------------Abrimos otro caso 

				r=x*y;//-----------------------------------------------Si se elige la NO.3 se multiplicara y el resultado se guarda en r

				System.out.println("El resultado es: "+r);//-----------Damos el resultado y concatenamos con r

				break;//-----------------------------------------------Paramos la cadena de casso 

		case 4://------------------------------------------------------Abrimos otro caso 

				r=x/y;//-----------------------------------------------Si se eligio el NO.4 se dividiran y y guardaran la respuesta en r 

				System.out.println("El resultado es: "+r);//-----------Se dara la respuesta por que se concateno con la r

				break;//-----------------------------------------------Cerramos 

		default://-----------------------------------------------------Agreglamos una clase extra por si el usuario utiliza otro numero que no coincida

				System.out.println("Solo estan disponibles las cuatro opciones");//----------Le damos una alerta al usuario que solo son cuatro opciones 

				break;//-----------------------------------------------Cerramos cadena de casos 
	}
	System.out.println ("Gracias por usar el programa");//---------------------Damos gracias por usar el comando 
	}
		

}
	

