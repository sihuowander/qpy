package com.util.bean;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AreaDemo {

	public List<Area> BufferedReaderDemo(String path) {
		String line = null;
		BufferedReader reader = null;
		File file = new File(path);

		String cityCode = "";
		String countyCode = "";
		List<Area> result = new ArrayList<Area>();
		if (!file.exists() || file.isDirectory()) {
			return null;
		}
		try {
			FileReader in = new FileReader(file);
			reader = new BufferedReader(in);

			// ��ȡ�ļ���ÿһ��
			while ((line = reader.readLine()) != null) {
				String[] data = this.doString(line);

				// �����ȡ���ļ���¼
				if (this.isSheng(data[0])) {
					cityCode = data[0];
					Area area = new Area(data[0], data[1], 0, "0");
					result.add(area);
				} else if (this.isShi(data[0])) {
					countyCode = data[0];
					Area area = new Area(data[0], data[1], 1, cityCode);
					result.add(area);
				} else {
					Area area = new Area(data[0], data[1], 2, countyCode);
					result.add(area);
				}

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return result;

	}

	// �ַ��ָ�
	public String[] doString(String line) {
		String code = "";
		String name = "";
		code = line.substring(0, 6);
		name = line.substring(6, line.length());
		String[] result = new String[] { code, name };
		return result;
	}

	// �ж��Ƿ�ʡ����ֱϽ��
	public boolean isSheng(String code) {
		String last = code.substring(2);
		if ("0000".equalsIgnoreCase(last)) {
			return true;
		}
		return false;

	}

	// �ж��Ƿ�ؼ���
	public boolean isShi(String code) {
		String last = code.substring(4);
		if ("00".equalsIgnoreCase(last)) {
			return true;
		}
		return false;
	}

}
