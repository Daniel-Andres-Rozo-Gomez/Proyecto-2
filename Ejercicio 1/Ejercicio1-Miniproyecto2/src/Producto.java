public class Producto {

    private String nombre;
    private String descripcion;
    private int precio;
    private int cantidad;
    private String materialDeElaboracion;
    private String ejemplosDeUso;
    private String herramienta;
    
    

    public Producto(String nombre, String descripcion, int precio, int cantidad, String materialDeElaboracion,
            String ejemplosDeUso, String herramienta) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
        this.materialDeElaboracion = materialDeElaboracion;
        this.ejemplosDeUso = ejemplosDeUso;
        this.herramienta = herramienta;
    }
    public String getMaterialDeElaboracion() {
        return materialDeElaboracion;
    }
    public void setMaterialDeElaboracion(String materialDeElaboracion) {
        this.materialDeElaboracion = materialDeElaboracion;
    }
    public String getEjemplosDeUso() {
        return ejemplosDeUso;
    }
    public void setEjemplosDeUso(String ejemplosDeUso) {
        this.ejemplosDeUso = ejemplosDeUso;
    }
    public String getHerramienta() {
        return herramienta;
    }
    public void setHerramienta(String herramienta) {
        this.herramienta = herramienta;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    } 

    
}
