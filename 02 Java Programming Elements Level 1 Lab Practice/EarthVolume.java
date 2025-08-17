//Write a Program to compute the volume of Earth in km^3 and miles^3. Radius of Earth = 6378 km.

public class EarthVolume {
    public static void main(String[] args){

        //storing the radius of earth in kilometers
        double radiusKm = 6378;

        //calculating the volume of earth in cubic kilometers using formula (4/3) * π * r^3
        double volumeKm = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);

        //converting radius from kilometers to miles (1 km = 0.621371 miles)
        double radiusMiles = radiusKm * 0.621371;

        //calculating the volume of earth in cubic miles
        double volumeMiles = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);

        //displaying the required result
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm + " and cubic miles is " + volumeMiles);
    }
}
