#include <string>
#include <iostream>

using namespace std;

string urlify(string s, int l)
{
    int i = s.length() - 1;

    for (int j = l - 1; j >= 0; j--)
        if (s[j] == 0x20)
        {
            s[i] = '0';
            s[--i] = '2';
            s[--i] = '%';
            i--;
        }
        else
        {
            s[i] = s[j];
            i--;
        }

    return s;
}


int main(int argc, char const* argv[])
{
    cout << urlify(" Mr John Smith      ", 14) << '\n';
    return 0;
}
