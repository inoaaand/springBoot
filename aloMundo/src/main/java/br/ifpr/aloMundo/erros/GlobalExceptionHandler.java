package br.ifpr.aloMundo.erros;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice //avisa que a classe é um "tratador" de erros
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handle(Exception e){
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("ERRO:" + e.getMessage());
    } 

    //outra forma de tratar erros
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handle02(Exception e){
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "https://http.cat/404.jpg");
        return new ResponseEntity<>(headers, HttpStatus.FOUND);
    } 

}
