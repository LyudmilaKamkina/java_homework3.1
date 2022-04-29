public class BonusMilesService {
    public int calculate(int price) {
        int miles;
        int oneMile = 20;

        miles = price / oneMile;
        return miles;
    }
}
