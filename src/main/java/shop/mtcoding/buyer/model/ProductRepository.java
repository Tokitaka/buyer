package shop.mtcoding.buyer.model;

import java.util.List;

public interface ProductRepository {
    public int insert(String name, int price, int qty);

    public List<Product> findAll();

    public Product findById(int id);

    public int updateById(int id, String name, int price, int qty);

    public int deleteById(int id);
}
