class Circle{
    protected double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double newRadius){
        this.radius = newRadius;
    }
    
    public double diameter(){
        return 2*this.radius;
    }

    public double perimeter(){
        return 2*Math.PI*this.radius;
    }

    public double area(){
        return Math.PI*Math.pow(this.radius, 2);
    }
}