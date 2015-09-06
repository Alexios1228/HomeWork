package service;

import java.time.LocalDate;

public interface JavaContactService {
    public void createContact(String firstName, String lastName, LocalDate birthDay);

    public void addHobby(String tittleHobby, String descriptionHobby);

    public void addPlace(String tittlePlace, String descriptionPlace, double longitube, double latitube);

    public void addFriendship();

    public void getFriendList();

    public void getConversation();

}
