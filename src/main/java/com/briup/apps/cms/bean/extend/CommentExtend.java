package com.briup.apps.cms.bean.extend;

import com.briup.apps.cms.bean.Comment;
import com.briup.apps.cms.bean.User;

import java.util.List;

public class CommentExtend extends Comment {
    private User user;
    private List<CommentExtend> commentExtends;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<CommentExtend> getCommentExtends() {
        return commentExtends;
    }

    public void setCommentExtends(List<CommentExtend> commentExtends) {
        this.commentExtends = commentExtends;
    }
}
