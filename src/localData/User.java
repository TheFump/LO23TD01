package localData;

import mocks.*; // TODO

import java.util.List;

public class User {
	private Profile publicData;
	public GameTable actualTable;
	public boolean isSpectating;
	
	public User getEmptyVersion() {
		// TODO
	}
	
	public User getLightWeightVersion() {
		// TODO
	}
	
	public boolean isEmptyVersion() {
		// TOTO
	}
	
	public boolean isLightWeightVersion() {
		// TODO
	}
	
	public boolean isFullVersion(){
		// TODO
	}
	
	/**
	 * Check if it's the same user
	 * @param anotherUser
	 * @return boolean
	 */
	public boolean isSame(User anotherUser) {
		return anotherUser.publicData.uid == this.publicData.uid;
	}
	
	/**
	 * Retrieve the the same user from a user list
	 * @param listUser
	 * @return User or null(if not found)
	 */
	public User getSame(List<User> listUser) {
		for(User thatUser : listUser) {
			if (thatUser.publicData.uid == this.publicData.uid) {
				return thatUser;
			}
		}
		return null;
	}
	
	public Profile getPublicData() {
		return publicData;
	}
	public void setPublicData(Profile publicData) {
		this.publicData = publicData;
	}
	public GameTable getActualTable() {
		return actualTable;
	}
	public void setActualTable(GameTable actualTable) {
		this.actualTable = actualTable;
	}
	public boolean isSpectating() {
		return isSpectating;
	}
	public void setSpectating(boolean isSpectating) {
		this.isSpectating = isSpectating;
	}
	
}
