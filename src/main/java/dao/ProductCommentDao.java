package dao;

import base.BaseDao;
import entity.ProductComment;
import org.hibernate.query.Query;

import java.util.List;

public class ProductCommentDao extends BaseDao {

    public List<ProductComment> findAll(){

        Query query = getCurrentSession().createQuery(
                "select productComment from ProductComment productComment");

        return query.list();
    }

}
