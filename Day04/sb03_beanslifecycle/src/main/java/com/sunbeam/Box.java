package com.sunbeam;

public interface Box {
	Void setLength(int length);
	int getLength();
	void setBreadth(int breadth);
	int getBreadth();
	void setHeight(int height);
	int getHeight();
	int calcVolume();
}
