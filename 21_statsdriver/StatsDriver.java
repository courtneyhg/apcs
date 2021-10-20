public class StatsDriver{
	public static void main (String [] args){
		Stats calc = new Stats();
		
		calc.mean(10, 10); // mean should be 10
		calc.mean(-2, 4); // mean should be 1
		calc.mean(0, 30); // mean should be 15
		
		calc.mean(2.5, 7.5); // mean should be 5
		calc.mean(-1.5, 3); // mean should be 0.75 
		calc.mean(3.0, 2.0); // mean should be 2.5
		
		calc.max(45, 89); // max should be 89
		calc.max(36, -780); // max should be 36
		calc.max(6, 0); // max should be 6
		
		calc.max(4.5, 8.9); // max should be 8.9
		calc.max(1.9, 1.99); // max should be 1.99
		calc.max(667.2, -5.6); // max should be 667.2
		
		calc.geoMean(10, 10); // geoMean should be 10
		calc.geoMean(4, 64); // geoMean should be 16
		calc.geoMean(5, 45); // geoMean should be 15
		
		calc.geoMean(); // geoMean should be
		calc.geoMean(); // geoMean should be
		calc.geoMean(); // geoMean should be
