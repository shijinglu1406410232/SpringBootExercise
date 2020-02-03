package com.mapper;

import com.sjl.domain.Comment;
import org.apache.ibatis.annotations.*;
/**
 * 写一个CommentMapper接口文件。
 * 1.用@Mapper来表示该接口是一个MyBatis接口文件
 * 2.在findById、insertComment等方法上用@Select等注解对数据进行增删改查等操作。
 * */
@Mapper
public interface CommentMapper {
    //通过id去查询评论   要不等下加一下返回值试试或者看看另外两本ssm书
    @Select("select * from t_comment where id=#{id}")
    Comment findById(Integer id);

    //新增评论
    @Insert("insert into t_comment values(#{content},#{author},#{a_id}")
    int insertComment(Comment comment);

    //根据id删除评论
    @Delete("delete from t_comment where id=#{id}")
    int deleteComment(Integer id);

    //根据Id更新评论  返回值为int
    @Update("update t_comment set content=#{content} where id=#{id}")
    int updateComment(Integer id);
}
