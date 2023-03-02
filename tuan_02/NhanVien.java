package tuan_02;


public class NhanVien {
	private String maNV;
	private String ho;
	private String ten;
	private String phai;
	private int tuoi;
	private double luong;
	public NhanVien(String maNV,String ho,String ten,String phai,int tuoi,double luong) {
		super();
		this.maNV = maNV;
		this.ho = ho;
		this.ten = ten;
		this.phai = phai;
		this.tuoi = tuoi;
		this.luong = luong;
	}
	public NhanVien(String maNV) {
		this(maNV,"","","",0,0);
	}
	public NhanVien() {
		this("");
	}
	public int hashCode() {
		final int prime=31;
		int result=1;
		result = prime*result;
		return result;
	}
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(obj==null)
			return false;
		if(getClass()!= obj.getClass())
			return false;
		NhanVien other=(NhanVien) obj;
		if(maNV!=other.maNV)
			return false;
		return true;
	}
	public String toString() {
		return maNV+";"+ho+";"+ten+";"+phai+";"+tuoi+";"+luong;
	}
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public String getHo() {
		return ho;
	}
	public void setHo(String ho) {
		this.ho = ho;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String isPhai() {
		return phai;
	}
	public void setPhai(String phai) {
		this.phai = phai;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public double getLuong() {
		return luong;
	}
	public void setLuong(double luong) {
		this.luong = luong;
	}
	
}

