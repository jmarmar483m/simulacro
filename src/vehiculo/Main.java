
package vehiculo;

/**
 *
 * @author 
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoXXX2224 miVehiculoXXX2224;
        int stockActual;
        
        miVehiculoXXX2224 = new VehiculoXXX2224("Seat",18000,100);
        
        operativaVehiculosXXX22224(miVehiculoXXX2224, 50); 
        
        stockActual = miVehiculoXXX2224.obtenerStock();
        
        System.out.println("El stock actual es "+ stockActual );
    }

    private static void operativaVehiculosXXX22224(VehiculoXXX2224 miVehiculoXXX2224, int cantidad) {
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoXXX2224.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoXXX2224.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
    }

}
    
