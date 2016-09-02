package zhaowenyun.doallwishes.xian;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import fragment.F_Fujin;
import fragment.F_Home;
import fragment.F_Myinfo;
import fragment.F_Myshop;
import utils.Default;
import utils.Log;
import utils.Utils;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tv_home;
    private TextView tv_fujin;
    private TextView tv_myshop;
    private TextView tv_myinfo;
    private List<Fragment> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        //默认加载第一个Fragment
        Utils.replace(this, list.get(0));
        //用户登录状态当前可获取
        Log.d("当前用户状态:" + Default.userLoginState);
        //获取定位信息
        getLocationInfos();
    }

    private void getLocationInfos() {

    }

    private void initView() {

        tv_home = (TextView) findViewById(R.id.tv_home);
        tv_home.setOnClickListener(this);
        tv_fujin = (TextView) findViewById(R.id.tv_fujin);
        tv_fujin.setOnClickListener(this);
        tv_myshop = (TextView) findViewById(R.id.tv_myshop);
        tv_myshop.setOnClickListener(this);
        tv_myinfo = (TextView) findViewById(R.id.tv_myinfo);
        tv_myinfo.setOnClickListener(this);
        list.add(new F_Home());
        list.add(new F_Fujin());
        list.add(new F_Myshop());
        list.add(new F_Myinfo());

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_home:
                if (!list.get(0).isVisible()) {
                    Utils.replace(this, list.get(0));
                }
                break;
            case R.id.tv_fujin:
                if (!list.get(1).isVisible()) {
                    Utils.replace(this, list.get(1));
                }
                break;
            case R.id.tv_myshop:
                if (!list.get(2).isVisible()) {
                    Utils.replace(this, list.get(2));
                }
                break;
            case R.id.tv_myinfo:
                if (!list.get(3).isVisible()) {
                    Utils.replace(this, list.get(3));
                }
                break;

        }
    }
}
