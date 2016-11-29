package com.yyxk.spinnertest;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

/**
 * ----------Dragon be here!----------/
 * 　　　┏┓　　　┏┓
 * 　　┏┛┻━━━┛┻┓
 * 　　┃　　　　　　　┃
 * 　　┃　　　━　　　┃
 * 　　┃　┳┛　┗┳　┃
 * 　　┃　　　　　　　┃
 * 　　┃　　　┻　　　┃
 * 　　┃　　　　　　　┃
 * 　　┗━┓　　　┏━┛
 * 　　　　┃　　　┃神兽保佑
 * 　　　　┃　　　┃代码无BUG！
 * 　　　　┃　　　┗━━━┓
 * 　　　　┃　　　　　　　┣┓
 * 　　　　┃　　　　　　　┏┛
 * 　　　　┗┓┓┏━┳┓┏┛
 * 　　　　　┃┫┫　┃┫┫
 * 　　　　　┗┻┛　┗┻┛
 * ━━━━━━神兽出没━━━━━━
 * 项目名称：SpinnerTest
 * 包名:com.yyxk.spinnertest
 * 类描述：
 * 创建人：Random
 * 创建时间：9:24
 * 修改人：Random
 * 修改时间：9:24
 * 修改备注：
 */
public class SpinnerAdapter extends BaseAdapter {
    private List<String> list;
    private Context context;
    private Spinner spinner;
    public SpinnerAdapter(List<String> list, Context context,Spinner spinner) {
        this.list = list;
        this.context = context;
        this.spinner=spinner;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(R.layout.item, parent, false);
        final ViewHolder holder = new ViewHolder();
        holder.textView = (TextView) convertView.findViewById(R.id.text);

        holder.textView.setText("----请选择----");
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                holder.textView.setText(list.get(position));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        return convertView;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        convertView= LayoutInflater.from(context).inflate(R.layout.item,parent,false);
        ViewHolder holder=new ViewHolder();
        holder.textView= (TextView) convertView.findViewById(R.id.text);
        holder.textView.setText(list.get(position));
        return convertView;
    }
    static class ViewHolder{
        TextView textView;
    }

}
