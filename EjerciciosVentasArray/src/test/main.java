
package test;

import datos.VentaSemanal;


public class main {
    public static void main(String[] args) {
        VentaSemanal v1 =  new VentaSemanal(10);
        
        v1.cargarVentas();
        v1.muestraventas(v1);
      
    }
    
    
}
