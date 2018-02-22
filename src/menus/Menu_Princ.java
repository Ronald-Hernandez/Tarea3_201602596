
package menus;

import java.util.Scanner;

public class Menu_Princ {
    
    public Menu_Princ(){
        
        eleccion(); 
    }
    public void eleccion(){
         Scanner teclado = new Scanner(System.in);
        
        System.out.println("[IPC1]Tarea3_201602595");
        System.out.println();
        System.out.println("1.Usuarios");
        System.out.println("2.Contador de dígitos");
        System.out.println("3.Tresnúmeros de mayor a menor");
        System.out.println("4.Calcular promedio");
        System.out.println("5.Salir");
        System.out.println();
       
        
        int a = teclado.nextInt();
       
        switch(a){
            case 1:
                menusuario();       //llamada el método de usuarios
                break;
            case 2:
                menucontador();     //llamada al menu del contador
                break;
            case 3:
                menuMayorMenor();
                                    //llamada al método mayorMenor
                break;
            case 4:
                promedio();
                                    //llamada al método promedio
                break;
            case 5:
                                    //llamada al método salida
                break;
            default:
                System.out.println("ERROR");
                System.out.println("Vuelva a intentarlo");
                eleccion();
                break;
        }
    
    }
public void menusuario(){

    Scanner teclado = new Scanner(System.in);       //creando objeto por medio de entrada
    System.out.println("1.Ingresar Usuario");
    System.out.println("2.Ordenar Ascendente");
    System.out.println("3.Ordenar Descendente");
    System.out.println("4.Menúprincipal");
    int a = teclado.nextInt();
    
    switch(a){          //Sentencia de seleccion
        case 1:
            entradaUsuario();       //llamada al metodo de ingreso de usuario
            System.out.println();
            menusuario();
            break;
        case 2:
            System.out.println("Se ordenarán en el orden de entrada");  
            usuarioAscendente();            //llamando al metodo de orden ascendente
            System.out.println();
            menusuario();
            break;
        case 3:
            System.out.println("Se ordenará en el orden opuesto de entrada");
            usuarioDescendente();       //llamando al metodo de  orden descendente
            System.out.println();
            break;
        case 4:
            eleccion();
            break;
        default:
            System.out.println("ERROR VUELVA A INTENTARLO DE NUEVO");
            System.out.println();
            menusuario();
            break;
    
    
    
    }
    
}
public String[] entradaUsuario(){
    System.out.println("Ingresar usuarios");    
    int i;
   String usuarios[]= new String[5];        //creacion del vector de 5 espacios
        for(i=0;i<usuarios.length;i++){
            Scanner teclado= new Scanner(System.in);
            String a= teclado.next();
            usuarios[i]=a;    
        }
        
        for(i=0;i<usuarios.length;i++){
            System.out.println(i+1+"."+usuarios[i]);
        
        }
        return usuarios[];
        
}
public void usuarioAscendente(){
    int i;
    String usuarios[]= entradaUsuario();
    
    for(i=1;i==usuarios.length;i++){
            System.out.println(i+"."+usuarios[i]);
}
}

public void usuarioDescendente(){}

public void menucontador(){         //menu del contador
 
    Scanner teclado = new Scanner(System.in);
    System.out.println("1. Ingresar numero");
    System.out.println("2. Mostrar numero de dígitos");
    System.out.println("3. Menú principal");
    
    int a= teclado.nextInt();
    //Opciones del menu
     switch(a){
            case 1:
                cont();         // llamda al metodo contador
                menucontador(); //regresando al menu del contador
                break;
            case 2:
                System.out.println("Ingrese primero su numero");  
                System.out.println();
                menucontador();                             //regresando al menu del contador
            case 3:              
                eleccion();     //regresando al menú principal
                break;
            default:
                System.out.println("ERROR");   
                System.out.println();
                menucontador();               //regresando al menu del contador
                
}

    
}
public void cont(){

    Scanner teclado1 = new Scanner(System.in);      //creacion del objeto de entrada
     System.out.println("Ingrese un numero para conocer su cantidad de digitos.");    //peticion de numero
     System.out.println();
     System.out.println("NOTA: debe estar en un rango de 0 a 100000");               //Especificacion del rango
     int b = teclado1.nextInt();
    
     
    if(b<100000){       //validando rango
        if(b!=0){       //excluyendo "0"
        int n=0;
    int cont=1;    
    while(cont<=b) {                        //iniciando ciclo para el problema
    int res=(int)Math.pow(10,n);      // calculando la potencia para la exprecion cientifica
    cont=1*res;                         
    n=n+1;    
    }
    int m=n-1;
    System.out.println("Su numero contiene "+m+" dígitos");//respuesta
        }else {  System.out.print("Su Número tiene 1 dígito");}//mensaje si es "0"
    } else {System.out.println("ERROR SU NUMERO ESTÁ FUERA DEL RANGO ESPECIFICADO");}   //Mensaje de error si está fuera del rango
   System.out.println(); 
}    

public void menuMayorMenor(){
   Scanner teclado = new Scanner(System.in);
   System.out.println("1.Ingresar numeros");
   System.out.println("2.Mostrar Numeros");
   System.out.println("3.Menu principal");
   int a = teclado.nextInt();
   
   switch(a){
       case 1:
           int num[]=entradaMayMen();
           System.out.println();
           menuMayorMenor();
           break;
       case 2:
           System.out.println("Ingrese primero los numeros");
           menuMayorMenor();
           break;
       case 3:
            eleccion();                 //vuelta al menu principal
            break;
       default:
            System.out.println("ERROR VUELVA A INTENTARLO DE NUEVO");           //mensaje de error
            System.out.println();
            menuMayorMenor();
            break;
           
   }       
}
public int[] entradaMayMen(){
    Scanner tecl_1=new Scanner(System.in);   // creando los objetos de ontrada
           Scanner tecl_2=new Scanner(System.in);
           Scanner tecl_3=new Scanner(System.in);
   
           System.out.println("Ingrese tres numeros");
      
           int x = tecl_1.nextInt();
           int y = tecl_2.nextInt();
           int z = tecl_3.nextInt();
 int arreglo[]={x,y,z};
 
    calcularMayorMenor(arreglo);
return new int[]{x,y,z} ;
}
public void calcularMayorMenor(int f[]){    

//metodo de mayor a menor
int a= f[0];
int b=f[1];
int c=f[2];
        
   if(a!=b && a!=c && b!=c){                //verificando que no hayan numeros repetidos
    if(a>b && a>c){
        if(b>c){
            System.out.println("El orden de los numeros es el siguiente: ");
            System.out.println(a+"_"+b+"_"+c);
        } else{
            System.out.println("El orden de los numeros es el siguiente: ");
            System.out.println(a+"_"+c+"_"+b);
        }
    } else if(b>a && b>c){
        if(a>c){
            System.out.println("El orden de los numeros es el siguiente: ");
            System.out.println(b+"_"+a+"_"+c);
        }else{
            System.out.println("El orden de los numeros es el siguiente: ");
            System.out.println(b+"_"+c+"_"+a);
        }
    } else if(c>a && c>b){
        if(a>b){
            System.out.println("El orden de los numeros es el siguiente: ");
            System.out.println(c+""+a+""+b);
        }else{
            System.out.println("El orden de los numeros es el siguiente: ");
            System.out.println(c+""+b+""+a);
        }
    }
   } else{              // Mensaje de error, si existe un numero repetido 
       System.out.println("Ingrese tres numeros distintos entre sí");
            
   }
   
}

public void promedio(){
int notas[] = entrada();
   matrizPromedio(notas[0],notas[1]);

}
public int[] entrada(){
   Scanner tecl_1=new Scanner(System.in);   // creando los objetos de ontrada
           Scanner tecl=new Scanner(System.in);  
           System.out.println("Ingrese sus notas");
      
           int w = tecl.nextInt();
           int x = tecl.nextInt();
           int y = tecl.nextInt();
           int z = tecl.nextInt();
           x=1;
           y=2;
           w=3;
           z=4;
                 

    
return new int[]{w,x,y,z,} ;
   }

public void matrizPromedio(int w,int x, int y,int z){
    



}
    
}

