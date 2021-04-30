
public class StudentManager extends User{
    String odevTeslim;
	boolean yoklamaKatilma;
	
	public StudentManager () {}
	
	public StudentManager (String odevTeslim, boolean yoklamaKatilma) {
		super();
		this.odevTeslim = odevTeslim;
		this.yoklamaKatilma = yoklamaKatilma;
		
		
	}

	public String getOdevTeslim() {
		return odevTeslim;
	}

	public void setOdevTeslim(String odevTeslim) {
		this.odevTeslim = odevTeslim;
	}

	public boolean getYoklamaKatilma() {
		return yoklamaKatilma;
	}
	
	public boolean setYoklamaKatilma() {
		return yoklamaKatilma = true;
	}
}
