package com.example.balancingball;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends Activity {

  private EditText nicknameInput;
  private Button playButton;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    nicknameInput = findViewById(R.id.nickname_input);
    playButton = findViewById(R.id.play_button);

    playButton.setOnClickListener(view -> {
      // Start the game
    });
  }
}
