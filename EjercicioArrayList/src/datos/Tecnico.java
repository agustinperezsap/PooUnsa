
package datos;

import java.util.ArrayList;


public class Tecnico {
    private ArrayList<String> competencias = new ArrayList<String>();

    public Tecnico() {
    }
    
    public void cargarCompetencia(String competencia){
        if(this.competencias.size() < 4){
            this.competencias.add(competencia);
        }
        else{
            System.out.println("Ya supero el limite de competencias");
        }
    }
    
    public void eliminarCompetencia(){
        int ultimo = this.competencias.size();
//        System.out.println("ultimo = " + ultimo);
        this.competencias.remove(ultimo - 1);
    }
    
    public void eliminarCompetencia(String competencia){
        this.competencias.remove(competencia);
    }
    
    public int cantidadDeCompetencias(){
        return this.competencias.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < this.competencias.size(); i++) {
            sb.append(this.competencias.get(i));
            if (i < this.competencias.size() - 1) {
                sb.append(", ");
            }
        }
         sb.append("]");
        return sb.toString();
    }

    
    
    
    
}
