#include <iostream>
#include <string>

using namespace std;

bool isPalindromePermutation(string s)
{
    int letters[26];

    for (int i = 0; i < 26; i++)
        letters[i] = 0;

    for (int i = 0; i < s.length(); i++)
    {
        if (s[i] == ' ')
            continue;

        char c = s[i];
        if (c <= 'Z')
            c += 32;

        letters[c - 'a']++;
    }

    bool foundOdd = false;

    for (int i = 0; i < 26; i++)
    {
        if (letters[i] % 2 == 0)
            continue;

        if (!foundOdd)
        {
            foundOdd = true;
            continue;
        }

        return false;
    }

    return true;
}

int main(int argc, char const* argv[])
{
    cout << isPalindromePermutation("Tact Coa") << '\n';
    cout << isPalindromePermutation("Tact Co") << '\n';
    cout << isPalindromePermutation("i nn a a") << '\n';
    cout << isPalindromePermutation("nins si") << '\n';
    return 0;
}
