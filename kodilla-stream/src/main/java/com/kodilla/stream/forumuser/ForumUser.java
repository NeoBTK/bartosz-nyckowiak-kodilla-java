package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int id;
    private final String username;
    private final char gender;
    private final LocalDate birthday;
    private final int publishedPosts;

    public ForumUser(final int id, final String username, final char gender, final LocalDate birthday, final int publishedPosts) {
        this.id = id;
        this.username = username;
        this.gender = gender;
        this.birthday = birthday;
        this.publishedPosts = publishedPosts;
    }

    public int getId() { return id; }
    public String getUsername() { return username; }
    public char getGender() { return gender; }
    public LocalDate getBirthday() { return birthday; }
    public int getPublishedPosts() { return publishedPosts; }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", gender=" + gender +
                ", birthday=" + birthday +
                ", publishedPosts=" + publishedPosts +
                '}';
    }
}
