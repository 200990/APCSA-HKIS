public class Message {
	
	private String mes;
	private String who;
	
	public Message(String m, String w) {
		mes = m;
		who = w;
	}
	
	public String getMessage() {
		return mes;
	}
	
	public String getWho() {
		return who;
	}
	
}