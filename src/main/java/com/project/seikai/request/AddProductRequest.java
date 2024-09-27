package com.project.seikai.request;

import com.project.seikai.model.Category;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
public class AddProductRequest {
        private Long id;
        private String name;
        private String brand;
        private BigDecimal price;
        private int inventory;
        private String description;
        private Category category;
}
