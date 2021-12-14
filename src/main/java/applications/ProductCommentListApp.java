package applications;
import dto.ProductCommentDetailDto;
import entityService.ProductCommentEntityService;
import java.util.List;

//Bu class içerisinde ürünlere yapılan yorumların listelenmiş hali gösterilecektir.

public class ProductCommentListApp {
    public static void main(String[] args) {

        ProductCommentEntityService productCommentEntityService= new ProductCommentEntityService();

        List<ProductCommentDetailDto> commentCount= productCommentEntityService.findAllProductCommentsByProductId(20L);

        for (ProductCommentDetailDto productCommentDetailDto : commentCount) {
            System.out.println(productCommentDetailDto);
        }



    }
}
