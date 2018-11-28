package dao;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import pojo.provider;

public interface providerMapper {

	List<provider> selectAll(@Param("proName") String proName);

}
