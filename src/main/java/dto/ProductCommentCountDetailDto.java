package dto;
import java.math.BigDecimal;

//Bu class bir ürünün yorum sayıları DTO'su için yazılmıştır.

public class ProductCommentCountDetailDto {

    private Long productId;
    private String productName;
    private BigDecimal price;
    private Long commentCount;

    public ProductCommentCountDetailDto(Long productId, String productName, BigDecimal price, Long commentCount) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.commentCount = commentCount;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Long getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Long commentCount) {
        this.commentCount = commentCount;
    }


    @Override
    public String toString() {
        return "ProductCommentCountDetailDto{" +
                "ürünId='" + productId + '\'' +
                ", ürünAdı='" + productName + '\'' +
                ", fiyat=" + price +
                ", yorumSayısı=" + commentCount +
                '}';
    }

}
