package Entity;

import java.util.HashMap;
import java.util.Map;

public class ProductList {

    private static Map<String,Product> productList;

    private ProductList() {
    }

    public static Map<String,Product> getInstance(){
        if(productList == null){
            productList = new HashMap<>();
        }
        return productList;
    }
}
