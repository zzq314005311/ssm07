package servieImpl;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.providerMapper;
import pojo.provider;
import service.providerServce;

@Service
public class providerServceimpl implements providerServce{
	@Autowired
	private providerMapper mapper;

	@Override
	public List<provider> select() {
		return mapper.selectAll();
	}
}
