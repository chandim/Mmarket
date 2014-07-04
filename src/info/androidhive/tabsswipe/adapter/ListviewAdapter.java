package info.androidhive.tabsswipe.adapter;

import info.androidhive.tabsswipe.R;

import java.util.zip.Inflater;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListviewAdapter extends BaseAdapter{
	String[][] in;
	LayoutInflater inflater;
	Context context;
	public ListviewAdapter(Context context, String[][] in) {
		this.in = in;
		inflater = LayoutInflater.from(context);
	}
	public class ViewHolder {
		ImageView imglogo;
		TextView title;
		TextView des;
	}
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return in.length;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder vHolder = new ViewHolder();
		if(convertView == null){
			convertView = inflater.inflate(R.layout.listvie_item, null);
			vHolder.imglogo = (ImageView)convertView.findViewById(R.id.imageView1);
			vHolder.title = (TextView)convertView.findViewById(R.id.textView1);
			vHolder.des = (TextView)convertView.findViewById(R.id.textView2);
			convertView.setTag(vHolder);
		}else{
			vHolder = (ViewHolder) convertView.getTag();
		}
		vHolder.imglogo.setImageResource(R.drawable.ic_launcher);
		vHolder.title.setText(in[position][0]);
		vHolder.des.setText(in[position][1]);
		return convertView;
	}

}
