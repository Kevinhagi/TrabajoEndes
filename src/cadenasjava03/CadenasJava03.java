package cadenasjava03;

/**
 *
 * @author kevin
 */
public class CadenasJava03 
{
    public static void main(String[] args) 
    {
        StringBuilder CadenaRotada = new StringBuilder();
        System.out.println("Introduce una cadena");
        String cadena = Teclado.cadena();
        Character ultimo;
        CadenaRotada.append(cadena);
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
