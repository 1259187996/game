package com.game.mapper;

import com.game.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author vader
 * @version 1.0.0
 * @package com.game.mapper
 * @date ${Date}
 * description
 */
@Mapper
public interface UserMapper {


    @Select("select * from users")
    public List<User> selectAll();

}
