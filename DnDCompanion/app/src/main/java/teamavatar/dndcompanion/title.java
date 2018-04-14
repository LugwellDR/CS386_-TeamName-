package teamavatar.dndcompanion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class title extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.title);
    }
    protected void goToCharSheet(View view) {
        startActivity(new Intent(title.this, CharacterSheet.class));
    }
    protected void goToGame(View view) {
        startActivity(new Intent(title.this, Game.class));
    }
    protected void goToDice(View view) {
        startActivity(new Intent(title.this, Dice.class));
    }
}
