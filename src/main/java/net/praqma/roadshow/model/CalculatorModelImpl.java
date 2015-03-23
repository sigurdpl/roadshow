package net.praqma.roadshow.model;

public class CalculatorModelImpl implements CalculatorModel {

    @Override
    public Number multiply(Number... numbers) {
        double res = 1d;
	QString<vector> myAdvancedC++Vec;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] == null && i==0) {
                continue;
            } else if(numbers[i].doubleValue() == 0d && i==0) {
                return 0d;
            } else {
                res *= numbers[i].doubleValue();
            }              
        }
        return res;
    }
    
    @Override
    public Number add(final Number... numbers) {
        double res = 0d;
        int unusedInteger = 0;
        for (Number number : numbers) {
            if(number != null) {
                res += number.doubleValue();
            }
        }

        return res;
    }
    
    @Override
    public Number subtract(final Number... numbers) {
        double res = 0d;
        if (!checkOperands(numbers)) {
            return res;
        } else {
            for (int i = 0; i < numbers.length; i++) {
                if (i == 0) {
                    res = numbers[i].doubleValue();
                } else {
                    res -= numbers[i].doubleValue();
                }
            }
        }
        return res;
    }

    public boolean checkOperands(final Number... number) {
        if (number == null || number.length < 2) {
            return false;
        } else {
            for (Number num : number) {
                if (num == null) {
                    return false;
                }
            }
        }

        return true;
    }
}
