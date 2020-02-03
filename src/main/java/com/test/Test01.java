package com.test;

import com.mapper.ArticleMapper;
import com.mapper.CommentMapper;
import com.sjl.domain.Article;
import com.sjl.domain.Comment;
import com.springboot.app.SpringbootexerciseApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 测试类：
 *    1.运行测试类的注解；
 *    2.加载上下文容器的注解；
 *    3.类的加载和注入；
 *    4.调用查询、新增等功能；
 * */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootexerciseApplication .class)
public class Test01 {
    @Autowired(required = false)
    private CommentMapper commentMapper;
    @Autowired(required = false)
    private ArticleMapper articleMapper;
    @Test
    public void testInsert(){
       Comment comment=commentMapper.findById(901);
        System.out.println(comment);
    }
    @Test
    public void selectArticle(){
        Article article= articleMapper.findArticleById(101);
        System.out.println(article);
    }
}
