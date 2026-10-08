package org.example.articulo.modelo;

public class ArticuloElectronico extends  Articulo {

    private int garantiaMeses;

    public ArticuloElectronico() {}
    public ArticuloElectronico(int codigo, String nombre, double precio, Categoria categoria, int garantiaMeses) {
        super(codigo, nombre, precio, categoria);
        this.garantiaMeses = garantiaMeses;
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }

    public String  nroTelMesaDeAyudaParaReclamos(){
        return "0800-123-4567";
    }

    @Override
    public String getTipoArticulo() {
        return "Electronico";
    }

    @Override
    public String getDetalleEspecifico() {
        String detalleEspecifico = String.valueOf(getGarantiaMeses());
        return detalleEspecifico;
    }

    @Override
    public String toString() {
        return super.toString() + ",[ Subtipo electronico]";
    }
}
