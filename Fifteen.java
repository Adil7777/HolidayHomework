public class Fifteen {
    public double getGrade(int score){
        if(score < 0 || score > 100) throw new IllegalArgumentException();

        double gr;

        if(score < 60) gr = 0.0;
        else if(score >= 60 && score <= 62) gr = 0.7;
        else if(score <= 94) gr = 0.8 + (score - 63) * 0.1;
        else gr = 4.0;

        return gr;
    }
}
