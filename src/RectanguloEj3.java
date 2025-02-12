public class RectanguloEj3 {

    // Zona de Atributos:
    // Variable Longitud
    private float lenght;
    // Variable Anchura
    private float width;

    // Zona Metodos
    public RectanguloEj3(){
        this.lenght = 2.0f;
        this.width = 3.0f;
    }

    public RectanguloEj3(float lenght, float width){
        this.lenght = lenght;
        this.width = width;
    }

    public float getLenght(){
        return lenght;
    }

    public void setLenght(float lenght){
        this.lenght = lenght;
    }

    public float getWidht(){
        return width;
    }

    public void SetWidth(float width){
        this.width= width;
    }

    public double getArea(){
        return lenght * width;
    }

    public double getPerimeter(){
        return 2 * lenght + 2 * width;
    }

    public String toString(){
        return "Rectangule[lenght = " + lenght + ", width = " + width + "]";
    }
}
