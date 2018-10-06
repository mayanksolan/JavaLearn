
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }
        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }
        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }
        return false;
    }

    public int differenceInYears(MyDate comparedDate) {
        if (this.year < comparedDate.year) {
            int yearDiff = comparedDate.year - this.year;
            if (this.month > comparedDate.month) {
                yearDiff--;
            } else if (this.day > comparedDate.day) {
                yearDiff--;
            }
            return yearDiff;
        }
        int yearDiff = this.year - comparedDate.year;
        if (this.month < comparedDate.month) {
            yearDiff--;
        } else if (this.day < comparedDate.day) {
            yearDiff--;
        }
        return yearDiff;
    }

}
