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
        // Cuerpo vacío (retorna valor por defecto para compilar).
        return false; 
    }

    public Object getDetail() {
        // Retorna el mensaje "result".
        return null; 
    }

    public void reset() {
        // Cuerpo vacío.
    }
}