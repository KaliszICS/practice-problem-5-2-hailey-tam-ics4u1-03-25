class Sphere extends Circle{

    public Sphere(double radius){
        super(radius);
    }

    @Override
    public double area(){
        return 4*Math.PI*Math.pow(this.radius, 2);
    }

    public double volume(){
        return  Math.PI*Math.pow(this.radius, 3)*4/3;
    }  
}