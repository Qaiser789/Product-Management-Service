package com.qaiser.advancedcrud.service;

import com.qaiser.advancedcrud.dto.ProductDto;
import com.qaiser.advancedcrud.entity.Product;

import java.util.List;

public interface ProductService {

    public Boolean saveProduct(ProductDto productDto);

    public List<ProductDto> getAllProducts();

    public ProductDto getProductById(Integer id);

    public Boolean deleteProduct(Integer id);

    // public ProductResponse getProductsWithPagination(int pageNo, int pageSize, String sortBy, String sortDir);

}
