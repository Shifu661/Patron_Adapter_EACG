package Clases;

public class API_Interbank_Adapter extends APITarget{
    private API_Interbank apiInterbank;

    public API_Interbank_Adapter(){
        super();
        System.out.println("Interfaz del API de Interbank");
        this.apiInterbank = new API_Interbank();
    }

    @Override
    public void sincronizar() {
        System.out.println("Sincronizando los datos del solicitante en la BD de Interbank.");
        this.apiInterbank.solicitarPrestamo();
        this.apiInterbank.recolectDatos();
    }

    @Override
    public void enlazar() {
        System.out.println("Enlazando los datos recolectados con la BD de Interbank.");
        this.apiInterbank.comprobarDatos();
    }

    @Override
    public void conectar() {
        System.out.println("Conectando con la cuenta Interbank del solicitante.");
        this.apiInterbank.revisarMovimientCuent();
        this.apiInterbank.prestamoOK();
    }

    @Override
    public void aprobCreditsPersonals() {
        System.out.println("Se aprobó su solicitud en el banco Interbank, su préstamo se realizó con éxito.\n\n");
    }
}
