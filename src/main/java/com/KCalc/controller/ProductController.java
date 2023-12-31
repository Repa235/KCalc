package com.KCalc.controller;

import com.KCalc.dto.ProductLightDTO;
import com.KCalc.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.coderion.model.ProductResponse;
import pl.coderion.service.OpenFoodFactsWrapper;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/product")
public class ProductController {
    private final OpenFoodFactsWrapper openFoodFactsWrapper;
    private final ProductService productService;

    @GetMapping("/{code}")
    public ResponseEntity<Object> getProduct(@PathVariable("code") String code){
        ProductResponse productResponse = productService.fetchProductByCode(code);
        if(productResponse == null) {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity(productResponse, HttpStatus.OK);
        }
    }

    @GetMapping("/{code}/light")
    public ResponseEntity<Object> getProductLight(@PathVariable("code") String code){
        ProductLightDTO productResponse = productService.getProductLight(code);
        if(productResponse == null) {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity(productResponse, HttpStatus.OK);
        }
    }


}
