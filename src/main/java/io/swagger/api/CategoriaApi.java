/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.9).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.ListaCategorias;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-10-30T11:53:28.518Z")

@Api(value = "categoria", description = "the categoria API")
public interface CategoriaApi {

    @ApiOperation(value = "Apaga Categoria", nickname = "apagaCategoria", notes = "Apaga uma categoria", response = ListaCategorias.class, tags={ "Categorias", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Categoria apagada", response = ListaCategorias.class),
        @ApiResponse(code = 400, message = "Requisição inválida") })
    @RequestMapping(value = "/categoria/{nome_categoria}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.DELETE)
    ResponseEntity<ListaCategorias> apagaCategoria(@ApiParam(value = "nome da categoria",required=true) @PathVariable("nome_categoria") String nomeCategoria);


    @ApiOperation(value = "Atualiza Categoria", nickname = "atualizaCategoria", notes = "Atualiza uma categoria", response = ListaCategorias.class, tags={ "Categorias", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Categoria atualizada", response = ListaCategorias.class),
        @ApiResponse(code = 400, message = "Requisição inválida") })
    @RequestMapping(value = "/categoria/{nome_categoria}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<ListaCategorias> atualizaCategoria(@ApiParam(value = "nome da categoria",required=true) @PathVariable("nome_categoria") String nomeCategoria);


    @ApiOperation(value = "Cadastra Categoria", nickname = "cadastraCategoria", notes = "Cadastra uma nova categoria", response = ListaCategorias.class, tags={ "Categorias", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Nova categoria cadastrada", response = ListaCategorias.class),
        @ApiResponse(code = 400, message = "Requisição inválida"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    @RequestMapping(value = "/categoria",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<ListaCategorias> cadastraCategoria(@ApiParam(value = ""  )  @Valid @RequestBody ListaCategorias categoria_);


    @ApiOperation(value = "Lista de categorias", nickname = "categoriaGet", notes = "Retorna todas as categorias", response = ListaCategorias.class, tags={ "Categorias", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Lista de categorias pronta", response = ListaCategorias.class),
        @ApiResponse(code = 400, message = "Requisição inválida") })
    @RequestMapping(value = "/categoria",
        method = RequestMethod.GET)
    ResponseEntity<ListaCategorias> categoriaGet();

}
