// package com.example.demo.Admin.service;


// import com.example.demo.Admin.model.ProductType;
// import com.example.demo.Admin.repository.IProductRepository;
// import com.example.demo.Admin.repository.IProductTypeRepository;
// import com.example.demo.Admin.repository.IUserRepository;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;
// import org.springframework.transaction.annotation.Transactional;

// import java.util.List;

// @Service
// @Transactional
// public class ProductTypeService {

//     @Autowired
//     private IProductTypeRepository repo;

//     public List<ProductType> listAll() {
//         return (List<ProductType>) repo.findAll();
//     }

//     public void save(ProductType product) {
//         repo.save(product);
//     }

//     public ProductType get(long  id) {
//         return repo.findById(id).get();
//     }

//     public void delete(long id) {
//         repo.deleteById(id);
//     }
// }