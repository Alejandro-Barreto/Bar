
package bar;

public class Articulo {
    private int IdArticulo;
    private String Descripcion;
    private int Precio;

    public Articulo(int IdArticulo, String Descripcion, int Precio) {
        this.IdArticulo = IdArticulo;
        this.Descripcion = Descripcion;
        this.Precio = Precio;
    }
    
    public void ModificarArticulo(String descripcion, int precio)
    {
        this.Descripcion = descripcion;
        this.Precio = precio;
    }
    
    public void AltaArticulo()
    {
        //Agregar articulo al listado
    }
    
    
    public void EliminarArticulo(int IdArticulo)
    {
        //Eliminar articulo de listado segun el IdArticulo      
    }
    
}
