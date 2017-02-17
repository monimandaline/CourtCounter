package com.example.android.courtcounter;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import static com.example.android.courtcounter.R.id.btn_team_a_brown;
import static com.example.android.courtcounter.R.id.btn_team_b_pink;


public class MainActivity extends AppCompatActivity {


    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreTeamA);

        final Animation animTranslate = AnimationUtils.loadAnimation(this, R.anim.anim_translate);
        final Animation animAlpha = AnimationUtils.loadAnimation(this, R.anim.anim_alpha);

        /**
         * Increase the score for Team A
         */

        //** Red button "A" team, animation and score update +1 */
        final Button btn_team_a_red = (Button) findViewById(R.id.btn_team_a_red);
        btn_team_a_red.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View v) {
                                                  ButtonAnimation(v);
                                                  scoreTeamA = scoreTeamA + 1;
                                                  displayForTeamA(scoreTeamA);
                                              }
                                          }
        );

        //** Yellow button "A" team, animation and score update +2 */
        Button btn_team_a_yellow = (Button) findViewById(R.id.btn_team_a_yellow);
        btn_team_a_yellow.setOnClickListener(new View.OnClickListener() {
                                                 @Override
                                                 public void onClick(View v) {
                                                     ButtonAnimation(v);
                                                     scoreTeamA = scoreTeamA + 2;
                                                     displayForTeamA(scoreTeamA);
                                                 }
                                             }
        );

        //** Green button "A" team, animation and score update +3 */
        Button btn_team_a_green = (Button) findViewById(R.id.btn_team_a_green);
        btn_team_a_green.setOnClickListener(new View.OnClickListener() {
                                                 @Override
                                                 public void onClick(View v) {
                                                     ButtonAnimation(v);
                                                     scoreTeamA = scoreTeamA + 3;
                                                     displayForTeamA(scoreTeamA);
                                                 }
                                             }
        );



        //** Brown button "A" team, animation and score update +4 */
        Button btn_team_a_brown = (Button) findViewById(R.id.btn_team_a_brown);
        btn_team_a_brown.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    ButtonAnimation(v);
                                                    scoreTeamA = scoreTeamA + 4;
                                                    displayForTeamA(scoreTeamA);
                                                }
                                            }
        );


        //** Blue button "A" team, animation and score update +5 */
        Button btn_team_a_blue = (Button) findViewById(R.id.btn_team_a_blue);
        btn_team_a_blue.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    ButtonAnimation(v);
                                                    scoreTeamA = scoreTeamA + 5;
                                                    displayForTeamA(scoreTeamA);
                                                }
                                            }
        );


        //** Pink button "A" team, animation and score update +6 */
        Button btn_team_a_pink = (Button) findViewById(R.id.btn_team_a_pink);
        btn_team_a_pink.setOnClickListener(new View.OnClickListener() {
                                               @Override
                                               public void onClick(View v) {
                                                   ButtonAnimation(v);
                                                   scoreTeamA = scoreTeamA + 6;
                                                   displayForTeamA(scoreTeamA);
                                               }
                                           }
        );

        //** Black button "A" team, animation and score update +7 */
        Button btn_team_a_black = (Button) findViewById(R.id.btn_team_a_black);
        btn_team_a_black.setOnClickListener(new View.OnClickListener() {
                                               @Override
                                               public void onClick(View v) {
                                                   ButtonAnimation(v);
                                                   scoreTeamA = scoreTeamA + 7;
                                                   displayForTeamA(scoreTeamA);
                                               }
                                           }
        );

        //** White button "A" team, animation and score update +4 for "B" team */
        Button btn_team_a_white = (Button) findViewById(R.id.btn_team_a_white);
        btn_team_a_white.setOnClickListener(new View.OnClickListener() {
                                               @Override
                                               public void onClick(View v) {
                                                   ButtonAnimation(v);
                                                   scoreTeamB = scoreTeamB + 4;
                                                   displayForTeamB(scoreTeamB);
                                               }
                                           }
        );

        /**
         * Increase the score for Team B
         */

        //** Red button "B" team, animation and score update +1 */
        final Button btn_team_b_red = (Button) findViewById(R.id.btn_team_b_red);
        btn_team_b_red.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View v) {
                                                  ButtonAnimation(v);
                                                  scoreTeamB = scoreTeamB + 1;
                                                  displayForTeamB(scoreTeamB);
                                              }
                                          }
        );

        //** Yellow button "B" team, animation and score update +2 */
        Button btn_team_b_yellow = (Button) findViewById(R.id.btn_team_b_yellow);
        btn_team_b_yellow.setOnClickListener(new View.OnClickListener() {
                                                 @Override
                                                 public void onClick(View v) {
                                                     ButtonAnimation(v);
                                                     scoreTeamB = scoreTeamB + 2;
                                                     displayForTeamB(scoreTeamB);
                                                 }
                                             }
        );

        //** Green button "B" team, animation and score update +3 */
        Button btn_team_b_green = (Button) findViewById(R.id.btn_team_b_green);
        btn_team_b_green.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    ButtonAnimation(v);
                                                    scoreTeamB = scoreTeamB + 3;
                                                    displayForTeamB(scoreTeamB);
                                                }
                                            }
        );



        //** Brown button "B" team, animation and score update +4 */
        Button btn_team_b_brown = (Button) findViewById(R.id.btn_team_b_brown);
        btn_team_b_brown.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    ButtonAnimation(v);
                                                    scoreTeamB = scoreTeamB + 4;
                                                    displayForTeamB(scoreTeamB);
                                                }
                                            }
        );


        //** Blue button "B" team, animation and score update +5 */
        Button btn_team_b_blue = (Button) findViewById(R.id.btn_team_b_blue);
        btn_team_b_blue.setOnClickListener(new View.OnClickListener() {
                                               @Override
                                               public void onClick(View v) {
                                                   ButtonAnimation(v);
                                                   scoreTeamB = scoreTeamB + 5;
                                                   displayForTeamB(scoreTeamB);
                                               }
                                           }
        );


        //** Pink button "B" team, animation and score update +6 */
        Button btn_team_b_pink = (Button) findViewById(R.id.btn_team_b_pink);
        btn_team_b_pink.setOnClickListener(new View.OnClickListener() {
                                               @Override
                                               public void onClick(View v) {
                                                   ButtonAnimation(v);
                                                   scoreTeamB = scoreTeamB + 6;
                                                   displayForTeamB(scoreTeamB);
                                               }
                                           }
        );

        //** Black button "B" team, animation and score update +7 */
        Button btn_team_b_black = (Button) findViewById(R.id.btn_team_b_black);
        btn_team_b_black.setOnClickListener(new View.OnClickListener() {
                                               @Override
                                               public void onClick(View v) {
                                                   ButtonAnimation(v);
                                                   scoreTeamB = scoreTeamB + 7;
                                                   displayForTeamB(scoreTeamB);
                                               }
                                           }
        );

        //** White button "B" team, animation and score update +4 for "A" team */
        Button btn_team_b_white = (Button) findViewById(R.id.btn_team_b_white);
        btn_team_b_white.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    ButtonAnimation(v);
                                                    scoreTeamA = scoreTeamA + 4;
                                                    displayForTeamA(scoreTeamA);
                                                }
                                            }
        );



        /**
         * 0 for Team A.B, Reset button
         */
        Button btn_reset = (Button) findViewById(R.id.btn_reset);
        btn_reset.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    ButtonAnimation(v);
                                                    scoreTeamA = 0;
                                                    scoreTeamB = 0;
                                                    displayForTeamA(0);
                                                    displayForTeamB(0);
                                                }
                                            }
        );

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }


    public void ButtonAnimation (View v) {

        final Animation animTranslate = AnimationUtils.loadAnimation(this, R.anim.anim_translate);
        final Animation animAlpha = AnimationUtils.loadAnimation(this, R.anim.anim_alpha);

        AnimationSet sets = new AnimationSet(false);
        sets.addAnimation(animTranslate);
        sets.addAnimation(animAlpha);
        v.startAnimation(sets);
    }
}