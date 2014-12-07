package com.zhuwen.recorder;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class EventItem extends Fragment
{
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
		Bundle savedInstanceState)
	{
		// Inflate the layout for this frament
		return inflater.inflate(R.layout.fragment_event_item, container, false);
	}
}
