package Com.hotel;

import java.io.Serializable;

class Food implements Serializable
{
	int itemno;
	int quantity;
	float price;
	public Food(int itemno, int quantity, float price)
	{
		this.itemno = itemno;
		this.quantity = quantity;

		switch(itemno)
		{
		case 1: price = quantity * 50;
		break;

		case 2: price = quantity * 60;
		break;

		case 3: price = quantity * 70;
		break;

		case 4: price = quantity * 80;
		break;
		}
	}
}


public class Hotel 
{

	public static void main(String[] args) 
	{


	}

}
