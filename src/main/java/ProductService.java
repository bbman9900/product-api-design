import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService {
    Map<String, Product> products = new HashMap<>();

    public ProductService() {
        Product p = new Product("101", "애플 아이폰", "애플", 1_200_000, "2024.05.01");
        products.put("101", p);
        p = new Product("102", "삼성 갤럭시", "삼성", 1_300_000, "2024.05.04");
        products.put("102", p);
        p = new Product("103", "엘지폰", "엘지", 1_100_000, "2024.05.16");
        products.put("103", p);
    }

    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    public Product find(String id) {
        return products.get(id);
    }
}
