
package linguadosistema;

import java.util.Locale;


public class LinguaDoSistema {

 
    public static void main(String[] args) {
        Locale idioma = Locale.getDefault();
        System.out.println("Idioma: "+ idioma.getDisplayLanguage() +" "+ idioma.getLanguage());
    }
    
}
