package network.messages;

import java.util.UUID;

import data.Profile;

public class UpdateProfileMessage implements IMessage {


	private static final long serialVersionUID = 633369383726455631L;

	private Profile profile;
	private UUID user;
	
	/**
	 * @param user
	 * @param profile
	 */
	public UpdateProfileMessage(UUID user, Profile profile) {
		this.user = user;
		this.profile = profile;
	}
	
	@Override
	public void process() {
		// ? ServerDataEngine -> updateUserProfile (user, profile); ?
	}

}