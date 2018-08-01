public class Paper{

	private String text;

	public Paper(){
		text = "Default Text";		
	}
	
	public Paper(String text){
		this.text = text;
	}
	public void setText(String text){
		this.text = text;
	}
	public String getText(){
		return text;
	}
}