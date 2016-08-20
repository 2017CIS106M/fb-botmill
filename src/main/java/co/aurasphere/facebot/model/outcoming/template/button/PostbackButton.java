package co.aurasphere.facebot.model.outcoming.template.button;


public class PostbackButton extends Button{
	
	private static final long serialVersionUID = 1L;
	
	private String payload;
	
	public PostbackButton(String title, ButtonType type, String payload) {
		this.title = title;
		this.type = type;
		this.payload = payload;
	}

	public String getPayload() {
		return payload;
	}

	public void setPayload(String payload) {
		this.payload = payload;
	}

}