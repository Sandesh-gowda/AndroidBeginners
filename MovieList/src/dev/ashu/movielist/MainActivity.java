package dev.ashu.movielist;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.Header;

import android.app.Activity;
import android.os.Bundle;
import android.renderscript.Type;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import dev.ashu.movielist.model.movieResponse;
import dev.ashu.movielist.model.moviesReciever;
import dev.ashu.movielist.ui.CustomAdapter;

public class MainActivity extends Activity implements OnItemClickListener {

	//private List<movie> movieList = new ArrayList<movie>();
  	public String url = "http://api.androidhive.info/json/movies.json";
	moviesReciever responseObj;
	Gson gson;
	ListView moviesList;
	CustomAdapter adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		moviesList = (ListView) findViewById(R.id.movie_list);
		moviesList.setOnItemClickListener(this);
		AsyncHttpClient client = new AsyncHttpClient();
		client.get(url, new AsyncHttpResponseHandler() {

			@Override
			public void onSuccess(int arg0, Header[] arg1, byte[] arg2) {
				// TODO Auto-generated method stub
				String responseStr = new String(arg2);
				try {
					Gson gson = new Gson();
					java.lang.reflect.Type listType = new TypeToken<ArrayList<movieResponse>>() {
					}.getType();
					List<movieResponse> yourClassList = new Gson().fromJson(
							responseStr, listType);
					adapter = new CustomAdapter(MainActivity.this,
							yourClassList);
					moviesList.setAdapter(adapter);
					
				} catch (JsonSyntaxException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

			@Override
			public void onFailure(int arg0, Header[] arg1, byte[] arg2,
					Throwable arg3) {
				// TODO Auto-generated method stub

			}
		});

	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id) {
		// TODO Auto-generated method stub

	}
}
