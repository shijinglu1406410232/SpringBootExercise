package com.mapper;

import com.sjl.domain.Article;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ArticleMapper {
    //根据id查找文章
    Article findArticleById(Integer id);

    //更新文章；
    int updateArticle(Article article);
}
