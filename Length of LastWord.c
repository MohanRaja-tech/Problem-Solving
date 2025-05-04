#include <stdio.h>
#include <string.h>
#include <stdbool.h>

int lengthOfLastWord(char* s) {
    int count = 0;
    bool flag = true;

    for (int i = strlen(s) - 1; i >= 0; i--) {
        if (s[i] == ' ') {
            continue;
        } else {
            int temp = i;
            while (flag && temp >= 0) {
                if (s[temp] != ' ') {
                    count++;
                    temp--;
                } else {
                    flag = false;
                }
            }

        }
        break;
    }

    return count;
}
