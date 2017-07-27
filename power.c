#include<stdio.h>
#include<conio.h>
void main()
{
int b,exp;
long long result=1;
printf("enter the b")';
scanf("%d",b);
printf("enter the exp");
scanf("%d",exp);
while(exp!=0)
{
result*=b;
--exp;
}
printf("ans=%11d",result);
}
