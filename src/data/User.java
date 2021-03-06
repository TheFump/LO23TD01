package data;

import java.util.List;

public class User {
	private Profile publicData;
	private GameTable actualTable;
	private boolean isSpectating;
	
	
	
	public User(Profile publicData, GameTable actualTable, boolean isSpectating) {
		super();
		this.publicData = publicData;
		this.actualTable = actualTable;
		this.isSpectating = isSpectating;
	}
	
	public User(Profile publicData) {
		super();
		this.publicData = publicData;
		this.actualTable = null;
		this.isSpectating = false;
	}


	public User getEmptyVersion(){
		
		if (this.isEmptyVersion())
			return this;
		return new User(new Profile(this.publicData.getUuid()));
	}
	
	public boolean isEmptyVersion(){
		if(this.publicData.getNickName()==null) //TOREVIEW : p-etre faire une condition complete ?
			return true;
		return false;
	}

	public User getLightWeightVersion() throws Exception{
		
		if(this.isLightWeightVersion())
			return this;
		if(this.isEmptyVersion())
			throw new Exception("User is Empty, can't get LightWeight");

		return new User(new Profile(this.publicData.getUuid(),this.publicData.getNickName(),this.publicData.getFirstName(),this.publicData.getSurName(),this.publicData.getAge()),this.actualTable,this.isSpectating);
	}
	
	public boolean isLightWeightVersion(){
		
		if(!this.isEmptyVersion() && this.publicData.getAvatar()==null) //TOREVIEW : p-etre faire une condition complete ?
			return true;
		return false;
	}
	
	public boolean isFullVersion()
	{
		if(!this.isEmptyVersion() && !this.isLightWeightVersion()) //TOREVIEW : p-etre faire une condition complete ?
			return true;
		return false;
	}
	
	public boolean isSame(User u){
		if(u.getPublicData().getUuid()==this.publicData.getUuid())
			return true;
		return false;
	}
	
	public User getSame(List<User> l){
		for(User u : l)
		{
			if(isSame(u))
				return u;
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
