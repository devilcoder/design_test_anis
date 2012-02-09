/*
package com.ibox_ucsc.design.ui;

import android.os.Bundle;
import android.support.v4.app.ListFragment;

import com.ibox_ucsc.design.util.NotifyingAsyncQueryHandler;

public class SearchFragment extends ListFragment implements
NotifyingAsyncQueryHandler.AsyncQueryListener {
	
    private NotifyingAsyncQueryHandler mHandler;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	     super.onCreate(savedInstanceState);
	     mHandler = new NotifyingAsyncQueryHandler(getActivity().getContentResolver(), this);
	     reloadFromArguments(getArguments());
	}
	
	
	public void reloadFromArguments(Bundle arguments) {
	     // Teardown from previous arguments
	   if (mCursor != null) {
	       getActivity().stopManagingCursor(mCursor);
	       mCursor = null;
	    }
	
}
*/