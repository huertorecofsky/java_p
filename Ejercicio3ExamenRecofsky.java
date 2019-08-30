import hsa.Console;
class Ejercicio3ExamenRecofsky
{
static Console c;
public static void main(String arg[])
{
int i, n1, n2;
c = new Console ();
c.print ("Ingrese el primer numero: ");
n1 = c.readInt();
c.print ("Ingrese el segundo numero: ");
n2 = c.readInt();
c.println();
c.println("Los numeros correspondidos entre los numeros ingresados son: ");
for (i=n1+1; i<n2; i++)
{
c.print (i+" ");
}
}
}
