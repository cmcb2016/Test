package test.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

public class RecyclerTestActivity extends AppCompatActivity {

    private RecyclerView mRcyView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclor_test);
        mRcyView = (RecyclerView)findViewById(R.id.lv_rcl);
        mRcyView.setAdapter(new MyAdapter());
        mRcyView.setLayoutManager(new GridLayoutManager(RecyclerTestActivity.this, 1));
    }

    //
    //
    //
    //

    private class MyAdapter extends RecyclerView.Adapter {

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = View.inflate(RecyclerTestActivity.this, R.layout.item_adapter_recycler_view, null);
//            view.findViewById(R.id.tv);
            MyHolder myHolder = new MyHolder(view);
            return myHolder;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return 10;
        }
    }

    private class MyHolder extends RecyclerView.ViewHolder {

        public MyHolder(View itemView) {
            super(itemView);
        }
    }

}
