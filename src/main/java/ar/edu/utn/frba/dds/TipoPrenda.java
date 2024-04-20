package ar.edu.utn.frba.dds;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

import static ar.edu.utn.frba.dds.Categoria.SUPERIOR;
import static ar.edu.utn.frba.dds.Categoria.INFERIOR;
import static ar.edu.utn.frba.dds.Categoria.CALZADO;
import static ar.edu.utn.frba.dds.Categoria.ACCESORIO;

public class TipoPrenda {
  Categoria categoriaPrenda;
  List<Material> materiales;

  public TipoPrenda(Categoria unaCategoria, List<Material> listaMateriales) {
    this.categoriaPrenda = unaCategoria;
    this.materiales = Collections.unmodifiableList(listaMateriales);
  }

  public Categoria EsCategoria() {
    return this.categoriaPrenda;
  }

  public boolean condiceMaterial(Material unMaterial) {
    return materiales.contains(unMaterial);
  }

  public List<Material> = new ArrayList<>();
  public TipoPrenda REMERA = new TipoPrenda(SUPERIOR, );
  public TipoPrenda PANTALON = new TipoPrenda(INFERIOR);
  public TipoPrenda ZAPATILLA = new TipoPrenda(CALZADO);
  public TipoPrenda CARTERA = new TipoPrenda(ACCESORIO);
}