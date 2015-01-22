package dev.ash.programaticgridview;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.RelativeLayout;
import android.widget.Toast;


public class MainActivity extends Activity {
	
	RelativeLayout Rl;
	GridView grid;
	List<String> griditem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Rl = (RelativeLayout) findViewById(R.id.Rl);
        grid = new GridView(MainActivity.this);
        
        griditem = new ArrayList<String>();
        
        griditem.add("Ashu Grid 1");
        griditem.add("Ashu Grid 2");
        griditem.add("Ashu Grid 3");
        griditem.add("Ashu Grid 4");
        griditem.add("Ashu Grid 5");
        griditem.add("Ashu Grid 6");
        griditem.add("Ashu Grid 7");
        griditem.add("Ashu Grid 8");
        griditem.add("Ashu Grid 9");
        griditem.add("Ashu Grid 10");
        griditem.add("Ashu Grid 11");
        griditem.add("Ashu Grid 12");
        griditem.add("Ashu Grid 13");
        griditem.add("Ashu Grid 14");
        griditem.add("Ashu Grid 15");
        griditem.add("Ashu Grid 16");
        griditem.add("Ashu Grid 17");
        griditem.add("Ashu Grid 18");
        griditem.add("Ashu Grid 19");
        griditem.add("Ashu Grid 20");
        griditem.add("Ashu Grid 21");
        griditem.add("Ashu Grid 22");
        griditem.add("Ashu Grid 23");
        
        ArrayAdapter<String> adp = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_dropdown_item_1line,griditem);
        grid.setNumColumns(2);
        grid.setBackgroundColor(Color.BLUE);
        grid.setAdapter(adp);
        Rl.addView(grid);
        
        grid.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				Toast.makeText(MainActivity.this, griditem.get(position), Toast.LENGTH_LONG).show();
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
