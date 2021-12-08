package carproject;

public class CarProject {

    public static void main(String[] args) {

      Car car1 = new BMW();
      BMW car2 = new BMW ();  
      
      Car paintCar1 = new PaintCar(car1);
      paintCar1.build();
      System.out.println(car2.getCar());
          
      Car car3 = new Chevrolet();
      Chevrolet car4 = new Chevrolet();
        
      Car paintCar2 = new PaintCar(car3);
      paintCar2.build();
      System.out.println(car4.getCar());
       
       
   }
 
}
