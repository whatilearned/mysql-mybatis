/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.wil.mybat.mysql.mapper;

import in.wil.mybat.mysql.bean.App;
import org.apache.ibatis.annotations.Mapper;




/**
 *
 * @author root
 */
@Mapper
public interface  AppMapper {
        App  selectApp(int id);
}
