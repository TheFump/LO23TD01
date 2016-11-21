package data;

import network.server.*; 

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import network.server.ComServerInterface;

public class ServerDataEngine implements InterfaceDataNetwork {
	private List<User> usersList;
	private List<GameTable> tableList;
	
	private ComServer comServer;
	
	/*
	 * 
	 * Constructor
	 * 
	 */

	public ServerDataEngine() {
		this.usersList = new ArrayList<>();
		this.tableList = new ArrayList<>();
		this.comServer = null;
	}
	
	/*
	 * 
	 * Methods
	 * 
	 */
	
	public GameTable createTable (User user, String name, Parameters params) throws Exception{
		
		//Initialisation des joueurs de la table avec le joueur cr�ant la table
		List<User> playerList = new ArrayList<User>();
		playerList.add(user);
		
		//Initialisation spectateurs, vide au d�but
		List<User> spectatorList = new ArrayList<User>();
		
		return new GameTable(name, user, params, playerList, spectatorList);
	}
	
	public boolean closeTable (GameTable table){
		//TO-DO : Fermeture de la table
		return false;
	}
	
	public void connect (User user){
		//TO-DO : Connexion d'un user
	}
	
	public void disconnect (User user){
		//TO-DO : Deconnexion d'un user
	}
	
	/*
	 * 
	 * Implemented Methods
	 * 
	 */
	
	@Override
	public Profile getProfile(User user) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void updateUserProfile(UUID uuid, Profile profile) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void sendMessage(ChatMessage message) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void dropTable(GameTable table) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void quit(User user, GameTable table) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void askJoinTable(User user, GameTable table, boolean isPlayer) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void launchGame(User user) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void createNewTable(User user, String name, Parameters params) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void disconnectUser(User user) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int[] hasThrown(UUID uuid, boolean d1, boolean d2, boolean d3) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void hasSelected(UUID uuid, boolean d1, boolean d2, boolean d3) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void connectUser(Profile profile) {
		User newUser = new User(profile);
		
//		if(!newUser.isFullVersion())
//			throw new Exception("Profil non complet lors de la connexion. Profil complet requis.");
//		else if (newUser.getSame(this.usersList)!=null)
//			throw new Exception("Profil d�j� connect�. Veuillez r�essayer dans X minutes");
		
		this.comServer.newUser(getUUIDList(this.usersList), newUser.getEmptyVersion().getPublicData());
		this.usersList.add(newUser);
		this.comServer.sendTablesUsers(this.usersList,this.tableList,newUser.getEmptyVersion().getPublicData());
		
		
	}
	@Override
	public void hasRefusedReplay(UUID uuid) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void hasAcceptedReplay(UUID uuid) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void askRefreshUsersList(User user) {
		// TODO Auto-generated method stub
		
	}
	
	
	public ComServer getComServer() {
		return comServer;
	}

	public void setComServer(ComServer comServer) {
		this.comServer = comServer;
	}	
	
	public static List<User> getEmptyList(List<User> userList)
	{
		List<User> newList = new ArrayList<User>();
		for(User i : userList)
			newList.add(i.getEmptyVersion());
		return newList;
	}
	
	public static List<UUID> getUUIDList(List<User> userList)
	{
		List<UUID> newList = new ArrayList<UUID>();
		for(User i : userList)
			newList.add(i.getPublicData().getUuid());
		return newList;
	}
}
