package hiapp.modules.dmmanager;

import java.util.List;

public class UserItem {
	private int dicId; 
	private int itemId; 
	private String itemText;
	private String text;
	private String id;
	private String state;
	private Boolean checked;
	private List<UserItem> children;
	public Boolean getChecked() {
		return checked;
	}
	public void setChecked(Boolean checked) {
		this.checked = checked;
	}

	public List<UserItem> getChildren() {
		return children;
	}
	public void setChildren(List<UserItem> children) {
		this.children = children;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getDicId() {
		return dicId;
	}
	public void setDicId(int dicId) {
		this.dicId = dicId;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemText() {
		return itemText;
	}
	public void setItemText(String itemText) {
		this.itemText = itemText;
	}
 
}
