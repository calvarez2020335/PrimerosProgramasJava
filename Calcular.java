import java.util.*;//----------------------Exportamos librerias que nos proporciona java 

public class Calcular{//-------------------Damos que clase sera y el nombre del proyecto

	public static void main(String[] args) {//---------Le decimos que si queremos ejecutar el proyecto

		System.out.println("Calcula perimetro y area de un triangulo");//------------------------Explicacion sobre que hace el programa 

		int b,h,r,re;//-------------------------------------------Asignamos variables 

		Scanner n=new Scanner(System.in);//----------------------Elefimos la biblioteca scanner para que el programa lea datos del usuario

		System.out.print("Escribe la base: ");//------------------le desimos al usurio que meta datos

		b=n.nextInt();//-------------Almacenamos los datos en la varible b

		System.out.print("ingrese la altura: ");//-----------Le decimos al usuario que meta otros datos 

		h=n.nextInt();//-------------------------- Almacena los datos en al variable h

		System.out.println("Que desea hacer");//-------------------Preguntamos al usuario que desea hacer

		System.out.println("1._Area 2._perimetro");//-------------Le damos la opcion al usuari nsobre que desae hacer

		re=n.nextInt();//----------------------------Almacenos en la variable re

		switch(re){//-------------------------Usamos el comando switch para saignar casos 

			case 1://-------------Abrimos caso 

				r=b*h/2;//------------Hacemos los calculos correspodientes 

				System.out.println("El area es: "+r);//-------damos el resultado contatenando la variable r 

				break;//-----------------------------------damos fin a la cadena de casoss

			case 2://------------------------asignamos un segundo caso 

				r=b*h*2;//--------------- hacemos los calculos correspondientes

				System.out.println("El perimetro es: "+r);//-----------------Damos el resultado concatenando la variable r 

				break;//--------------------- Cerramos la cadena de casos 

		}


		}




	}
