package test.test;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoActivity extends AppCompatActivity {

    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vedio);
        videoView = (VideoView) findViewById(R.id.vv_player);

        //添加播放控制条,还是自定义好点
        videoView.setMediaController(new MediaController(this));

//设置视频源播放res/raw中的文件,文件名小写字母,格式: 3gp,mp4等,flv的不一定支持;
        Uri rawUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.test);
        videoView.setVideoURI(rawUri);
//        videoView.setRotation(10f);

        videoView.start();
        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {

            @Override
            public void onCompletion(MediaPlayer mp) {
                Log.e("test", "stop");
            }
        });
    }
}
