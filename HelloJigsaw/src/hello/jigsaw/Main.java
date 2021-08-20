package hello.jigsaw;

import hello.modules.HelloJavaClass;

public class Main
{

	public static void main(String[] args)
	{
		
		System.out.println("Hello Jigsaw!");
		
		System.out.format("Hello from %s!%n", HelloJavaClass.name());

	}

}
