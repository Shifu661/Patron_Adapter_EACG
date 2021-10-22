package Clases;

public class API_BCP extends APITarget{

    public API_BCP(){
        super();
        System.out.println("Interfaz del API del BCP");
    }
    @Override
    public void sincronizar() {
        System.out.println("Sincronizando los datos del solicitante en la BD del BCP.");
    }

    @Override
    public void enlazar() {
        System.out.println("Enlazando los datos recolectados con la BD del BCP.");
    }

    @Override
    public void conectar() {
        System.out.println("Conectando con la cuenta BCP del solicitante.");
    }

    @Override
    public void aprobCreditsPersonals() {
        System.out.println("Se aprobó su solicitud en el BCP, su préstamo se realizó con éxito.\n\n");
    }
}

