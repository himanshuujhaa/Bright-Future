package com.example.brightfuture.X;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.brightfuture.R;
import com.example.brightfuture.ResultActivity;
import com.example.brightfuture.quiz.Quiz;
import com.example.brightfuture.quiz.QuizRepository;

import java.util.Collections;
import java.util.List;

public class ScienceQuizActivity extends AppCompatActivity {

    private TextView questionTextView;
    private RadioGroup optionsGroup;
    private Button submitButton;
    private List<Quiz> quizList;
    private int currentQuizIndex = 0;
    private int score = 0; // To store the total score

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science_quiz);

        questionTextView = findViewById(R.id.questionTextView);
        optionsGroup = findViewById(R.id.optionsGroup);
        submitButton = findViewById(R.id.submitButton);

        // Load all available quiz data
        List<Quiz> allQuizzes = QuizRepository.getScienceQuizzes();

        // Shuffle the quiz list to randomize questions
        Collections.shuffle(allQuizzes);

        // Select the first 10 questions from the shuffled list
        quizList = allQuizzes.subList(0, Math.min(10, allQuizzes.size())); // In case there are fewer than 10 questions

        // Show the first question
        loadQuiz(quizList.get(currentQuizIndex));

        // Handle submit button click
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer();
            }
        });
    }

    // Load quiz data into UI
    private void loadQuiz(Quiz quiz) {
        questionTextView.setText(quiz.getQuestion());

        // Clear previous options
        optionsGroup.removeAllViews();

        // Dynamically add RadioButtons for options
        for (String option : quiz.getOptions()) {
            RadioButton radioButton = new RadioButton(this);
            radioButton.setText(option);

            radioButton.setTextColor(getResources().getColor(android.R.color.black));

            optionsGroup.addView(radioButton);
        }
    }


    // Check if the selected answer is correct
    private void checkAnswer() {
        int selectedId = optionsGroup.getCheckedRadioButtonId();

        if (selectedId == -1) {
            Toast.makeText(this, "Please select an answer", Toast.LENGTH_SHORT).show();
            return;
        }

        RadioButton selectedRadioButton = findViewById(selectedId);
        String selectedAnswer = selectedRadioButton.getText().toString();

        // Get the correct answer for the current quiz
        String correctAnswer = quizList.get(currentQuizIndex).getCorrectAnswer();

        // Check if the answer is correct
        if (selectedAnswer.equals(correctAnswer)) {
            score += 10; // Increment score by 10 for a correct answer
            Toast.makeText(this, "Correct! +10 points", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Incorrect. The correct answer is: " + correctAnswer, Toast.LENGTH_SHORT).show();
        }

        // Move to the next question or finish the quiz
        currentQuizIndex++;
        if (currentQuizIndex < quizList.size()) {
            loadQuiz(quizList.get(currentQuizIndex));
        } else {
            // Quiz finished, show final score
            showFinalScore();
        }
    }

    // Show the final score after the quiz is finished
    private void showFinalScore() {
        String finalScoreMessage;

        if (score >= 80) {
            finalScoreMessage = "You will be good at Science";
        } else if (score >= 60 && score < 80) {
            finalScoreMessage = "You will be good at Commerce";
        } else {
            finalScoreMessage = "You will be good at Arts";
        }

        // Pass the score and result message to the ResultActivity
        Intent intent = new Intent(ScienceQuizActivity.this, ResultActivity.class);
        intent.putExtra("score", score);
        intent.putExtra("resultMessage", finalScoreMessage);
        startActivity(intent);
        finish(); // Finish the current activity
    }


}
