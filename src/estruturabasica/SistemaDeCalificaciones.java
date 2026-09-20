
package estruturabasica;

public class SistemaDeCalificaciones {
    
    public static void main(String[] args) {
        
        int nota = 85;
        String calificacion;
        
        if (nota >= 90){
            calificacion = "A - Excelente ";
        }
        else if (nota >= 80){
            calificacion = " B -  Muy Bueno";
        }
         else if (nota >= 70){
            calificacion = " C - bueno ";
        }
         else if (nota >= 60){
            calificacion = " D - Suficiente ";
        } else {
            calificacion = "F - Reprobado";
        }
        
        System.out.println("nota " + nota);
        System.out.println("Colificacion" + calificacion);
        
    }
    
}
