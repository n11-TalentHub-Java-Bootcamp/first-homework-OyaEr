package entityService;

import dao.ProductDao;
import entity.Product;
import java.util.List;

public class ProductEntityService {

    private ProductDao urunDao;

    public ProductEntityService() {
        urunDao = new ProductDao();
    }

    public List<Product> findAll(){
        return urunDao.findAll();
    }

}
