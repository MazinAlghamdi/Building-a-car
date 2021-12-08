package carproject;

public abstract class CarDecorator implements Car{
     
    protected Car internalVariable;
     
    public CarDecorator(Car internalVariable){
          this.internalVariable = internalVariable;
    }
 
    public abstract void build();
 
}