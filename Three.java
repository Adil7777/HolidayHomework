public class Three {
    public String season(int month, int day) {
        if (month < 3) {
            return "Winter";
        } else if ((month == 3 && day <= 15) || (month == 12 && day <= 16)) {
            return "Winter";
        } else if ((6 < month && month < 9) || (month == 6 && day >= 16) || (month == 9 && day <= 15)) {
            return "Summer";
        } else if ((3 < month && month < 6) || (month == 3 && day >= 16) || (month == 6 && day <= 15)) {
            return "Spring";
        }
        return "Fall";
    }
}
