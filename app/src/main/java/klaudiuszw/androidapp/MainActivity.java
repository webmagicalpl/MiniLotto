package klaudiuszw.androidapp;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    private TextView mFirstBall, mSecondBall, mThirdBall, mFourthBall, mFifthBall;
    private Button mGenerateButton;

    private String [] Balls  = {
            "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12",
            "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23",
            "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35",
            "36", "37", "38", "39", "40", "41", "42"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindViews();
        generateRandomBalls();

        mGenerateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                generateRandomBalls();
            }
        });
    }

    public void generateRandomBalls(){
        Collections.shuffle(Arrays.asList(Balls));
        mFirstBall.setText(Balls[0]);
        mSecondBall.setText(Balls[1]);
        mThirdBall.setText(Balls[2]);
        mFourthBall.setText(Balls[3]);
        mFifthBall.setText(Balls[4]);

    }

    public void bindViews(){
        mFirstBall = (TextView)findViewById(R.id.firstBall);
        mSecondBall = (TextView)findViewById(R.id.secondBall);
        mThirdBall = (TextView)findViewById(R.id.thirdBall);
        mFourthBall = (TextView)findViewById(R.id.fourthBall);
        mFifthBall = (TextView)findViewById(R.id.fifthBall);
        mGenerateButton = (Button)findViewById(R.id.losujButton);
    }
}