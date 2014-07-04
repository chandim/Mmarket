package info.androidhive.tabsswipe;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class Page2 extends Fragment{
	AutoCompleteTextView autoText;
	String[] text = {"Cambodia", "Cameroon","Thailand","Singapore","Brazil","Belgium"};
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.auto_activity, container, false);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity().getApplicationContext(), android.R.layout.simple_list_item_1, text);
		autoText = (AutoCompleteTextView)rootView.findViewById(R.id.autoCompleteTextView1);
		autoText.setAdapter(adapter);
		return rootView;
	}
}
