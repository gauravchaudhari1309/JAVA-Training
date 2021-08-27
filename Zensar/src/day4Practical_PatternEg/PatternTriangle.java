package day4Practical_PatternEg;
//* pattern program 
public class PatternTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=10; i++)
		{
			for(int j=1;j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
//1
//23
//456
//
//1
//22
//33
//444
//55555
//
//A
//BC
//CDE
//FGHI
//
//A
//BB
//CCC
//DDDD
//
//*
//**
//***
//****
//******
//
//*****
//****
//***
//**
//*
//
//*
//**
//***
//****
//******
//****
//***
//**
//*
//
//
//*****
//****
//***
//**
//*
//**
//***
//****
//******
//
//    *
//   ***
//  *****
// *******
// 
// 
// *******
//  *****
//   ***
//    *
//    
//     *
//    ***
//   *****
//  *******
//   *****
//    ***
//     * 
// 