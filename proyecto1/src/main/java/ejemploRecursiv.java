
public class ejemploRecursiv {
    public static int calcularNumerosNaturales (int n){
    //caso base:si n es = 1 , se retorna 1
     if  (n==1) {
         return 1;
       }
     //caso recursivo: se suma n con la llamada recursiva para (n-1>);
      return n + calcularNumerosNaturales (n-1);
       }
    public static void main(String[] args) {
        int numero =5;
        int suma =calcularNumerosNaturales (numero);
      
        
    //public static void main (String[] args) {
         System.out.println("La suma de los primeros " + "numeros naturales es: " + suma);    
    }
}



/*
    public static int fibonacci(int n){
         if (n==0) {
        return n;
         }
        return fibonacci(n - 1) + fibonacci(n - 2);
     }
        public static void main(String[] args) {
        int numero = 10;
        int resultado = fibonacci (numero);
        System.out.println("El termino" + numero + "de la serie Fibonacci " + resultado);
    }
}*/
