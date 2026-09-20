
package estruturabasica;


public class EstruturaBasica {

    
    
    public static void main(String[] args) {
        
        
        String  nombre ="maria";
        int edad = 28;
        double salario = 45000.50;
        boolean esEmpleado = true;
        
        
        double salarioAnual = salario * 12;
        int edadProxima = edad +1;
        
        System.out.println("=== Informacion del Empleado ===");
        System.out.println("nombre: " + nombre );
        System.out.println("Edad Actual: "+ edad);
        System.out.println(" Edad proximo ano: " + edadProxima );
        System.out.println("salario mensual: " + salario);
        System.out.println(" Salario anual: "+ salarioAnual);
             System.out.println("Es empleado activo? " + esEmpleado);
    }
    
}
