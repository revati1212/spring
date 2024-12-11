package com.xworks.products.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;


    @Data
    @NoArgsConstructor
    public class ProductDTO {
        private String name;
        private String type;
        private double cost;
        private String manufacturer;

        private String manufactureDate;
        private String Warranty;

    }

