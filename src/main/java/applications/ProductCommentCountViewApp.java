package applications;
import dto.ProductCommentCountDetailDto;
import entityService.ProductCommentEntityService;
import java.util.List;

//Bu class içerisinde ürünlere yapılmış olan yorum satırlarının sayısı gösterilecektir.

public class ProductCommentCountViewApp {
    public static void main(String[] args) {

        ProductCommentEntityService productCommentEntityService= new ProductCommentEntityService();

        List<ProductCommentCountDetailDto> commentCount= productCommentEntityService.findAllProductCommentsCount();

        for (ProductCommentCountDetailDto productCommentCountDetailDto : commentCount) {
            System.out.println(productCommentCountDetailDto);
        }

    }
}
