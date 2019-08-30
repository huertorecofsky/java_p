import hsa.Console;
import java.awt.*;
class SegundoDesempenioRecofsky
{
static Console c;
String [] nombres;
float [] tiempos;
SegundoDesempenioRecofsky ()
{
nombres = new String [20];
tiempos = new float [20];
}
void cargarDatos ()
{
c.println ("Cargue los nombres de los participantes: ");
c.println ();
for (int i = 0 ; i < nombres.length ; i++)
{
c.print ("Ingrese nombre[" + (i + 1) + "]: ");
nombres [i] = c.readLine ();
c.print ("Ingrese su tiempo: ");
tiempos [i] = c.readFloat ();
c.println ();
}
}

void imprimir ()
{
int fila;
c.setCursor(3, 10); c.print ("Corredores");
c.setCursor(4, 10); c.print ("----------");
c.setCursor(3, 30); c.print ("Tiempos");
c.setCursor(4, 30); c.print ("------------");
fila = 5;
for (int i = 0 ; i < nombres.length ; i++)
{
c.setCursor(fila, 10);
c.print(nombres[i]);
c.setCursor(fila, 30);
c.print(tiempos[i],4,1);
fila++;
}
c.println(); c.println ();
c.print(" Digite [Enter] para retornar al Menu ");
c.readChar ();
}

void ordenarPorNombres ()
{
int n=nombres.length; String
auxiNombre;
float auxiTiempo;
for (int k = 1 ; k < n ; k++)
{
for (int i = 0 ; i < n - k ; i++)
{
if(nombres[i].compareTo(nombres[i+1]) > 0)
{
auxiNombre = nombres [i];
nombres [i] = nombres [i + 1];
nombres [i + 1] = auxiNombre;
auxiTiempo = tiempos [i];
tiempos [i] = tiempos [i + 1];
tiempos [i + 1] = auxiTiempo;
}
}
}
}
void ordenarPorTiempos ()
{
int n = tiempos.length;
String auxiNombre;
float auxiTiempo;
for (int k = 1 ; k < n ; k++)
{
for (int i = 0 ; i < n - k ; i++)
{
if(tiempos[i] > tiempos[i+1])
{
auxiNombre = nombres [i];
nombres [i] = nombres [i + 1];
nombres [i + 1] = auxiNombre;
auxiTiempo = tiempos [i];
tiempos [i] = tiempos [i + 1];
tiempos [i + 1] = auxiTiempo;
}
}
}
}


void menorTiempo()
{
float menorT=tiempos[0];
int posi=0;
for(int i=1; i<tiempos.length; i++)
{
if(tiempos[i] < menorT)
{
menorT=tiempos[i];
posi=i;
}
}
c.clear();
c.setCursor(5,10);
c.print("El ganador es: " + nombres[posi]);
c.readChar ();
}

void mayorTiempo()
{
float mayorT=tiempos[0];
int posi=0;
for(int i=1; i<tiempos.length; i++)
{
if(tiempos[i] > mayorT)
{
mayorT=tiempos[i];
posi=i;
}
}
c.clear();
c.setCursor(5,10);
c.print("El perdedor es: " + nombres[posi]);
c.readChar ();
}

void consultas ()
{
int posicion;
String nombreAux;
char op;
do
{
c.clear ();
c.println ("Consultas por corredores");
c.println ("----------------------");
posicion = -1;
c.println ();
c.print ("Ingrese el nombre a buscar: ");
nombreAux = c.readLine ();
for (int i = 0 ; i < nombres.length ; i++)
{
if (nombreAux.equalsIgnoreCase (nombres [i]))
{
posicion = i;
}
}
c.println ();
if (posicion != -1)
{
c.print ("Su tiempo es: ");
c.println (tiempos[posicion] + " horas" );
}
else
{
c.println ("No existe ese corredor");
}
c.println ();
c.println ();
c.print ("Desea realizar otra consulta (s/n): ");
op = c.readChar ();
}
while (op == 'S' || op == 's');
}

public static void main (String arg [])
{
c = new Console ();
SegundoDesempenioRecofsky e = new SegundoDesempenioRecofsky ();
int op;
do
{
c.clear ();
c.setCursor (3, 10);
c.print ("Menu de Opciones");
c.setCursor (4, 10);
c.print ("----------------");
c.setCursor (5, 10);
c.print ("1- Cargar Datos");
c.setCursor (6, 10);
c.print ("2- Listado ordenado por nombres");
c.setCursor (7, 10);
c.print("3- Listado ordenado por tiempos");
c.setCursor (8, 10);
c.print ("4- Ganador de la carrera");
c.setCursor (9, 10);
c.print ("5- Perdedor de la carrera");
c.setCursor (10, 10);
c.print ("6- Busqueda segun corredor");
c.setCursor (11, 10);
c.print ("7- Finalizar el programa");
c.setCursor (12, 10);
c.print ("Digite la opcion: ");
op = c.readInt ();
switch (op)
{
case 1: e.cargarDatos (); break;
case 2: c.clear ();
c.setCursor (1, 10);
c.print("Listado Ordenado por Nombres");
e.ordenarPorNombres ();
e.imprimir(); break;
case 3: c.clear();
c.setCursor (1, 10);
c.print("Listado Ordenado por Tiempos");
e.ordenarPorTiempos ();
e.imprimir(); break;
case 4: c.clear();
c.setCursor (1, 10);
c.print("Ganador de la carrera");
e.menorTiempo ();
e.imprimir(); break;
case 5: c.clear();
c.setCursor (1, 10);
c.print("Perdedor de la carrera");
e.mayorTiempo ();
e.imprimir(); break;
case 6: c.clear();
c.setCursor (1, 10);
c.print("Busqueda segun corredor");
e.consultas ();
e.imprimir(); break;
}
}
while (op != 7);
System.exit (0);
}
}
