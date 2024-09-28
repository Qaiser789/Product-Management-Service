package com.qaiser.advancedcrud.service;

import com.qaiser.advancedcrud.dto.ProductDto;
import com.qaiser.advancedcrud.repository.ProductRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ModelMapper mapper;

    @Override
    public Boolean saveProduct(ProductDto productDto) {
        return null;
    }

    @Override
    public List<ProductDto> getAllProducts() {
        return List.of();
    }

    @Override
    public ProductDto getProductById(Integer id) {
        return null;
    }

    @Override
    public Boolean deleteProduct(Integer id) {
        return null;
    }

    /*@Override
    public ProductResponse getProductsWithPagination(int pageNo, int pageSize, String sortBy, String sortDir) {
        return null;
    }*/
}
