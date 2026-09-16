public class Carre {
    private int cote;
    private String color;
    private double[] center = new double[2];

    public Carre(int c, double x, double y, String co){
        cote = c;
        color = co;
        center[0] = x;
        center[1] = y;
    }

    public int getCote(){
        return cote;
    }
    public void setCote(int c){
        cote = c;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String co){
        color = co;
    }
    public double[] getCenter(){
        return center;
    }
    public void translate(double dx, double dy){
        center[0] += dx;
        center[1] += dy;
    }
    public void rotate(){
        // Implementation for rotation
    }
    public void setCenter(double x, double y){
        center[0] = x;
        center[1] = y;
    }
}
