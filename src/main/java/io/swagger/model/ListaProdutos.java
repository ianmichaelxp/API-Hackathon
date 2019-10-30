package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Produto;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ListaProdutos
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-10-30T11:53:28.518Z")

public class ListaProdutos   {
  @JsonProperty("listaProdutos")
  @Valid
  private List<Produto> listaProdutos = null;

  public ListaProdutos listaProdutos(List<Produto> listaProdutos) {
    this.listaProdutos = listaProdutos;
    return this;
  }

  public ListaProdutos addListaProdutosItem(Produto listaProdutosItem) {
    if (this.listaProdutos == null) {
      this.listaProdutos = new ArrayList<Produto>();
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

  public List<Produto> getListaProdutos() {
    return listaProdutos;
  }

  public void setListaProdutos(List<Produto> listaProdutos) {
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
    ListaProdutos listaProdutos = (ListaProdutos) o;
    return Objects.equals(this.listaProdutos, listaProdutos.listaProdutos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listaProdutos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListaProdutos {\n");
    
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

