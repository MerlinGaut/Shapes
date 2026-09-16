class Cercle{
    private int radius;
    private String color;
    private double[] center = new double[2];

    public Cercle(){
        radius = 0;
        color = "white";
        center[0] = 0;
        center[1] = 0;
    }

    public Cercle(int r, double x, double y, String c){
        radius = r;
        color = c;
        center[0] = x;
        center[1] = y;
    }

    public int getRadius(){
        return radius;
    }
    public void setRadius(int r){
        radius = r;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String c){
        color = c;
    }

    public double[] getCenter(){
        return center;
    }
    public void translate(double dx, double dy){
        center[0] += dx;
        center[1] += dy;
    }
    public void rotate(){
    }

}