package Entity;

public class Product {
    private String id;
    private String name;

    private static int counterId;

    public Product(String name) {
        this.name = name;
        this.id = "p" + counterId++ ;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
