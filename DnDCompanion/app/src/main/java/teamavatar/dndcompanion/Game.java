package teamavatar.dndcompanion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;


public class Game extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
    }
    protected void post(View view)
    {
        LinearLayout layout = (LinearLayout)findViewById(R.id.gameLayout);
        EditText replyText = (EditText)findViewById(R.id.input);
        String text = replyText.getText().toString();
        TextView reply = new TextView(this);
        reply.setText(text);
        layout.addView(reply);
        replyText.setText("");
    }
}
