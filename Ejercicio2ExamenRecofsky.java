import hsa.Console;
class Ejercicio2ExamenRecofsky
{
static Console c;
public static void main (String arg[])
{
int i, precio, mayores, menores, entre;
c = new Console();
mayores = menores = entre = 0;
do
{
c.print ("Ingrese precio del articulo (9999 para detener carga): ");
precio=c.readInt();
if (precio > 100 && precio < 9999)
mayores++;
else
if (precio >=40 && precio <= 100)
entre++;
else
if (precio > 0 && 40 <= precio) 
menores++;
}
while (precio != 9999 || precio > 9999);
c.println();
c.println("Articulos mayores a $100: " + mayores);
c.println("Articulos entre $40 y $100: " + entre);
c.println("Articulos menores a $40: " + menores);
}
}
