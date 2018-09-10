package com.example.seat;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import static android.content.ContentValues.TAG;

/**
 * @author ：fan
 * @date 2018/9/6
 * @Description:影院座位表类
 */
public class MovieSelectSeatActivity1 extends Activity {

	private TextView yingmuTextView;

	private SeatView seatView;
	private SeatNumberView seatNumberView;
	private ScreenView screenView;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_movie_select_seat1);
		initView();
	}

	private void initView() {
		yingmuTextView = (TextView) findViewById(R.id.yingmu);
		yingmuTextView.setText("1602A-" + "404号厅");

		seatView = (SeatView) findViewById(R.id.seat_view);
		seatNumberView = (SeatNumberView) findViewById(R.id.seat_number_view);
		screenView = (ScreenView) findViewById(R.id.screen_view);
		screenView.setScreenName("西虹市首富");

		seatView.addSeatZoomListener(seatNumberView);
		seatView.addSeatZoomListener(screenView);
		seatView.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Log.d(TAG, "onClick: ");
			}
		});
	}
	
}
