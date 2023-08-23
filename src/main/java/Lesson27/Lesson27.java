package Lesson27;

public class Lesson27 {
    public static void main(String[] args) {
        Tiger t1 = new Tiger();
        t1.eat("myaso");
        try {
            t1.drink("voda");
            try {
                t1.drink("pivo");
            } catch (NeVodaException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Eto inner finally block");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class NeMyasoException extends RuntimeException {
    NeMyasoException(String s) {
        super(s);
    }
}

class NeVodaException extends Exception {
    NeVodaException(String s) {
        super(s);
    }
}

class Tiger {
    public void eat(String eat) {
        if (!eat.equals("myaso")) {
            throw new NeMyasoException("Tigr ne est " + eat);
        } else {
            System.out.println("Tigr est myaso");
        }
    }

    public void drink(String drink) throws NeVodaException {
        if (!drink.equals("voda")) {
            throw new NeVodaException("Tigr ne pyet " + drink);
        } else {
            System.out.println("Tigr pyet vodu");
        }
    }
}