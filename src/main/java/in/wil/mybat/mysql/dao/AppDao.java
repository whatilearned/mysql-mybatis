/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.wil.mybat.mysql.dao;

import in.wil.mybat.mysql.bean.App;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

/**
 *
 * @author root
 */
@Component
public class AppDao {
    private final SqlSession sqlSession;
    public AppDao(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
    public App selectCityById(long id) {
		return this.sqlSession.selectOne("selectApp", 1);
	}
    
    
}
