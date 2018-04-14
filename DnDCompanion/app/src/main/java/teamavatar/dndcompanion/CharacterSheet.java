package teamavatar.dndcompanion;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CharacterSheet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_sheet);
    }
    protected void newItem(View view)
    {
        LinearLayout layout = (LinearLayout)findViewById(R.id.charitems);
        EditText inputtxt = (EditText)findViewById(R.id.itemInput);
        String text = inputtxt.getText().toString();
        TextView item = new TextView(this);
        item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setVisibility(View.GONE);
            }
        });
        item.setText(text);
        layout.addView(item);
        inputtxt.setText("");
    }
    protected void newSpell(View view)
    {
        LinearLayout layout = (LinearLayout)findViewById(R.id.charspells);
        EditText inputtxt = (EditText)findViewById(R.id.spellInput);
        String text = inputtxt.getText().toString();
        TextView item = new TextView(this);
        item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setVisibility(View.GONE);
            }
        });
        item.setText(text);
        layout.addView(item);
        inputtxt.setText("");
    }
    protected void newLanguage(View view)
    {
        LinearLayout layout = (LinearLayout)findViewById(R.id.charlangs);
        EditText inputtxt = (EditText)findViewById(R.id.langInput);
        String text = inputtxt.getText().toString();
        TextView item = new TextView(this);
        item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setVisibility(View.GONE);
            }
        });
        item.setText(text);
        layout.addView(item);
        inputtxt.setText("");
    }
}
