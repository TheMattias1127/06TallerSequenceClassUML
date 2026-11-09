package SeccionC;

public class Displayer {
    private Handler hand;

    public void draw() {
        render();
    }

    public void render() {
        Object result = hand.getDetail();
    }
}
