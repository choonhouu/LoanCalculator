package my.edu.tarc.loancalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        String status = intent.getStringExtra(MainActivity.LOANSTATUS);
        double payment = intent.getDoubleExtra(MainActivity.LOANPAYMENT,0);
    }

    public void closeActivity(View view){
        finish();
    }
}
