package my.edu.tarc.loancalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String LOANPAYMENT = "payment";
    public static final String LOANSTATUS = "status";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        public void calculateLoan(View view) {
            String status = "Approve";
            double monthlyPayment = 450.00;

            Intent intent = new Intent(this,ResultActivity.class);


            intent.putExtra(LOANSTATUS,status);
            intent.putExtra(LOANPAYMENT,monthlyPayment);

            startActivity(intent);

        }
}
