package dao;

import base.BaseDao;
import entity.Kullanici;
import entity.UrunYorum;
import org.hibernate.query.Query;

import java.util.List;

public class UrunYorumDao extends BaseDao {

    public List<UrunYorum> findAll(){

        Query query = getCurrentSession().createQuery(
                "select urunYorum from UrunYorum urunYorum");

        return query.list();
    }

}
