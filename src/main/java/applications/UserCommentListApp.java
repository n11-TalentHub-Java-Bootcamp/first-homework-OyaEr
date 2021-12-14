package applications;
import dto.UserCommentDetailDto;
import entityService.ProductCommentEntityService;
import java.util.List;

//Bu class içerisinde bir kullanıcının yapmış olduğu yorumlar listelenip,gösterilecektir.

public class UserCommentListApp {
    public static void main(String[] args) {

        ProductCommentEntityService productCommentEntityService= new ProductCommentEntityService();

        List<UserCommentDetailDto> userComment= productCommentEntityService.findAllProductCommentsByUserId(20L);

        for (UserCommentDetailDto userCommentDetailDto : userComment) {
            System.out.println(userCommentDetailDto);
        }
    }
}

