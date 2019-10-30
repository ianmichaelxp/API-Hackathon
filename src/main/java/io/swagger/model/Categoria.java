package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ListaProdutos;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Categoria
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-10-30T11:53:28.518Z")

public class Categoria   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("nome_categoria")
  private String nomeCategoria = null;

  @JsonProperty("ListaProdutos")
  @Valid
  private List<ListaProdutos> listaProdutos = null;

  public Categoria id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "123", value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Categoria nomeCategoria(String nomeCategoria) {
    this.nomeCategoria = nomeCategoria;
    return this;
  }

  /**
   * Get nomeCategoria
   * @return nomeCategoria
  **/
  @ApiModelProperty(example = "Blusa", value = "")


  public String getNomeCategoria() {
    return nomeCategoria;
  }

  public void setNomeCategoria(String nomeCategoria) {
    this.nomeCategoria = nomeCategoria;
  }

  public Categoria listaProdutos(List<ListaProdutos> listaProdutos) {
    this.listaProdutos = listaProdutos;
    return this;
  }

  public Categoria addListaProdutosItem(ListaProdutos listaProdutosItem) {
    if (this.listaProdutos == null) {
      this.listaProdutos = new ArrayList<ListaProdutos>();
    }
    this.listaProdutos.add(listaProdutosItem);
    return this;
  }

  /**
   * Get listaProdutos
   * @return listaProdutos
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<ListaProdutos> getListaProdutos() {
    return listaProdutos;
  }

  public void setListaProdutos(List<ListaProdutos> listaProdutos) {
    this.listaProdutos = listaProdutos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Categoria categoria = (Categoria) o;
    return Objects.equals(this.id, categoria.id) &&
        Objects.equals(this.nomeCategoria, categoria.nomeCategoria) &&
        Objects.equals(this.listaProdutos, categoria.listaProdutos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nomeCategoria, listaProdutos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Categoria {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nomeCategoria: ").append(toIndentedString(nomeCategoria)).append("\n");
    sb.append("    listaProdutos: ").append(toIndentedString(listaProdutos)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

