package app.example.com.mapdemo.activity;

import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintSet;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.Button;

import app.example.com.mapdemo.R;

public class MainActivity extends AppCompatActivity {

    ConstraintSet constraintSet, constraintSet2;
    private boolean change = false;
    Button button;
    ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        constraintLayout = (ConstraintLayout) findViewById(R.id.constraint);
        constraintSet = new ConstraintSet();
        constraintSet.clone(constraintLayout);
        constraintSet2 = new ConstraintSet();
        constraintSet2.clone(this, R.layout.activity_main_alt);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TransitionManager manager = new TransitionManager();
                ConstraintSet constraint = new ConstraintSet();

                manager.beginDelayedTransition(constraintLayout);
                if (change) {
                    constraint = constraintSet;

                } else {
                    constraint = constraintSet2;
                }
                constraint.applyTo(constraintLayout);
            }
        });

    }
}
