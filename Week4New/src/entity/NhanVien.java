package entity;


public class NhanVien {
	private String maSo;
	private String ho;
	private String ten;
	private boolean phai;
	private int tuoi;
	private long tienLuong;
	private PhongBan phongBan;

	/**
	 * @param maSo
	 * @param ho
	 * @param ten
	 * @param phai
	 * @param tuoi
	 * @param tienLuong
	 * @param phongBan
	 */
	public NhanVien(String maSo, String ho, String ten, boolean phai, int tuoi,
			long tienLuong, PhongBan phongBan) {
		super();
		this.maSo = maSo;
		this.ho = ho;
		this.ten = ten;
		this.phai = phai;
		this.tuoi = tuoi;
		this.tienLuong = tienLuong;
		this.phongBan = phongBan;
	}
	
	/**
	 * @return the maSo
	 */
	public String getMaSo() {
		return maSo;
	}
	
	/**
	 * @param maSo the maSo to set
	 */
	public void setMaSo(String maSo) {
		this.maSo = maSo;
	}
	
	/**
	 * @return the ten
	 */
	public String getTen() {
		return ten;
	}
	
	/**
	 * @param ten the ten to set
	 */
	public void setTen(String ten) {
		this.ten = ten;
	}
	
	/**
	 * @return the phai
	 */
	public boolean isPhai() {
		return phai;
	}
	
	/**
	 * @param phai the phai to set
	 */
	public void setPhai(boolean phai) {
		this.phai = phai;
	}
	
	/**
	 * @return the tienLuong
	 */
	public long getTienLuong() {
		return tienLuong;
	}
	
	/**
	 * @param tienLuong the tienLuong to set
	 */
	public void setTienLuong(long tienLuong) {
		this.tienLuong = tienLuong;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maSo == null) ? 0 : maSo.hashCode());
		return result;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NhanVien other = (NhanVien) obj;
		if (maSo == null) {
			if (other.maSo != null)
				return false;
		} else if (!maSo.equalsIgnoreCase(other.maSo))
			return false;
		return true;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "NhanVien [maSo=" + maSo + ", ten=" + ten + ", phai=" + phai
				+ ", tienLuong=" + tienLuong + "]";
	}
	
	public void setPhongBan(PhongBan phongBan) {
		this.phongBan = phongBan;
	}
	
	public PhongBan getPhongBan() {
		return phongBan;
	}
	
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	
	public int getTuoi() {
		return tuoi;
	}
	
	public void setHo(String ho) {
		this.ho = ho;
	}
	
	public String getHo() {
		return ho;
	}
}
