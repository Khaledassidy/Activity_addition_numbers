

//awal she 3ashen 2e2dar 2et3mela ma3 l views bel activity lezm 2obotoun b file java w metl ma 2olna mnesta3mel l id la ne2dar norbotoun w ne2dar n8ayer attribute b2alb l views
//la norbout l view mnetsa3mel function esma   findViewById() bte5od id le howe le bade 2orbotoun fe w l output ta3ela 3onsour bas generit type le howe <T>
// findViewById() wazefet hay l function bta3mel inflate lal view lal 3onsour inflate: ma3neta t7awel l 3osnour mn xml la code java ya3ne(xml to object java) byaerja3 object mn nafs no3 ya3ne 3mlt inflate la button byerja3 object mn no3 button 3ashen 2e2dar et7akam bel attribute ta3el l view ba3mel inflate
//ana ma3mel inflate nel create method 3atoul
//  EditText editText1= findViewById(R.id.number1); mtl ma 2olt ana ba3ml inflate bel create method bas barke ana bade esta3ml heed l 3onour b matra7 tene fa la 23ml l 3onsour public b3arfo bel class fo2 w ta7t ba3mlo inflate
//EditText editText1= findViewById(R.id.number1); hayde 7awaleto la object java la heda l edit text mn 5elele 3amlye esma (parse)




//note 3atoul 2awl she ba3mel inflate la kel l views 3ande b 2aye activity ba3mela




package com.example.activityadditionnumbers;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class calculate extends AppCompatActivity {
    EditText editText1;
    EditText editText2;
    Button calculate;
    TextView result;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);

        //hala2 hay l activity l esma calculate iza sha8lt l application ma7a tbyen l2no mana sheshe ra2seye sheshe l 2asaseye heye l mainactivity
        //bas fene 8ayer w 7ot l calculate heye l shshe l ra2seye mn file l manifist



        //inflate of views
       editText1= findViewById(R.id.number1);
       editText2=findViewById(R.id.number2);
       calculate=findViewById(R.id.calculate);
       result=findViewById(R.id.Result);


       //5ale l button ta3mel action ya3ne bas yed8alt 3al button l user sho yseer fe 2 method la hay sha8le

        //first method:
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //bektob l code le bado yetnafaz ba3d ma ed8alt houn


                String number1 = editText1.getText().toString();//7ayjeble l nous l mawjoud b l edit text 1 bas l methkle heed l gettext() beroud output object mn no3 editable fa ma byemshe l 7al ma 7ayerdelak nous la tezabat bt7ot tostring()
                String number2 = editText2.getText().toString();//7ayjeble l nous l mawjoud b l edit text 2 bas l methkle heed l gettext() beroud output object mn no3 editable fa ma byemshe l 7al ma 7ayerdelak nous la tezabat bt7ot tostring()

                //from string to integer useing parse 3amlyet l parse ta7wel nous la ra2m
                //"10"->10  "10.5"->10.5
                //hala2 ana bade 7awel la integer:so Integer.parseInt() law bade double  Double.parseDouble() law bade float...
                int num1 = Integer.parseInt(number1);
                int num2 = Integer.parseInt(number2);

                //result
                int sum = num1 + num2;

                //set the result to textview
                result.setText("Result: "+sum);
            }
        });



        //second method using lamda expression:
        /*calculate.setOnClickListener(v -> {
            //bektob l code le bado yetnafaz ba3d ma ed8alt houn


            String number1 = editText1.getText().toString();//7ayjeble l nous l mawjoud b l edit text 1 bas l methkle heed l gettext() beroud output object mn no3 editable fa ma byemshe l 7al ma 7ayerdelak nous la tezabat bt7ot tostring()
            String number2 = editText2.getText().toString();//7ayjeble l nous l mawjoud b l edit text 2 bas l methkle heed l gettext() beroud output object mn no3 editable fa ma byemshe l 7al ma 7ayerdelak nous la tezabat bt7ot tostring()

            from string to integer useing parse 3amlyet l parse ta7wel nous la ra2m
            "10"->10  "10.5"->10.5
            hala2 ana bade 7awel la integer:so Integer.parseInt() law bade double  Double.parseDouble() law bade float...
            int num1 = Integer.parseInt(number1);
            int num2 = Integer.parseInt(number2);

            result
            int sum = num1 + num2;

            set the result to textview
            result.setText("Result: "+sum);

        });*/




    }
}