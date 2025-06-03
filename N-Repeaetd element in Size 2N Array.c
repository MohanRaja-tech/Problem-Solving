#include <stdio.h>
#include <stdlib.h>
#include <limits.h>

int repeatedNTimes(int* nums, int numsSize) {
    int max = INT_MIN;
    int min = INT_MAX;

   
    for (int i = 0; i < numsSize; i++) {
        if (nums[i] > max) max = nums[i];
        if (nums[i] < min) min = nums[i];
    }

    int range = max - min + 1;
    int* freq = (int*)calloc(range, sizeof(int));  

    for (int i = 0; i < numsSize; i++) {
        freq[nums[i] - min]++;
        if (freq[nums[i] - min] > 1) {
            free(freq);
            return nums[i];
        }
    }

    free(freq);
    return -1;
}
