package com.lzy.mapper;

import com.lzy.pojo.MyTexts;
import org.apache.ibatis.annotations.*;

import java.util.List;

//编写mapper代理
public interface TextMapper {

    @Insert("insert into texts values(null,#{myText},1)")
    void addText(MyTexts myTexts);

    @Select("select * from texts")
    @ResultMap("MyTextsResultMap")
    List<MyTexts> selectAll();

    @Delete("delete from texts where id = #{id}")
    void deleteById(int id);

    @Update("update texts set status = 0 where id = #{id}")
    void logicalDelete(int id);

    @Update("update texts set status = 1")
    void recover();
}
