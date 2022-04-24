package cadenasjava03;

/**
 *
 * @author kevin
 * Fecha: 10/04/2022
 * Clase: Clase principal que contiene el metodo main
 */
public class CadenasJava03 
{
	/**
	 * Metodo: El programa solicita una cadena al usuario mediante el uso de la clase teclado y va rotando la cadena 
	 * desde la primera letra a la ultima hasta que la cadena queda igual
	 * 
	 */
    public static void main() 
    {
    	/**
    	 * Asignacion de variables
    	 */
        StringBuilder CadenaRotada = new StringBuilder();
        System.out.println("Introduce una cadena");
        String cadena = Teclado.cadena();
        /**
         * Guardamos el ultimo caracter para no perderlo 
         */
        Character ultimo;
        CadenaRotada.append(cadena);
        /**
         * Rotacion de la cadena mediante un for
         */
        for(int paso=0; paso < CadenaRotada.length();paso++ )
        {
            ultimo=CadenaRotada.charAt(CadenaRotada.length()-1);
            for(int j = CadenaRotada.length()-1; j > 0; j--)
            {
                CadenaRotada.setCharAt(j,CadenaRotada.charAt(j-1));
            }
            CadenaRotada.setCharAt(0,ultimo);
             System.out.println(CadenaRotada);
        }
        
    }
    
    
}
