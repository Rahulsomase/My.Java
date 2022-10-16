
public abstract class RBIBANK {

 int getRBI(){
     return 0;
 }

    abstract int getRoI();
}

class SBI extends RBIBANK{
    @Override
    int getRoI(){
        return (int) 7.5;
    }
}
class HDFC extends RBIBANK{
    @Override
    int getRoI(){
        return 8;
    }

}

