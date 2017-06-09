package com.util.bean;

public class Area {
	private String code;
	// ��������
	private String name;
	// ����
	private int level;
	// �������� 0:ʡ/ֱϽ�� 1:�ؼ��� 2:�ؼ���
	private String parentCode;

	// ��һ����������������
	public Area() {
		super();
	}

	public Area(String code, String name, int level, String parentCode) {
		super();
		this.code = code;
		this.name = name;
		this.level = level;
		this.parentCode = parentCode;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getParentCode() {
		return parentCode;
	}

	public void setParentCode(String parentCode) {
		this.parentCode = parentCode;
	}

	public String outPutString() {
		return this.getCode() + " " + this.getName() + " " + this.getLevel()
				+ " " + this.getParentCode();
	}
}
