package Clases;

public class API_Scotiabank_Adapter extends APITarget{
    private API_Scotiabank apiScotiabank;

    public API_Scotiabank_Adapter(){
        super();
        System.out.println("Interfaz del API de Scotiabank");
        this.apiScotiabank = new API_Scotiabank();
    }

    @Override
    public void sincronizar() {
        System.out.println("Sincronizando los datos del solicitante en la BD de Scotiabank.");
        this.apiScotiabank.solicitarPrestamo();
        this.apiScotiabank.recolectDatos();
    }

    @Override
    public void enlazar() {
        System.out.println("Enlazando los datos recolectados con la BD de Scotiabank.");
        this.apiScotiabank.comprobarDatos();
    }

    @Override
    public void conectar() {
        System.out.println("Conectando con la cuenta Scotiabank del solicitante.");
        this.apiScotiabank.revisarMovimientCuent();
        this.apiScotiabank.prestamoOK();
    }

    @Override
    public void aprobCreditsPersonals() {
        System.out.println("Se aprobó su solicitud en el banco Scotiabank, su préstamo se realizó con éxito.\n\n");
    }
}
