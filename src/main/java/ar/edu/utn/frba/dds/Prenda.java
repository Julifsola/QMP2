package ar.edu.utn.frba.dds;

import java.awt.*;

public class Prenda {
  private TipoPrenda tipo;
  private Categoria categoria;
  private Material material;
  private ColorPrenda colorPrimario;
  private ColorPrenda colorSecundario;
  private Trama trama;

  /**/
  public Prenda(Categoria categoria, TipoPrenda tipo, Material material, ColorPrenda colorPrimario, ColorPrenda colorSecundario, Trama trama) {
    if (tipo == null) {
      throw new ExcepcionPrendaInvalida("El tipo no debe estar vacio");
    }
    this.tipo = tipo;

    this.categoria = tipo.EsCategoria();

    if (material == null) {
      throw new ExcepcionPrendaInvalida("El material no debe estar vacio");
    }
    this.material = material;

    if (colorPrimario == null) {
      throw new ExcepcionPrendaInvalida("El color primario no debe estar vacio");
    }
    this.colorPrimario = colorPrimario;

    if (trama == null) {
      throw new ExcepcionPrendaInvalida("La trama no debe estar vacia");
    }

    this.colorSecundario = colorSecundario; // Puede ser NULL
  }

}

