package ss06_inheriance.baitap.bt02_poin2d_3d;

public class Poin2D {
    protected float x;
    protected float y;

    public Poin2D() {
    }

    public Poin2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] arr = {this.x, this.y};
        return arr;
    }

    @Override
    public String toString() {
        return "Poin2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
