import hsa.Console; 
class Ejercico1ExamenRecofsky
{
static Console c;
public static void main (String arg [])
{
int n1, n2, n3;
c = new Console();

c.print ("Ingrese primer numero: ");
n1= c.readInt();
c.print ("Ingrese segundo numero: ");
n2= c.readInt();
c.print("Ingrese tercer numero: ");
n3= c.readInt();
c.println();
if (n1 == n2 && n1 == n3 && n2 == n3)
{
c.print ("Los tres numeros son iguales");
}
else
if (n1 == n2 || n1 == n3 || n2 == n3)
{
c.print ("Dos numeros son iguales");
}
else
{
c.print ("Los tres numeros son distintos");
}
 }
 }
 
