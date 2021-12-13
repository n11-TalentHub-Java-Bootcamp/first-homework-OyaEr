package entity;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name="URUN_YORUM")
public class ProductComment {

    @SequenceGenerator(name = "generator", sequenceName = "URUN_YORUM_ID_SEQ")
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name="YORUM", nullable = false, length = 500)
    private String comment;

    @Temporal(TemporalType.DATE)
    @Column(name="YORUM_TARIHI", nullable = false, length = 500)
    private Date commentDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }



    @Override
    public String toString() {
        return "UrunYorum{" +
                "id=" + id +
                ", yorum='" + comment + '\'' +
                ", yorumTarihi=" + commentDate +
                '}';
    }


}
