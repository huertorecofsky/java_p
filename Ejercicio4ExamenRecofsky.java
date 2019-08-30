import hsa.Console; 
class Ejercicio4ExamenRecofsky
{
static Console c;
public static void main (String arg [])
{
int i,t, mul, suma, resultado;
c = new Console();
i=1;
t=200;
mul=0;
suma=0;
resultado=0;
c.println ("Impresion de la suma y multiplicacion de la serie : ");
c.println();
while (i <= 30)
{
t = t + 3;
mul = t * 5;
suma = mul + suma;
i = i + 1;
}
{
resultado = suma;
}
{
c.print ("El resultado es: " + resultado);
}
}
}




