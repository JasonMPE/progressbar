package mars.progressbar;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ProgressBar;

public class ProgressTest extends ActionBarActivity {
	private ProgressBar firstBar=null;
	private ProgressBar secondBar=null;
	private Button myButton=null;
	private int i=0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		firstBar=(ProgressBar)findViewById(R.id.firstBar);
		secondBar=(ProgressBar)findViewById(R.id.secondBar);
		myButton=(Button)findViewById(R.id.myButton);
		myButton.setOnClickListener(new ButtonListener());
	}
	
	class ButtonListener implements OnClickListener{

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
		if(i==0){
			firstBar.setVisibility(View.VISIBLE);
			secondBar.setVisibility(View.VISIBLE);
		}
		else if(i<firstBar.getMax()){
			firstBar.setProgress(i);
			firstBar.setSecondaryProgress(i+10);
			//secondBar.setProgress(i);
		}
		else{
			firstBar.setVisibility(View.GONE);
			secondBar.setVisibility(View.GONE);
		}
		i=i+10;
		}
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.progress_test, menu);
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
