	import java.lang.System;

	interface Area
	{ 

	 	void PrintArea();

	}

interface Volume
	{

		void PrintVolume();

	}

	interface Perimeter
	{

		void PrintPerimeter();

	}

	

 //START OF CLASS CUBE
	class Cube implements Area,Volume,Perimeter
	{
	double side,area,volume,perimeter ;
	

	Cube( double side)  //Cube Constructor for side length
	{
	this.side =side;
	}

	public void PrintPerimeter()
	{
		perimeter = 12 *side; 
		System.out.println("Perimeter of the Cube is:" + this.perimeter );

	}
	public void PrintArea()
	{
		area = 6 *side*side;
		System.out.println("Area of the Cube is:" + this.area );

	}
	public void PrintVolume() 
	{
		volume =  side*side*side;
		System.out.println("Volume of the Cube is:" + this.volume );

	}
	}//End of Class Cube

	class Sphere implements Area,Volume
	{final double pi=3.14;
		double radius,area,volume,length;


		Sphere(double radius)
		{
			this.radius=radius;
		}
		
		
	public void PrintArea()
	{
		area = 4.0 *pi*radius*radius;
		System.out.println("Area of the Sphere is:" + area );

	}
	public void PrintVolume() 
	{
		volume =  4.0 *pi*radius*radius*radius;
		volume = volume/3.0;
		System.out.println("Volume of the Sphere is:" + volume );

	}

	}


	class INTERFACE
	{
		public static void main(String args[])
		{	
			Area A;
			Volume V;
			Perimeter P;
			Cube C =new Cube (30.0);

			A=C;
			A.PrintArea();
			V=C;
			V.PrintVolume();
			P=C;
			P.PrintPerimeter();


			Sphere S =new Sphere(4.0f);

			A=S;
			A.PrintArea();
			V=S;
			V.PrintVolume();
		}
}