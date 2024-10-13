package org.ads.sort;

public class HeapSort{
	
	void heapify(int arr[],int n,int i){
		int largest=i; //root
		int l=2*i + 1; // lc
		int r=2*i + 2; //rc
		
		
		if (l<n && arr[l]> arr[largest]){
			largest=l;
		}	
		if (r<n && arr[r] > arr[largest]){
			largest=r;
		}
	
		if (largest !=i){
			
			int temp=arr[i];
			arr[i]=arr[largest];
			arr[largest]=temp;
			
		
			heapify(arr,n,largest);
		}
		
		
		
	}
	
	void heapsort(int arr[]){
		int n=arr.length;
		
		//building max heapify
		
		for (int i=n/2-1; i>=0;i--){
			heapify(arr,n,i);
		}
		
		//one by one extract elemets from the heap 
		for (int i=n-1;i>0;i--){
			
			//reaplce root node last element
			int temp = arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			display(arr);
			heapify(arr,i,0);
			
			
		}
		
		
		
	}
	
	void display(int arr[]){
		int n=arr.length;
		for(int i=0 ;i<n;i++){
			System.out.print(arr[i]+"	");
		}
		System.out.println();
	}
	
	public static void main (String [] args){
		
		HeapSort h1=new HeapSort();
		
		int arr[]={99,66,77,44,33,88,11};
		h1.display(arr);
		
		
		h1.heapsort(arr);
		h1.display(arr);
		
		
		
		
		
	}
	
	
}