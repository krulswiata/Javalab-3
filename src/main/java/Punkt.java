public class Punkt {
    int x;
    int y;
    public Punkt(int i) {
    }

    public Punkt setX(int x) {
        this.x = x;
        return this;
    }

    public Punkt setY(int y) {
        this.y = y;
        return this;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Punkt(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Punkt(int x, int y, int z){
        this.x = x;
        this.y = y + z;
    }
}