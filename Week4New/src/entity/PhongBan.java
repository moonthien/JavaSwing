package entity;

import java.util.ArrayList;

public class PhongBan {
	private String maPhong;
	private String tenPhong;
	
	private ArrayList<NhanVien> dsnv;

	/**
	 * @param maPhong
	 * @param tenPhong
	 */
	public PhongBan(String maPhong, String tenPhong) {
		super();
		this.maPhong = maPhong;
		this.tenPhong = tenPhong;
		dsnv = new ArrayList<NhanVien>();
	}
	
	public void themMoiNhanVien(String maSo, String ho, String ten, boolean phai, int tuoi, long tienLuong) {
		NhanVien nv = new NhanVien(maSo, ho, ten, phai, tuoi, tienLuong, this);
		dsnv.add(nv);
	}
	
	public ArrayList<NhanVien> getDsnv() {
		return dsnv;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return  tenPhong ;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maPhong == null) ? 0 : maPhong.hashCode());
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
		PhongBan other = (PhongBan) obj;
		if (maPhong == null) {
			if (other.maPhong != null)
				return false;
		} else if (!maPhong.equalsIgnoreCase(other.maPhong))
			return false;
		return true;
	}
	
	public String getTenPhong() {
		return tenPhong;
	}
}
