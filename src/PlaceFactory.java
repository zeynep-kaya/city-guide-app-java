public class PlaceFactory {
	
	public static Place createPlace(String placeType,String name,Address address, Phone phone,String price,String season,String information,
			int distance_to_center,boolean[] facilities,int rate) {
		 if(placeType.equalsIgnoreCase(Accommodation.class.getSimpleName()))
			return new Accommodation(name, placeType, address, phone, price, rate);
		else if(placeType.equalsIgnoreCase(FoodAndDrink.class.getSimpleName()))
			return new FoodAndDrink(name, address, phone, placeType, price, facilities, rate);
		else if(placeType.equalsIgnoreCase(TravelToVisit.class.getSimpleName()))
			return new TravelToVisit(name, placeType, address, phone, season, information, Integer.valueOf(price),
					distance_to_center, facilities, rate);
		else 
			return null;
	
	}

	
}
