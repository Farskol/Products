package service.impl;

import Entity.Product;
import Entity.ProductList;
import service.Products;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ProductsImpl implements Products {
    @Override
    public boolean addProduct(Product product) {
        return ProductList.getInstance().putIfAbsent(product.getId(), product) == null;
    }

    @Override
    public boolean deleteProduct(Product product) {
        return ProductList.getInstance().remove(product.getId(),product);
    }

    @Override
    public String getName(String id) {
        Product product = ProductList.getInstance().get(id);
        return product != null ? product.getName() : "";
    }

    @Override
    public List<String> findByName(String name) {
        List<String> productsId = new ArrayList<>();
        for(Map.Entry<String, Product> product: ProductList.getInstance().entrySet()){
            if(name.equals(product.getValue().getName())){
                productsId.add(product.getKey());
            }
        }
        return productsId;
    }
}
