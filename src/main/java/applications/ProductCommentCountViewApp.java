package applications;

import dto.ProductCommentCountDetailDto;
import entityService.ProductCommentEntityService;

import java.util.List;

public class ProductCommentCountViewApp {
    public static void main(String[] args) {

        ProductCommentEntityService productCommentEntityService= new ProductCommentEntityService();

        List<ProductCommentCountDetailDto> commentCount= productCommentEntityService.findAllProductCommentsCount();

        for (ProductCommentCountDetailDto productCommentCountDetailDto : commentCount) {
            System.out.println(productCommentCountDetailDto);
        }

    }
}
