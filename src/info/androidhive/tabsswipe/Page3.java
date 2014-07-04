package info.androidhive.tabsswipe;

import info.androidhive.tabsswipe.adapter.GridviewAdapter;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

public class Page3 extends Fragment{
	GridView gv;
	String[] str = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T"};
	int[] image  = {R.drawable.ic_launcher,R.drawable.ic_launcher,R.drawable.ic_launcher,R.drawable.ic_launcher,R.drawable.ic_launcher,};
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.gridview_activity, container, false);
		
		gv = (GridView)rootView.findViewById(R.id.gridView1);
		gv.setAdapter(new GridviewAdapter(getActivity().getApplicationContext(), str));
		
		return rootView;
	}
}
