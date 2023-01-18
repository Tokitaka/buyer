package shop.mtcoding.buyer.model;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ProductRepository {
    public int insert(String name, int price, int qty);

    public List<Product> findAll();

    public Product findById(int id);

    public int updateById(@Param("id") int id, @Param("name") String name, @Param("price") int price,
            @Param("qty") int qty);

    public int deleteById(int id);
}
