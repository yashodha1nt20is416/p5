package com.example.yashodha_mediaplayer;
import androidx.appcompat.app.AppCompatActivity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
Button play,pause,stop,backward,forward;
MediaPlayer mediaPlayer;
int fwTime = 5000;
int rwTime = 5000;
int startTime=0;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
play = findViewById(R.id.play);
pause = findViewById(R.id.pause);
stop = findViewById(R.id.stop);
backward = findViewById(R.id.rewind);
forward = findViewById(R.id.forward);
play.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
Toast.makeText(MainActivity.this, "Playing Media now", Toast.LENGTH_SHORT).show();
mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.song1);
mediaPlayer.start();
}
});
pause.setOnClickListener((new View.OnClickListener() {
@Override
public void onClick(View v) {
}
}));
stop.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
int currentPosition = mediaPlayer.getCurrentPosition();
if (currentPosition+fwTime <= mediaPlayer.getDuration())
{
mediaPlayer.seekTo(currentPosition+fwTime);
}
}
});
forward.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
int currentPosition = mediaPlayer.getCurrentPosition();
if (currentPosition+fwTime <= mediaPlayer.getDuration())
{
mediaPlayer.seekTo(currentPosition+fwTime);
}
}
});
backward.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
int currentPosition = mediaPlayer.getCurrentPosition();
if(currentPosition-rwTime >= startTime){
mediaPlayer.seekTo(currentPosition-rwTime);
}
}
});
}
}


................................................................................................................................



<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
xmlns:app="http://schemas.android.com/apk/res-auto"
xmlns:tools="http://schemas.android.com/tools"
android:layout_width="match_parent"
android:layout_height="match_parent"
android:orientation="vertical"
tools:context=".MainActivity">
<EditText
android:id="@+id/uname"
android:layout_width="match_parent"
android:layout_height="72dp"
android:ems="10"
android:inputType="textPersonName"
android:text="Name" />
<EditText
android:id="@+id/upass"
android:layout_width="match_parent"
android:layout_height="67dp"
android:ems="10"
android:inputType="textPersonName"
android:text="password" />
<Button
android:id="@+id/login"
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:text="login" />
<Button
android:id="@+id/register"
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:text="register" />
<Button
android:id="@+id/delete"
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:text="delete" />
<Button
android:id="@+id/update"
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:text="update" />
<Button
android:id="@+id/display"
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:text="display" />
<TextView
android:id="@+id/res"
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:text="TextView" />
</LinearLayout>


.................................................................................................


<resources>
<string name="app_name">yashodha_Mediaplayer</string>
<string name="songname">song</string>
</resources>
