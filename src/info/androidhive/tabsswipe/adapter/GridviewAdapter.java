package info.androidhive.tabsswipe.adapter;

import info.androidhive.tabsswipe.R;
import info.androidhive.tabsswipe.adapter.ListviewAdapter.ViewHolder;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class GridviewAdapter extends BaseAdapter{
	LayoutInflater inflater;
	Context context;
	String[] str;
	public GridviewAdapter(Context context,String[] str){
		this.str = str;
		inflater = LayoutInflater.from(context);
	}
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return str.length;
	}
	public class ViewHolder {
		TextView text;
	}
	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder vHolder = new ViewHolder();
		if(convertView == null){
			convertView = inflater.inflate(R.layout.gridview_item, null);
			vHolder.text = (TextView)convertView.findViewById(R.id.textView1);
			convertView.setTag(vHolder);
		}else{
			vHolder = (ViewHolder) convertView.getTag();
		}
		vHolder.text.setText(str[position]);
		//vHolder.imglogo.setImageResource(image[position]);
		return convertView;
	}

}
