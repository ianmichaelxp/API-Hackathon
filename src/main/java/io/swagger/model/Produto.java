package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Categoria;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Produto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-10-30T11:53:28.518Z")

public class Produto   {
  @JsonProperty("nome_produto")
  private String nomeProduto = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("valor_produto")
  private Double valorProduto = null;

  @JsonProperty("descricao_produto")
  private String descricaoProduto = null;

  @JsonProperty("Categoria")
  private Categoria categoria = null;

  public Produto nomeProduto(String nomeProduto) {
    this.nomeProduto = nomeProduto;
    return this;
  }

  /**
   * Get nomeProduto
   * @return nomeProduto
  **/
  @ApiModelProperty(value = "")


  public String getNomeProduto() {
    return nomeProduto;
  }

  public void setNomeProduto(String nomeProduto) {
    this.nomeProduto = nomeProduto;
  }

  public Produto id(Long id) {
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

  public Produto valorProduto(Double valorProduto) {
    this.valorProduto = valorProduto;
    return this;
  }

  /**
   * Get valorProduto
   * @return valorProduto
  **/
  @ApiModelProperty(example = "100.0", value = "")


  public Double getValorProduto() {
    return valorProduto;
  }

  public void setValorProduto(Double valorProduto) {
    this.valorProduto = valorProduto;
  }

  public Produto descricaoProduto(String descricaoProduto) {
    this.descricaoProduto = descricaoProduto;
    return this;
  }

  /**
   * Get descricaoProduto
   * @return descricaoProduto
  **/
  @ApiModelProperty(example = "cod. barras 7890000000", value = "")


  public String getDescricaoProduto() {
    return descricaoProduto;
  }

  public void setDescricaoProduto(String descricaoProduto) {
    this.descricaoProduto = descricaoProduto;
  }

  public Produto categoria(Categoria categoria) {
    this.categoria = categoria;
    return this;
  }

  /**
   * Get categoria
   * @return categoria
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Categoria getCategoria() {
    return categoria;
  }

  public void setCategoria(Categoria categoria) {
    this.categoria = categoria;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Produto produto = (Produto) o;
    return Objects.equals(this.nomeProduto, produto.nomeProduto) &&
        Objects.equals(this.id, produto.id) &&
        Objects.equals(this.valorProduto, produto.valorProduto) &&
        Objects.equals(this.descricaoProduto, produto.descricaoProduto) &&
        Objects.equals(this.categoria, produto.categoria);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nomeProduto, id, valorProduto, descricaoProduto, categoria);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Produto {\n");
    
    sb.append("    nomeProduto: ").append(toIndentedString(nomeProduto)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    valorProduto: ").append(toIndentedString(valorProduto)).append("\n");
    sb.append("    descricaoProduto: ").append(toIndentedString(descricaoProduto)).append("\n");
    sb.append("    categoria: ").append(toIndentedString(categoria)).append("\n");
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

