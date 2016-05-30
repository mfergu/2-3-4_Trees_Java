package two_three_four_trees;

class DataItem {
	//holds the data items stored in nodes
	//would normally contain inventory record or 
	//personnel data
	public long dData; //one data item
	
	public DataItem(long dd)
	{ //constuctor
		dData = dd;
	}
	
	public void displayItem()
	{
		System.out.print("/"+dData);		
	}
	
	

};
