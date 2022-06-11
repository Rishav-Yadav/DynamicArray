public class DynamicArray {
	private int data[];
	private int nextIndex;
	DynamicArray() {
		data=new int[5];
		nextIndex=0;
	}
	public void add(int element) {
		if(nextIndex>=data.length)
			restructure();
			data[nextIndex]=element;
			nextIndex++;
			}
	private void restructure() {
		int temp[]=data;
		data=new int[nextIndex*2];
		for(int i=0;i<temp.length;i++)
				data[i]=temp[i];
		}
	public int get(int index) {
		if(index>=nextIndex) 
			return -1;
		else
			return data[index];}
public void set(int index,int element) {
	if(index>nextIndex) 
		return;
	if(index==nextIndex)
		add(element);
	if(index<nextIndex)
		data[index]=element;
	nextIndex++;}
		
public boolean isEmpty() {
	if(nextIndex==0)
		return true;
	else return false;}
public int size() {
	return nextIndex;}
public int removeLast() {
	if(size()==0) {return -1;}
	int temp=data[nextIndex-1];
	data[nextIndex-1]=0;
	nextIndex--;
	return temp;}
	
	}
