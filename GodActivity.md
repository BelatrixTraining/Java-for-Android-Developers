## GOD ACTIVITY

```java

package com.google.iprotect;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParserException;

import com.google.iprotect.layout.TitleBarLayout;

import android.app.Activity;
import android.app.ListActivity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.XmlResourceParser;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.TextView;

public class ThirdActivity extends ListActivity implements OnItemClickListener{

    JSONArray jArray1,jArray2;
    String one,two,three,tablename;
    String color,r;
    JSONObject responseJSON;
    TitleBarLayout titlebarLayout;
    final ArrayList<Tables> arraylist = new ArrayList<Tables>();
    TextView tableName;
    ColorStateList colorStateList1;
    String email1,password1;
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thirdactivity);

        ListView lv=getListView();
        lv.setOnItemClickListener(this);


        tablename=getIntent().getExtras().getString("Table Name");
        email1 = getIntent().getExtras().getString("email");
        password1 =getIntent().getExtras().getString("password");

        titlebarLayout = new TitleBarLayout(ThirdActivity.this);
        titlebarLayout.setLeftButtonText("go Back");
        titlebarLayout.setRightButtonText("Logout");
        titlebarLayout.setTitle(tablename);
        titlebarLayout.setLeftButtonSize(70,40);
        titlebarLayout.setRightButtonSize(70,40);
        //titlebarLayout.setLeftButtonLeftDrawable(R.drawable.refresh);

        //titlebarLayout.setRightButtonLeftDrawable(R.drawable.buttonrefresh);
        //titlebarLayout.setLeftButtonBackgroundColor(Color.rgb(255,255,255));
        //titlebarLayout.setRightButtonBackgroundColor(Color.rgb(34,49,64));
        //titlebarLayout.setLeftButtonTextColor(Color.rgb(255,255,255));
        //titlebarLayout.setRightButtonTextColor(Color.rgb(255,255,0));     

        XmlResourceParser parser1 =getResources().getXml(R.color.colorstatelist);


        try {
            colorStateList1 = ColorStateList.createFromXml(getResources(), parser1);
            titlebarLayout.setRightButtonTextColor(colorStateList1);
        } catch (XmlPullParserException e) {    
            e.printStackTrace();
        } catch (IOException e) {

            e.printStackTrace();
        }

        OnClickListener listener = new OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                if (v.getId() == R.id.left_button) {
                    Intent intent = new Intent(ThirdActivity.this,SecondActivity.class);
                    intent.putExtra("email", email1);
                    intent.putExtra("password", password1);
                    startActivity(intent);
                    finish();

                } else if (v.getId() == R.id.right_button) {
                    Intent intent = new Intent(ThirdActivity.this,
                            MainActivity.class);
                    //intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    intent.setFlags( Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                    ThirdActivity.this.startActivity(intent);

                }
            }
        };
        titlebarLayout.setLeftButtonOnClickListener(listener);
        titlebarLayout.setRightButtonOnClickListener(listener);


        updateTableList();




    }

    private void updateTableList() {
        // TODO Auto-generated method stub
        //final ProgressDialog pd1=ProgressDialog.show(this, "Calling Webservice", "Waiting...", true, false);

        final ProgressBar pbHeaderProgress = (ProgressBar) findViewById(R.id.pbHeaderProgress);

        new AsyncTask<Void, Void, Void>() {


            protected void onPreExecute() {
                // TODO Auto-generated method stub
                super.onPreExecute();
                pbHeaderProgress.setVisibility(View.VISIBLE);
            }



            protected Void doInBackground(Void... params) {
                r = invokeWebService1(tablename);
                //pd1.dismiss();

                try {
                    responseJSON = new JSONObject(r);
                    //json reading
                    jArray1 = responseJSON.getJSONArray("FirstThree");//get JSONArray jArray1 from JSONObject with name FirstThree
                    jArray2 = responseJSON.getJSONArray("Color");//get JSONArray jArray2 from JSONOobject with name Color
                    JSONObject json_data1 = null;
                    JSONObject json_data2 = null;

                    for (int i = 0; i < jArray1.length(); i++) {
                        json_data1 = jArray1.getJSONObject(i);//get JSONObject json_data1 from JSONArray at index i;
                        one = json_data1.getString("One");//get value from JSONObject json_data1 with key "One"
                        two = json_data1.getString("Two");
                        three = json_data1.getString("Three");
                        json_data2 = jArray2.getJSONObject(i);
                        color = json_data2.getString("color");//get value from JSONObject json_data2 with key "color"

                        Tables tables = new Tables();
                        //set value to Tables Class
                        tables.column1 = one;
                        tables.column2 = two;
                        tables.column3 = three;
                        tables.tableName=tablename;
                        tables.color=color;
                        //add Tables object into ArrayList<Tables>
                        arraylist.add(tables);

                        Log.i("ONE", json_data1.getString("One"));
                        Log.i("TWO", json_data1.getString("Two"));
                        Log.i("THREE", json_data1.getString("Three"));
                        Log.i("color",""+ json_data2.getString("color"));
                    }

                } catch (JSONException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                return null;
            }

            protected void onPostExecute(Void result) {
                pbHeaderProgress.setVisibility(View.GONE);

                //Custom Adapter for ListView
                TableDetailAdapter adaptor = new TableDetailAdapter(ThirdActivity.this,
                        R.layout.table_data_list_item, arraylist);
                setListAdapter(adaptor);
            }
        }.execute();

    }

    protected String invokeWebService1(String tablename2) {
        // TODO Auto-generated method stub
        String response = "";
        try {
            WebService webService = new WebService(
            "http://sphinx-solution.com/iProtect/api.php?");

            // Pass the parameters if needed
            Map<String, String> params = new HashMap<String, String>();
            params.put("action", "getTableRecords");
            params.put("tablename", tablename2);
            params.put("email", email1);
            params.put("password", password1);

            // Get JSON response from server the "" are where the method name
            // would normally go if needed example
            response = webService.WebGet("auth", params);

        } catch (Exception e) {
            Log.d("Error: ", e.getMessage());
        }
        return response;
    }


    public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {
        // TODO Auto-generated method stub

        Log.v("", "Click ListItem Number "+position);
        Intent intent = new Intent(ThirdActivity.this,FourthActivity.class);
        intent.putExtra("Json", responseJSON.toString());//sending json Object as a string to next activity
        intent.putExtra("Table Name", tablename);
        intent.putExtra("email", email1);
        intent.putExtra("password", password1);
        intent.putExtra("Item No", position);
        startActivity(intent);
```
