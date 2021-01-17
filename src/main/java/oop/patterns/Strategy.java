package oop.patterns;

public class Strategy {

}

enum PaymentType{
    PHONE,
    DATA,
    SMS
}

interface Biller{
    double payment(PaymentType paymentType, double cost);
}


class Bill{

    private Biller biller;

    public void setBiller(Biller biller){
        this.biller = biller;
    }

    public double processPayment(PaymentType paymentType, double usage){
        return biller.payment(paymentType, usage);
    }
}