package com.zhuwen.recorder;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class Recorder extends Activity 
{

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_recorder);
		//SimpleAdapter adapter = new SimpleAdapter(this, getData(), R.layout.activity_event_item, )
		
	}

	private List<Map<String, Object>> getData()
	{
		List<Map<String, Object>> eventList = new ArrayList<Map<String, Object>>();

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("eventitem_textview", )
	}

	public boolean onTouchEvent(MotionEvent event)
	{
		int action = MotionEventCompat.getActionMasked(eventE);
		switch(action)
			case (MotionEvent.ACTION_DOWN) :
				Log.d(DEBUG_TAG,"Action was DOWN");	
				return true;
			case (MotionEvent.ACTION_MOVE) :
				Log.d(DEBUG_TAG,"Action was MOVE");
				return true;
			case (MotionEvent.ACTION_UP) :
				Log.d(DEBUG_TAG,"Action was UP");
				return true;
			case (MotionEvent.ACTION_CANCEL) :
				 Log.d(DEBUG_TAG,"Action was CANCEL");
				 return true;
			case (MotionEvent.ACTION_OUTSIDE) :
				Log.d(DEBUG_TAG,"Movement occurred outside bounds " +e "of current screen element");
				return true;      
			default :   
				return super.onTouchEvent(event);
			}
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
