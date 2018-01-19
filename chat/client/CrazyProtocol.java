package chat.client;

public interface CrazyProtocol {
	
	int PROTOCOL_LEN = 2;
	
	// public msg
	String MSG_ROUND = "���";
	
	//login protocol
	String USER_ROUND = "�ǡ�";
	
	String LOGIN_SUCCESS = "1";
	// protocol used to respond for invalid username
	String NAME_REP = "-1";
	
	//private msg protocol
	String PRIVATE_ROUND = "�";
	
	//split sign used to seperate user and private message
	String SPLIT_SIGN = "��";
}
