package com.lzy.service;

import com.lzy.mapper.TextMapper;
import com.lzy.pojo.MyTexts;
import com.lzy.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

//业务逻辑封装
public class TextService {
    private SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();

    //添加内容
    public void addText(MyTexts myTexts){
        SqlSession sqlSession = factory.openSession();
        TextMapper mapper = sqlSession.getMapper(TextMapper.class);
        mapper.addText(myTexts);
        sqlSession.commit();
        sqlSession.close();
    }

    //展示所有内容
    public List<MyTexts> selectAll(){
        SqlSession sqlSession = factory.openSession();
        TextMapper mapper = sqlSession.getMapper(TextMapper.class);
        List<MyTexts> myTexts = mapper.selectAll();
        sqlSession.close();
        return myTexts;
    }

    //物理删除
    public void deleteById(int id){
        SqlSession sqlSession = factory.openSession();
        TextMapper mapper = sqlSession.getMapper(TextMapper.class);
        mapper.deleteById(id);
        sqlSession.commit();
        sqlSession.close();
    }

    //逻辑删除
    public void logicalDelete(int id){
        SqlSession sqlSession = factory.openSession();
        TextMapper mapper = sqlSession.getMapper(TextMapper.class);
        mapper.logicalDelete(id);
        sqlSession.commit();
        sqlSession.close();
    }

    //恢复逻辑删除
    public void recover(){
        SqlSession sqlSession = factory.openSession();
        TextMapper mapper = sqlSession.getMapper(TextMapper.class);
        mapper.recover();
        sqlSession.commit();
        sqlSession.close();
    }

}
