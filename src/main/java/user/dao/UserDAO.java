package user.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import user.bean.UserImageDTO;

@Mapper //UserDAOMybatis라는 구현체 안만들고 여기다가 다하겠다..
public interface UserDAO {

	public void upload(List<UserImageDTO> userImageList);

}
