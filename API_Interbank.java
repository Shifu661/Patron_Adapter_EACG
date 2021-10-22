package Clases;

public class API_Interbank {
    private boolean conectado = false;

    public API_Interbank() {
        System.out.println("Usted se encuentra en la interfaz del API de Interbank...");
        this.conectado = false;
    }

    public void solicitarPrestamo() {
        System.out.println("Usted a solicitado un préstamo en Interbank.");
        this.conectado = true;
    }

    public void recolectDatos() {
        if (!this.conectado) {
            System.out.println("No podemos continuar con su solicitud, ya que faltan datos.");
        } else {
            System.out.println("Los datos han sido recolectados, procederemos con la comprobación en la BD de Interbank.");
        }
    }

    public void comprobarDatos() {
        if (!this.conectado) {
            System.out.println("No podemos continuar con su solicitud, ya que los datos no coinciden con los de la base de datos.");
        } else {
            System.out.println("Los datos son correctos, puede continuar con su solicitud de préstamo en Interbank.");
        }
    }

    public void revisarMovimientCuent() {
        if (!this.conectado) {
            System.out.println("No se puede hacerle un préstamo porque tiene una deuda con Interbank.");
        } else {
            System.out.println("Usted NO tiene deudas con Interbank, puede continuar con su solicitud de préstamo.");
        }
    }

    public void prestamoOK() {
        System.out.println("Su préstamo con Interbank se realizó con éxito.\n\n");
        this.conectado = false;
    }
}
