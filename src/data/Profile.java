package data;

import java.awt.Image;
import java.io.Serializable;
import java.util.UUID;

public class Profile implements Serializable{
    private UUID uuid;
    private String login;
    private String nickName;
    private String psw;
    private String firstName;
    private String surName;
    private int age;
    private Image avatar;
    private int nbGameWon;
    private int nbGameLost;
    private int nbGameAbandonned;
    private Client client;

    /*
     *
     * Constructors
     *
     */

    public Profile(UUID uuid) {
        this.uuid = uuid;
    }

    public Profile(UUID uuid, String nickname, String firstName, String surName, int age) {
        this.uuid = uuid;
        this.nickName = nickname;
        this.firstName = firstName;
        this.surName = surName;
        this.age = age;
    }

    public Profile(UUID uuid, String login, String nickname, String psw, String firstName, String surName, int age,
            Image avatar, int nbGameWon, int nbGameLost, int nbGameAbandonned, Client client) {
        super();
        this.uuid = uuid;
        this.login = login;
        this.nickName = nickname;
        this.psw = psw;
        this.firstName = firstName;
        this.surName = surName;
        this.age = age;
        this.avatar = avatar;
        this.nbGameWon = nbGameWon;
        this.nbGameLost = nbGameLost;
        this.nbGameAbandonned = nbGameAbandonned;
        this.client = client;
    }

    /*
     *
     * Methods
     *
     *
     */

    public int getAge() {
        return age;
    }


    /*
     *
     * Getters & Setters
     *
     *
     */

    public Image getAvatar() {
        return avatar;
    }

    public Client getClient() {
        return client;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLogin() {
        return login;
    }

    public int getNbGameAbandonned() {
        return nbGameAbandonned;
    }

    public int getNbGameLost() {
        return nbGameLost;
    }

    public int getNbGameWon() {
        return nbGameWon;
    }

    public String getNickName() {
        return nickName;
    }

    public String getPsw() {
        return psw;
    }

    public String getSurName() {
        return surName;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAvatar(Image avatar) {
        this.avatar = avatar;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setNbGameAbandonned(int nbGameAbandonned) {
        this.nbGameAbandonned = nbGameAbandonned;
    }

    public void setNbGameLost(int nbGameLost) {
        this.nbGameLost = nbGameLost;
    }

    public void setNbGameWon(int nbGameWon) {
        this.nbGameWon = nbGameWon;
    }

    public void setNickName(String nickname) {
        this.nickName = nickname;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public void Xmlise(){
        /*
         * TO-DO
         */
    }


}
