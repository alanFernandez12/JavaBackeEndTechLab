package org.example.articulo.modelo;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class ArticuloAlimenticio extends Articulo{

    private int diasParaVencimiento;

    @Override
    public String getTipoArticulo() {
        return "Alimenticio";
    }

    @Override
    public String getDetalleEspecifico() {
        return String.valueOf(getDiasParaVencimiento());
    }
}
