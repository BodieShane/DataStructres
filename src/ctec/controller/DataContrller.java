package ctec.controller;

import java.util.*;

import ctec.model.Customer;
import ctec.model.Dish;

public class DataContrller
{
	private Queue<Customer> customerQueue;
	private Stack<Dish> dishes;


	private void doStuffToDishes()
	{
		dishes = new Stack < Dish>();
		dishes.add(new Dish(true, dishes,8))
		System.out.println(dishes.size());
		dishes.pop();
		dishes.push(new Dish (flase, java.awt.color.Magenta, 54))
	}
	private void useThCustomerQueue()
	{
		customerQueue = new  LinkedList<Customer>();
		customerQueue.add(new Customer(false,"", 1234.3));
		customerQueue = remove();
	}
	private Queue<Customer> remove()
	{
		// TODO Auto-generated method stub
		return null;
	}

}
