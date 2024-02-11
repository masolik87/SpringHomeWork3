package HomeWork3.HomeWork3.services;

import HomeWork3.HomeWork3.domain.User;
import org.springframework.stereotype.Service;


@Service
public class NotificationService {

    public void notifyUser(User user) {
        System.out.println("A new user has been created: " + user.getName());
    }

    public void sendNotification(String s) {
        System.out.println(s);
    }
}