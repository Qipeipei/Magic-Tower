package Model;

/*
 * This class for storing the data of our maps
 * maps are stored in a 3D array
 * There are also two method inside for getting one single map & getting the total amout of maps
 *  
 * */

public class MapFactory {
	static byte maps [][][] = { { { 4, 4, 4, 4, 4 },
								  { 4, 3, 3, 3, 4 },
								  { 4, 3, 3, 3, 4 },
								  { 4, 3, 3, 3, 4 },
								  { 4, 4, 4, 4, 4 } } }; //'int' could change into 'byte' for saving memory          
	
	static int count = maps.length;
	
	//Get one single map (3D->2D)
	public static byte[][] getMap (int level){
		
		//pump the specified level's map
		byte temp[][];
		if(level >= 0 && level < count) {
			temp = maps[level];
		}else { //avoid exception                                                  
			temp = maps[0];
		}
		
		//transmit the temporary one to the result (avoid change the map data since it's static)
		int row = temp.length;
		int column = temp[0].length;
		byte map[][] = new byte[row][column];
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				map[i][j] = temp[i][j]; 
			}
		}
		return map;
	}
	
	//Get maps's amount
	public static int getCount() {
		return count;
	}
	

}
