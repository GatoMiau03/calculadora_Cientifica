import java.lang.Math;


//calcular perímetros, áreas y volúmenes según corresponda de las siguientes figuras geométricas: cuadrado, rectángulo, círculo, esfera, cubo y cono

public class Main {
    //metodo para el cuadrado

    //ÁREA
    public static int areaCuadrado (int lado){
        return lado*lado;
    }

    //PERÍMETRO
    public static int perimetroCuadrado (int lado){
        return lado*4;
    }

    //metodo para el rectángulo

    //ÁREA
    public static int areaRectangulo (int base, int altura){
        return base*altura;
    }

    //PERÍMETRO
    public static int perimetroRectangulo (int base, int altura){
        return (base*2)+(altura*2);
    }

    //metodo para el círculo

    //ÁREA
    public static double areaCirculo (int radio){
        return Math.PI*(radio*radio);
    }

    //PERÍMETRO
    public static double perimetroCirculo (int radio){
        return 2*Math.PI*radio;
    }

    //VOLUMEN
    public static double volumenCirculo (int radio){
        double aaa= (double) 4/3;
        return (aaa)*Math.PI*(radio^3);
    }



}
