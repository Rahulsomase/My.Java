package Day_11;

// Question -2
public interface Hotel {
    void chickenBiryani();
    void masalaDosa();
}

class TajHotel implements Hotel{
    public void chickenBiryani() {
        System.out.println("Chicken Biriyani at taj");
    };

    public void masalaDosa(){
        System.out.println("Dosa at taj");
    }

    public void welcomeDrink(){
        System.out.println("Welcome Drink from the TajHotel");
    }
}

class RoadSideHotel implements Hotel{
    public void chickenBiryani() {
        System.out.println("Chicken Biriyani at RoadSide Hotel");
    };

    public void masalaDosa(){
        System.out.println("Dosa at Road side Hotel");
    }
}

