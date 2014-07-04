package info.androidhive.tabsswipe;

import info.androidhive.tabsswipe.adapter.ListviewAdapter;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class Page1 extends Fragment{
	ListView lv;
	ListviewAdapter adapter;
	String[][] in = {{"Chandim", "Student"}, {"Dara", "Student"}, {"Dola", "Student"}, {"Sama", "Student"}, {"Sreylis", "Student"}};
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.listview_activity, container, false);
		
		lv = (ListView)rootView.findViewById(R.id.listView1);
		lv.setAdapter(new ListviewAdapter(getActivity().getApplicationContext(), in));
		
		return rootView;
	}
}
