package com.example.ashleytjon_hing_comp304lab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CustomerActivity extends AppCompatActivity {
    private TextView name;
    private TextView addr;
    private TextView cred;
    private TextView col;
    private TextView guest;
    private String totalPrice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer);

        totalPrice = getIntent().getStringExtra("message");
        name = (TextView) findViewById(R.id.nameEdit);
        addr = (TextView) findViewById(R.id.addrEdit);
        cred = (TextView) findViewById(R.id.credEdit);
        col = (TextView) findViewById(R.id.colEdit);
        guest = (TextView) findViewById(R.id.guestEdit);
        if(name.length()==0)
        {
            name.requestFocus();
            name.setError("Field CANNOT be empty.");
        }
        if(addr.length()==0)
        {
            addr.requestFocus();
            addr.setError("Field CANNOT be empty.");
        }
        if(cred.length()!=16)
        {
            cred.requestFocus();
            cred.setError("Number must be 16 digits in length.");
        }

    }

    public void back_button(View view){
        this.finish();
    }

    public void final_bttn(View view){
        if(guest.length()==0)
        {
            guest.setText("1");
        }
        if(col.length()==0)
        {
            col.setText("you might like");
        }
        Intent intent = new Intent(this, FinalResult.class);
        intent.putExtra("finalPrice", totalPrice);
        intent.putExtra("customer", name.getText());
        intent.putExtra("address", addr.getText());
        intent.putExtra("credit", cred.getText());
        intent.putExtra("colour", col.getText());
        intent.putExtra("guest", guest.getText());
        startActivity(intent);
    }
}
