public class LineaFactura {

    // Zona de Atributos:
    private String id; //id de la factura
    private String desc; //Descuento de la factura
    private int qti; //Cantidad de la factura
    private double unitPrice; //Precio de la unidad

    // Zona de Metodos:
    public LineaFactura(String id, String desc, int qti, double unitPrice){
        this.id = id;
        this.desc = desc;
        this.qti = qti;
        this.unitPrice = unitPrice;
    }

    // Zona de Atributos:
    public String getId(){
        return id;
    }
    public String getDesc(){
        return desc;
    }
    public int getQti(){
        return qti;
    }

    public void setQti(int qti){
        this.qti = qti;
    }

    public double getUnitPrice(){
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice){
        this.unitPrice = unitPrice;
    }

    public double getTotal(){
        return unitPrice * qti;
    }

    public String toString(){
        return "LineaFactura[id=" + id + ", desc=" + desc + ", qti=" + qti + ", unitPrice=" + unitPrice + "]";
    }
}
