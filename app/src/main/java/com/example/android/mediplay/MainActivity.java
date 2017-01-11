package com.example.android.mediplay;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // Initialise quantity to 0
    double quantity1 = 0;


    // Value of current quantity of Crocin tablets
    public double value1(){
        return quantity1 * 1.572;
    }

    //Add 1 Crocin tablet
    public void add1(View view){
        if (quantity1 == 100){
            return;
        }
        quantity1 += 1;
        displayQuantity1(quantity1);
        displayValue1(value1());
    }

    //Remove 1 Crocin tablet
    public void remove1(View view){
        if (quantity1 == 0){
            return;
        }
        quantity1 -= 1;
        displayQuantity1(quantity1);
        displayValue1(value1());
    }

    //Displays dynamic quantity of the selected quantity of Crocin tablets
    private void displayQuantity1(double n){
        TextView quantityText1 = (TextView) findViewById(R.id.quantity_text1);
        quantityText1.setText("" + n);
    }

    //Displays dynamic value of the selected quantity of Crocin tablets
    private void displayValue1(double n){
        TextView valueText1 = (TextView) findViewById(R.id.value_text1);
        valueText1.setText("" + n);
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    double quantity2 = 0;


    public double value2(){
        return quantity2 * 11.65;
    }

    public void add2(View view){
        if (quantity2 == 100){
            return;
        }
        quantity2 += 1;
        displayQuantity2(quantity2);
        displayValue2(value2());
    }

    public void remove2(View view){
        if (quantity2 == 0){
            return;
        }
        quantity2 -= 1;
        displayQuantity2(quantity2);
        displayValue2(value2());
    }

    private void displayQuantity2(double n){
        TextView quantityText2 = (TextView) findViewById(R.id.quantity_text2);
        quantityText2.setText("" + n);
    }

    private void displayValue2(double n){
        TextView valueText2 = (TextView) findViewById(R.id.value_text2);
        valueText2.setText("" + n);
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    double quantity3 = 0;


    public double value3(){
        return quantity3 * 11.40;
    }

    public void add3(View view){
        if (quantity3 == 100){
            return;
        }
        quantity3 += 1;
        displayQuantity3(quantity3);
        displayValue3(value3());
    }

    public void remove3(View view){
        if (quantity3 == 0){
            return;
        }
        quantity3 -= 1;
        displayQuantity3(quantity3);
        displayValue3(value3());
    }

    private void displayQuantity3(double n){
        TextView quantityText3 = (TextView) findViewById(R.id.quantity_text3);
        quantityText3.setText("" + n);
    }

    private void displayValue3(double n){
        TextView valueText3 = (TextView) findViewById(R.id.value_text3);
        valueText3.setText("" + n);
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    double quantity4 = 0;


    public double value4(){
        return quantity4 * 7.541;
    }

    public void add4(View view){
        if (quantity4 == 100){
            return;
        }
        quantity4 += 1;
        displayQuantity4(quantity4);
        displayValue4(value4());
    }

    public void remove4(View view){
        if (quantity4 == 0){
            return;
        }
        quantity4 -= 1;
        displayQuantity4(quantity4);
        displayValue4(value4());
    }

    private void displayQuantity4(double n){
        TextView quantityText4 = (TextView) findViewById(R.id.quantity_text4);
        quantityText4.setText("" + n);
    }

    private void displayValue4(double n){
        TextView valueText4 = (TextView) findViewById(R.id.value_text4);
        valueText4.setText("" + n);
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    double quantity5 = 0;


    public double value5(){
        return quantity5 * 1.855;
    }

    public void add5(View view){
        if (quantity5 == 100){
            return;
        }
        quantity5 += 1;
        displayQuantity5(quantity5);
        displayValue5(value5());
    }

    public void remove5(View view){
        if (quantity5 == 0){
            return;
        }
        quantity5 -= 1;
        displayQuantity5(quantity5);
        displayValue5(value5());
    }

    private void displayQuantity5(double n){
        TextView quantityText5 = (TextView) findViewById(R.id.quantity_text5);
        quantityText5.setText("" + n);
    }

    private void displayValue5(double n){
        TextView valueText5 = (TextView) findViewById(R.id.value_text5);
        valueText5.setText("" + n);
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    double quantity6 = 0;


    public double value6(){
        return quantity6 * 4.1;
    }

    public void add6(View view){
        if (quantity6 == 100){
            return;
        }
        quantity6 += 1;
        displayQuantity6(quantity6);
        displayValue6(value6());
    }

    public void remove6(View view){
        if (quantity6 == 0){
            return;
        }
        quantity6 -= 1;
        displayQuantity6(quantity6);
        displayValue6(value6());
    }

    private void displayQuantity6(double n){
        TextView quantityText6 = (TextView) findViewById(R.id.quantity_text6);
        quantityText6.setText("" + n);
    }

    private void displayValue6(double n){
        TextView valueText6 = (TextView) findViewById(R.id.value_text6);
        valueText6.setText("" + n);
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    double quantity7 = 0;


    public double value7(){
        return quantity7 * 1.1;
    }

    public void add7(View view){
        if (quantity7 == 100){
            return;
        }
        quantity7 += 1;
        displayQuantity7(quantity7);
        displayValue7(value7());
    }

    public void remove7(View view){
        if (quantity7 == 0){
            return;
        }
        quantity7 -= 1;
        displayQuantity7(quantity7);
        displayValue7(value7());
    }

    private void displayQuantity7(double n){
        TextView quantityText7 = (TextView) findViewById(R.id.quantity_text7);
        quantityText7.setText("" + n);
    }

    private void displayValue7(double n){
        TextView valueText7 = (TextView) findViewById(R.id.value_text7);
        valueText7.setText("" + n);
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    int quantity8 = 0;


    public int value8(){
        return quantity8 * 25;
    }

    public void add8(View view){
        if (quantity8 == 100){
            return;
        }
        quantity8 += 1;
        displayQuantity8(quantity8);
        displayValue8(value8());
    }

    public void remove8(View view){
        if (quantity8 == 0){
            return;
        }
        quantity8 -= 1;
        displayQuantity8(quantity8);
        displayValue8(value8());
    }

    private void displayQuantity8(int n){
        TextView quantityText8 = (TextView) findViewById(R.id.quantity_text8);
        quantityText8.setText("" + n);
    }

    private void displayValue8(int n){
        TextView valueText8 = (TextView) findViewById(R.id.value_text8);
        valueText8.setText("" + n);
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //Submit the order
    public void submitOrder(View view){

        String theMessage = "Crocin: " + quantity1 + " x Rs. 1.572 = " + "Rs. " + value1() + "\n";
        theMessage += "Novamox: " + quantity2 + " x Rs. 11.65 = " + "Rs. " + value2() + "\n";
        theMessage += "Rablet: " + quantity3 + " x Rs. 11.40 = " + "Rs. " + value3() + "\n";
        theMessage += "Althrocin: " + quantity4 + " x Rs. 7.541 = " + "Rs. " + value4() + "\n";
        theMessage += "Ranitidine: " + quantity5 + " x Rs. 1.855 = " + "Rs. " + value5() + "\n";
        theMessage += "Coldact: " + quantity6 + " x Rs. 4.1 = " + "Rs. " + value6() + "\n";
        theMessage += "ParaRite: " + quantity7 + " x Rs. 1.1 = " + "Rs. " + value7() + "\n";
        theMessage += "KefPod: " + quantity8 + " x Rs. 25 = " + "Rs. " + value8() + "\n";
        theMessage += "Total: Rs. " + (value1() + value2() + value3() + value4() + value5() + value6() + value7() + value8()) + "\n";
        theMessage += "After 10% discount is: Rs. " + ((value1() + value2() + value3() + value4() + value5() + value6() + value7() + value8()) * .9) + "\n";
        theMessage += "You have saved us: Rs. " + ((value1() + value2() + value3() + value4() + value5() + value6() + value7() + value8()) * .1);

        Intent sendSMS = new Intent(Intent.ACTION_SENDTO);
        sendSMS.setData(Uri.parse("smsto:7795415514"));
        sendSMS.putExtra(Intent.EXTRA_TEXT, theMessage);

        if (sendSMS.resolveActivity(getPackageManager()) != null) {
            startActivity(sendSMS);
        }

        Toast.makeText(this, "App developed by Bapusaheb Patil", Toast.LENGTH_LONG).show();
    }
}
