package tuan_02;

import java.util.ArrayList;

public class DanhSachNhanVien {
	private ArrayList<NhanVien> list;
	public DanhSachNhanVien() {
		list= new ArrayList<NhanVien>();
	}
	public boolean themNhanVien(NhanVien nv) {
		if(list.contains(nv))
			return false;
		list.add(nv);
		return true;
	}
	public boolean xoaNhanVien(String maNV) {
		NhanVien nv= new NhanVien(maNV);
		if(list.contains(nv)) {
			list.remove(nv);
			return true;
		}
		return false;
	}
	public NhanVien timkiem(String maNV) {
		NhanVien nv =new NhanVien (maNV);
		if(list.contains(nv)) {
			return list.get(list.indexOf(nv));
		}
		return null;
	}
	public ArrayList<NhanVien> getList(){
		return list;
	}
}

