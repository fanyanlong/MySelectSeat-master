package com.example.seat;

/**
 *
 * @author fan
 * @date 2018/9/7
 * @Description:影院座位表缩放监听
 *
 */
public interface SeatZoomListener {
	/**
	 * 
	 * @param row 行
	 * @param column 列
	 * @param newBoxSize 座位大小+周围空隙大小
	 * @param newSeatSize 座位大小
	 * @param paddingLeft 距离left
	 * @param paddingTop 距离top
	 */
	void zoomChange(int row, int column, int newBoxSize, int newSeatSize,float paddingLeft, float paddingTop);
	
	
}
