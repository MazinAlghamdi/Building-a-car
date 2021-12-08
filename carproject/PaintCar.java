package carproject;

public class PaintCar extends CarDecorator {
 
    public PaintCar(Car car) {
          super(car);       
       }
 
       @Override
       public void build() {
          System.out.println("----------------------------------"); 
          internalVariable.build();        
          paintCar();
       }
        
       private void paintCar(){
          System.out.println("This car have been painted as well.");
          System.out.println("----------------------------------");
       }
}