/**
 * 
 */
package com.muzongyan.maven.archetypes.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.muzongyan.maven.archetypes.dtos.User;

/**
 * @author skatam
 *
 */
public interface UserMapper {
	
	@Select("select user_id as userId, user_name as userName from user where user_id=#{userId}")
	public User findUserById(Integer userId);
	
	@Select("select user_id as userId, user_name as userName from user")
	public List<User> findAllUsers();
}
