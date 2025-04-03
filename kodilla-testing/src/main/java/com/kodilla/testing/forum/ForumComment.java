package com.kodilla.testing.forum;

public class ForumComment {

    private ForumPost forumPost;
    private String commentBody;
    private String author;

    public ForumComment(ForumPost forumPost, String commentBody,  String author) {
        this.forumPost = forumPost;
        this.commentBody = commentBody;
        this.author = author;
    }

    public ForumPost getForumPost() {
        return forumPost;
    }

    public String getCommentBody() {
        return commentBody;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof ForumComment that)) return false;

        return forumPost.equals(that.forumPost) && commentBody.equals(that.commentBody) && author.equals(that.author);
    }

    @Override
    public int hashCode() {
        int result = forumPost.hashCode();
        result = 31 * result + commentBody.hashCode();
        result = 31 * result + author.hashCode();
        return result;
    }
}
