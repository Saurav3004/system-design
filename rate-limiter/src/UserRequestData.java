public class UserRequestData {
    private int count;
    private long windowStartTime;

    UserRequestData(int count,long windowStartTime){
        this.count = count;
        this.windowStartTime = windowStartTime;
    }

    public long getWindowStartTime(){
        return windowStartTime;
    }

    public int getCount(){
        return count;
    }

    public void setCount(){
        count++;
    }
}