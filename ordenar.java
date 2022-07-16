import java.util.*;//-------Importamos librerias de las que nos ofrece java

public class ordenar{//--------------Asignamos clase y nombre al proyecto

	public static void main(String[] args) {//-----le decimnos que queremos ejecutar el problema 

		System.out.println("Hola");//------------Le damos un saludo al usuario

		int n1,n2;//--------------Asignamos variables

		Scanner n=new Scanner(System.in);//-------Usamos la libreria para que el usuario ingrese datos 

		System.out.print("ingrese el primer numero: ");//-----Le decimos al usuario que ingrese datos

		n1=n.nextInt();//---------------Guardamos datos en la variable n1

		System.out.print("ingrese el segundo numero: ");//-------Le decimos al usuario que ingrese datos

		n2=n.nextInt();//----------------Guardamos daros en la variable n2

		System.out.println("Ordenando numeros...");//---------ordenando numeros...

		if(n1<n2){//---ñ-----------Realizamos los los calculos correspondientes

			System.out.println(n1+"  es menor  que   "+n2 );// Damos el resultado 
		}else if(n1==n2){
			System.out.println(n1+"  es igual que   "+n2 );// Damos el resultado 
		}else{// ------------------- si no se cumple lo dado pasamos a este else 

			System.out.println(n2+"  es menor  que  "+n1);// si no se cumplio lo anterior se reailaza este proceso 
		}

		System.out.println("Gracias por usar el programa :D");//---------------- Damos gracias por usar el problema 
	}


}