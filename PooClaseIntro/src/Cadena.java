
public class Cadena {
    private String linea ;
    
    public Cadena(String linea){
        this.linea = linea;
    }
    
    public int cantidadCaracteres(){
        return this.linea.length();
    }
    
    public int cantidadPalabras(){
        String[] palabras = this.linea.split("\\s+");
        return palabras.length;
                
    }
    
    public int contadorVocales(){
        int contador = 0;
        String vocales = "aeiouAEIOU";
        for (int i = 0; i < this.linea.length(); i++) {
            char c = this.linea.charAt(i);
            if (vocales.indexOf(c) != -1) {
                contador ++;
            }
        }
        return contador;
    }
    
    public int cantidadConsonantes() {
        int contador = 0;
        String consonantes = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
        for (int i = 0; i < this.linea.length(); i++) {
            char c = this.linea.charAt(i);
            if (consonantes.indexOf(c) != -1) {
                contador++;
            }
        }
        return contador;
    }
    
    
}
