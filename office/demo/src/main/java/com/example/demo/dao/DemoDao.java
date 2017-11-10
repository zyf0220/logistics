package com.example.demo.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * Created by fang on 2017/11/1.
 */
@Repository
public interface DemoDao {

    @Select("SELECT COUNT(*) FROM zyf_feedback WHERE question = #{question} AND code = #{code}")
    Integer getCount(@Param("question") String question ,@Param("code") Integer code);

    @Insert("INSERT INTO zyf_feedback (question,code)VALUES (#{question},#{code});")
    Integer insertQuestion(@Param("question")String question,@Param("code")Integer code);


}
