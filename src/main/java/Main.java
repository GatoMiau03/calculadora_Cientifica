import java.util.Scanner;
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
        double a= (double) 4/3;
        return (a)*Math.PI*(radio^3);
    }

    //metodo para la esfera

    //ÁREA
    public static double areaEsfera (int radio){
        return 4*Math.PI*(radio*radio);
    }

    //VOLUMEN
    public static double volumenEsfera (int radio){
        double aa= (double) 4/3;
        return (aa)*Math.PI*(radio^3);
    }

    //metodo para el cubo

    //ÁREA
    public static int areaCubo (int lado){
        return 6*(lado*lado);
    }

    //VOLUMEN
    public static int volumenCubo (int lado){
        return lado*lado*lado;
    }

    //metodo para el cono

    //ÁREA
    public static double areaCono (int radio, int generatriz){
        return Math.PI*radio*(radio+generatriz);
    }

    //VOLUMEN
    public static double volumenCono (int radio, int altura){
        double aaa= (double) 1/3;
        return aaa*Math.PI*(radio*radio)*altura;
    }






}
