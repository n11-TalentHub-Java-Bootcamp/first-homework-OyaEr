package dao;

import base.BaseDao;
import dto.ProductCommentCountDetailDto;
import dto.ProductCommentDetailDto;
import dto.UserCommentDetailDto;
import org.hibernate.query.Query;

import java.util.List;

public class ProductCommentDao extends BaseDao {


    //Bu metot bir ürüne ait yorumların listelenmesi için yazılmıştır.
    public List<ProductCommentDetailDto> findAllProductCommentsByProductId(Long id){
        String sql =" select new dto.ProductCommentDetailDto( p.name, p.category.name, p.price, u.name, u.surname, u.email, u.phoneNumber, pc.comment, pc.commentDate)" +
                " from ProductComment pc" +
                " INNER JOIN Product p ON pc.productId.id = p.id " +
                " INNER JOIN User u ON pc.userId.id = u.id  " +
                " WHERE p.id =:id";

        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("id", id);
        return query.list();
    }

    //Bu metot ürünlere yapılan yorum sayılarını göstermesi için yazılmıştır.
    public List<ProductCommentCountDetailDto> findAllProductCommentsCount() {
        String sql =" select new dto.ProductCommentCountDetailDto(p.id,p.name,p.price,COUNT (p.id))" +
                " from ProductComment pc" +
                " INNER JOIN Product p ON pc.productId.id =p.id " +
                " GROUP BY p.id ";

        Query query = getCurrentSession().createQuery(sql);
        return query.list();
    }


    //Bu metot bir kullanıcının yapmış olduğu yorumlarıgöstermesi için yazılmıştır.
    public List<UserCommentDetailDto> findAllProductCommentsByUserId(Long id) {
        String sql =" select new dto.UserCommentDetailDto( u.id, u.name, p.name, pc.comment, pc.commentDate ) " +
                " from ProductComment pc " +
                " INNER JOIN Product p ON pc.productId.id = p.id " +
                " INNER JOIN User u ON pc.userId.id = u.id " +
                " WHERE u.id = :id";

        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("id", id);
        return query.list();
    }

}
