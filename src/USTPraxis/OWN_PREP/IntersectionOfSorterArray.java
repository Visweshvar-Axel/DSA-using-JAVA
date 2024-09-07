package USTPraxis.OWN_PREP;

import java.util.* ;

public class IntersectionOfSorterArray
{
	public static ArrayList<Integer> findArrayIntersection(ArrayList<Integer> arr1, int n, ArrayList<Integer> arr2, int m)
	{
		ArrayList<Integer> res = new ArrayList<>();
		int i=0,z=0;
		while(i < n && z < m){
			if(arr1.get(i) < arr2.get(z)){
				i++;
			} else if(arr1.get(i) > arr2.get(z)){
				z++;
			} else {
				res.add(arr1.get(i));
				i++;
				z++;
			}
		}
		return res;
		//                               using map 
		// Map<Integer,Integer> fre = new HashMap<>();
		// for(int i: arr1){
		// 	fre.put(i, fre.getOrDefault(i,0)+1);
		// }
		// ArrayList<Integer> res = new ArrayList<>();
		// // for(Map.Entry<Integer,Integer> e :fre.entrySet()){
		// for(int i: arr2){
		// 	if(fre.containsKey(i) && fre.getOrDefault(i,0)>0){
		// 		res.add(i);
		// 		fre.put(i, fre.get(i)-1);
		// 	}
		// }
		// return res;
		//                            below has some error
		// if(n == 0 || m == 0) return new ArrayList<>();
		// ArrayList<Integer> res = new ArrayList<>();
		// int i=0,z=0;
		// while(i<n && z<m){
		// 	if(arr1.get(i) == arr2.get(z)) {
		// 		res.add(arr1.get(i));
		// 		i++;
		// 		z++;
		// 	} else if(arr1.get(i) < arr2.get(z)) {
		// 		i++;
		// 	} else {
		// 		z++;
		// 	}
		// }
		// return res;
	}
}
