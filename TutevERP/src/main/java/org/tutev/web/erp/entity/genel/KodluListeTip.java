package org.tutev.web.erp.entity.genel;

public enum KodluListeTip {

	PARA_BIRIM(101, "Para Birimi"), OLCU_BIRIMI(102, "�l�� Birimi"), UYRUK(103,
			"Uyru�u"), URETIM_TIP(109, "�retim Tipi");

	private KodluListeTip(int no, String label) {
		this.no = no;
		this.label = label;
	}

	int no;
	String label;

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

}