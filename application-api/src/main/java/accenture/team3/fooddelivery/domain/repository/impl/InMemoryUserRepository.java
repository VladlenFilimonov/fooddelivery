package accenture.team3.fooddelivery.domain.repository.impl;

import accenture.team3.fooddelivery.domain.User;
import accenture.team3.fooddelivery.domain.repository.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


// implementation of UserRepository interface
@Repository
public class InMemoryUserRepository implements UserRepository {

    private List<User> listOfUsers = new ArrayList<User>();

    public InMemoryUserRepository() {
        User ivan = new User("Ivan", "Ivanov", (byte) 3, "ivan.ivanov@mail.ru");
        User vasja = new User("Vasja", "Pupmkin", (byte) 3, "vasijadominator1337@mail.ru");
        User gena = new User("Gennadij", "Malahov", (byte) 3, "genchik@brazzers.com");
        listOfUsers.add(ivan);
        listOfUsers.add(vasja);
        listOfUsers.add(gena);
    }


    @Override
    public List<User> getAllUsers() {
        return listOfUsers;
    }
}
