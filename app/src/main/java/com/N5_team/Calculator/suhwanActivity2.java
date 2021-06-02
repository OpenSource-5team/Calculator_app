package com.N5_team.Calculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class suhwanActivity2 extends AppCompatActivity {

    private TextView text1, text2, text3, text4, text5, text6, text7, text8, text9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suhwan2);

        text1 = (TextView)findViewById(R.id.result001);
        text2 = (TextView)findViewById(R.id.result002);
        text3 = (TextView)findViewById(R.id.result003);
        text4 = (TextView)findViewById(R.id.result004);
        text5 = (TextView)findViewById(R.id.result005);
        text6 = (TextView)findViewById(R.id.result006);
        text7 = (TextView)findViewById(R.id.result007);
        text8 = (TextView)findViewById(R.id.result008);
        text9 = (TextView)findViewById(R.id.result009);

        Intent i = getIntent();
        Bundle bundle = i.getExtras();
        Long AllSalary = bundle.getLong("AllSalary");
        int family = bundle.getInt("family");
        int kid = bundle.getInt("kid");

        if(AllSalary<=10000000){
            text1.setText("1,000만원 |퇴직금 별도");
            text2.setText("32,990원");
            text3.setText("22,870원");
            text4.setText("1,680원");
            text5.setText("4,760원");
            text6.setText("0원");
            text7.setText("0원");
            text8.setText("62,330원");
            text9.setText("771,033원");
        }
        else if(AllSalary<=11000000){
            text1.setText("1,100만원 |퇴직금 별도");
            text2.setText("36,380원");
            text3.setText("25,470원");
            text4.setText("1,870원");
            text5.setText("5,300원");
            text6.setText("0원");
            text7.setText("0원");
            text8.setText("69,380원");
            text9.setText("847,286원");
        }
        else if(AllSalary<=12000000){
            text1.setText("1,200만원 |퇴직금 별도");
            text2.setText("40,500원");
            text3.setText("28,080원");
            text4.setText("2,070원");
            text5.setText("5,850원");
            text6.setText("0원");
            text7.setText("0원");
            text8.setText("76,500원");
            text9.setText("923,500원");
        }
        else if(AllSalary<=15000000){
            text1.setText("1,500만원 |퇴직금 별도");
            text2.setText("51,750원");
            text3.setText("35,880원");
            text4.setText("2,640원");
            text5.setText("7,470원");
            text6.setText("3,350원");
            text7.setText("330원");
            text8.setText("101,420원");
            text9.setText("1,148,580원");
        }
        else if(AllSalary<=20000000){
            text1.setText("2,000만원 |퇴직금 별도");
            text2.setText("70,490원");
            text3.setText("48,870원");
            text4.setText("3,600원");
            text5.setText("10,180원");
            text6.setText("11,790원");
            text7.setText("1,170원");
            text8.setText("146,100원");
            text9.setText("1,520,566원");
        }
        else if(AllSalary<=25000000){
            text1.setText("2,500만원 |퇴직금 별도");
            text2.setText("89,240원");
            text3.setText("61,870원");
            text4.setText("4,560원");
            text5.setText("12,890원");
            text6.setText("22,100원");
            text7.setText("2,210원");
            text8.setText("192,870원");
            text9.setText("1,890,463원");
        }
        else if(AllSalary<=30000000){
            text1.setText("3,000만원 |퇴직금 별도");
            text2.setText("108,000원");
            text3.setText("74,880원");
            text4.setText("5,520원");
            text5.setText("15,600원");
            text6.setText("43,330원");
            text7.setText("4,330원");
            text8.setText("251,600원");
            text9.setText("2,248,340원");
        }
        else if(AllSalary<=35000000){
            text1.setText("3,500만원 |퇴직금 별도");
            text2.setText("126,740원");
            text3.setText("87,870원");
            text4.setText("6,480원");
            text5.setText("18,300원");
            text6.setText("88,120원");
            text7.setText("8,810원");
            text8.setText("336,320원");
            text9.setText("2,580,346원");
        }

        else if(AllSalary<=40000000){
            text1.setText("4,000만원 |퇴직금 별도");
            text2.setText("145,490원");
            text3.setText("100,870원");
            text4.setText("7,440원");
            text5.setText("21,010원");
            text6.setText("128,530원");
            text7.setText("12,850원");
            text8.setText("416,190원");
            text9.setText("2,917,143원");
        }
        else if(AllSalary<=45000000){
            text1.setText("4,500만원 |퇴직금 별도");
            text2.setText("164,250원");
            text3.setText("113,880원");
            text4.setText("8,400원");
            text5.setText("23,720원");
            text6.setText("182,280원");
            text7.setText("18,220원");
            text8.setText("510,750원");
            text9.setText("3,239,250원");
        }
        else if(AllSalary<=50000000){
            text1.setText("5,000만원 |퇴직금 별도");
            text2.setText("182,990원");
            text3.setText("126,870원");
            text4.setText("9,360원");
            text5.setText("26,430원");
            text6.setText("244,280원");
            text7.setText("24,420원");
            text8.setText("614,350원");
            text9.setText("3,552,316원");
        }
        else if(AllSalary<=55000000){
            text1.setText("5,500만원 |퇴직금 별도");
            text2.setText("201,740원");
            text3.setText("139,870원");
            text4.setText("10,320원");
            text5.setText("29,140원");
            text6.setText("302,720원");
            text7.setText("30,270원");
            text8.setText("714,060원");
            text9.setText("3,869,273원");
        }
        else if(AllSalary<=60000000){
            text1.setText("6,000만원 |퇴직금 별도");
            text2.setText("220,500원");
            text3.setText("152,880원");
            text4.setText("11,280원");
            text5.setText("31,850원");
            text6.setText("363,660원");
            text7.setText("36,360원");
            text8.setText("816,530원");
            text9.setText("4,183,470원");
        }
        else if(AllSalary<=65000000){
            text1.setText("6,500만원 |퇴직금 별도");
            text2.setText("239,240원");
            text3.setText("165,870원");
            text4.setText("12,240원");
            text5.setText("34,550원");
            text6.setText("422,090원");
            text7.setText("42,200원");
            text8.setText("916,190원");
            text9.setText("4,500,476원");
        }
        else if(AllSalary<=70000000){
            text1.setText("7,000만원 |퇴직금 별도");
            text2.setText("257,990원");
            text3.setText("178,870원");
            text4.setText("13,200원");
            text5.setText("37,260원");
            text6.setText("509,270원");
            text7.setText("50,920원");
            text8.setText("1,047,510원");
            text9.setText("4,785,823원");
        }
        else if(AllSalary<=75000000){
            text1.setText("7,500만원 |퇴직금 별도");
            text2.setText("276,750원");
            text3.setText("191,880원");
            text4.setText("14,160원");
            text5.setText("39,970원");
            text6.setText("628,160원");
            text7.setText("62,810원");
            text8.setText("1,213,730원");
            text9.setText("5,036,270원");
        }
        else if(AllSalary<=80000000){
            text1.setText("8,000만원 |퇴직금 별도");
            text2.setText("275,490원");
            text3.setText("204,870원");
            text4.setText("15,110원");
            text5.setText("42,680원");
            text6.setText("722,460원");
            text7.setText("72,240원");
            text8.setText("1,352,850원");
            text9.setText("5,313,816원");
        }
        else if(AllSalary<=85000000){
            text1.setText("8,500만원 |퇴직금 별도");
            text2.setText("314,240원");
            text3.setText("217,870원");
            text4.setText("16,070원");
            text5.setText("43,390원");
            text6.setText("816,750원");
            text7.setText("81,670원");
            text8.setText("1,491,990원");
            text9.setText("5,591,343원");
        }
        else if(AllSalary<=90000000){
            text1.setText("9,000만원 |퇴직금 별도");
            text2.setText("333,000원");
            text3.setText("230,880원");
            text4.setText("17,030원");
            text5.setText("48,100원");
            text6.setText("911,050원");
            text7.setText("91,100원");
            text8.setText("1,631,160원");
            text9.setText("5,868,840원");
        }
        else if(AllSalary<=95000000){
            text1.setText("9,500만원 |퇴직금 별도");
            text2.setText("351,740원");
            text3.setText("243,870원");
            text4.setText("17,990원");
            text5.setText("50,800원");
            text6.setText("1,005,350원");
            text7.setText("100,530원");
            text8.setText("1,770,280원");
            text9.setText("6,146,386원");
        }
        else if(AllSalary<=100000000){
            text1.setText("10,000만원 |퇴직금 별도");
            text2.setText("370,490원");
            text3.setText("256,870원");
            text4.setText("18,950원");
            text5.setText("53,510원");
            text6.setText("1,099,650원");
            text7.setText("109,960원");
            text8.setText("1,909,430원");
            text9.setText("6,423,903원");
        }
        else if(AllSalary<=105000000){
            text1.setText("10,500만원 |퇴직금 별도");
            text2.setText("389,250원");
            text3.setText("269,880원");
            text4.setText("19,910원");
            text5.setText("56,220원");
            text6.setText("1,196,220원");
            text7.setText("119,620원");
            text8.setText("2,051,100원");
            text9.setText("6,698,900원");
        }
        else if(AllSalary<=110000000){
            text1.setText("11,000만원 |퇴직금 별도");
            text2.setText("407,990원");
            text3.setText("282,870원");
            text4.setText("20,870원");
            text5.setText("58,930원");
            text6.setText("1,298,190원");
            text7.setText("129,810원");
            text8.setText("2,198,660원");
            text9.setText("6,968,006원");
        }
        else if(AllSalary<=115000000){
            text1.setText("11,500만원 |퇴직금 별도");
            text2.setText("426,740원");
            text3.setText("295,870원");
            text4.setText("21,830원");
            text5.setText("61,640원");
            text6.setText("1,440,090원");
            text7.setText("144,000원");
            text8.setText("2,390,170원");
            text9.setText("7,193,163원");
        }
        else if(AllSalary<=120000000){
            text1.setText("12,000만원 |퇴직금 별도");
            text2.setText("445,500원");
            text3.setText("308,880원");
            text4.setText("22,790원");
            text5.setText("64,350원");
            text6.setText("1,581,980원");
            text7.setText("158,190원");
            text8.setText("2,581,690원");
            text9.setText("7,418,310원");
        }
        else if(AllSalary<=125000000){
            text1.setText("12,500만원 |퇴직금 별도");
            text2.setText("464,240원");
            text3.setText("321,870원");
            text4.setText("23,750원");
            text5.setText("67,050원");
            text6.setText("1,832,340원");
            text7.setText("183,230원");
            text8.setText("2,892,480원");
            text9.setText("7,524,186원");
        }
        else if(AllSalary<=130000000){
            text1.setText("13,000만원 |퇴직금 별도");
            text2.setText("482,990원");
            text3.setText("334,870원");
            text4.setText("24,710원");
            text5.setText("69,760원");
            text6.setText("1,974,960원");
            text7.setText("197,490원");
            text8.setText("3,084,780원");
            text9.setText("7,748,553원");
        }
        else if(AllSalary<=135000000){
            text1.setText("13,500만원 |퇴직금 별도");
            text2.setText("501,750원");
            text3.setText("347,880원");
            text4.setText("25,670원");
            text5.setText("72,470원");
            text6.setText("2,117,580원");
            text7.setText("211,750원");
            text8.setText("3,277,100원");
            text9.setText("7,972,900원");
        }
        else if(AllSalary<=140000000){
            text1.setText("14,000만원 |퇴직금 별도");
            text2.setText("520,490원");
            text3.setText("360,870원");
            text4.setText("26,630원");
            text5.setText("75,180원");
            text6.setText("2,260,210원");
            text7.setText("226,020원");
            text8.setText("3,469,400원");
            text9.setText("8,197,266원");
        }
        else if(AllSalary<=145000000){
            text1.setText("14,500만원 |퇴직금 별도");
            text2.setText("539,240원");
            text3.setText("373,870원");
            text4.setText("27,590원");
            text5.setText("77,890원");
            text6.setText("2,402,830원");
            text7.setText("240,280원");
            text8.setText("3,661,700원");
            text9.setText("8,421,633원");
        }
        else{
            text1.setText("15,000만원 |퇴직금 별도");
            text2.setText("558,000원");
            text3.setText("386,880원");
            text4.setText("28,550원");
            text5.setText("80,600원");
            text6.setText("2,545,450원");
            text7.setText("254,540원");
            text8.setText("3,854,020원");
            text9.setText("8,645,980원");
        }



        Button buttonreturn1 = (Button) findViewById(R.id.buttonreturn);
        buttonreturn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(suhwanActivity2.this, suhwanActivity.class);
                startActivity(intent);
            }
        });

        Button buttonhome1 = (Button) findViewById(R.id.buttonhome);
        buttonhome1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(suhwanActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });//
    }


}
