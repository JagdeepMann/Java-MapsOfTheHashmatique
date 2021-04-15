package Default;

import java.util.HashMap;
import java.util.Set;

//	Tasks:
//
//  Create a trackList of type HashMap
//
//  Add in at least 4 songs that are stored by title
//
//  Pull out one of the songs by its track title
//
//  Print out all the track names and lyrics in the format Track: Lyrics

public class MapsOfTheHashmatique {

	public void songs() {

		HashMap<String, String> trackList = new HashMap<String, String>();
		trackList.put("Track Title 1", "Lyrics 1");
		trackList.put("Track Title 2", "Lyrics 2");
		trackList.put("Track Title 3", "Lyrics 3");
		trackList.put("Track Title 4", "Lyrics 4");
		trackList.put("Track Title 5", "Lyrics 5");

		String song = trackList.get("Track Title 3");

		System.out.println(song);

		Set<String> keys = trackList.keySet();
		for(String key : keys) {
			System.out.println(key);
			System.out.println(trackList.get(key));    
		}

		
		
		
	}

}
