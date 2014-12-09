package com.zhuwen.recorder;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.GestureDetectorCompat;
import android.util.Log;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

public class Recorder extends Activity implements
	GestureDetector .OnGestureListener,
	GestureDetector.OnDoubleTapListener
{
	private final String DEBUG_TAG = "touchEvent";
	private GestureDetectorCompat mDetector;

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_recorder);
		//SimpleAdapter adapter = new SimpleAdapter(this, getData(), R.layout.activity_event_item, )
		mDetector = new GestureDetectorCompat(this, this);
		mDetector.setOnDoubleTapListener(this);
	}

/*	private List<Map<String, Object>> getData()
	{
		List<Map<String, Object>> eventList = new ArrayList<Map<String, Object>>();

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("eventitem_textview", );
	}*/

	//capturing touch events for Recorder activity
	public boolean onTouchEvent(MotionEvent event)
	{
		this.mDetector.onTouchEvent(event);
		// Be sure to call the superclass implementation
		return super.onTouchEvent(event);
	}
	
	@Override
	public boolean onSingleTapConfirmed(MotionEvent e) 
	{
		Log.d(DEBUG_TAG, "onSingleTapConfirmed: " + e.toString());
		return false;
	}

	@Override
	public boolean onDoubleTap(MotionEvent e) 
	{
		Log.d(DEBUG_TAG, "onDoubleTap: " + e.toString());
		return false;
	}

	@Override
	public boolean onDoubleTapEvent(MotionEvent e)
	{
		Log.d(DEBUG_TAG, "onDoubleTapEvent: " + e.toString());
		return false;
	}

	@Override
	public boolean onDown(MotionEvent e) 
	{
		Log.d(DEBUG_TAG, "onDown: " + e.toString());
		return true;
	}

	@Override
	public void onShowPress(MotionEvent e) 
	{
		Log.d(DEBUG_TAG, "onShowPress: " + e.toString());
		
	}

	@Override
	public boolean onSingleTapUp(MotionEvent e) 
	{
		Log.d(DEBUG_TAG, "onSingleTapUp: " + e.toString());
		return false;
	}

	@Override
	public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX,
			float distanceY) 
	{
		Log.d(DEBUG_TAG, "onScroll: " + e1.toString() + e2.toString());
		Log.d(DEBUG_TAG, "onFling: " + distanceX + distanceY);
		return false;
	}

	@Override
	public void onLongPress(MotionEvent e) 
	{
		Log.d(DEBUG_TAG, "onLongPress: " + e.toString());
		
	}

	@Override
	public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX,
			float velocityY) 
	{
		Log.d(DEBUG_TAG, "onFling: " + e1.toString() + e2.toString());
		Log.d(DEBUG_TAG, "onFling: " + velocityX + velocityY);
		return true;
	}
	
	public void CreateEvent_click(View view)
	{
		Toast.makeText(this, "Create event.", Toast.LENGTH_SHORT).show();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) 
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.recorder, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	
}
