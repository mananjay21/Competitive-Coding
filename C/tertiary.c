#include<stdio.h>
#include<conio.h>
void main()
{
	int a,b,c;
	scanf("%d%d%d",&a,&b,&c);
	
	a>b && a>c ? printf("a is greater "): b>c && b>a ? printf("B is largest") : printf("C is largest") ; 
	
	
}
