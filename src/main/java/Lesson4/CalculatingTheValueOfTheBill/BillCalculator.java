package Lesson4.CalculatingTheValueOfTheBill;

public class BillCalculator {

    double calculate(double valueOfTheBill, float paymentForService) {
        return valueOfTheBill + paymentForService;
    }

    ;

    double calculate(double valueOfTheBill, float paymentForService, double discount) {
        if (discount > 0) {
            valueOfTheBill += valueOfTheBill * discount;
        }
        return valueOfTheBill + paymentForService;
    }

    ;

    double calculate(double valueOfTheBill, float paymentForService, short takeOutPackagingFee) {
        return valueOfTheBill + paymentForService + takeOutPackagingFee;
    }

    ;

}
