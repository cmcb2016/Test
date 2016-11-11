package test.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.SurfaceView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements ScaleGestureDetector.OnScaleGestureListener , View.OnTouchListener{

    private SurfaceView sv;
    private ScaleGestureDetector scaleGesture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sv = (SurfaceView) findViewById(R.id.sv_view);
        sv.setOnTouchListener(this);
        scaleGesture = new ScaleGestureDetector(this, this);


    }

    @Override
    public boolean onScale(ScaleGestureDetector detector) {
        Log.d("test", detector.getScaleFactor() + " =   detector.getScaleFactor()");
        return true;
    }

    @Override
    public boolean onScaleBegin(ScaleGestureDetector detector) {
        Log.d("test", detector.getScaleFactor() + " =   detector.getScaleFactor()");
        return true;
    }

    @Override
    public void onScaleEnd(ScaleGestureDetector detector) {

    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        return scaleGesture.onTouchEvent(event);
    }
}
