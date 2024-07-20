#include <iostream>

using namespace std;
const int N = 10;
int V[N] = {2, 5 , 10, 17, 30, 35, 40, 56, 100};
int CautareBinara(int x)
{
    int Sol = -1, Left = 0, Right = N;
    while(Left <= Right)
    {
        int Mid = (Left+Right) / 2;
        if(V[Mid] == x)
        {
            Sol = Mid;
            break;
        }
        if(V[Mid] > x)
            Right = Mid - 1;
        if(V[Mid] < x)
            Left = Mid + 1;
    }
    return Sol;
}
int main()
{
    int x = 30;
    cout << CautareBinara(x);
    return 0;
}
