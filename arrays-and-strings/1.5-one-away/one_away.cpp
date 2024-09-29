#include <string>
#include <iostream>

using namespace std;

bool oneAway(string s, string t)
{
    string small = s.length() < t.length() ? move(s) : move(t);
    string big = s.length() < t.length() ? move(t) : move(s);

    if (big.length() - small.length() > 1)
        return false;


    bool foundDiff = false;
    int j = 0;
    for (int i = 0; i < big.length() - 1; i++)
    {
        if (foundDiff && small[j] != big[i])
            return false;


        if (small[j] != big[i])
        {
            foundDiff = true;
            if (small.length() < big.length())
                continue;
        }
        j++;
    }


    return true;
}

int main(int argc, char const* argv[])
{
    cout << oneAway("pale", "ple") << '\n';
    cout << oneAway("pales", "pale") << '\n';
    cout << oneAway("pale", "bale") << '\n';
    cout << oneAway("pale", "bake") << '\n';
    cout << oneAway("nicolas", "ncolas") << '\n';
    cout << oneAway("nicolas", "nolas") << '\n';

    return 0;
}
