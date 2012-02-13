/*
 * Copyright 2011 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ibox_ucsc.design.ui;


import com.ibox_ucsc.design.R;

import com.ibox_ucsc.design.util.AnalyticsUtils;
import com.ibox_ucsc.design.util.UIUtils;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Toast;


///

import com.ibox_ucsc.design.view.MapView;



/**
 * Shows a {@link WebView} with a map of the conference venue.
 */
public class MapFragment extends Fragment {
//    private static final String TAG = "MapFragment";
    
    //////////////////// portion of the code added to implement the MapView in the MapFragment :
      
  //  protected Activity mActivity;
	
	public static final int MENU_MY_LOCATION = Menu.FIRST + 1; 
	public static final int MENU_CHOOSE_DESTINATION = Menu.FIRST + 2;
	public static final int MENU_STOP_RECORDING = Menu.FIRST + 3;
    

    /**
     * When specified, will automatically point the map to the requested room.
     */
    public static final String EXTRA_ROOM = "com.google.android.iosched.extra.ROOM";

    
 //   private WebView mWebView;
  //  private View mLoadingSpinner;
 //   private boolean mMapInitialized = false;
    
    private MapView mMapView;
    
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {

        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragment_webview_with_spinner, container, false);

        // For some reason, if we omit this, NoSaveStateFrameLayout thinks we are
        // FILL_PARENT / WRAP_CONTENT, making the progress bar stick to the top of the activity.
        root.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT,
                ViewGroup.LayoutParams.FILL_PARENT));

        //  mLoadingSpinner = root.findViewById(R.id.loading_spinner);
        
       // mMapView = new MapView(root.getContext());
        
        
        mMapView = (MapView) root.findViewById(R.id.map_view);
        
        

   
        
        // TODO: must use a thread here : a runnable or post methods !!!
        
        /*
         *         mMapView.post(new Runnable() {
         *   public void run() {
         *       mMapView.ggetSettings().setJavaScriptEnabled(true);
 	     *		public class TagStreamFragment extends Fragment {
         *       }
         *   }
         *  });
		 *
         * 
         * 
         * 
         */
        
        
        
        
       return root;
       
    }
    
    
    
    
    
    
    ////////////////////
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
        AnalyticsUtils.getInstance(getActivity()).trackPageView("/Map");
    }

    
    
    
    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.map_menu_items, menu);   // refresh_menu_items
    }

    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
   //     if (item.getItemId() == R.id.menu_map) {   //R.id.menu_refresh
       //     mWebView.reload();
        	
          //getActivity().
   //         return true;
   //     }
  //      if (item.getItemId() == R.id.menu_now) {
  //          if (!updateNowView(true)) {
  //              Toast.makeText(getActivity(), R.string.toast_now_not_visible,
  //                      Toast.LENGTH_SHORT).show();
 //           }
  //          return true;
  //       }
        
//        intent = new Intent(getActivity().getApplicationContext(),
//                UIUtils.getMapActivityClass(getActivity()));
//               intent.putExtra(MapFragment.EXTRA_ROOM, mRoomId);
//       startActivity(intent);
//       return true;
        
        return super.onOptionsItemSelected(item);
    }

    
    
    // 
    
    
    
    
    
    

}