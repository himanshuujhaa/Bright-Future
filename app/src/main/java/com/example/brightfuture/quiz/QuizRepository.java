package com.example.brightfuture.quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuizRepository {

    // Returns a list of quizzes
    public static List<Quiz> getXScienceQuizzes() {
        List<Quiz> quizzes = new ArrayList<>();

        // Question 1
        List<String> options1 = new ArrayList<>();
        options1.add("14");
        options1.add("21");
        options1.add("49");
        options1.add("56");
        quizzes.add(new Quiz("What is the value of 7^2?", options1, "49"));

        // Question 2
        List<String> options2 = new ArrayList<>();
        options2.add("90 degrees");
        options2.add("180 degrees");
        options2.add("360 degrees");
        options2.add("270 degrees");
        quizzes.add(new Quiz("The sum of the angles in a triangle is?", options2, "180 degrees"));

        // Question 3
        List<String> options3 = new ArrayList<>();
        options3.add("154 cm²");
        options3.add("144 cm²");
        options3.add("100 cm²");
        options3.add("200 cm²");
        quizzes.add(new Quiz("What is the area of a circle with a radius of 7 cm? (Use π=22/7)", options3, "154 cm²"));

        // Question 4
        List<String> options4 = new ArrayList<>();
        options4.add("7");
        options4.add("8");
        options4.add("6");
        options4.add("4");
        quizzes.add(new Quiz("If x + 3 = 10, then x is:", options4, "7"));

        // Question 5
        List<String> options5 = new ArrayList<>();
        options5.add("20");
        options5.add("60");
        options5.add("120");
        options5.add("100");
        quizzes.add(new Quiz("What is the value of 5! (5 factorial)?", options5, "120"));

        // Question 6
        List<String> options6 = new ArrayList<>();
        options6.add("(3, 4, 5)");
        options6.add("(5, 6, 7)");
        options6.add("(1, 2, 3)");
        options6.add("(2, 3, 4)");
        quizzes.add(new Quiz("Which of the following is a Pythagorean triplet?", options6, "(3, 4, 5)"));

        // Question 7
        List<String> options7 = new ArrayList<>();
        options7.add("6");
        options7.add("-6");
        options7.add("5");
        options7.add("-5");
        quizzes.add(new Quiz("The product of the roots of the quadratic equation x² - 5x + 6 = 0 is:", options7, "6"));

        // Question 8
        List<String> options8 = new ArrayList<>();
        options8.add("15");
        options8.add("21");
        options8.add("17");
        options8.add("25");
        quizzes.add(new Quiz("Which of the following is a prime number?", options8, "17"));

        // Question 9
        List<String> options9 = new ArrayList<>();
        options9.add("2");
        options9.add("3");
        options9.add("-2");
        options9.add("-3");
        quizzes.add(new Quiz("The slope of a line represented by the equation y = 2x + 3 is:", options9, "2"));

        // Question 10
        List<String> options10 = new ArrayList<>();
        options10.add("30 cm");
        options10.add("25 cm");
        options10.add("50 cm");
        options10.add("40 cm");
        quizzes.add(new Quiz("What is the perimeter of a rectangle with length 10 cm and width 5 cm?", options10, "30 cm"));

        // Question 11
        List<String> options11 = new ArrayList<>();
        options11.add("34/4");
        options11.add("14/4");
        options11.add("12/2");
        options11.add("13/3");
        quizzes.add(new Quiz("If the probability of an event occurring is 14 1/4, what is the probability of it not occurring?", options11, "34/4"));

        // Question 12
        List<String> options12 = new ArrayList<>();
        options12.add("10");
        options12.add("12");
        options12.add("14");
        options12.add("16");
        quizzes.add(new Quiz("What is the value of √144?", options12, "12"));

        // Question 13
        List<String> options13 = new ArrayList<>();
        options13.add("32");
        options13.add("35");
        options13.add("30");
        options13.add("28");
        quizzes.add(new Quiz("In an arithmetic progression (AP), if the first term is 5 and the common difference is 3, what is the 10th term?", options13, "32"));

        // Question 14
        List<String> options14 = new ArrayList<>();
        options14.add("28");
        options14.add("20");
        options14.add("25");
        options14.add("30");
        quizzes.add(new Quiz("The sum of the first 5 prime numbers is:", options14, "28"));

        // Question 15
        List<String> options15 = new ArrayList<>();
        options15.add("x² + y² = 25");
        options15.add("y = 3x + 1");
        options15.add("x³ + y = 0");
        options15.add("xy = 10");
        quizzes.add(new Quiz("Which of the following represents a linear equation?", options15, "y = 3x + 1"));

        // Question 16
        List<String> options16 = new ArrayList<>();
        options16.add("9 cm³");
        options16.add("27 cm³");
        options16.add("18 cm³");
        options16.add("30 cm³");
        quizzes.add(new Quiz("What is the volume of a cube with a side length of 3 cm?", options16, "27 cm³"));

        // Question 17
        List<String> options17 = new ArrayList<>();
        options17.add("Equilateral");
        options17.add("Isosceles");
        options17.add("Scalene");
        options17.add("Right");
        quizzes.add(new Quiz("If the sides of a triangle are 3 cm, 4 cm, and 5 cm, what type of triangle is it?", options17, "Right"));

        // Question 18
        List<String> options18 = new ArrayList<>();
        options18.add("5");
        options18.add("4");
        options18.add("3");
        options18.add("2");
        quizzes.add(new Quiz("The distance between the points (2, 3) and (5, 7) is:", options18, "5"));

        // Question 19
        List<String> options19 = new ArrayList<>();
        options19.add("0");
        options19.add("1");
        options19.add("undefined");
        options19.add("45");
        quizzes.add(new Quiz("What is the value of tan(45°)?", options19, "1"));

        // Question 20
        List<String> options20 = new ArrayList<>();
        options20.add("3 cm");
        options20.add("4 cm");
        options20.add("5 cm");
        options20.add("6 cm");
        quizzes.add(new Quiz("In a right-angled triangle, if one angle is 30 degrees and the hypotenuse is 10 cm, what is the length of the opposite side?", options20, "5 cm"));

        // Question 21
        List<String> options21 = new ArrayList<>();
        options21.add("-3");
        options21.add("-6");
        options21.add("3");
        options21.add("0");
        quizzes.add(new Quiz("The roots of the equation x² + 6x + 9 = 0 are:", options21, "-3"));

        // Question 22
        List<String> options22 = new ArrayList<>();
        options22.add("Straight line");
        options22.add("Circle");
        options22.add("Parabola");
        options22.add("Hyperbola");
        quizzes.add(new Quiz("The graph of a quadratic function is a:", options22, "Parabola"));

        // Question 23
        List<String> options23 = new ArrayList<>();
        options23.add("31.4 cm");
        options23.add("28 cm");
        options23.add("25 cm");
        options23.add("20 cm");
        quizzes.add(new Quiz("What is the circumference of a circle with a diameter of 10 cm? (Use π=3.14)", options23, "31.4 cm"));

        // Question 24
        List<String> options24 = new ArrayList<>();
        options24.add("13");
        options24.add("11");
        options24.add("9");
        options24.add("8");
        quizzes.add(new Quiz("If a=2 and b=3, what is the value of a² + b²?", options24, "13"));

        // Question 25
        List<String> options25 = new ArrayList<>();
        options25.add("90 degrees");
        options25.add("180 degrees");
        options25.add("30 degrees");
        options25.add("45 degrees");
        quizzes.add(new Quiz("The angle between the hour and minute hand of a clock at 3:00 is:", options25, "90 degrees"));

        quizzes.add(new Quiz("What is the chemical formula of water?",
                Arrays.asList("a) H2O", "b) CO2", "c) O2", "d) H2"), "a) H2O"));

        quizzes.add(new Quiz("Which of the following is a non-renewable source of energy?",
                Arrays.asList("a) Solar energy", "b) Wind energy", "c) Coal", "d) Biomass"), "c) Coal"));

        quizzes.add(new Quiz("The unit of force in the International System of Units (SI) is:",
                Arrays.asList("a) Joule", "b) Newton", "c) Pascal", "d) Watt"), "b) Newton"));

        quizzes.add(new Quiz("What is the process by which plants make their own food called?",
                Arrays.asList("a) Respiration", "b) Photosynthesis", "c) Fermentation", "d) Digestion"), "b) Photosynthesis"));

        quizzes.add(new Quiz("Which of the following is a type of friction?",
                Arrays.asList("a) Static friction", "b) Kinetic friction", "c) Rolling friction", "d) All of the above"), "d) All of the above"));

        quizzes.add(new Quiz("What is the main function of red blood cells?",
                Arrays.asList("a) To fight infections", "b) To transport oxygen", "c) To clot blood", "d) To produce hormones"), "b) To transport oxygen"));

        quizzes.add(new Quiz("Which organ is responsible for filtering blood in the human body?",
                Arrays.asList("a) Heart", "b) Liver", "c) Kidney", "d) Lungs"), "c) Kidney"));

        quizzes.add(new Quiz("What type of bond is formed when two atoms share electrons?",
                Arrays.asList("a) Ionic bond", "b) Covalent bond", "c) Metallic bond", "d) Hydrogen bond"), "b) Covalent bond"));

        quizzes.add(new Quiz("The smallest unit of an element that retains its properties is called:",
                Arrays.asList("a) Molecule", "b) Atom", "c) Ion", "d) Compound"), "b) Atom"));

        quizzes.add(new Quiz("Which of the following is a greenhouse gas?",
                Arrays.asList("a) Oxygen", "b) Nitrogen", "c) Carbon dioxide", "d) Hydrogen"), "c) Carbon dioxide"));

        quizzes.add(new Quiz("In which part of the plant does photosynthesis primarily take place?",
                Arrays.asList("a) Roots", "b) Stem", "c) Leaves", "d) Flowers"), "c) Leaves"));

        quizzes.add(new Quiz("What is the pH value of a neutral solution?",
                Arrays.asList("a) 0", "b) 7", "c) 14", "d) 5"), "b) 7"));

        quizzes.add(new Quiz("Which gas is produced during photosynthesis?",
                Arrays.asList("a) Oxygen", "b) Carbon dioxide", "c) Nitrogen", "d) Hydrogen"), "a) Oxygen"));

        quizzes.add(new Quiz("The force of attraction between two masses is called:",
                Arrays.asList("a) Gravitational force", "b) Electromagnetic force", "c) Nuclear force", "d) Frictional force"), "a) Gravitational force"));

        quizzes.add(new Quiz("Which of the following is a renewable source of energy?",
                Arrays.asList("a) Natural gas", "b) Wind energy", "c) Nuclear energy", "d) Fossil fuels"), "b) Wind energy"));

        quizzes.add(new Quiz("What is the boiling point of water at standard atmospheric pressure?",
                Arrays.asList("a) 50°C", "b) 100°C", "c) 150°C", "d) 200°C"), "b) 100°C"));

        quizzes.add(new Quiz("Which organelle is known as the powerhouse of the cell?",
                Arrays.asList("a) Nucleus", "b) Ribosome", "c) Mitochondria", "d) Chloroplast"), "c) Mitochondria"));

        quizzes.add(new Quiz("The change of state from liquid to gas is called:",
                Arrays.asList("a) Condensation", "b) Evaporation", "c) Sublimation", "d) Freezing"), "b) Evaporation"));

        quizzes.add(new Quiz("What is the main component of the Earth's atmosphere?",
                Arrays.asList("a) Oxygen", "b) Carbon dioxide", "c) Nitrogen", "d) Argon"), "c) Nitrogen"));

        quizzes.add(new Quiz("Which part of the brain is responsible for coordination and balance?",
                Arrays.asList("a) Cerebrum", "b) Cerebellum", "c) Brainstem", "d) Thalamus"), "b) Cerebellum"));

        quizzes.add(new Quiz("The formula for calculating speed is:",
                Arrays.asList("a) Distance × Time", "b) Distance / Time", "c) Time / Distance", "d) Distance + Time"), "b) Distance / Time"));

        quizzes.add(new Quiz("Which of the following is a characteristic of metals?",
                Arrays.asList("a) Brittle", "b) Good conductors of heat and electricity", "c) Dull appearance", "d) Low density"), "b) Good conductors of heat and electricity"));

        quizzes.add(new Quiz("Which type of energy is stored in food?",
                Arrays.asList("a) Kinetic energy", "b) Potential energy", "c) Chemical energy", "d) Thermal energy"), "c) Chemical energy"));

        quizzes.add(new Quiz("What is the primary function of the small intestine?",
                Arrays.asList("a) To absorb nutrients", "b) To digest food", "c) To filter blood", "d) To store waste"), "a) To absorb nutrients"));

        quizzes.add(new Quiz("What type of reaction occurs when an acid reacts with a base?",
                Arrays.asList("a) Oxidation", "b) Reduction", "c) Neutralization", "d) Hydrolysis"), "c) Neutralization"));

        // English Quiz
        quizzes.add(new Quiz("Who is the author of 'The Diary of a Young Girl'?",
                Arrays.asList("a) Anne Frank", "b) Mark Twain", "c) J.K. Rowling", "d) George Orwell"), "a) Anne Frank"));

        quizzes.add(new Quiz("What is the main theme of the poem 'If—' by Rudyard Kipling?",
                Arrays.asList("a) Success and failure", "b) Love and friendship", "c) War and peace", "d) Nature and beauty"), "a) Success and failure"));

        quizzes.add(new Quiz("In Shakespeare's play 'Romeo and Juliet,' what are the names of the two feuding families?",
                Arrays.asList("a) Montague and Capulet", "b) Capulet and Veron", "c) Montague and Mercutio", "d) Capulet and Paris"), "a) Montague and Capulet"));

        quizzes.add(new Quiz("Which literary device involves giving human traits to non-human entities?",
                Arrays.asList("a) Metaphor", "b) Personification", "c) Simile", "d) Alliteration"), "b) Personification"));

        quizzes.add(new Quiz("What is the primary purpose of a thesis statement in an essay?",
                Arrays.asList("a) To entertain", "b) To summarize", "c) To present the main argument", "d) To conclude"), "c) To present the main argument"));

        quizzes.add(new Quiz("In the story 'The Necklace,' what does Madame Loisel lose?",
                Arrays.asList("a) A ring", "b) A necklace", "c) A bracelet", "d) A pair of earrings"), "b) A necklace"));

        quizzes.add(new Quiz("Which of the following is an example of an oxymoron?",
                Arrays.asList("a) Bitter sweet", "b) Tall short", "c) Bright darkness", "d) Fast slow"), "a) Bitter sweet"));

        quizzes.add(new Quiz("In 'The Adventures of Tom Sawyer,' what is Tom's greatest adventure?",
                Arrays.asList("a) Finding treasure", "b) Running away from home", "c) Going to school", "d) Witnessing a murder"), "a) Finding treasure"));

        quizzes.add(new Quiz("What is a synonym for 'benevolent'?",
                Arrays.asList("a) Kind", "b) Evil", "c) Indifferent", "d) Angry"), "a) Kind"));

        quizzes.add(new Quiz("Which figure of speech compares two unlike things using 'like' or 'as'?",
                Arrays.asList("a) Metaphor", "b) Simile", "c) Hyperbole", "d) Personification"), "b) Simile"));

        quizzes.add(new Quiz("What is the setting of the novel 'To Kill a Mockingbird'?",
                Arrays.asList("a) Maycomb, Alabama", "b) New York City", "c) London", "d) Boston"), "a) Maycomb, Alabama"));

        quizzes.add(new Quiz("What does the term 'theme' refer to in literature?",
                Arrays.asList("a) The main character", "b) The underlying message", "c) The plot", "d) The setting"), "b) The underlying message"));

        quizzes.add(new Quiz("Which of the following is an example of alliteration?",
                Arrays.asList("a) She sells sea shells by the sea shore", "b) The wind whispered softly", "c) The sun shone brightly", "d) Time flies"), "a) She sells sea shells by the sea shore"));

        quizzes.add(new Quiz("In which genre of literature would you typically find a plot twist?",
                Arrays.asList("a) Romance", "b) Mystery", "c) Biography", "d) Poetry"), "b) Mystery"));

        quizzes.add(new Quiz("What is the primary function of a conclusion in an essay?",
                Arrays.asList("a) To introduce new ideas", "b) To summarize and close the argument", "c) To provide evidence", "d) To present the thesis"), "b) To summarize and close the argument"));

        quizzes.add(new Quiz("In poetry, a 'stanza' is equivalent to a:",
                Arrays.asList("a) Sentence", "b) Paragraph", "c) Chapter", "d) Line"), "b) Paragraph"));

        quizzes.add(new Quiz("Which of the following is a classic novel written by F. Scott Fitzgerald?",
                Arrays.asList("a) The Great Gatsby", "b) 1984", "c) Moby Dick", "d) Pride and Prejudice"), "a) The Great Gatsby"));

        quizzes.add(new Quiz("What type of poem is typically 14 lines long?",
                Arrays.asList("a) Haiku", "b) Limerick", "c) Sonnet", "d) Ode"), "c) Sonnet"));

        quizzes.add(new Quiz("In 'Pride and Prejudice', who is Elizabeth Bennet's love interest?",
                Arrays.asList("a) Mr. Collins", "b) Mr. Darcy", "c) Mr. Wickham", "d) Mr. Bingley"), "b) Mr. Darcy"));

        quizzes.add(new Quiz("What is the main conflict in 'The Catcher in the Rye'?",
                Arrays.asList("a) Man vs. nature", "b) Man vs. society", "c) Man vs. himself", "d) Man vs. fate"), "c) Man vs. himself"));


        return quizzes;
    }

    public static List<Quiz> getXCommerceQuizzes() {
        List<Quiz> quizzes = new ArrayList<>();

        // Question 1
        List<String> options1 = new ArrayList<>();
        options1.add("Pause in a sentence");
        options1.add("Poetry");
        options1.add("Title");
        options1.add("End of a sentence");
        quizzes.add(new Quiz("When is punctuation used?", options1, "End of a sentence"));

        // Question 2
        List<String> options2 = new ArrayList<>();
        options2.add("Kavi Naresh");
        options2.add("Kavi Hemant");
        options2.add("Kavi Mahesh");
        options2.add("Kavi Kailash");
        quizzes.add(new Quiz("Who wrote 'Saraswati'?", options2, "Kavi Naresh"));

        // Question 3
        List<String> options3 = new ArrayList<>();
        options3.add("Song");
        options3.add("Novel");
        options3.add("Play");
        options3.add("Poem");
        quizzes.add(new Quiz("What does the word 'Kavya' mean?", options3, "Poem"));

        // Question 4
        List<String> options4 = new ArrayList<>();
        options4.add("Kantidas");
        options4.add("Narsinh Mehta");
        options4.add("Manibhai");
        options4.add("A poet from South India");
        quizzes.add(new Quiz("Who is considered the father of Gujarati literature?", options4, "Narsinh Mehta"));

        // Question 5
        List<String> options5 = new ArrayList<>();
        options5.add("Education");
        options5.add("Tradition");
        options5.add("Thought");
        options5.add("Music");
        quizzes.add(new Quiz("What is the meaning of 'Samskar'?", options5, "Tradition"));

        // Question 6
        List<String> options6 = new ArrayList<>();
        options6.add("Dog");
        options6.add("Tiger");
        options6.add("Wild animal");
        options6.add("Fish");
        quizzes.add(new Quiz("What does 'Harina' mean?", options6, "Wild animal"));

        // Question 7
        List<String> options7 = new ArrayList<>();
        options7.add("Creation of poetry");
        options7.add("Approach to thought");
        options7.add("Beauty of language");
        options7.add("Literary equality");
        quizzes.add(new Quiz("What is the importance of 'Alankaran' in poetry?", options7, "Beauty of language"));

        // Question 8
        List<String> options8 = new ArrayList<>();
        options8.add("Sun");
        options8.add("Cloud");
        options8.add("Sky");
        options8.add("Horizon");
        quizzes.add(new Quiz("What is a synonym for 'Akash' in Gujarati?", options8, "Sky"));

        // Question 9
        List<String> options9 = new ArrayList<>();
        options9.add("A devotee");
        options9.add("A poet");
        options9.add("A text");
        options9.add("A historian");
        quizzes.add(new Quiz("Who was 'Tulsidas'?", options9, "A poet"));

        // Question 10
        List<String> options10 = new ArrayList<>();
        options10.add("Shankar");
        options10.add("Narsinh Mehta");
        options10.add("Kabir");
        options10.add("Rabindranath Tagore");
        quizzes.add(new Quiz("Who is the author of the poem 'Vaisnav Jan To'?", options10, "Narsinh Mehta"));

        // Question 11
        List<String> options11 = new ArrayList<>();
        options11.add("Incomplete");
        options11.add("Complete");
        options11.add("Inappropriate");
        options11.add("Wrong");
        quizzes.add(new Quiz("What does the word 'Samyak' mean?", options11, "Complete"));

        // Question 12
        List<String> options12 = new ArrayList<>();
        options12.add("Thoughts");
        options12.add("Opinion");
        options12.add("Approach");
        options12.add("Knowledge");
        quizzes.add(new Quiz("What is the meaning of 'Abhipray'?", options12, "Opinion"));

        // Question 13
        List<String> options13 = new ArrayList<>();
        options13.add("Beautiful");
        options13.add("Weak");
        options13.add("Ugly");
        options13.add("Magnificent");
        quizzes.add(new Quiz("What is the antonym of 'Sundar'?", options13, "Ugly"));

        // Question 14
        List<String> options14 = new ArrayList<>();
        options14.add("Lamp");
        options14.add("Devotee");
        options14.add("Disciple");
        options14.add("Ascetic");
        quizzes.add(new Quiz("What does 'Tapsvi' mean?", options14, "Ascetic"));

        // Question 15
        List<String> options15 = new ArrayList<>();
        options15.add("River");
        options15.add("Water");
        options15.add("Pond");
        options15.add("Lake");
        quizzes.add(new Quiz("What does 'Jal' mean?", options15, "Water"));

        // Question 16
        List<String> options16 = new ArrayList<>();
        options16.add("Folk tale");
        options16.add("Literature");
        options16.add("Music");
        options16.add("Imagination");
        quizzes.add(new Quiz("What is poetry referred to as?", options16, "Literature"));

        // Question 17
        List<String> options17 = new ArrayList<>();
        options17.add("Leadership");
        options17.add("Truthfulness");
        options17.add("Religion");
        options17.add("Competence");
        quizzes.add(new Quiz("What does 'Naitikta' mean?", options17, "Truthfulness"));

        // Question 18
        List<String> options18 = new ArrayList<>();
        options18.add("Vision");
        options18.add("Example");
        options18.add("Lack of vision");
        options18.add("Visionary");
        quizzes.add(new Quiz("What does 'Drashti' mean?", options18, "Vision"));

        // Question 19
        List<String> options19 = new ArrayList<>();
        options19.add("Language");
        options19.add("Reality");
        options19.add("Creativity");
        options19.add("Composition");
        quizzes.add(new Quiz("What is the significance of 'Shabd' (word)?", options19, "Language"));

        // Question 20
        List<String> options20 = new ArrayList<>();
        options20.add("Teaching");
        options20.add("Knowledge");
        options20.add("Study");
        options20.add("Curriculum");
        quizzes.add(new Quiz("What does 'Shikshan' mean?", options20, "Teaching"));

        // Question 21
        List<String> options21 = new ArrayList<>();
        options21.add("Sorrow");
        options21.add("Pain");
        options21.add("Hatred");
        options21.add("Severity");
        quizzes.add(new Quiz("What is the antonym of 'Prem'?", options21, "Hatred"));

        // Question 22
        List<String> options22 = new ArrayList<>();
        options22.add("Poetry");
        options22.add("Story");
        options22.add("Song");
        options22.add("Narrative");
        quizzes.add(new Quiz("What does 'Gatha' mean?", options22, "Story"));

        // Question 23
        List<String> options23 = new ArrayList<>();
        options23.add("Sanskrit");
        options23.add("Hindi");
        options23.add("Gujarati");
        options23.add("English");
        quizzes.add(new Quiz("In which language is 'Dev' referenced?", options23, "Sanskrit"));

        // Question 24
        List<String> options24 = new ArrayList<>();
        options24.add("Old");
        options24.add("New ideas");
        options24.add("Wealth");
        options24.add("Tradition");
        quizzes.add(new Quiz("What does 'Aadhunikta' mean?", options24, "New ideas"));

        // Question 25
        List<String> options25 = new ArrayList<>();
        options25.add("Respect");
        options25.add("Insult");
        options25.add("Indifference");
        options25.add("Disregard");
        quizzes.add(new Quiz("What is the antonym of 'Aadar'?", options25, "Insult"));

        List<String> options26 = new ArrayList<>();
        options26.add("Right to Property");
        options26.add("Right to Equality");
        options26.add("Right to Work");
        options26.add("Right to Education");
        quizzes.add(new Quiz("Which of the following is a fundamental right in India?", options26, "Right to Equality"));

        // Question 3
        List<String> options27 = new ArrayList<>();
        options27.add("1912");
        options27.add("1914");
        options27.add("1916");
        options27.add("1918");
        quizzes.add(new Quiz("The First World War began in which year?", options27, "1914"));

        // Question 4
        List<String> options28 = new ArrayList<>();
        options28.add("USA and Japan");
        options28.add("USA and USSR");
        options28.add("China and India");
        options28.add("France and Germany");
        quizzes.add(new Quiz("The term 'Cold War' refers to the tension between which two groups?", options28, "USA and USSR"));

        // Question 5
        List<String> options29 = new ArrayList<>();
        options29.add("1885");
        options29.add("1905");
        options29.add("1915");
        options29.add("1920");
        quizzes.add(new Quiz("The Indian National Congress was founded in which year?", options29, "1885"));

        // Question 6
        List<String> options30 = new ArrayList<>();
        options30.add("Industrial growth");
        options30.add("Agricultural productivity");
        options30.add("Urban development");
        options30.add("Environmental conservation");
        quizzes.add(new Quiz("What does the term 'Green Revolution' refer to?", options30, "Agricultural productivity"));

        // Question 7
        List<String> options31 = new ArrayList<>();
        options31.add("Article 15");
        options31.add("Article 17");
        options31.add("Article 21");
        options31.add("Article 25");
        quizzes.add(new Quiz("Which article of the Indian Constitution provides for the abolition of untouchability?", options31, "Article 17"));

        // Question 8
        List<String> options32 = new ArrayList<>();
        options32.add("Sardar Patel");
        options32.add("Jawaharlal Nehru");
        options32.add("Mahatma Gandhi");
        options32.add("Lal Bahadur Shastri");
        quizzes.add(new Quiz("Who was the first Prime Minister of India?", options32, "Jawaharlal Nehru"));

        // Question 9
        List<String> options33 = new ArrayList<>();
        options33.add("Mumbai");
        options33.add("Kolkata");
        options33.add("New Delhi");
        options33.add("Bengaluru");
        quizzes.add(new Quiz("What is the capital of India?", options33, "New Delhi"));

        // Question 10
        List<String> options34 = new ArrayList<>();
        options34.add("1915");
        options34.add("1919");
        options34.add("1920");
        options34.add("1930");
        quizzes.add(new Quiz("The 'Rowlatt Act' was enacted in which year?", options34, "1919"));

        // Question 11
        List<String> options35 = new ArrayList<>();
        options35.add("Non-Cooperation Movement");
        options35.add("Civil Disobedience Movement");
        options35.add("Quit India Movement");
        options35.add("Salt March");
        quizzes.add(new Quiz("Which movement was launched by Mahatma Gandhi in 1920?", options35, "Non-Cooperation Movement"));

        // Question 12
        List<String> options36 = new ArrayList<>();
        options36.add("January 1, 1950");
        options36.add("January 26, 1950");
        options36.add("March 15, 1950");
        options36.add("August 15, 1947");
        quizzes.add(new Quiz("The Constitution of India came into effect on which date?", options36, "January 26, 1950"));

        // Question 13
        List<String> options37 = new ArrayList<>();
        options37.add("Centralization of power");
        options37.add("Division of powers");
        options37.add("Unitary system");
        options37.add("Single-tier government");
        quizzes.add(new Quiz("Which of the following is a feature of a federal government?", options37, "Division of powers"));

        // Question 14
        List<String> options38 = new ArrayList<>();
        options38.add("Urban development");
        options38.add("Rural employment");
        options38.add("Industrial growth");
        options38.add("Educational reform");
        quizzes.add(new Quiz("What is the primary objective of the 'Mahatma Gandhi National Rural Employment Guarantee Act (MGNREGA)'?", options38, "Rural employment"));

        // Question 15
        List<String> options39 = new ArrayList<>();
        options39.add("France");
        options39.add("USA");
        options39.add("England");
        options39.add("Germany");
        quizzes.add(new Quiz("The Industrial Revolution began in which country?", options39, "England"));

        // Question 16
        List<String> options40 = new ArrayList<>();
        options40.add("B.R. Ambedkar");
        options40.add("Mahatma Gandhi");
        options40.add("Jawaharlal Nehru");
        options40.add("Sardar Patel");
        quizzes.add(new Quiz("Who is known as the 'Father of the Indian Constitution'?", options40, "B.R. Ambedkar"));

        // Question 17
        List<String> options41 = new ArrayList<>();
        options41.add("Battle of Plassey");
        options41.add("Battle of Buxar");
        options41.add("Battle of Panipat");
        options41.add("Battle of Haldighati");
        quizzes.add(new Quiz("Which battle marked the beginning of British rule in India?", options41, "Battle of Plassey"));

        // Question 18
        List<String> options42 = new ArrayList<>();
        options42.add("1920");
        options42.add("1930");
        options42.add("1942");
        options42.add("1947");
        quizzes.add(new Quiz("The 'Civil Disobedience Movement' was launched in which year?", options42, "1930"));

        // Question 19
        List<String> options43 = new ArrayList<>();
        options43.add("Solar energy");
        options43.add("Wind energy");
        options43.add("Coal");
        options43.add("Biomass");
        quizzes.add(new Quiz("Which of the following is a non-renewable resource?", options43, "Coal"));

        // Question 20
        List<String> options44 = new ArrayList<>();
        options44.add("1945");
        options44.add("1950");
        options44.add("1960");
        options44.add("1970");
        quizzes.add(new Quiz("The United Nations was established in which year?", options44, "1945"));

        // Question 21
        List<String> options45 = new ArrayList<>();
        options45.add("High Court");
        options45.add("Supreme Court");
        options45.add("District Court");
        options45.add("Tribunal");
        quizzes.add(new Quiz("Which is the highest judicial authority in India?", options45, "Supreme Court"));

        // Question 22
        List<String> options46 = new ArrayList<>();
        options46.add("Non-violent resistance");
        options46.add("Armed rebellion");
        options46.add("Silent protest");
        options46.add("Economic boycott");
        quizzes.add(new Quiz("The term 'Satyagraha' means:", options46, "Non-violent resistance"));

        // Question 23
        List<String> options47 = new ArrayList<>();
        options47.add("Single party rule");
        options47.add("Free and fair elections");
        options47.add("Centralized power");
        options47.add("Limited citizen participation");
        quizzes.add(new Quiz("Which is a main feature of democracy?", options47, "Free and fair elections"));

        // Question 24
        List<String> options48 = new ArrayList<>();
        options48.add("Taxation");
        options48.add("Loans");
        options48.add("Foreign aid");
        options48.add("Investments");
        quizzes.add(new Quiz("Which is the main source of income for the government of India?", options48, "Taxation"));

        // Question 25
        List<String> options49 = new ArrayList<>();
        options49.add("1920s");
        options49.add("1930s");
        options49.add("1940s");
        options49.add("1950s");
        quizzes.add(new Quiz("The Great Depression occurred in which decade?", options49, "1930s"));

        // Question 26
        List<String> options50 = new ArrayList<>();
        options50.add("Bhagat Singh");
        options50.add("Subhas Chandra Bose");
        options50.add("Rajendra Prasad");
        options50.add("Sardar Vallabhbhai Patel");
        quizzes.add(new Quiz("Who was the leader of the Indian National Army (INA)?", options50, "Subhas Chandra Bose"));

        List<String> options51 = new ArrayList<>();
        options51.add("14");
        options51.add("21");
        options51.add("49");
        options51.add("56");
        quizzes.add(new Quiz("What is the value of 7^2?", options51, "49"));

        // Question 2
        List<String> options52 = new ArrayList<>();
        options52.add("90 degrees");
        options52.add("180 degrees");
        options52.add("360 degrees");
        options52.add("270 degrees");
        quizzes.add(new Quiz("The sum of the angles in a triangle is?", options52, "180 degrees"));

        // Question 3
        List<String> options53 = new ArrayList<>();
        options53.add("154 cm²");
        options53.add("144 cm²");
        options53.add("100 cm²");
        options53.add("200 cm²");
        quizzes.add(new Quiz("What is the area of a circle with a radius of 7 cm? (Use π=22/7)", options53, "154 cm²"));

        // Question 4
        List<String> options54 = new ArrayList<>();
        options54.add("7");
        options54.add("8");
        options54.add("6");
        options54.add("4");
        quizzes.add(new Quiz("If x + 3 = 10, then x is:", options54, "7"));

        // Question 5
        List<String> options55 = new ArrayList<>();
        options55.add("20");
        options55.add("60");
        options55.add("120");
        options55.add("100");
        quizzes.add(new Quiz("What is the value of 5! (5 factorial)?", options55, "120"));

        // Question 6
        List<String> options56 = new ArrayList<>();
        options56.add("(3, 4, 5)");
        options56.add("(5, 6, 7)");
        options56.add("(1, 2, 3)");
        options56.add("(2, 3, 4)");
        quizzes.add(new Quiz("Which of the following is a Pythagorean triplet?", options56, "(3, 4, 5)"));

        // Question 7
        List<String> options57 = new ArrayList<>();
        options57.add("6");
        options57.add("-6");
        options57.add("5");
        options57.add("-5");
        quizzes.add(new Quiz("The product of the roots of the quadratic equation x² - 5x + 6 = 0 is:", options57, "6"));

        // Question 8
        List<String> options58 = new ArrayList<>();
        options58.add("15");
        options58.add("21");
        options58.add("17");
        options58.add("25");
        quizzes.add(new Quiz("Which of the following is a prime number?", options58, "17"));

        // Question 9
        List<String> options59 = new ArrayList<>();
        options59.add("2");
        options59.add("3");
        options59.add("-2");
        options59.add("-3");
        quizzes.add(new Quiz("The slope of a line represented by the equation y = 2x + 3 is:", options59, "2"));

        // Question 10
        List<String> options60 = new ArrayList<>();
        options60.add("30 cm");
        options60.add("25 cm");
        options60.add("50 cm");
        options60.add("40 cm");
        quizzes.add(new Quiz("What is the perimeter of a rectangle with length 10 cm and width 5 cm?", options60, "30 cm"));

        // Question 11
        List<String> options61 = new ArrayList<>();
        options61.add("34/4");
        options61.add("14/4");
        options61.add("12/2");
        options61.add("13/3");
        quizzes.add(new Quiz("If the probability of an event occurring is 14 1/4, what is the probability of it not occurring?", options61, "34/4"));

        // Question 12
        List<String> options62 = new ArrayList<>();
        options62.add("10");
        options62.add("12");
        options62.add("14");
        options62.add("16");
        quizzes.add(new Quiz("What is the value of √144?", options62, "12"));

        // Question 13
        List<String> options63 = new ArrayList<>();
        options63.add("32");
        options63.add("35");
        options63.add("30");
        options63.add("28");
        quizzes.add(new Quiz("In an arithmetic progression (AP), if the first term is 5 and the common difference is 3, what is the 10th term?", options63, "32"));

        // Question 14
        List<String> options64 = new ArrayList<>();
        options64.add("28");
        options64.add("20");
        options64.add("25");
        options64.add("30");
        quizzes.add(new Quiz("The sum of the first 5 prime numbers is:", options64, "28"));

        // Question 15
        List<String> options65 = new ArrayList<>();
        options65.add("x² + y² = 25");
        options65.add("y = 3x + 1");
        options65.add("x³ + y = 0");
        options65.add("xy = 10");
        quizzes.add(new Quiz("Which of the following represents a linear equation?", options65, "y = 3x + 1"));

        // Question 16
        List<String> options66 = new ArrayList<>();
        options66.add("9 cm³");
        options66.add("27 cm³");
        options66.add("18 cm³");
        options66.add("30 cm³");
        quizzes.add(new Quiz("What is the volume of a cube with a side length of 3 cm?", options66, "27 cm³"));

        // Question 17
        List<String> options67 = new ArrayList<>();
        options67.add("Equilateral");
        options67.add("Isosceles");
        options67.add("Scalene");
        options67.add("Right");
        quizzes.add(new Quiz("If the sides of a triangle are 3 cm, 4 cm, and 5 cm, what type of triangle is it?", options67, "Right"));

        // Question 18
        List<String> options68 = new ArrayList<>();
        options68.add("5");
        options68.add("4");
        options68.add("3");
        options68.add("2");
        quizzes.add(new Quiz("The distance between the points (2, 3) and (5, 7) is:", options68, "5"));

        // Question 19
        List<String> options69 = new ArrayList<>();
        options69.add("0");
        options69.add("1");
        options69.add("undefined");
        options69.add("45");
        quizzes.add(new Quiz("What is the value of tan(45°)?", options69, "1"));

        // Question 20
        List<String> options70 = new ArrayList<>();
        options70.add("3 cm");
        options70.add("4 cm");
        options70.add("5 cm");
        options70.add("6 cm");
        quizzes.add(new Quiz("In a right-angled triangle, if one angle is 30 degrees and the hypotenuse is 10 cm, what is the length of the opposite side?", options70, "5 cm"));

        // Question 21
        List<String> options71 = new ArrayList<>();
        options71.add("-3");
        options71.add("-6");
        options71.add("3");
        options71.add("0");
        quizzes.add(new Quiz("The roots of the equation x² + 6x + 9 = 0 are:", options71, "-3"));

        // Question 22
        List<String> options72 = new ArrayList<>();
        options72.add("Straight line");
        options72.add("Circle");
        options72.add("Parabola");
        options72.add("Hyperbola");
        quizzes.add(new Quiz("The graph of a quadratic function is a:", options72, "Parabola"));

        // Question 23
        List<String> options73 = new ArrayList<>();
        options73.add("31.4 cm");
        options73.add("28 cm");
        options73.add("25 cm");
        options73.add("20 cm");
        quizzes.add(new Quiz("What is the circumference of a circle with a diameter of 10 cm? (Use π=3.14)", options73, "31.4 cm"));

        // Question 24
        List<String> options74 = new ArrayList<>();
        options74.add("13");
        options74.add("11");
        options74.add("9");
        options74.add("8");
        quizzes.add(new Quiz("If a=2 and b=3, what is the value of a² + b²?", options74, "13"));

        // Question 25
        List<String> options75 = new ArrayList<>();
        options75.add("90 degrees");
        options75.add("180 degrees");
        options75.add("30 degrees");
        options75.add("45 degrees");
        quizzes.add(new Quiz("The angle between the hour and minute hand of a clock at 3:00 is:", options75, "90 degrees"));

        quizzes.add(new Quiz("Who is the author of 'The Diary of a Young Girl'?",
                Arrays.asList("a) Anne Frank", "b) Mark Twain", "c) J.K. Rowling", "d) George Orwell"), "a) Anne Frank"));

        quizzes.add(new Quiz("What is the main theme of the poem 'If—' by Rudyard Kipling?",
                Arrays.asList("a) Success and failure", "b) Love and friendship", "c) War and peace", "d) Nature and beauty"), "a) Success and failure"));

        quizzes.add(new Quiz("In Shakespeare's play 'Romeo and Juliet,' what are the names of the two feuding families?",
                Arrays.asList("a) Montague and Capulet", "b) Capulet and Veron", "c) Montague and Mercutio", "d) Capulet and Paris"), "a) Montague and Capulet"));

        quizzes.add(new Quiz("Which literary device involves giving human traits to non-human entities?",
                Arrays.asList("a) Metaphor", "b) Personification", "c) Simile", "d) Alliteration"), "b) Personification"));

        quizzes.add(new Quiz("What is the primary purpose of a thesis statement in an essay?",
                Arrays.asList("a) To entertain", "b) To summarize", "c) To present the main argument", "d) To conclude"), "c) To present the main argument"));

        quizzes.add(new Quiz("In the story 'The Necklace,' what does Madame Loisel lose?",
                Arrays.asList("a) A ring", "b) A necklace", "c) A bracelet", "d) A pair of earrings"), "b) A necklace"));

        quizzes.add(new Quiz("Which of the following is an example of an oxymoron?",
                Arrays.asList("a) Bitter sweet", "b) Tall short", "c) Bright darkness", "d) Fast slow"), "a) Bitter sweet"));

        quizzes.add(new Quiz("In 'The Adventures of Tom Sawyer,' what is Tom's greatest adventure?",
                Arrays.asList("a) Finding treasure", "b) Running away from home", "c) Going to school", "d) Witnessing a murder"), "a) Finding treasure"));

        quizzes.add(new Quiz("What is a synonym for 'benevolent'?",
                Arrays.asList("a) Kind", "b) Evil", "c) Indifferent", "d) Angry"), "a) Kind"));

        quizzes.add(new Quiz("Which figure of speech compares two unlike things using 'like' or 'as'?",
                Arrays.asList("a) Metaphor", "b) Simile", "c) Hyperbole", "d) Personification"), "b) Simile"));

        quizzes.add(new Quiz("What is the setting of the novel 'To Kill a Mockingbird'?",
                Arrays.asList("a) Maycomb, Alabama", "b) New York City", "c) London", "d) Boston"), "a) Maycomb, Alabama"));

        quizzes.add(new Quiz("What does the term 'theme' refer to in literature?",
                Arrays.asList("a) The main character", "b) The underlying message", "c) The plot", "d) The setting"), "b) The underlying message"));

        quizzes.add(new Quiz("Which of the following is an example of alliteration?",
                Arrays.asList("a) She sells sea shells by the sea shore", "b) The wind whispered softly", "c) The sun shone brightly", "d) Time flies"), "a) She sells sea shells by the sea shore"));

        quizzes.add(new Quiz("In which genre of literature would you typically find a plot twist?",
                Arrays.asList("a) Romance", "b) Mystery", "c) Biography", "d) Poetry"), "b) Mystery"));

        quizzes.add(new Quiz("What is the primary function of a conclusion in an essay?",
                Arrays.asList("a) To introduce new ideas", "b) To summarize and close the argument", "c) To provide evidence", "d) To present the thesis"), "b) To summarize and close the argument"));

        quizzes.add(new Quiz("In poetry, a 'stanza' is equivalent to a:",
                Arrays.asList("a) Sentence", "b) Paragraph", "c) Chapter", "d) Line"), "b) Paragraph"));

        quizzes.add(new Quiz("Which of the following is a classic novel written by F. Scott Fitzgerald?",
                Arrays.asList("a) The Great Gatsby", "b) 1984", "c) Moby Dick", "d) Pride and Prejudice"), "a) The Great Gatsby"));

        quizzes.add(new Quiz("What type of poem is typically 14 lines long?",
                Arrays.asList("a) Haiku", "b) Limerick", "c) Sonnet", "d) Ode"), "c) Sonnet"));

        quizzes.add(new Quiz("In 'Pride and Prejudice', who is Elizabeth Bennet's love interest?",
                Arrays.asList("a) Mr. Collins", "b) Mr. Darcy", "c) Mr. Wickham", "d) Mr. Bingley"), "b) Mr. Darcy"));

        quizzes.add(new Quiz("What is the main conflict in 'The Catcher in the Rye'?",
                Arrays.asList("a) Man vs. nature", "b) Man vs. society", "c) Man vs. himself", "d) Man vs. fate"), "c) Man vs. himself"));

        return quizzes;
    }


    public static List<Quiz> getXArtsQuizzes() {
        List<Quiz> quizzes = new ArrayList<>();

        // Question 1
        List<String> options1 = new ArrayList<>();
        options1.add("Pause in a sentence");
        options1.add("Poetry");
        options1.add("Title");
        options1.add("End of a sentence");
        quizzes.add(new Quiz("When is punctuation used?", options1, "End of a sentence"));

        // Question 2
        List<String> options2 = new ArrayList<>();
        options2.add("Kavi Naresh");
        options2.add("Kavi Hemant");
        options2.add("Kavi Mahesh");
        options2.add("Kavi Kailash");
        quizzes.add(new Quiz("Who wrote 'Saraswati'?", options2, "Kavi Naresh"));

        // Question 3
        List<String> options3 = new ArrayList<>();
        options3.add("Song");
        options3.add("Novel");
        options3.add("Play");
        options3.add("Poem");
        quizzes.add(new Quiz("What does the word 'Kavya' mean?", options3, "Poem"));

        // Question 4
        List<String> options4 = new ArrayList<>();
        options4.add("Kantidas");
        options4.add("Narsinh Mehta");
        options4.add("Manibhai");
        options4.add("A poet from South India");
        quizzes.add(new Quiz("Who is considered the father of Gujarati literature?", options4, "Narsinh Mehta"));

        // Question 5
        List<String> options5 = new ArrayList<>();
        options5.add("Education");
        options5.add("Tradition");
        options5.add("Thought");
        options5.add("Music");
        quizzes.add(new Quiz("What is the meaning of 'Samskar'?", options5, "Tradition"));

        // Question 6
        List<String> options6 = new ArrayList<>();
        options6.add("Dog");
        options6.add("Tiger");
        options6.add("Wild animal");
        options6.add("Fish");
        quizzes.add(new Quiz("What does 'Harina' mean?", options6, "Wild animal"));

        // Question 7
        List<String> options7 = new ArrayList<>();
        options7.add("Creation of poetry");
        options7.add("Approach to thought");
        options7.add("Beauty of language");
        options7.add("Literary equality");
        quizzes.add(new Quiz("What is the importance of 'Alankaran' in poetry?", options7, "Beauty of language"));

        // Question 8
        List<String> options8 = new ArrayList<>();
        options8.add("Sun");
        options8.add("Cloud");
        options8.add("Sky");
        options8.add("Horizon");
        quizzes.add(new Quiz("What is a synonym for 'Akash' in Gujarati?", options8, "Sky"));

        // Question 9
        List<String> options9 = new ArrayList<>();
        options9.add("A devotee");
        options9.add("A poet");
        options9.add("A text");
        options9.add("A historian");
        quizzes.add(new Quiz("Who was 'Tulsidas'?", options9, "A poet"));

        // Question 10
        List<String> options10 = new ArrayList<>();
        options10.add("Shankar");
        options10.add("Narsinh Mehta");
        options10.add("Kabir");
        options10.add("Rabindranath Tagore");
        quizzes.add(new Quiz("Who is the author of the poem 'Vaisnav Jan To'?", options10, "Narsinh Mehta"));

        // Question 11
        List<String> options11 = new ArrayList<>();
        options11.add("Incomplete");
        options11.add("Complete");
        options11.add("Inappropriate");
        options11.add("Wrong");
        quizzes.add(new Quiz("What does the word 'Samyak' mean?", options11, "Complete"));

        // Question 12
        List<String> options12 = new ArrayList<>();
        options12.add("Thoughts");
        options12.add("Opinion");
        options12.add("Approach");
        options12.add("Knowledge");
        quizzes.add(new Quiz("What is the meaning of 'Abhipray'?", options12, "Opinion"));

        // Question 13
        List<String> options13 = new ArrayList<>();
        options13.add("Beautiful");
        options13.add("Weak");
        options13.add("Ugly");
        options13.add("Magnificent");
        quizzes.add(new Quiz("What is the antonym of 'Sundar'?", options13, "Ugly"));

        // Question 14
        List<String> options14 = new ArrayList<>();
        options14.add("Lamp");
        options14.add("Devotee");
        options14.add("Disciple");
        options14.add("Ascetic");
        quizzes.add(new Quiz("What does 'Tapsvi' mean?", options14, "Ascetic"));

        // Question 15
        List<String> options15 = new ArrayList<>();
        options15.add("River");
        options15.add("Water");
        options15.add("Pond");
        options15.add("Lake");
        quizzes.add(new Quiz("What does 'Jal' mean?", options15, "Water"));

        // Question 16
        List<String> options16 = new ArrayList<>();
        options16.add("Folk tale");
        options16.add("Literature");
        options16.add("Music");
        options16.add("Imagination");
        quizzes.add(new Quiz("What is poetry referred to as?", options16, "Literature"));

        // Question 17
        List<String> options17 = new ArrayList<>();
        options17.add("Leadership");
        options17.add("Truthfulness");
        options17.add("Religion");
        options17.add("Competence");
        quizzes.add(new Quiz("What does 'Naitikta' mean?", options17, "Truthfulness"));

        // Question 18
        List<String> options18 = new ArrayList<>();
        options18.add("Vision");
        options18.add("Example");
        options18.add("Lack of vision");
        options18.add("Visionary");
        quizzes.add(new Quiz("What does 'Drashti' mean?", options18, "Vision"));

        // Question 19
        List<String> options19 = new ArrayList<>();
        options19.add("Language");
        options19.add("Reality");
        options19.add("Creativity");
        options19.add("Composition");
        quizzes.add(new Quiz("What is the significance of 'Shabd' (word)?", options19, "Language"));

        // Question 20
        List<String> options20 = new ArrayList<>();
        options20.add("Teaching");
        options20.add("Knowledge");
        options20.add("Study");
        options20.add("Curriculum");
        quizzes.add(new Quiz("What does 'Shikshan' mean?", options20, "Teaching"));

        // Question 21
        List<String> options21 = new ArrayList<>();
        options21.add("Sorrow");
        options21.add("Pain");
        options21.add("Hatred");
        options21.add("Severity");
        quizzes.add(new Quiz("What is the antonym of 'Prem'?", options21, "Hatred"));

        // Question 22
        List<String> options22 = new ArrayList<>();
        options22.add("Poetry");
        options22.add("Story");
        options22.add("Song");
        options22.add("Narrative");
        quizzes.add(new Quiz("What does 'Gatha' mean?", options22, "Story"));

        // Question 23
        List<String> options23 = new ArrayList<>();
        options23.add("Sanskrit");
        options23.add("Hindi");
        options23.add("Gujarati");
        options23.add("English");
        quizzes.add(new Quiz("In which language is 'Dev' referenced?", options23, "Sanskrit"));

        // Question 24
        List<String> options24 = new ArrayList<>();
        options24.add("Old");
        options24.add("New ideas");
        options24.add("Wealth");
        options24.add("Tradition");
        quizzes.add(new Quiz("What does 'Aadhunikta' mean?", options24, "New ideas"));

        // Question 25
        List<String> options25 = new ArrayList<>();
        options25.add("Respect");
        options25.add("Insult");
        options25.add("Indifference");
        options25.add("Disregard");
        quizzes.add(new Quiz("What is the antonym of 'Aadar'?", options25, "Insult"));

        List<String> options26 = new ArrayList<>();
        options26.add("Right to Property");
        options26.add("Right to Equality");
        options26.add("Right to Work");
        options26.add("Right to Education");
        quizzes.add(new Quiz("Which of the following is a fundamental right in India?", options26, "Right to Equality"));

        // Question 3
        List<String> options27 = new ArrayList<>();
        options27.add("1912");
        options27.add("1914");
        options27.add("1916");
        options27.add("1918");
        quizzes.add(new Quiz("The First World War began in which year?", options27, "1914"));

        // Question 4
        List<String> options28 = new ArrayList<>();
        options28.add("USA and Japan");
        options28.add("USA and USSR");
        options28.add("China and India");
        options28.add("France and Germany");
        quizzes.add(new Quiz("The term 'Cold War' refers to the tension between which two groups?", options28, "USA and USSR"));

        // Question 5
        List<String> options29 = new ArrayList<>();
        options29.add("1885");
        options29.add("1905");
        options29.add("1915");
        options29.add("1920");
        quizzes.add(new Quiz("The Indian National Congress was founded in which year?", options29, "1885"));

        // Question 6
        List<String> options30 = new ArrayList<>();
        options30.add("Industrial growth");
        options30.add("Agricultural productivity");
        options30.add("Urban development");
        options30.add("Environmental conservation");
        quizzes.add(new Quiz("What does the term 'Green Revolution' refer to?", options30, "Agricultural productivity"));

        // Question 7
        List<String> options31 = new ArrayList<>();
        options31.add("Article 15");
        options31.add("Article 17");
        options31.add("Article 21");
        options31.add("Article 25");
        quizzes.add(new Quiz("Which article of the Indian Constitution provides for the abolition of untouchability?", options31, "Article 17"));

        // Question 8
        List<String> options32 = new ArrayList<>();
        options32.add("Sardar Patel");
        options32.add("Jawaharlal Nehru");
        options32.add("Mahatma Gandhi");
        options32.add("Lal Bahadur Shastri");
        quizzes.add(new Quiz("Who was the first Prime Minister of India?", options32, "Jawaharlal Nehru"));

        // Question 9
        List<String> options33 = new ArrayList<>();
        options33.add("Mumbai");
        options33.add("Kolkata");
        options33.add("New Delhi");
        options33.add("Bengaluru");
        quizzes.add(new Quiz("What is the capital of India?", options33, "New Delhi"));

        // Question 10
        List<String> options34 = new ArrayList<>();
        options34.add("1915");
        options34.add("1919");
        options34.add("1920");
        options34.add("1930");
        quizzes.add(new Quiz("The 'Rowlatt Act' was enacted in which year?", options34, "1919"));

        // Question 11
        List<String> options35 = new ArrayList<>();
        options35.add("Non-Cooperation Movement");
        options35.add("Civil Disobedience Movement");
        options35.add("Quit India Movement");
        options35.add("Salt March");
        quizzes.add(new Quiz("Which movement was launched by Mahatma Gandhi in 1920?", options35, "Non-Cooperation Movement"));

        // Question 12
        List<String> options36 = new ArrayList<>();
        options36.add("January 1, 1950");
        options36.add("January 26, 1950");
        options36.add("March 15, 1950");
        options36.add("August 15, 1947");
        quizzes.add(new Quiz("The Constitution of India came into effect on which date?", options36, "January 26, 1950"));

        // Question 13
        List<String> options37 = new ArrayList<>();
        options37.add("Centralization of power");
        options37.add("Division of powers");
        options37.add("Unitary system");
        options37.add("Single-tier government");
        quizzes.add(new Quiz("Which of the following is a feature of a federal government?", options37, "Division of powers"));

        // Question 14
        List<String> options38 = new ArrayList<>();
        options38.add("Urban development");
        options38.add("Rural employment");
        options38.add("Industrial growth");
        options38.add("Educational reform");
        quizzes.add(new Quiz("What is the primary objective of the 'Mahatma Gandhi National Rural Employment Guarantee Act (MGNREGA)'?", options38, "Rural employment"));

        // Question 15
        List<String> options39 = new ArrayList<>();
        options39.add("France");
        options39.add("USA");
        options39.add("England");
        options39.add("Germany");
        quizzes.add(new Quiz("The Industrial Revolution began in which country?", options39, "England"));

        // Question 16
        List<String> options40 = new ArrayList<>();
        options40.add("B.R. Ambedkar");
        options40.add("Mahatma Gandhi");
        options40.add("Jawaharlal Nehru");
        options40.add("Sardar Patel");
        quizzes.add(new Quiz("Who is known as the 'Father of the Indian Constitution'?", options40, "B.R. Ambedkar"));

        // Question 17
        List<String> options41 = new ArrayList<>();
        options41.add("Battle of Plassey");
        options41.add("Battle of Buxar");
        options41.add("Battle of Panipat");
        options41.add("Battle of Haldighati");
        quizzes.add(new Quiz("Which battle marked the beginning of British rule in India?", options41, "Battle of Plassey"));

        // Question 18
        List<String> options42 = new ArrayList<>();
        options42.add("1920");
        options42.add("1930");
        options42.add("1942");
        options42.add("1947");
        quizzes.add(new Quiz("The 'Civil Disobedience Movement' was launched in which year?", options42, "1930"));

        // Question 19
        List<String> options43 = new ArrayList<>();
        options43.add("Solar energy");
        options43.add("Wind energy");
        options43.add("Coal");
        options43.add("Biomass");
        quizzes.add(new Quiz("Which of the following is a non-renewable resource?", options43, "Coal"));

        // Question 20
        List<String> options44 = new ArrayList<>();
        options44.add("1945");
        options44.add("1950");
        options44.add("1960");
        options44.add("1970");
        quizzes.add(new Quiz("The United Nations was established in which year?", options44, "1945"));

        // Question 21
        List<String> options45 = new ArrayList<>();
        options45.add("High Court");
        options45.add("Supreme Court");
        options45.add("District Court");
        options45.add("Tribunal");
        quizzes.add(new Quiz("Which is the highest judicial authority in India?", options45, "Supreme Court"));

        // Question 22
        List<String> options46 = new ArrayList<>();
        options46.add("Non-violent resistance");
        options46.add("Armed rebellion");
        options46.add("Silent protest");
        options46.add("Economic boycott");
        quizzes.add(new Quiz("The term 'Satyagraha' means:", options46, "Non-violent resistance"));

        // Question 23
        List<String> options47 = new ArrayList<>();
        options47.add("Single party rule");
        options47.add("Free and fair elections");
        options47.add("Centralized power");
        options47.add("Limited citizen participation");
        quizzes.add(new Quiz("Which is a main feature of democracy?", options47, "Free and fair elections"));

        // Question 24
        List<String> options48 = new ArrayList<>();
        options48.add("Taxation");
        options48.add("Loans");
        options48.add("Foreign aid");
        options48.add("Investments");
        quizzes.add(new Quiz("Which is the main source of income for the government of India?", options48, "Taxation"));

        // Question 25
        List<String> options49 = new ArrayList<>();
        options49.add("1920s");
        options49.add("1930s");
        options49.add("1940s");
        options49.add("1950s");
        quizzes.add(new Quiz("The Great Depression occurred in which decade?", options49, "1930s"));

        // Question 26
        List<String> options50 = new ArrayList<>();
        options50.add("Bhagat Singh");
        options50.add("Subhas Chandra Bose");
        options50.add("Rajendra Prasad");
        options50.add("Sardar Vallabhbhai Patel");
        quizzes.add(new Quiz("Who was the leader of the Indian National Army (INA)?", options50, "Subhas Chandra Bose"));

        // English Quiz
        quizzes.add(new Quiz("Who is the author of 'The Diary of a Young Girl'?",
                Arrays.asList("a) Anne Frank", "b) Mark Twain", "c) J.K. Rowling", "d) George Orwell"), "a) Anne Frank"));

        quizzes.add(new Quiz("What is the main theme of the poem 'If—' by Rudyard Kipling?",
                Arrays.asList("a) Success and failure", "b) Love and friendship", "c) War and peace", "d) Nature and beauty"), "a) Success and failure"));

        quizzes.add(new Quiz("In Shakespeare's play 'Romeo and Juliet,' what are the names of the two feuding families?",
                Arrays.asList("a) Montague and Capulet", "b) Capulet and Veron", "c) Montague and Mercutio", "d) Capulet and Paris"), "a) Montague and Capulet"));

        quizzes.add(new Quiz("Which literary device involves giving human traits to non-human entities?",
                Arrays.asList("a) Metaphor", "b) Personification", "c) Simile", "d) Alliteration"), "b) Personification"));

        quizzes.add(new Quiz("What is the primary purpose of a thesis statement in an essay?",
                Arrays.asList("a) To entertain", "b) To summarize", "c) To present the main argument", "d) To conclude"), "c) To present the main argument"));

        quizzes.add(new Quiz("In the story 'The Necklace,' what does Madame Loisel lose?",
                Arrays.asList("a) A ring", "b) A necklace", "c) A bracelet", "d) A pair of earrings"), "b) A necklace"));

        quizzes.add(new Quiz("Which of the following is an example of an oxymoron?",
                Arrays.asList("a) Bitter sweet", "b) Tall short", "c) Bright darkness", "d) Fast slow"), "a) Bitter sweet"));

        quizzes.add(new Quiz("In 'The Adventures of Tom Sawyer,' what is Tom's greatest adventure?",
                Arrays.asList("a) Finding treasure", "b) Running away from home", "c) Going to school", "d) Witnessing a murder"), "a) Finding treasure"));

        quizzes.add(new Quiz("What is a synonym for 'benevolent'?",
                Arrays.asList("a) Kind", "b) Evil", "c) Indifferent", "d) Angry"), "a) Kind"));

        quizzes.add(new Quiz("Which figure of speech compares two unlike things using 'like' or 'as'?",
                Arrays.asList("a) Metaphor", "b) Simile", "c) Hyperbole", "d) Personification"), "b) Simile"));

        quizzes.add(new Quiz("What is the setting of the novel 'To Kill a Mockingbird'?",
                Arrays.asList("a) Maycomb, Alabama", "b) New York City", "c) London", "d) Boston"), "a) Maycomb, Alabama"));

        quizzes.add(new Quiz("What does the term 'theme' refer to in literature?",
                Arrays.asList("a) The main character", "b) The underlying message", "c) The plot", "d) The setting"), "b) The underlying message"));

        quizzes.add(new Quiz("Which of the following is an example of alliteration?",
                Arrays.asList("a) She sells sea shells by the sea shore", "b) The wind whispered softly", "c) The sun shone brightly", "d) Time flies"), "a) She sells sea shells by the sea shore"));

        quizzes.add(new Quiz("In which genre of literature would you typically find a plot twist?",
                Arrays.asList("a) Romance", "b) Mystery", "c) Biography", "d) Poetry"), "b) Mystery"));

        quizzes.add(new Quiz("What is the primary function of a conclusion in an essay?",
                Arrays.asList("a) To introduce new ideas", "b) To summarize and close the argument", "c) To provide evidence", "d) To present the thesis"), "b) To summarize and close the argument"));

        quizzes.add(new Quiz("In poetry, a 'stanza' is equivalent to a:",
                Arrays.asList("a) Sentence", "b) Paragraph", "c) Chapter", "d) Line"), "b) Paragraph"));

        quizzes.add(new Quiz("Which of the following is a classic novel written by F. Scott Fitzgerald?",
                Arrays.asList("a) The Great Gatsby", "b) 1984", "c) Moby Dick", "d) Pride and Prejudice"), "a) The Great Gatsby"));

        quizzes.add(new Quiz("What type of poem is typically 14 lines long?",
                Arrays.asList("a) Haiku", "b) Limerick", "c) Sonnet", "d) Ode"), "c) Sonnet"));

        quizzes.add(new Quiz("In 'Pride and Prejudice', who is Elizabeth Bennet's love interest?",
                Arrays.asList("a) Mr. Collins", "b) Mr. Darcy", "c) Mr. Wickham", "d) Mr. Bingley"), "b) Mr. Darcy"));

        quizzes.add(new Quiz("What is the main conflict in 'The Catcher in the Rye'?",
                Arrays.asList("a) Man vs. nature", "b) Man vs. society", "c) Man vs. himself", "d) Man vs. fate"), "c) Man vs. himself"));

// Sanskrit Quiz
        quizzes.add(new Quiz("राम is which type of noun?",
                Arrays.asList("a) Proper noun", "b) Common noun", "c) Abstract noun", "d) Collective noun"), "a) Proper noun"));

        quizzes.add(new Quiz("What is the meaning of 'गच्छ'?",
                Arrays.asList("a) To come", "b) To go", "c) To sit", "d) To speak"), "b) To go"));

        quizzes.add(new Quiz("The feminine form of 'पुस्तक' is:",
                Arrays.asList("a) पुस्तकम्", "b) पुस्तकाः", "c) पुस्तक", "d) पुस्तकं"), "b) पुस्तकाः"));

        quizzes.add(new Quiz("What does 'अहं' mean?",
                Arrays.asList("a) You", "b) He", "c) I", "d) They"), "c) I"));

        quizzes.add(new Quiz("What is the plural form of 'शिक्षक'?",
                Arrays.asList("a) शिक्षकम्", "b) शिक्षिकाः", "c) शिक्षकाः", "d) शिक्षके"), "c) शिक्षकाः"));

        quizzes.add(new Quiz("The word 'क्रीडति' means:",
                Arrays.asList("a) To play", "b) To read", "c) To write", "d) To listen"), "a) To play"));

        quizzes.add(new Quiz("What is the antonym of 'सूर्यः'?",
                Arrays.asList("a) चन्द्र", "b) तारा", "c) रात्रि", "d) दिन"), "a) चन्द्र"));

        quizzes.add(new Quiz("Who is the author of 'रामायण'?",
                Arrays.asList("a) वेदव्यास", "b) वाल्मीकि", "c) कालीदास", "d) भवभूति"), "b) वाल्मीकि"));

        quizzes.add(new Quiz("What is the meaning of 'भवान्'?",
                Arrays.asList("a) You", "b) I", "c) He", "d) They"), "a) You"));

        quizzes.add(new Quiz("What is the plural form of 'जल'?",
                Arrays.asList("a) जलानि", "b) जलम्", "c) जलाः", "d) जलम्"), "a) जलानि"));

        quizzes.add(new Quiz("The word 'शान्ति' means:",
                Arrays.asList("a) War", "b) Peace", "c) Struggle", "d) Noise"), "b) Peace"));

        quizzes.add(new Quiz("What is the meaning of 'कुतः'?",
                Arrays.asList("a) Where", "b) Why", "c) What", "d) When"), "b) Why"));

        quizzes.add(new Quiz(" 'गायति' translates to:",
                Arrays.asList("a) To hear", "b) To sing", "c) To speak", "d) To play"), "b) To sing"));

        quizzes.add(new Quiz("The antonym of 'सुख' is:",
                Arrays.asList("a) दुख", "b) आनंद", "c) शांति", "d) प्रेम"), "a) दुख"));

        quizzes.add(new Quiz("What does 'सर्वे' mean?",
                Arrays.asList("a) Some", "b) All", "c) Any", "d) One"), "b) All"));

        quizzes.add(new Quiz(" 'नग्न' translates to:",
                Arrays.asList("a) To dress", "b) Naked", "c) To run", "d) To hide"), "b) Naked"));

        quizzes.add(new Quiz("What does 'विद्या' mean?",
                Arrays.asList("a) Ignorance", "b) Knowledge", "c) Wealth", "d) Power"), "b) Knowledge"));

        quizzes.add(new Quiz("The antonym of 'अधम' is:",
                Arrays.asList("a) उत्तम", "b) मध्यम", "c) सामान्य", "d) निःसंदेह"), "a) उत्तम"));

        quizzes.add(new Quiz("What is the meaning of 'सत्य'?",
                Arrays.asList("a) Truth", "b) Falsehood", "c) Justice", "d) Freedom"), "a) Truth"));

        return quizzes;
    }

    public static List<Quiz> getMathsQuizzes(){
        List<Quiz> quizzes = new ArrayList<>();

        List<String> options1 = new ArrayList<>();
        options1.add("Zero charges");
        options1.add("Point charges");
        options1.add("Single charge");
        options1.add("No charges");
        quizzes.add(new Quiz("If the sizes of charged bodies are very small compared to the distances between them, we treat them as _________", options1, "Point charges"));

        List<String> options2 = new ArrayList<>();
        options2.add("Electrostatic potential = Work done*charge");
        options2.add("Electrostatic potential = Work done-charge");
        options2.add("Electrostatic potential = Work done+charge");
        options2.add("Electrostatic potential = Work done/charge");
        quizzes.add(new Quiz("The formula for electrostatic potential is __________", options2, "Electrostatic potential = Work done/charge"));

        List<String> options3 = new ArrayList<>();
        options3.add("0.0059");
        options3.add("0.0039");
        options3.add("0.0159");
        options3.add("0.0129");
        quizzes.add(new Quiz("A silver wire has a resistance of 2.1 Ω at 27.5 °C, and a resistance of 2.7 Ω at 100 °C. What is the temperature coefficient of resistivity of silver?", options3, "0.0039"));

        List<String> options4 = new ArrayList<>();
        options4.add("Ferromagnetic material");
        options4.add("Paramagnetic material");
        options4.add("Diamagnetic material");
        options4.add("None of these options");
        quizzes.add(new Quiz("Which among the following materials display higher magnetic susceptibility?", options4, "Ferromagnetic material"));

        List<String> options5 = new ArrayList<>();
        options5.add("Fresnel");
        options5.add("Rayleigh");
        options5.add("Fraunhofer");
        options5.add("Poisson");
        quizzes.add(new Quiz("Who discovered Poisson’s bright spot?", options5, "Poisson"));

        List<String> options6 = new ArrayList<>();
        options6.add("Pure capacitor");
        options6.add("Pure resistor");
        options6.add("Pure inductor");
        options6.add("All of the above");
        quizzes.add(new Quiz("The power factor is one for which of the following?", options6, "Pure resistor"));

        List<String> options7 = new ArrayList<>();
        options7.add("Monovalent");
        options7.add("Bivalent");
        options7.add("Trivalent");
        options7.add("Covalent");
        quizzes.add(new Quiz("What bonds are present in a semiconductor?", options7, "Covalent"));

        List<String> options8 = new ArrayList<>();
        options8.add("10 cm2/s");
        options8.add("10/3 cm2/s");
        options8.add("√3 cm2/s");
        options8.add("10√3 cm2/s");
        quizzes.add(new Quiz("The side of an equilateral triangle is increasing at the rate of 2 cm/s. The rate at which area increases when the side is 10 is", options8, "10√3 cm2/s"));

        List<String> options9 = new ArrayList<>();
        options9.add("1/3");
        options9.add("8/3");
        options9.add("35/6");
        options9.add("None of these");
        quizzes.add(new Quiz("The area bounded by the curves y2 = 4x and y = x is equal to", options9, "8/3"));

        List<String> options10 = new ArrayList<>();
        options10.add("2");
        options10.add("3");
        options10.add("4");
        options10.add("5");
        quizzes.add(new Quiz("What is the degree of differential equation (y’’’)2 + (y’’)3 + (y’)4 + y5 = 0?", options10, "2"));

        List<String> options11 = new ArrayList<>();
        options11.add("x + 2y = 0");
        options11.add("x – y – 2 = 0");
        options11.add("-x + 2y – 2 = 0");
        options11.add("x + y – 2 = 0");
        quizzes.add(new Quiz("Find the equation of the plane passing through the points P(1, 1, 1), Q(3, -1, 2), R(-3, 5, -4).", options11, "x + y – 2 = 0"));

        List<String> options12 = new ArrayList<>();
        options12.add("0.32");
        options12.add("0.25");
        options12.add("0.1");
        options12.add("0.5");
        quizzes.add(new Quiz("If P (A) = 0.8, P (B) = 0.5 and P (B|A) = 0.4, what is the value of P (A ∩ B)?", options12, "0.32"));

        List<String> options13 = new ArrayList<>();
        options13.add("a constraint");
        options13.add("Decision variables");
        options13.add("Objective function");
        options13.add("None of the above");
        quizzes.add(new Quiz("The linear inequalities or equations or restrictions on the variables of a linear programming problem are called:", options13, "a constraint"));

        List<String> options14 = new ArrayList<>();
        options14.add("12");
        options14.add("14");
        options14.add("16");
        options14.add("None of the above");
        quizzes.add(new Quiz("The maximum value of Z = 3x + 4y subjected to constraints x + y ≤ 4, x ≥ 0 and y ≥ 0 is:", options14, "16"));

        List<String> options15 = new ArrayList<>();
        options15.add("Benzenediamine");
        options15.add("Benzene-1,4-diamine");
        options15.add("p-Aminoaniline");
        options15.add("4-Aminobenzenamine");
        quizzes.add(new Quiz("What is the correct name for a molecule that has two amino groups in opposing (para) locations around a benzene ring?", options15, "Benzene-1,4-diamine"));

        List<String> options16 = new ArrayList<>();
        options16.add("Ethanamine");
        options16.add("Aminoethane");
        options16.add("Ethylamine");
        options16.add("Ethane amine");
        quizzes.add(new Quiz("Which of the following is the IUPAC name of the chemical in which an ethyl group replaces one hydrogen of ammonia?", options16, "Ethanamine"));

        List<String> options17 = new ArrayList<>();
        options17.add("Absorption");
        options17.add("Adsorption");
        options17.add("Sorption");
        options17.add("Desorption");
        quizzes.add(new Quiz("When the molecules of a substance are kept at the surface of a solid or a liquid, what is the name of the process?", options17, "Adsorption"));

        List<String> options18 = new ArrayList<>();
        options18.add("Rate of reaction");
        options18.add("Mechanism of reaction");
        options18.add("Factors which affect the rate of reaction");
        options18.add("All of the mentioned");
        quizzes.add(new Quiz("The study of reaction kinetics is called __________.", options18, "All of the mentioned"));

        List<String> options19 = new ArrayList<>();
        options19.add("Integration method");
        options19.add("Half-life period method");
        options19.add("Graphical method");
        options19.add("Ostwald’s isolation method");
        quizzes.add(new Quiz("Only a simple homogeneous reaction requires which of the following methods?", options19, "Integration method"));

        List<String> options20 = new ArrayList<>();
        options20.add("30 minutes");
        options20.add("60 minutes");
        options20.add("90 minutes");
        options20.add("120 minutes");
        quizzes.add(new Quiz("In 30 minutes, a first-order reaction is 50% complete. Calculate the amount of time it took to complete 87.5 percent of the reaction.", options20, "90 minutes"));

        return quizzes;
    }

    public static List<Quiz> getBiologyQuizzes(){
        List<Quiz> quizzes = new ArrayList<>();

        List<String> options1 = new ArrayList<>();
        options1.add("Zero charges");
        options1.add("Point charges");
        options1.add("Single charge");
        options1.add("No charges");
        quizzes.add(new Quiz("If the sizes of charged bodies are very small compared to the distances between them, we treat them as _________", options1, "Point charges"));

        List<String> options2 = new ArrayList<>();
        options2.add("Electrostatic potential = Work done*charge");
        options2.add("Electrostatic potential = Work done-charge");
        options2.add("Electrostatic potential = Work done+charge");
        options2.add("Electrostatic potential = Work done/charge");
        quizzes.add(new Quiz("The formula for electrostatic potential is __________", options2, "Electrostatic potential = Work done/charge"));

        List<String> options3 = new ArrayList<>();
        options3.add("0.0059");
        options3.add("0.0039");
        options3.add("0.0159");
        options3.add("0.0129");
        quizzes.add(new Quiz("A silver wire has a resistance of 2.1 Ω at 27.5 °C, and a resistance of 2.7 Ω at 100 °C. What is the temperature coefficient of resistivity of silver?", options3, "0.0039"));

        List<String> options4 = new ArrayList<>();
        options4.add("Ferromagnetic material");
        options4.add("Paramagnetic material");
        options4.add("Diamagnetic material");
        options4.add("None of these options");
        quizzes.add(new Quiz("Which among the following materials display higher magnetic susceptibility?", options4, "Ferromagnetic material"));

        List<String> options5 = new ArrayList<>();
        options5.add("Fresnel");
        options5.add("Rayleigh");
        options5.add("Fraunhofer");
        options5.add("Poisson");
        quizzes.add(new Quiz("Who discovered Poisson’s bright spot?", options5, "Poisson"));

        List<String> options6 = new ArrayList<>();
        options6.add("Pure capacitor");
        options6.add("Pure resistor");
        options6.add("Pure inductor");
        options6.add("All of the above");
        quizzes.add(new Quiz("The power factor is one for which of the following?", options6, "Pure resistor"));

        List<String> options7 = new ArrayList<>();
        options7.add("Monovalent");
        options7.add("Bivalent");
        options7.add("Trivalent");
        options7.add("Covalent");
        quizzes.add(new Quiz("What bonds are present in a semiconductor?", options7, "Covalent"));

        List<String> options8 = new ArrayList<>();
        options8.add("Z chromosome");
        options8.add("Y chromosome");
        options8.add("X chromosome");
        options8.add("None of the above");
        quizzes.add(new Quiz("Colour blindness is an _________ linked recessive trait", options8, "X chromosome"));

        List<String> options9 = new ArrayList<>();
        options9.add("Alanine");
        options9.add("Methionine");
        options9.add("N-formyl methionine");
        options9.add("Glycine");
        quizzes.add(new Quiz("AUG stands for", options9, "Methionine"));

        List<String> options10 = new ArrayList<>();
        options10.add("Fisheries");
        options10.add("Apiaries");
        options10.add("Poultry");
        options10.add("None of the these");
        quizzes.add(new Quiz("Hypophysation is a technique primarily used in ____", options10, "Fisheries"));

        List<String> options11 = new ArrayList<>();
        options11.add("Spleen");
        options11.add("Thymus");
        options11.add("Pituitary gland");
        options11.add("Adrenal gland");
        quizzes.add(new Quiz("Both B & T lymphocytes are produced in the bone marrow; however, only the T lymphocytes travel to the ______ and mature there.", options11, "Thymus"));

        List<String> options12 = new ArrayList<>();
        options12.add("Leghorn");
        options12.add("Sulmtaler");
        options12.add("Augsburger");
        options12.add("Manx Rumpy");
        quizzes.add(new Quiz("_______ is an example of an American breed of poultry", options12, "Leghorn"));

        List<String> options13 = new ArrayList<>();
        options13.add("Tylosis");
        options13.add("Xerosis");
        options13.add("Heterosis");
        options13.add("Atherosis");
        quizzes.add(new Quiz("Creation of Superior F1 hybrids is known as __________", options13, "Heterosis"));

        List<String> options14 = new ArrayList<>();
        options14.add("Health anxiety");
        options14.add("Sleep apnea");
        options14.add("Hypnagogia");
        options14.add("Narcolepsy");
        quizzes.add(new Quiz("Hypochondria is also termed as_______.", options14, "Health anxiety"));

        List<String> options15 = new ArrayList<>();
        options15.add("Benzenediamine");
        options15.add("Benzene-1,4-diamine");
        options15.add("p-Aminoaniline");
        options15.add("4-Aminobenzenamine");
        quizzes.add(new Quiz("What is the correct name for a molecule that has two amino groups in opposing (para) locations around a benzene ring?", options15, "Benzene-1,4-diamine"));

        List<String> options16 = new ArrayList<>();
        options16.add("Ethanamine");
        options16.add("Aminoethane");
        options16.add("Ethylamine");
        options16.add("Ethane amine");
        quizzes.add(new Quiz("Which of the following is the IUPAC name of the chemical in which an ethyl group replaces one hydrogen of ammonia?", options16, "Ethanamine"));

        List<String> options17 = new ArrayList<>();
        options17.add("Absorption");
        options17.add("Adsorption");
        options17.add("Sorption");
        options17.add("Desorption");
        quizzes.add(new Quiz("When the molecules of a substance are kept at the surface of a solid or a liquid, what is the name of the process?", options17, "Adsorption"));

        List<String> options18 = new ArrayList<>();
        options18.add("Rate of reaction");
        options18.add("Mechanism of reaction");
        options18.add("Factors which affect the rate of reaction");
        options18.add("All of the mentioned");
        quizzes.add(new Quiz("The study of reaction kinetics is called __________.", options18, "All of the mentioned"));

        List<String> options19 = new ArrayList<>();
        options19.add("Integration method");
        options19.add("Half-life period method");
        options19.add("Graphical method");
        options19.add("Ostwald’s isolation method");
        quizzes.add(new Quiz("Only a simple homogeneous reaction requires which of the following methods?", options19, "Integration method"));

        List<String> options20 = new ArrayList<>();
        options20.add("30 minutes");
        options20.add("60 minutes");
        options20.add("90 minutes");
        options20.add("120 minutes");
        quizzes.add(new Quiz("In 30 minutes, a first-order reaction is 50% complete. Calculate the amount of time it took to complete 87.5 percent of the reaction.", options20, "90 minutes"));

        return quizzes;
    }

    public static List<Quiz> getMathsBioQuizzes(){
        List<Quiz> quizzes = new ArrayList<>();

        List<String> options1 = new ArrayList<>();
        options1.add("Zero charges");
        options1.add("Point charges");
        options1.add("Single charge");
        options1.add("No charges");
        quizzes.add(new Quiz("If the sizes of charged bodies are very small compared to the distances between them, we treat them as _________", options1, "Point charges"));

        List<String> options2 = new ArrayList<>();
        options2.add("Electrostatic potential = Work done*charge");
        options2.add("Electrostatic potential = Work done-charge");
        options2.add("Electrostatic potential = Work done+charge");
        options2.add("Electrostatic potential = Work done/charge");
        quizzes.add(new Quiz("The formula for electrostatic potential is __________", options2, "Electrostatic potential = Work done/charge"));

        List<String> options3 = new ArrayList<>();
        options3.add("0.0059");
        options3.add("0.0039");
        options3.add("0.0159");
        options3.add("0.0129");
        quizzes.add(new Quiz("A silver wire has a resistance of 2.1 Ω at 27.5 °C, and a resistance of 2.7 Ω at 100 °C. What is the temperature coefficient of resistivity of silver?", options3, "0.0039"));

        List<String> options4 = new ArrayList<>();
        options4.add("Ferromagnetic material");
        options4.add("Paramagnetic material");
        options4.add("Diamagnetic material");
        options4.add("None of these options");
        quizzes.add(new Quiz("Which among the following materials display higher magnetic susceptibility?", options4, "Ferromagnetic material"));

        List<String> options5 = new ArrayList<>();
        options5.add("Fresnel");
        options5.add("Rayleigh");
        options5.add("Fraunhofer");
        options5.add("Poisson");
        quizzes.add(new Quiz("Who discovered Poisson’s bright spot?", options5, "Poisson"));

        List<String> options6 = new ArrayList<>();
        options6.add("10 cm2/s");
        options6.add("10/3 cm2/s");
        options6.add("√3 cm2/s");
        options6.add("10√3 cm2/s");
        quizzes.add(new Quiz("The side of an equilateral triangle is increasing at the rate of 2 cm/s. The rate at which area increases when the side is 10 is", options6, "10√3 cm2/s"));

        List<String> options7 = new ArrayList<>();
        options7.add("1/3");
        options7.add("8/3");
        options7.add("35/6");
        options7.add("None of these");
        quizzes.add(new Quiz("The area bounded by the curves y2 = 4x and y = x is equal to", options7, "8/3"));

        List<String> options8 = new ArrayList<>();
        options8.add("2");
        options8.add("3");
        options8.add("4");
        options8.add("5");
        quizzes.add(new Quiz("What is the degree of differential equation (y’’’)2 + (y’’)3 + (y’)4 + y5 = 0?", options8, "2"));

        List<String> options9 = new ArrayList<>();
        options9.add("x + 2y = 0");
        options9.add("x – y – 2 = 0");
        options9.add("-x + 2y – 2 = 0");
        options9.add("x + y – 2 = 0");
        quizzes.add(new Quiz("Find the equation of the plane passing through the points P(1, 1, 1), Q(3, -1, 2), R(-3, 5, -4).", options9, "x + y – 2 = 0"));

        List<String> options10 = new ArrayList<>();
        options10.add("0.32");
        options10.add("0.25");
        options10.add("0.1");
        options10.add("0.5");
        quizzes.add(new Quiz("If P (A) = 0.8, P (B) = 0.5 and P (B|A) = 0.4, what is the value of P (A ∩ B)?", options10, "0.32"));

        List<String> options11 = new ArrayList<>();
        options11.add("Spleen");
        options11.add("Thymus");
        options11.add("Pituitary gland");
        options11.add("Adrenal gland");
        quizzes.add(new Quiz("Both B & T lymphocytes are produced in the bone marrow; however, only the T lymphocytes travel to the ______ and mature there.", options11, "Thymus"));

        List<String> options12 = new ArrayList<>();
        options12.add("Leghorn");
        options12.add("Sulmtaler");
        options12.add("Augsburger");
        options12.add("Manx Rumpy");
        quizzes.add(new Quiz("_______ is an example of an American breed of poultry", options12, "Leghorn"));

        List<String> options13 = new ArrayList<>();
        options13.add("Tylosis");
        options13.add("Xerosis");
        options13.add("Heterosis");
        options13.add("Atherosis");
        quizzes.add(new Quiz("Creation of Superior F1 hybrids is known as __________", options13, "Heterosis"));

        List<String> options14 = new ArrayList<>();
        options14.add("Health anxiety");
        options14.add("Sleep apnea");
        options14.add("Hypnagogia");
        options14.add("Narcolepsy");
        quizzes.add(new Quiz("Hypochondria is also termed as_______.", options14, "Health anxiety"));

        List<String> options15 = new ArrayList<>();
        options15.add("Fisheries");
        options15.add("Apiaries");
        options15.add("Poultry");
        options15.add("None of the these");
        quizzes.add(new Quiz("Hypophysation is a technique primarily used in ____", options15, "Fisheries"));


        List<String> options16 = new ArrayList<>();
        options16.add("Ethanamine");
        options16.add("Aminoethane");
        options16.add("Ethylamine");
        options16.add("Ethane amine");
        quizzes.add(new Quiz("Which of the following is the IUPAC name of the chemical in which an ethyl group replaces one hydrogen of ammonia?", options16, "Ethanamine"));

        List<String> options17 = new ArrayList<>();
        options17.add("Absorption");
        options17.add("Adsorption");
        options17.add("Sorption");
        options17.add("Desorption");
        quizzes.add(new Quiz("When the molecules of a substance are kept at the surface of a solid or a liquid, what is the name of the process?", options17, "Adsorption"));

        List<String> options18 = new ArrayList<>();
        options18.add("Rate of reaction");
        options18.add("Mechanism of reaction");
        options18.add("Factors which affect the rate of reaction");
        options18.add("All of the mentioned");
        quizzes.add(new Quiz("The study of reaction kinetics is called __________.", options18, "All of the mentioned"));

        List<String> options19 = new ArrayList<>();
        options19.add("Integration method");
        options19.add("Half-life period method");
        options19.add("Graphical method");
        options19.add("Ostwald’s isolation method");
        quizzes.add(new Quiz("Only a simple homogeneous reaction requires which of the following methods?", options19, "Integration method"));

        List<String> options20 = new ArrayList<>();
        options20.add("30 minutes");
        options20.add("60 minutes");
        options20.add("90 minutes");
        options20.add("120 minutes");
        quizzes.add(new Quiz("In 30 minutes, a first-order reaction is 50% complete. Calculate the amount of time it took to complete 87.5 percent of the reaction.", options20, "90 minutes"));

        return quizzes;
    }

    public static List<Quiz> getCommereceQuizzes(){
        List<Quiz> quizzes = new ArrayList<>();

        List<String> options1 = new ArrayList<>();
        options1.add("For recording a sale");
        options1.add("For recording a return of goods");
        options1.add("For recording payment received");
        options1.add("For recording an expense");
        quizzes.add(new Quiz("What is a debit note used for?", options1, "For recording a return of goods"));

        List<String> options2 = new ArrayList<>();
        options2.add("Buying stocks");
        options2.add("Selling real estate");
        options2.add("Accepting deposits and lending money");
        options2.add("Issuing insurance");
        quizzes.add(new Quiz("What is the primary function of a bank?", options2, "Accepting deposits and lending money"));

        List<String> options3 = new ArrayList<>();
        options3.add("Goods and Services Tax");
        options3.add("Government Sales Tax");
        options3.add("General Services Tax");
        options3.add("Gross Sales Tax");
        quizzes.add(new Quiz("What is the full form of GST?", options3, "Goods and Services Tax"));

        List<String> options4 = new ArrayList<>();
        options4.add("Raw materials");
        options4.add("Wages");
        options4.add("Rent");
        options4.add("Commission");
        quizzes.add(new Quiz("Which of the following is an example of a fixed cost?", options4, "Rent"));

        List<String> options5 = new ArrayList<>();
        options5.add("Gross Domestic Product");
        options5.add("General Demand Price");
        options5.add("Global Distribution Plan");
        options5.add("General Domestic Policy");
        quizzes.add(new Quiz("What does GDP stand for?", options5, "Gross Domestic Product"));

        List<String> options6 = new ArrayList<>();
        options6.add("24/7 availability");
        options6.add("Global reach");
        options6.add("Physical interaction with products");
        options6.add("Lower operating costs");
        quizzes.add(new Quiz("Which one of these is not an advantage of e-commerce?", options6, "Physical interaction with products"));

        List<String> options7 = new ArrayList<>();
        options7.add("Every transaction has two effects");
        options7.add("It involves recording only expenses");
        options7.add("Only income is recorded twice");
        options7.add("None of the above");
        quizzes.add(new Quiz("What is the double-entry accounting system?", options7, "Every transaction has two effects"));

        List<String> options8 = new ArrayList<>();
        options8.add("Reserve Bank of India");
        options8.add("Bank of India");
        options8.add("State Bank of India");
        options8.add("Punjab National Bank");
        quizzes.add(new Quiz("Which is the central bank of India?", options8, "Reserve Bank of India"));

        List<String> options9 = new ArrayList<>();
        options9.add("Convertible");
        options9.add("Non-convertible");
        options9.add("Both a and b");
        options9.add("None of the above");
        quizzes.add(new Quiz("Which of these is a type of debenture?", options9, "Both a and b"));

        List<String> options10 = new ArrayList<>();
        options10.add("Revenue - Expenses");
        options10.add("Revenue + Expenses");
        options10.add("Assets - Liabilities");
        options10.add("Assets + Liabilities");
        quizzes.add(new Quiz("What is the basic formula for calculating Net Profit?", options10, "Revenue - Expenses"));

        List<String> options11 = new ArrayList<>();
        options11.add("Trade credit");
        options11.add("Bank overdraft");
        options11.add("Equity shares");
        options11.add("Cash flow");
        quizzes.add(new Quiz("Which of these is a source of long-term finance?", options11, "Equity shares"));

        List<String> options12 = new ArrayList<>();
        options12.add("The number of assets a business has");
        options12.add("How quickly an asset can be converted into cash");
        options12.add("The number of shares in the stock market");
        options12.add("The company's profit margins");
        quizzes.add(new Quiz("What does the term 'liquidity' refer to?", options12, "How quickly an asset can be converted into cash"));

        List<String> options13 = new ArrayList<>();
        options13.add("Retained earnings");
        options13.add("Bank loan");
        options13.add("Sale of assets");
        options13.add("Reduction in expenses");
        quizzes.add(new Quiz("Which of the following is an external source of finance?", options13, "Bank loan"));

        List<String> options14 = new ArrayList<>();
        options14.add("The total revenue of a company");
        options14.add("The total value of a company's shares on the stock market");
        options14.add("The value of a company’s assets");
        options14.add("The total amount of profit a company makes");
        quizzes.add(new Quiz("What is market capitalization?", options14, "The total value of a company's shares on the stock market"));

        List<String> options15 = new ArrayList<>();
        options15.add("A loan given to the company");
        options15.add("A portion of the company’s earnings paid to shareholders");
        options15.add("The company’s revenue");
        options15.add("A penalty for defaulting");
        quizzes.add(new Quiz("What is a dividend?", options15, "A portion of the company’s earnings paid to shareholders"));

        List<String> options16 = new ArrayList<>();
        options16.add("Total Assets ÷ Total Liabilities");
        options16.add("Current Assets ÷ Current Liabilities");
        options16.add("Revenue ÷ Expenses");
        options16.add("Profit ÷ Sales");
        quizzes.add(new Quiz("What is the formula for calculating the current ratio?", options16, "Current Assets ÷ Current Liabilities"));

        List<String> options17 = new ArrayList<>();
        options17.add("Loan payable");
        options17.add("Cash in hand");
        options17.add("Taxes owed");
        options17.add("Utility expenses");
        quizzes.add(new Quiz("Which of the following is an asset?", options17, "Cash in hand"));

        List<String> options18 = new ArrayList<>();
        options18.add("Increased production leads to lower per-unit costs");
        options18.add("Increased production leads to higher profits");
        options18.add("Decreased production leads to increased costs");
        options18.add("Increased sales lead to higher prices");
        quizzes.add(new Quiz("What does 'economies of scale' mean?", options18, "Increased production leads to lower per-unit costs"));

        List<String> options19 = new ArrayList<>();
        options19.add("A book for summarizing financial transactions");
        options19.add("A summary of a company’s assets");
        options19.add("A detailed sales report");
        options19.add("A marketing plan");
        quizzes.add(new Quiz("In accounting, what is a ledger?", options19, "A book for summarizing financial transactions"));

        List<String> options20 = new ArrayList<>();
        options20.add("A decrease in prices over time");
        options20.add("An increase in the value of money");
        options20.add("A general increase in prices");
        options20.add("The change in tax rates");
        quizzes.add(new Quiz("What is inflation?", options20, "A general increase in prices"));

        return quizzes;
    }

    public static List<Quiz> getArtsQuizzes(){
        List<Quiz> quizzes = new ArrayList<>();

        List<String> options1 = new ArrayList<>();
        options1.add("Pablo Picasso");
        options1.add("Claude Monet");
        options1.add("Leonardo da Vinci");
        options1.add("Michelangelo");
        quizzes.add(new Quiz("Who is the famous artist behind \"The Last Supper\"?", options1, "Leonardo da Vinci"));

        List<String> options2 = new ArrayList<>();
        options2.add("Painting");
        options2.add("Drawing");
        options2.add("Sculpture");
        options2.add("Photography");
        quizzes.add(new Quiz("Which art form primarily involves creating three-dimensional objects?", options2, "Sculpture"));

        List<String> options3 = new ArrayList<>();
        options3.add("Charles Dickens");
        options3.add("Jane Austen");
        options3.add("William Shakespeare");
        options3.add("Emily Brontë");
        quizzes.add(new Quiz("Who is the author of the novel \"Pride and Prejudice\"?", options3, "Jane Austen"));

        List<String> options4 = new ArrayList<>();
        options4.add("Symphony No. 5");
        options4.add("Moonlight Sonata");
        options4.add("The Four Seasons");
        options4.add("Clair de Lune");
        quizzes.add(new Quiz("Which of these is a type of Baroque music?", options4, "The Four Seasons"));

        List<String> options5 = new ArrayList<>();
        options5.add("Marble");
        options5.add("Sandstone");
        options5.add("Brick");
        options5.add("Granite");
        quizzes.add(new Quiz("What is the Taj Mahal primarily made of?", options5, "Marble"));

        List<String> options6 = new ArrayList<>();
        options6.add("Claude Monet");
        options6.add("Pablo Picasso");
        options6.add("Salvador Dalí");
        options6.add("Vincent van Gogh");
        quizzes.add(new Quiz("Who painted the \"Starry Night\"?", options6, "Vincent van Gogh"));

        List<String> options7 = new ArrayList<>();
        options7.add("The Colosseum");
        options7.add("The Eiffel Tower");
        options7.add("The Sydney Opera House");
        options7.add("The Burj Khalifa");
        quizzes.add(new Quiz("Which of the following is an example of Classical architecture?", options7, "The Colosseum"));

        List<String> options8 = new ArrayList<>();
        options8.add("The Nutcracker");
        options8.add("Swan Lake");
        options8.add("Sleeping Beauty");
        options8.add("All of the above");
        quizzes.add(new Quiz("Which ballet is composed by Pyotr Ilyich Tchaikovsky?", options8, "All of the above"));

        List<String> options9 = new ArrayList<>();
        options9.add("Plato");
        options9.add("Homer");
        options9.add("Socrates");
        options9.add("Aristotle");
        quizzes.add(new Quiz("Who wrote \"The Odyssey\"?", options9, "Homer"));

        List<String> options10 = new ArrayList<>();
        options10.add("Pablo Picasso");
        options10.add("Henri Matisse");
        options10.add("Leonardo da Vinci");
        options10.add("Jackson Pollock");
        quizzes.add(new Quiz("Which famous artist is known for the painting \"Guernica\"?", options10, "Pablo Picasso"));

        List<String> options11 = new ArrayList<>();
        options11.add("Violin");
        options11.add("Saxophone");
        options11.add("Harp");
        options11.add("Flute");
        quizzes.add(new Quiz("Which instrument is commonly associated with jazz music?", options11, "Saxophone"));

        List<String> options12 = new ArrayList<>();
        options12.add("Cubism");
        options12.add("Expressionism");
        options12.add("Impressionism");
        options12.add("Surrealism");
        quizzes.add(new Quiz("Which art movement is associated with artists like Claude Monet?", options12, "Impressionism"));

        List<String> options13 = new ArrayList<>();
        options13.add("Quentin Tarantino");
        options13.add("Steven Spielberg");
        options13.add("James Cameron");
        options13.add("Martin Scorsese");
        quizzes.add(new Quiz("Who directed the movie \"Schindler’s List\"?", options13, "Steven Spielberg"));

        List<String> options14 = new ArrayList<>();
        options14.add("Leonardo da Vinci");
        options14.add("Michelangelo");
        options14.add("Raphael");
        options14.add("Caravaggio");
        quizzes.add(new Quiz("Who painted the ceiling of the Sistine Chapel?", options14, "Michelangelo"));

        List<String> options15 = new ArrayList<>();
        options15.add("Pablo Picasso");
        options15.add("Claude Monet");
        options15.add("Vincent van Gogh");
        options15.add("Paul Cézanne");
        quizzes.add(new Quiz("Which famous artist is known for cutting off part of his ear?", options15, "Vincent van Gogh"));

        List<String> options16 = new ArrayList<>();
        options16.add("Cubism");
        options16.add("Surrealism");
        options16.add("Expressionism");
        options16.add("Baroque");
        quizzes.add(new Quiz("What style of art is Salvador Dalí known for?", options16, "Surrealism"));

        List<String> options17 = new ArrayList<>();
        options17.add("The Persistence of Memory");
        options17.add("The Scream");
        options17.add("The Mona Lisa");
        options17.add("Girl with a Pearl Earring");
        quizzes.add(new Quiz("Which famous painting is also known as \"La Gioconda\"?", options17, "The Mona Lisa"));

        List<String> options18 = new ArrayList<>();
        options18.add("London");
        options18.add("Paris");
        options18.add("Rome");
        options18.add("Madrid");
        quizzes.add(new Quiz("In which city would you find the Louvre Museum?", options18, "Paris"));

        List<String> options19 = new ArrayList<>();
        options19.add("Wood");
        options19.add("Bronze");
        options19.add("Marble");
        options19.add("Clay");
        quizzes.add(new Quiz("What is the primary medium of sculpture artist Auguste Rodin?", options19, "Bronze"));

        List<String> options20 = new ArrayList<>();
        options20.add("Baroque");
        options20.add("Cubism");
        options20.add("Realism");
        options20.add("Art Nouveau");
        quizzes.add(new Quiz("Which art movement is characterized by abstract, non-representational forms?", options20, "Cubism"));

        return quizzes;
    }
}
