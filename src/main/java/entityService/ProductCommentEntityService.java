package entityService;
import dao.ProductCommentDao;
import dto.ProductCommentCountDetailDto;
import dto.ProductCommentDetailDto;
import dto.UserCommentDetailDto;
import java.util.List;

//UrunYorum entity'sine ait service class'ı.

public class ProductCommentEntityService {

    private ProductCommentDao productCommentDao = new ProductCommentDao();

    public ProductCommentEntityService(){

        productCommentDao= new ProductCommentDao();
    }


    public List<ProductCommentDetailDto> findAllProductCommentsByProductId(Long id) {
        return productCommentDao.findAllProductCommentsByProductId(id);
    }

    public List<ProductCommentCountDetailDto> findAllProductCommentsCount(){
        return productCommentDao.findAllProductCommentsCount();
    }

    public List<UserCommentDetailDto> findAllProductCommentsByUserId(Long id) {
        return productCommentDao.findAllProductCommentsByUserId(id);
    }
}
