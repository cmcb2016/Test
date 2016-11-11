package test.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class LuncherActivity extends AppCompatActivity {

    private boolean stillCanReplaceIMG = true;
    private boolean fileExit = false;
    private TextView tv;


//    private long startTime;
//    private Runnable checkFileRunnable = new Runnable() {
//        @Override
//        public void run() {
//            Log.d("test", "checkFileRunnable ---  run");
//            if (fileExit) {
//                showImg();
//            } else {
//                if ((System.currentTimeMillis() - startTime) / 1000 == 5) {
//                    Log.d("test", "时间到  跳转");
//                } else {
//                    Log.d("test", "时间未到继续");
//                    if ((System.currentTimeMillis() - startTime) / 1000 == 1) {
//
//                    }
//                }
//            }
//        }
//    };
//
//    private void showImg() {
//        if (stillCanReplaceIMG) {
//            Log.d("test", "show ---  ");
//        }
//    }
//    private Handler mHandler = new Handler() {
//        @Override
//        public void handleMessage(Message msg) {
//            super.handleMessage(msg);
//            switch (msg.what) {
//                case 0:
//                    break;
//                default:
//                    break;
//            }
//        }
//    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luncher);
//        mHandler.post(checkFileRunnable);
//        startTime = System.currentTimeMillis();

        tv = (TextView) findViewById(R.id.tv_test);


    }

    public void getText(View view) {
        try {
            Class testClass = Class.forName("test.test.Test");
            Object testInstance = testClass.newInstance();
            Method getText = testClass.getDeclaredMethod("getText", null);
            String textStr = (String)getText.invoke(testInstance);
            tv.setText(textStr);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
