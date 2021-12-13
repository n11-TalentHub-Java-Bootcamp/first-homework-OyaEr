package dao;

import base.BaseDao;
import entity.Product;
import org.hibernate.query.Query;

import java.util.List;

public class ProductDao extends BaseDao {

    public List<Product> findAll(){

        String sql = "select product from Product product";

        Query query = getCurrentSession().createQuery(sql);

        return query.list();
    }
}
