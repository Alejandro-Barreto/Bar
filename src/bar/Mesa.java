package bar;
import facturacion.Ticket;

public class Mesa {
    private int IdMesa;
    private String estado;
    private Consumo consumo;
    private Mozo mozo;

    public Mesa(int IdMesa, String Estado, Consumo consumo, Mozo mozo) {
        this.IdMesa = IdMesa;
        this.estado = Estado;
        this.consumo = consumo;
        this.mozo = mozo;
    }
    
    
    public void AsignarMozo(int IdMozo)
    {
        //Seleccionar Mozo de listado segun IdMozo. Se consulta los mozos actuales.
        //this.mozo = Mozo;
        this.estado = "Ocupada";
    }
    
    public void AgregarArticulo(Articulo articulo)
    {
        if(this.consumo == null)
        {
            this.consumo = new Consumo();
            this.consumo.Sumar(articulo);
        }
        else{
            this.consumo.Sumar(articulo);
        }
    }
    
    public void CerrarMesa()
    {
        this.consumo.CalcularTotal();
        Ticket ticket = new Ticket();
        ticket.GenerarTicket(this.consumo);
        this.estado = "Cobrando"; //Color Naranja de mesa
    }
    
    public void CobrarMesa()
    {
        //Logica para el cobro del consumo
        this.estado = "Libre"; //Color Verde de mesa
    }
    
    public void AltaMesa(){
        //Alta de mesa en el sistema
    }
    
    public void BajaMesa(){
        //Baja de mesa en el sistema
    }
    
    public void ModificarMesa(){
        //Modificacion de mesa en el sistema
    }
    
    
}
