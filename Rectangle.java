class Rectangle{
    private double length;
    private double width;
    private String color;
    private double[] center = new double[2];

    public Rectangle(double l, double w, double x, double y, String co){
        length = l;
        width = w;
        color = co;
        center[0] = x;
        center[1] = y;
    }

    public double getLength(){
        return length;
    }
    public void setLength(double l){
        length = l;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double w){
        width = w;
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
        double temp = length;
        length = width;
        width = temp;
    }
    public void setCenter(double x, double y){
        center[0] = x;
        center[1] = y;
    }
}