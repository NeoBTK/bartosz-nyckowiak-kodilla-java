package com.kodilla.testing.forum.statistics;

public class ForumStatistics {

    private int userCount;
    private int postCount;
    private int commentCount;
    private double avgPostsPerUser;
    private double avgCommentsPerUser;
    private double avgCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics) {
        userCount = statistics.usersNames().size();
        postCount = statistics.postsCount();
        commentCount = statistics.commentsCount();

        if (userCount > 0) {
            avgPostsPerUser = (double) postCount / userCount;
        } else {
            avgPostsPerUser = 0;
        }

        if (userCount > 0) {
            avgCommentsPerUser = (double) commentCount / userCount;
        } else {
            avgCommentsPerUser = 0;
        }

        if (postCount > 0) {
            avgCommentsPerPost = (double) commentCount / postCount;
        } else {
            avgCommentsPerPost = 0;
        }
    }

    public void showStatistics() {
        System.out.println("User count: " + userCount);
        System.out.println("Post count: " + postCount);
        System.out.println("Comment count: " + commentCount);
        System.out.println("Avg posts per user: " + avgPostsPerUser);
        System.out.println("Avg comments per user: " + avgCommentsPerUser);
        System.out.println("Avg comments per post: " + avgCommentsPerPost);
    }

    public int getUserCount() {
        return userCount;
    }

    public int getPostCount() {
        return postCount;
    }
    public int getCommentCount() {
        return commentCount;
    }

    public double getAvgPostsPerUser() {
        return avgPostsPerUser;
    }

    public double getAvgCommentsPerUser() {
        return avgCommentsPerUser;
    }

    public double getAvgCommentsPerPost() {
        return avgCommentsPerPost;
    }
}