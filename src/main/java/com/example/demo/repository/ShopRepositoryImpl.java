package com.example.demo.repository;

import com.example.demo.model.ShopInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class ShopRepositoryImpl implements ShopRepository {



    @Autowired
    private JdbcTemplate template;

    @Override
    public void Insert(ShopInfo info) {
        try {
            template.execute(
                    "insert into shop_info( name, address, phone) values ( '" + info.getName() + "', '" + info.getAddress() + "', '" + info.getPhone() + "');"
            );
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }

    @Override
    public List<ShopInfo> findAll() {
        return template.query("select *from shop_info;", (rs, rowNum) -> {
            ShopInfo item = new ShopInfo();
            item.setId(rs.getInt("id"));
            item.setName(rs.getString("name"));
            item.setAddress(rs.getString("address"));
            item.setPhone(rs.getString("phone"));
            return item;
        });
    }

    @Override
    public ShopInfo findByName(String name) {
        return template.queryForObject("select * from shop_info where name = '"+name+" ';", (rs, rowNum) -> {
            ShopInfo item = new ShopInfo();
            item.setId(rs.getInt("id"));
            item.setName(rs.getString("name"));
            item.setAddress(rs.getString("address"));
            item.setPhone(rs.getString("phone"));
            return item;
        });
    }

}
