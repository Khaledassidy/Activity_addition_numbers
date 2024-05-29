/* Android commponent:Activity_Service_content provider_broadcast reciver*/

//Activity heye mokawane mn sha8lten l design(xml),file l code(java)
//backward comptability eno hal hay l activity badak yeha teb3a lal support library wala lal sdk (version l android nafsa)



package com.example.activityadditionnumbers; //hedd l ana ketbo ta7t java 3ashen elo eno howe heed l file ween mawjoud b 2aye package 3mlt import androidx.appcompat.app.AppCompatActivity;



import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;                              /*haw satren acwedoun
                                                         mawjouden ta7t msta3mlen
                                                         fa rou7 3mel eloun import
                                                         3ashen 2e2dar 2a3mel access
                                                         la 2eloun keef l scanner 3ashen
                                                         esta3mela ba3mel import nafs she
                                                              */







public class MainActivity extends AppCompatActivity {  // MainActivity extends AppCompatActivity(ya3ne l mainactivity 3emel extend mn class esmo AppCompatActivity,( AppCompatActivity:3ebara 3an class mawjoud mn 2abl heye l activity l bt5ale l app y2ale3 ya3ne l MainActivity l 3am 2a3mlo heed mano activity 3am esnshe2a mn sefr la2 howe activity 3am testa3mel activity tenye bas 3am t3asel 3al 5asa2es ta3ela l heye l appcomat
                                                       //Base class for activities that wish to use some of the newer platform features on older Android devices. ya3ne feture jdede bas maktobe b code 2adem ya3ne btemshe 3al telephonet 2ademe
                                                       //Note that every activity that extends this class has to be themed with Theme.AppCompat or a theme that extends that theme.
    @Override
    protected void onCreate(Bundle savedInstanceState) { /*awal she mawjoud b2alb heed l class l howe main activity function esma on create bas hay l method mawjoude bel apppcomapat bas ne7na stad3yneha w 3melna 3lyha ovverried l on create heye 2awl sha8le byestad3eha system bas yeshte8l l app hay l function bte5od parameter esmo bundle ya3ne 7ezme mn7ot b2alba she */
        super.onCreate(savedInstanceState);  //  super.onCreate(savedInstanceState); super heye bedel 3ala object mn l ab heye method mawjoude 3nd l ab l howe appcompatactivity
        setContentView(R.layout.activity_main);//super.onCreate(savedInstanceState); ma3neta abl ma testad3e dele le 3end l ebn l heye  setContentView(R.layout.activity_main); stad3e hay l method 3end l ab le heye l system byesd3eha 2awl ma yeshte8l l app w metl ma mna3ref super btesd3a awl she 3atoul abl kel she
        /* setContentView(R.layout.activity_main);hye function esma setContentView() bte5od parameter 3ebara 3an id wl id howe integer

        kel 3ensour commponent b2alb l l xml lezm ykoun 3ando id lesh 3ashen 2e2dar 2orbto b malaf l java fa mn 5elel l id
        be2dar 2estad3e b malaf java w 2et3emal ma3o ka code ya3ne la n2ol 3ana button bel design keef bade jebo 3a malaf java w 2e2dar 2etfe3al ma3o ya3ne 5ale bas yokbous ya3mel she hal button fa 2alolak heda l button 3ando id bta3yetlo mn 5elele l id w btet3emla ma3o w lezm ma yetkarar kel commponent 3ando id uniqe
        fa houn 3ashen ye2daro yerbto malaf java b malaf design l howe xml mn 5elel l id ta3et l activity (R.layout.activity_main:3ebara 3an id ta3et l design)

        setContentView(R.layout.activity_main); kamen 2ana houn 3am 2ool eno heed malaf java howe la hyda l activity le esma main activity




        */

    }


}