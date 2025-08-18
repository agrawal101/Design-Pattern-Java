package Behavioral.mediatorDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class CollaborativeDocument implements DocumentSessionMediator{

    List<User> allUsers = new ArrayList<>();
    @Override
    public void join(User user)
    {
        allUsers.add(user);
    }

    @Override
    public void broadcastChange(String change,User sender)
    {
        for(User u:allUsers)
        {
            if(sender!=u)
            {
                u.receiveChange(change,sender);
            }
        }
    }
}
