import java.util.Arrays;
class InterpolationSearchAlgo {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8};
		int size = arr.length;
		
		System.out.println("Number found at "+InterpolationSearch(arr,8,size-1));
		
	}
	
	public static int InterpolationSearch(int[] arr , int data, int end){
		//Arrays.sort(arr);
		//for(Integer i : arr)System.out.println(i);
		int mid = 0;
		int start = 0;
		int counter = 1;
		while (start <= end) {
			mid = start+((end-start)/(arr[end] - arr[start]))*(data - arr[start]);
			
			System.out.println(start+" "+end);			
			if(arr[mid] == data ){
				System.out.println("Number of loop : "+counter);
				return mid+1;
			}else if(arr[mid] > data){
				end = mid-1;
			}else{
				start = mid+1;
			}
			counter++;
		}
		
		System.out.println("Not found after : "+counter+" try");
		return -1;
	}
}