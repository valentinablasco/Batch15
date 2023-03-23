package Object;

public class Shape {



    // calculate perimeter of rectangle

    // width,length 2*(w+l)

   // int w=5,l=10,p=0;
   // p=2*(w+l);
    public void perimiterCalculator(int width,int length) {

        int perimeter = 2 * (width + length);
        System.out.println("The perimiter of rectangle is :" + perimeter);
    }
        //create a method that will calculate area of a triangle
        //A=
//this method is to calculate area of a triangle

        public void AreaCalculator(double base,double height){
            double area = (base * height) / 2;
            System.out.println(area +" The area of triangle is ");


    }
}
