package SeccionC;

public class Handler {
    private Displayer disp;

    public void run() {
        if (isChanged()) {
            disp.draw();
        } else {
            reset();
        }
    }

    public boolean isChanged() {
        // Cuerpo vacío según instrucciones (retorna valor por defecto para compilar)
        return false; 
    }

    public Object getDetail() {
        // Retorna el mensaje "result" indicado en el diagrama
        return null; 
    }

    public void reset() {
        // Cuerpo vacío según instrucciones
    }
}