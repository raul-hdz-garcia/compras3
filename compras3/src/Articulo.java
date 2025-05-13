public class Articulo implements Comparable<Articulo>{
    public String descripcionCompra;
    public double valorCompra;

    public Articulo (String descripcionCompra, double valorCompra) {
        this.descripcionCompra = descripcionCompra;
        this.valorCompra = valorCompra;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    @Override
    public int compareTo(Articulo otroArticulo) {
        return Double.valueOf(this.getValorCompra()).compareTo(Double.valueOf(otroArticulo.valorCompra));
    }

//    @Override
//    public String toString() {
//        return descripcionCompra + " - " + valorCompra;
//    }

}

