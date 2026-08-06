class Solution {
    public double angleClock(int hour, int minutes) {
        double t1=hour*30+(minutes/60.0)*30;
        double t2=(minutes*30)/5;
            double angle=Math.abs(t1-t2);
            return Math.min(angle,360-angle);

    }
}