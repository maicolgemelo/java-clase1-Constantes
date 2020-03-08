package main;

public enum Mensajes {

    PETICION_RADIO("ingresa el radio del círculo:"),
    MENSAJE_RESPUESTA("El area del circulo es:");

    private String mensaje;

    Mensajes(String s) {
        this.mensaje = s;
    }

    public String getMensaje() {
        return mensaje;
    }
}
