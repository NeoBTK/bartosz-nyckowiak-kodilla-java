package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        Forum forumUsers = new Forum();

        Map<Integer, ForumUser> forumUsersResultMap = forumUsers.getUserList().stream()
                .filter(user -> user.getGender() == 'M')
                .filter(user -> calculateAge(user.getBirthday()) >= 20)
                .filter(user -> user.getPublishedPosts() > 0)
                .collect(Collectors.toMap(ForumUser::getId, user -> user));

        System.out.println("Result:");
        forumUsersResultMap.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
//        forumUsersResultMap.forEach((k, v) -> System.out.println(k + ": " + v));
    }

    public static int calculateAge(LocalDate birthDate) {
        LocalDate today = LocalDate.now();
        Period age = Period.between(birthDate, today);
        return age.getYears();
    }
}
