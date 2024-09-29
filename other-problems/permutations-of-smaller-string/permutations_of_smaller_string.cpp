#include <string>
#include <iostream>

using namespace std;

// This problem is mentioned in page 70

// Given a smaller string s and a bigger string b, design an algorithm to find all permutations of the shorter string within the longer one.
// Print location of each permutation.

void printIndices(string s, string b)
{
    int charsS[256];
    int charsW[256];

    for (int i = 0; i < 256; i++)
    {
        charsS[i] = 0;
        charsW[i] = 0;
    }

    for (int i = 0; i < s.length(); i++)
        charsS[s[i]]++;

    for (int i = 0; i < b.length(); i++)
    {
        charsW[b[i]]++;
        if (i - (int)s.length() >= 0)
            charsW[b[i - s.length()]]--;

        int j = 0;
        for (; j < 256; j++)
            if (charsS[j] != charsW[j])
                break;

        if (j == 256)
            cout << i - s.length() + 1 << '\n';
    }
}


int main()
{

    printIndices("abcc", "aabdccabcabceda");
    return 0;
}