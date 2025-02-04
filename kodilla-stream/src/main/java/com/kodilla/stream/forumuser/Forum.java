package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> theUserList = new ArrayList<>();

    public Forum() {
        theUserList.add(new ForumUser(1, "Wiesiek", 'M', LocalDate.of(1970, 3, 12), 10));
        theUserList.add(new ForumUser(2, "Julka", 'K', LocalDate.of(2008, 7, 23), 41));
        theUserList.add(new ForumUser(3, "Zbychu", 'M', LocalDate.of(2006, 11, 5), 14));
        theUserList.add(new ForumUser(4, "Mariola", 'K', LocalDate.of(1982, 6, 17), 28));
        theUserList.add(new ForumUser(5, "Czesiek", 'M', LocalDate.of(1975, 8, 3), 0));
        theUserList.add(new ForumUser(6, "Barbara", 'K', LocalDate.of(1995, 12, 10), 33));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(theUserList);
    }
}
