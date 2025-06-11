public class circle{
    double raduis;

    void areaCircle(){
        // Math.Pi is 3.14 and Math.pow is square
        System.out.println("The area of circle is: " + (Math.PI * Math.pow(raduis, 2)));
    }

    void diameterCircle(){
        System.out.println("The diameter is: " + (raduis * 2));
    }
}