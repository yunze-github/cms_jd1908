package com.briup.apps.cms.dao.extend;

import com.briup.apps.cms.bean.extend.CommentExtend;

import java.util.List;

public interface CommentExtendMapper {

    //查看文章的所有评论
    List<CommentExtend> selectCommentsByArticleId(Long articleId);


}
