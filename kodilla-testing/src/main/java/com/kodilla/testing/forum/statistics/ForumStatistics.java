package com.kodilla.testing.forum.statistics;

public class ForumStatistics {

    private static int userCount;
    private static int postCount;
    private static int commentCount;
    private static double avgPostsPerUser;
    private static double avgCommentsPerUser;
    private static double avgCommentsPerPost;

    public static void calculateAdvStatistics(Statistics statistics) {
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

    public static int getUserCount() {
        return userCount;
    }

    public static int getPostCount() {
        return postCount;
    }
    public static int getCommentCount() {
        return commentCount;
    }

    public static double getAvgPostsPerUser() {
        return avgPostsPerUser;
    }

    public static double getAvgCommentsPerUser() {
        return avgCommentsPerUser;
    }

    public static double getAvgCommentsPerPost() {
        return avgCommentsPerPost;
    }
}