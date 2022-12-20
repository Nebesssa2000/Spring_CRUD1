package web.DAO;

import web.Model.User;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Repository
public class UserDaoImp implements UserDao{
    List<User> people;

    {
        people =new ArrayList<>();

        people.add(new User(1L, "Garry", "Potter","Hogwarts@magic.uk"));
        people.add(new User(2L, "Gaius Iulius", "Caesar", "Roma@romail.it"));
        people.add(new User(3L, "Napoleon", "Bonaparte", "Waterloo@imper.be"));
        people.add(new User(4L, "Benjamin", "Franklin", "Benya$100@gmial.com"));
    }

    @Override
    public List<User> listUsers() {
        return people;
    }

    @Override
    public User getUserById(long id) {
        return people.stream().filter(user -> user.getId() == id).findAny().orElse(null);
    }

    public UserDaoImp(List<User> people) {
        this.people = people;
    }

    @Override
    public void add(User user){}
}
