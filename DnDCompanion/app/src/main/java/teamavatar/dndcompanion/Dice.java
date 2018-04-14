package teamavatar.dndcompanion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class Dice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice);
    }

    protected void rolld2(View view)
    {
        Random ran = new Random();
        TextView display = (TextView)findViewById(R.id.d2restxt);
        display.setText(Integer.toString(1 + ran.nextInt(2)));
    }
    protected void rolld4(View view)
    {
        Random ran = new Random();
        TextView display = (TextView)findViewById(R.id.d4restxt);
        display.setText(Integer.toString(1 + ran.nextInt(4)));
    }
    protected void rolld6(View view)
    {
        Random ran = new Random();
        TextView display = (TextView)findViewById(R.id.d6restxt);
        display.setText(Integer.toString(1 + ran.nextInt(6)));
    }
    protected void rolld8(View view)
    {
        Random ran = new Random();
        TextView display = (TextView)findViewById(R.id.d8restxt);
        display.setText(Integer.toString(1 + ran.nextInt(8)));
    }
    protected void rolld10(View view)
    {
        Random ran = new Random();
        TextView display = (TextView)findViewById(R.id.d10restxt);
        display.setText(Integer.toString(1 + ran.nextInt(10)));
    }
    protected void rolld12(View view)
    {
        Random ran = new Random();
        TextView display = (TextView)findViewById(R.id.d12restxt);
        display.setText(Integer.toString(1 + ran.nextInt(12)));
    }
    protected void rolld20(View view)
    {
        Random ran = new Random();
        TextView display = (TextView)findViewById(R.id.d20restxt);
        display.setText(Integer.toString(1 + ran.nextInt(20)));
    }
    protected void rolld100(View view)
    {
        Random ran = new Random();
        TextView display = (TextView)findViewById(R.id.d100restxt);
        display.setText(Integer.toString(1 + ran.nextInt(100)));
    }
}
