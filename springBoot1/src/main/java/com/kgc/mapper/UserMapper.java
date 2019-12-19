package com.kgc.mapper;

import com.kgc.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by Administrator on 2019/12/17.
 */
@Mapper
public interface UserMapper {
    public List<User> queryUserList();


}

