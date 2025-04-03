package com.kodilla.good_patterns.challenges;

public class MailService implements InformationService {

    @Override
    public void inform(User user) {
        System.out.println("Sending mail to user");
    }
}
