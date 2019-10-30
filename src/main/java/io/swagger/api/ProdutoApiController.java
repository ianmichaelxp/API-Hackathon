package io.swagger.api;

import io.swagger.model.ListaProdutos;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-10-30T11:53:28.518Z")

@Controller
public class ProdutoApiController implements ProdutoApi {

    private static final Logger log = LoggerFactory.getLogger(ProdutoApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ProdutoApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<ListaProdutos> apagaProduto(@ApiParam(value = "nome do produto",required=true) @PathVariable("nome_produto") Integer nomeProduto) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ListaProdutos>(objectMapper.readValue("{  \"listaProdutos\" : [ {    \"valor_produto\" : 100.0,    \"descricao_produto\" : \"cod. barras 7890000000\",    \"nome_produto\" : \"nome_produto\",    \"id\" : 123  }, {    \"valor_produto\" : 100.0,    \"descricao_produto\" : \"cod. barras 7890000000\",    \"nome_produto\" : \"nome_produto\",    \"id\" : 123  } ]}", ListaProdutos.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ListaProdutos>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ListaProdutos>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ListaProdutos> atualizaProduto(@ApiParam(value = "nome do produto",required=true) @PathVariable("nome_produto") Integer nomeProduto) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ListaProdutos>(objectMapper.readValue("{  \"listaProdutos\" : [ {    \"valor_produto\" : 100.0,    \"descricao_produto\" : \"cod. barras 7890000000\",    \"nome_produto\" : \"nome_produto\",    \"id\" : 123  }, {    \"valor_produto\" : 100.0,    \"descricao_produto\" : \"cod. barras 7890000000\",    \"nome_produto\" : \"nome_produto\",    \"id\" : 123  } ]}", ListaProdutos.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ListaProdutos>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ListaProdutos>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ListaProdutos> cadastraProduto(@ApiParam(value = ""  )  @Valid @RequestBody ListaProdutos produto_) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ListaProdutos>(objectMapper.readValue("{  \"listaProdutos\" : [ {    \"valor_produto\" : 100.0,    \"descricao_produto\" : \"cod. barras 7890000000\",    \"nome_produto\" : \"nome_produto\",    \"id\" : 123  }, {    \"valor_produto\" : 100.0,    \"descricao_produto\" : \"cod. barras 7890000000\",    \"nome_produto\" : \"nome_produto\",    \"id\" : 123  } ]}", ListaProdutos.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ListaProdutos>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ListaProdutos>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ListaProdutos> produtoGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ListaProdutos>(objectMapper.readValue("{  \"listaProdutos\" : [ {    \"valor_produto\" : 100.0,    \"descricao_produto\" : \"cod. barras 7890000000\",    \"nome_produto\" : \"nome_produto\",    \"id\" : 123  }, {    \"valor_produto\" : 100.0,    \"descricao_produto\" : \"cod. barras 7890000000\",    \"nome_produto\" : \"nome_produto\",    \"id\" : 123  } ]}", ListaProdutos.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ListaProdutos>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ListaProdutos>(HttpStatus.NOT_IMPLEMENTED);
    }

}
