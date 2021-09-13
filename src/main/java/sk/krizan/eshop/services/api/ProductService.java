package sk.krizan.eshop.services.api;

import sk.krizan.eshop.domain.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts();
    List<Product> getProductsByGender(String gender);
    Product getByProductId(Integer id);
    Integer add(Product product);
    void delete(Integer id);
    void update(Integer id, Product product);

}
