#include<stdio.h>
int main()
{
  //Type your code here
  int x,rem,sum=0;
  scanf("%d",&x);
  while(x>0)
  {
  rem=x%10;
  sum=sum+rem;
  x=x/10;
  }
  printf("%d",sum);
  return 0;
}