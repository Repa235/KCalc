package com.KCalc.service;

import com.KCalc.dto.ProductLightDTO;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;
import pl.coderion.model.ProductResponse;
import pl.coderion.service.OpenFoodFactsWrapper;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final OpenFoodFactsWrapper openFoodFactsWrapper;
    public ProductResponse fetchProductByCode(String code) {
        return openFoodFactsWrapper.fetchProductByCode(code);
    }

    @NotNull
    public ProductLightDTO getProductLight(String code) {
        return new ProductLightDTO(openFoodFactsWrapper.fetchProductByCode(code).getProduct());
    }
}
