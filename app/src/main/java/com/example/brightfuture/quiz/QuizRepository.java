package com.example.brightfuture.quiz;

import java.util.ArrayList;
import java.util.List;

public class QuizRepository {

    // Returns a list of quizzes
    public static List<Quiz> getScienceQuizzes() {
        List<Quiz> quizzes = new ArrayList<>();

        List<String> options1 = new ArrayList<>();
        options1.add("Hydrogen");
        options1.add("Oxygen");
        options1.add("Carbon");
        options1.add("Nitrogen");
        quizzes.add(new Quiz("What is the most abundant element in the universe?", options1, "Hydrogen"));

        List<String> options2 = new ArrayList<>();
        options2.add("Mercury");
        options2.add("Mars");
        options2.add("Venus");
        options2.add("Earth");
        quizzes.add(new Quiz("Which is the closest planet to the Sun?", options2, "Mercury"));

        List<String> options3 = new ArrayList<>();
        options3.add("Oxygen");
        options3.add("Carbon dioxide");
        options3.add("Hydrogen");
        options3.add("Carbon monoxide");
        quizzes.add(new Quiz("Which gas is needed for photosynthesis?", options3, "Carbon dioxide"));

        List<String> options4 = new ArrayList<>();
        options4.add("Light");
        options4.add("Heat");
        options4.add("Electrical");
        options4.add("Electrical");
        quizzes.add(new Quiz("What type of energy is required for photosynthesis to happen?", options4, "Light"));

        List<String> options5 = new ArrayList<>();
        options5.add("Glucose");
        options5.add("Oxygen");
        options5.add("Carbon dioxide");
        options5.add("None of the above");
        quizzes.add(new Quiz("What is the waste by-product of photosynthesis?", options5, "Oxygen"));

        List<String> options6 = new ArrayList<>();
        options6.add("The temperature must have been a limiting factor.");
        options6.add("Carbon dioxide concentration must have been a limiting factor earlier.");
        options6.add("Light intensity must have been a limiting factor.");
        options6.add("None of the above");
        quizzes.add(new Quiz("Tomatoes in a greenhouse grow faster if the carbon dioxide concentration is increased. Why is that?", options6, "Carbon dioxide concentration must have been a limiting factor earlier."));

        List<String> options7 = new ArrayList<>();
        options7.add("Oxygen + glucose → carbon dioxide + water");
        options7.add("Carbon dioxide + oxygen → glucose + water");
        options7.add("Carbon dioxide + water → glucose + oxygen");
        options7.add("None of the above");
        quizzes.add(new Quiz("What is the equation of photosynthesis?", options7, "Carbon dioxide + water → glucose + oxygen"));

        List<String> options8 = new ArrayList<>();
        options8.add("To make proteins");
        options8.add("To make fatty acids");
        options8.add("To make starch for storage");
        options8.add("To make chlorophyll");
        quizzes.add(new Quiz("Why do plants need nitrate ions?", options8, "To make proteins"));

        List<String> options9 = new ArrayList<>();
        options9.add("6");
        options9.add("4");
        options9.add("7");
        options9.add("16");
        quizzes.add(new Quiz("Solve for x : 2x + y = 8, y= - 6", options9, "7"));

        List<String> options10 = new ArrayList<>();
        options10.add("Angle of triangle");
        options10.add("Angle of elevation");
        options10.add("Angle of depression");
        options10.add("None of the these");
        quizzes.add(new Quiz("When a point is observed, the angle formed by the line of sight with the horizontal level where the point being viewed is above the horizontal plane is known as:", options10, "Angle of elevation"));

        List<String> options11 = new ArrayList<>();
        options11.add("Positive");
        options11.add("Negative");
        options11.add("Both A and B");
        options11.add("None of the above");
        quizzes.add(new Quiz("The probability of an event can't be _______", options11, "Negative"));

        List<String> options12 = new ArrayList<>();
        options12.add("1/2");
        options12.add("1");
        options12.add("1/3");
        options12.add("1/10");
        quizzes.add(new Quiz("In a lottery, there are 10 prizes and 20 blanks. What is the probability of getting a prize?", options12, "1/3"));

        List<String> options13 = new ArrayList<>();
        options13.add("1250");
        options13.add("1255");
        options13.add("1355");
        options13.add("1350");
        quizzes.add(new Quiz("The HCF of two numbers, a and b, is 30, while their LCM is 45. What is the value of (a x b)?", options13, "1350"));

        List<String> options14 = new ArrayList<>();
        options14.add("12");
        options14.add("18");
        options14.add("20");
        options14.add("22");
        quizzes.add(new Quiz("Which term of the progression 4,9,14,…. is 109?", options14, "22"));

        List<String> options15 = new ArrayList<>();
        options15.add("10");
        options15.add("11");
        options15.add("12");
        options15.add("13");
        quizzes.add(new Quiz("1+2+…+k=55, what is the value of k?", options15, "10"));

        List<String> options16 = new ArrayList<>();
        options16.add("13/5");
        options16.add("17/5");
        options16.add("14/5");
        options16.add("1");
        quizzes.add(new Quiz("If cot A = 12/5, then the value of (sin A + cos A) x cosec A is :", options16, "17/5"));

        List<String> options17 = new ArrayList<>();
        options17.add("32");
        options17.add("35");
        options17.add("42");
        options17.add("28");
        quizzes.add(new Quiz("What is the 10th term of the sequence whose nth term is 3n-2?", options17, "28"));

        List<String> options18 = new ArrayList<>();
        options18.add("Leaf");
        options18.add("Palisade");
        options18.add("Chlorophyll");
        options18.add("Chloroplasts");
        quizzes.add(new Quiz("What is the substance that makes leaves look green?", options18, "Chlorophyll"));

        List<String> options19 = new ArrayList<>();
        options19.add("Roots");
        options19.add("Palisade");
        options19.add("Chloroplasts");
        options19.add("None");
        quizzes.add(new Quiz("Where does photosynthesis takes place in?", options19, "Chloroplasts"));

        List<String> options20 = new ArrayList<>();
        options20.add("To provide oxygen for terrestrial life");
        options20.add("To absorb and scatter solar ultraviolet light");
        options20.add("To regulate the Earth’s temperature");
        options20.add("To act as a shield against meteorites");
        quizzes.add(new Quiz("What is the primary function of the ozone layer in the Earth's atmosphere?", options20, "To absorb and scatter solar ultraviolet light"));

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