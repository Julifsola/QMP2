package ar.edu.utn.frba.dds;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class TipoPrenda {
  Categoria categoriaPrenda;
  //List<Material> materiales;

  public TipoPrenda(Categoria unaCategoria) {
    this.categoriaPrenda = unaCategoria;
    //this.materiales = Collections.unmodifiableList(listaMateriales);List<Material> listaMateriales
  }

  public Categoria EsCategoria() {
    return this.categoriaPrenda;
  }

  static TipoPrenda REMERA = new TipoPrenda(Categoria.SUPERIOR);
  static TipoPrenda PANTALON = new TipoPrenda(Categoria.INFERIOR);
  static TipoPrenda ZAPATILLA = new TipoPrenda(Categoria.CALZADO);
  static TipoPrenda CARTERA = new TipoPrenda(Categoria.ACCESORIO);
}