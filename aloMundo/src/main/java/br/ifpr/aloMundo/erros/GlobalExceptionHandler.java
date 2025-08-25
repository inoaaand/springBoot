package br.ifpr.aloMundo.erros;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice //avisa que a classe é um "tratador" de erros
public class GlobalExceptionHandler {

    public ResponseEntity<String> handle(Exception e){
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("ERRO:" + e.getMessage());
    } 

}
