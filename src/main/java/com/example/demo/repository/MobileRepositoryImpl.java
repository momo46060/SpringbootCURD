package com.example.demo.repository;

import com.example.demo.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class MobileRepositoryImpl implements MobileRepository {

    @Autowired
    JdbcTemplate sybaseJdbcTemplate;

    @Override
    public List<UserInfo> getAllUsers(int role) {
        String sql =
                "select autocode,convert(univarchar(100),Encode.arEncoding(user_name)) as user_name, " +
                        "convert(univarchar(100),Encode.arEncoding(emp_name)) as emp_name , " +
                        "alpha_code,companyId,email,mobile,roleid,roledesc,erp_users.uid,name_ar, name_eng from fk_userrole,\n" +
                        "erp_users, fk_role, branch " +
                        "where fk_userrole.userrole = "+ role+ " and erp_users.uid = fk_userrole.uid and fk_role.roleid = fk_userrole.userrole\n" +
                        "and branch.branch_code=erp_users.autocode";
        return sybaseJdbcTemplate.query(sql, (rs, rowNum) -> {
            UserInfo userInfo = new UserInfo();
            userInfo.setUserName(rs.getString("user_name"));
            userInfo.setNameAr(rs.getString("name_ar"));
            userInfo.setNameEn(rs.getString("name_eng"));
            userInfo.setAutocode(rs.getShort("autocode"));
            userInfo.setEmail(rs.getString("email"));
            userInfo.setMobile(rs.getString("mobile"));
            userInfo.setRoleid(rs.getShort("roleid"));
            userInfo.setRoledesc(rs.getString("roledesc"));
            userInfo.setAlpha_code(rs.getInt("alpha_code"));
            userInfo.setCompanyId(rs.getShort("companyId"));
            userInfo.setEmail(rs.getString("email"));
            userInfo.setUid(rs.getString("uid"));
            return userInfo;
        });
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        String sql  = " UPDATE erp_users" +
                " SET autocode = "+userInfo.getAutocode()+" WHERE uid = '"+userInfo.getUid() +"'";
        sybaseJdbcTemplate.execute(sql);
    }
}
