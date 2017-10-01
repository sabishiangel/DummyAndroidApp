package com.example.ashleytjon_hing_comp304lab2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FinalResult extends AppCompatActivity {
    public String thanks = "";
    public String name = getIntent().getStringExtra("customer");
    public String bill = getIntent().getStringExtra("finalPrice");
    public String address = getIntent().getStringExtra("address");
    public String creditcard = getIntent().getStringExtra("credit");
    public String colour = getIntent().getStringExtra("colour");
    public String guestNo= getIntent().getStringExtra("guest");
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_result);
        result = (TextView) findViewById(R.id.finaltxt);
        result.setText("Order Confirmation\n"+"Customer Name:\t" + name + "\nAddress:\t" + address + "Total Cost:\t" + bill);
    }

    public void end_click(View view){
        thanks = "Thank you for your order, " + name + "!" + "\n Your total comes to $" + bill + ", and it will be sent to " + address
                + ". It will be charged to credit card number " + creditcard
                + ". We will try out best to outfit your order in the colour " + colour + ", for your group of "
                + guestNo + " guest(s).";
        result.setText(thanks);
    }
}
