import dao.CategoryDao;
import dao.ProductCommentDao;
import dao.ProductDao;
import dao.UserDao;


public class Application {

    public static void main(String[] args) {

        CategoryDao kategoriDao= new CategoryDao();
        ProductDao urunDao= new ProductDao();
        ProductCommentDao productCommentDao = new ProductCommentDao();
        UserDao userDao = new UserDao();
    }
}
