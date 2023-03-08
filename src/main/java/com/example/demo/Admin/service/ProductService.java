package com.example.demo.Admin.service;

import java.util.Collections;
import java.util.List;

import com.example.demo.Models.Product;
import com.example.demo.Admin.repository.IProductRepository;
import com.example.demo.Admin.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProductService {

    @Autowired
    private IProductRepository repo;

    public List<Product> listAll() {
        return repo.findAll();
    }

    public Page<Product> findPaginated(String search, Pageable pageable) {
        List<Product> products = repo.searchProduct(search); //repo.findAll();

        int pageSize = pageable.getPageSize();
        int currentPage = pageable.getPageNumber();
        int startItem = currentPage * pageSize;
        List<Product> list;

        if (products.size() < startItem) {
            list = Collections.emptyList();
        } else {
            int toIndex = Math.min(startItem + pageSize, products.size());
            list = products.subList(startItem, toIndex);
        }

        Page<Product> bookPage = new PageImpl<Product>(list, PageRequest.of(currentPage, pageSize), products.size());

        return bookPage;
    }


    public void save(Product product) {
        repo.save(product);
    }

    public Product get(long id) {
        return repo.findById(id).get();
    }

    public void delete(long id) {
        repo.deleteById(id);
    }
}