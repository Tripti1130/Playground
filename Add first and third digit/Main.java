#include<stdio.h>
int main()
{
  //Type your code here
  int x,q,r,sum;
  scanf("%d",&x);
  q=x/100;
  r=x%10;
  sum=q+r;
  printf("%d",sum);
  return 0;
}