package entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="URUN_YORUM")
public class UrunYorum {

    @SequenceGenerator(name = "generator", sequenceName = "URUN_YORUM_ID_SEQ")
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name="YORUM", nullable = false, length = 500)
    private String yorum;

    @Temporal(TemporalType.DATE)
    private Date yorumTarihi;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getYorum() {
        return yorum;
    }

    public void setYorum(String yorum) {
        this.yorum = yorum;
    }

    public Date getYorumTarihi() {
        return yorumTarihi;
    }

    public void setYorumTarihi(Date yorumTarihi) {
        this.yorumTarihi = yorumTarihi;
    }


    @Override
    public String toString() {
        return "UrunYorum{" +
                "id=" + id +
                ", yorum='" + yorum + '\'' +
                ", yorumTarihi=" + yorumTarihi +
                '}';
    }


}
