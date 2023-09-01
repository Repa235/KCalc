package com.KCalc.dto;

import lombok.Data;
import pl.coderion.model.Ingredient;
import pl.coderion.model.Nutriments;
import pl.coderion.model.Product;

import javax.validation.constraints.NotNull;

@Data
public class ProductLightDTO {
    String brand;
    String productName;
    String imageUrl;
    Ingredient[] ingredients;
    Nutriments nutriments;

    public ProductLightDTO(@NotNull Product product){
        this.brand = product.getBrands();
        this.productName = product.getProductName();
        this.imageUrl = product.getImageUrl();
        this.ingredients = product.getIngredients();
        this.nutriments = product.getNutriments();
    }
}
