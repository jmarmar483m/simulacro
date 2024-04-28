package vehiculo;
/**
 *
 * @author Juan Martinez
 */
public class VehiculoXXX2224 {
    /**
     * @return nombre devuelve el nombre del vehiculo
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * @param nombre introduce el nombre del vehiculo
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * @return precio devuelve el precio
     */
    public double getPrecio() {
        return precio;
    }
    /**
     * @param precio introduce el precio del vehiculo
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    /**
     * @return precioIVA el precio con IVA
     */
    public double getPrecioIVA() {
        return precioIVA;
    }
    /**
     * @param precioIVA introduce el precio ya con IVA
     */
    public void setPrecioIVA(double precioIVA) {
        this.precioIVA = precioIVA;
    }
    /**
     * @return the stock cantidad de producto
     */
    public int getStock() {
        return stock;
    }
    /**
     * @param stock marca la cantidad que hay del producto
     */
    public void setStock(int stock) {
        this.stock = stock;
    }
    /*atributos*/
    private String nombre;
    private double precio;
    private double precioIVA;
    private int stock;
    /* Constructor sin argumentos */
    public VehiculoXXX2224() {
    }
    // Constructor con parámetro para iniciar todas las propiedades de la clase
    /**
     * @param nom nombre
     * @param precio precio
     * @param stock cantidad en stock
     */
    public VehiculoXXX2224(String nom, double precio, int stock) {
        this.nombre = nom;
        this.precio = precio;
        this.stock = stock;
    }
    // Método para asignar el nombre del vehiculo
    /**
     *
     * @param nom asigna el nombre al vehiculo
     */
    public void asignarNombre(String nom) {
        setNombre(nom);
    }
    // Método que me devuelve el nombre del vehiculo
    /**
     *
     * @return devuelve el nombre del vehiculo
     */
    public String obtenerNombre() {
        return getNombre();
    }
    // Método que me devuelve el stock de vehiculos disponible en cada momento
    /**
     *
     * @return Stock la cantidad de producto
     */
    public int obtenerStock() {
        return getStock();
    }
    /* Método para comprar vehiculos. Modifica el stock.
     * Este método va a ser probado con Junit
     */
    /**
     *
     * @param cantidad numero de vehiculos a comprar
     * @throws Exception excepcion en caso de no tener stock
     */
    public void comprar(int cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede comprar un nº negativo de vehiculos");
        }        setStock(getStock() + cantidad);
    }
    /**
     *
     * @param cantidad cantidad de vehiculos a vender
     * @throws Exception en caso de que se vendan más vehiculos que los que hay
     * en stock
     */
    public void vender(int cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede vender una cantidad negativa de vehiculos");
        }        if (obtenerStock() < cantidad) {
            throw new Exception("No se hay suficientes vehiculos para vender");
        }        setStock(getStock() - cantidad);
    }

}
