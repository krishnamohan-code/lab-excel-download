package model;


//Progression -1 
//Create a class called ProGrad with the following parameters
//
//	private String name;
//	private String id;
//	private String rate;
//	private String comment;
//	private String recommend;
//	
//Generate getters and setters.
//Generate a constructor with the following parameters (String name, String id, String rate, String comment, String recommend)

public class Prograd
{
	private String name;
	private String id;
	private String rate;
	private String comment;
	private String recommend;
	public Prograd(String name, String id, String rate, String comment, String recommend)
	{
		this.name=name;
		this.id=id;
		this.rate=rate;
		this.comment=comment;
		this.recommend=recommend;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setId(String id)
	{
	this.id=id;
	}
   public String getId()
   {
	   return id;
   }
   public void setRate(String rate)
	{
	this.rate=rate;
	}
   public String  getRate()
	{
	return  rate;
	}
   public void setComment(String comment)
	{
	this.comment=comment;
	}
   public String getComment()
   {
	   return comment;
   }
   public void setRecommend(String recommend)
	{
	this.recommend=recommend;
	}
   public String getRecommend()
	{
	return recommend;
	}
}
	