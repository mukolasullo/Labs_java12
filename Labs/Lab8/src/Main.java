import java.util.*;

class Product {
    private String name;
    private double recommendedPrice;

    public Product(String name, double recommendedPrice) {
        this.name = name;
        this.recommendedPrice = recommendedPrice;
    }

    public String getName() {
        return name;
    }

    public double getRecommendedPrice() {
        return recommendedPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.recommendedPrice, recommendedPrice) == 0 && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, recommendedPrice);
    }
}

class OnlineStore {
    private String name;
    private Map<Product, Double> productPrices;

    public OnlineStore(String name) {
        this.name = name;
        this.productPrices = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void addProduct(Product product, double price) {
        productPrices.put(product, price);
    }

    public Map<Product, Double> getProductPrices() {
        return productPrices;
    }
}

class ProductSearchService {
    private Set<OnlineStore> stores;

    public ProductSearchService() {
        this.stores = new HashSet<>();
    }

    public void addStore(OnlineStore store) {
        stores.add(store);
    }

    // 1. Знайти мінімальну ціну на заданий товар (нетипізований ітератор)
    public double findMinPrice(String productName) {
        double minPrice = Double.MAX_VALUE;
        for (Iterator<OnlineStore> it = stores.iterator(); it.hasNext(); ) {
            OnlineStore store = it.next();
            for (Map.Entry<Product, Double> entry : store.getProductPrices().entrySet()) {
                if (entry.getKey().getName().equals(productName)) {
                    minPrice = Math.min(minPrice, entry.getValue());
                }
            }
        }
        return minPrice == Double.MAX_VALUE ? -1 : minPrice;
    }

    // 2. Магазини з мінімальною ціною (типізований ітератор)
    public List<String> findStoresWithMinPrice(String productName) {
        double minPrice = findMinPrice(productName);
        List<String> storeNames = new ArrayList<>();

        for (OnlineStore store : stores) {
            for (Map.Entry<Product, Double> entry : store.getProductPrices().entrySet()) {
                if (entry.getKey().getName().equals(productName) && entry.getValue() == minPrice) {
                    storeNames.add(store.getName());
                }
            }
        }
        return storeNames;
    }

    // 3. Чи є магазин, де всі ціни нижчі за рекомендовану (типізований цикл "for-each")
    public boolean isStoreAllBelowRecommended() {
        for (OnlineStore store : stores) {
            boolean allBelow = true;
            for (Map.Entry<Product, Double> entry : store.getProductPrices().entrySet()) {
                if (entry.getValue() >= entry.getKey().getRecommendedPrice()) {
                    allBelow = false;
                    break;
                }
            }
            if (allBelow) return true;
        }
        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 1000.0);
        Product product2 = new Product("Phone", 500.0);
        Product product3 = new Product("Tablet", 300.0);

        OnlineStore store1 = new OnlineStore("Store A");
        store1.addProduct(product1, 950.0);
        store1.addProduct(product2, 480.0);

        OnlineStore store2 = new OnlineStore("Store B");
        store2.addProduct(product1, 970.0);
        store2.addProduct(product3, 280.0);

        ProductSearchService service = new ProductSearchService();
        service.addStore(store1);
        service.addStore(store2);

        // Task 1
        String targetProduct = "Laptop";
        System.out.println("Мінімальна ціна на заданий товар " + targetProduct + ": " + service.findMinPrice(targetProduct));

        // Task 2
        System.out.println("Список магазинів, в яких заданий товар можна купити по мінімальній ціні " + targetProduct + ": " + service.findStoresWithMinPrice(targetProduct));

        // Task 3
        System.out.println("Чи є магазин, де всі товари за ціною нижче рекомендованої? " + service.isStoreAllBelowRecommended());
    }
}
