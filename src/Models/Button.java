package Models;

public abstract class Button {
    public int id;
    public boolean pressed;
    public String label;

    public Button(int id, String label) {
        this.id = id;
        this.pressed = false;
        this.label = label;
    }

    public abstract void press();

    public void reset(){
        this.pressed=false;
    };

    public String getLabel() {
        return label;
    }

    public boolean isPressed() {
        return pressed;
    }
}
