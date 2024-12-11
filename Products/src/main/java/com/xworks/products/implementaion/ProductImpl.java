package com.xworks.products.implementaion;

import com.xworks.products.DTO.ProductDTO;
import com.xworks.products.service.ProductService;
import org.springframework.stereotype.Service;

@Service
public class ProductImpl implements ProductService {

    @Override
    public boolean service(ProductDTO productDTO) {
        return true;
    }
}

