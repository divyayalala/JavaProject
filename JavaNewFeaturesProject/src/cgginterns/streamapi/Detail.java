package cgginterns.streamapi;

import java.util.List;

public class Detail {
	
	private int detailId;
	private List<String> parts;
	public Detail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Detail(int detailId, List<String> parts) {
		super();
		this.detailId = detailId;
		this.parts = parts;
	}
	public int getDetailId() {
		return detailId;
	}
	public void setDetailId(int detailId) {
		this.detailId = detailId;
	}
	public List<String> getParts() {
		return parts;
	}
	public void setParts(List<String> parts) {
		this.parts = parts;
	}
	@Override
	public String toString() {
		return "Detail [detailId=" + detailId + ", parts=" + parts + "]";
	}
	
	

}
