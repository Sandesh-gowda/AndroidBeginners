package dev.ash.gridview;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;


public class MainActivity extends Activity {

	List<String> List;
    GridView grid;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List = new ArrayList<String>();
        grid = (GridView) findViewById(R.id.gridView1);
        
        List.add(" Ashok 1");
        List.add(" Ashok 2");
        List.add(" Ashok 3");
        List.add(" Ashok 4");
        List.add(" Ashok 5");
        List.add(" Ashok 6");
        List.add(" Ashok 7");
        List.add(" Ashok 8");
        List.add(" Ashok 9");
        List.add(" Ashok 10");
        List.add(" Ashok 11");
        List.add(" Ashok 12");
        List.add(" Ashok 13");
        List.add(" Ashok 14");
        List.add(" Ashok 15");
        List.add(" Ashok 16");
        List.add(" Ashok 17");
        List.add(" Ashok 18");
        List.add(" Ashok 19");
        List.add(" Ashok 20");
        
        
        ArrayAdapter<String> adp = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_dropdown_item_1line, List);
        grid.setAdapter(adp);
        
        grid.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity.this, List.get(position), Toast.LENGTH_LONG).show();
				
			}
		});
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
