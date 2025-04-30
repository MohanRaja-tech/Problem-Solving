#include<string.h>
bool check_equal(int nums1[], int nums2[]){
    for(int i=0;i<26;i++){
        if(nums1[i]!=nums2[i]){
            return false;
        }
    }
    return true;
}
bool checkInclusion(char* s1, char* s2) {
    int freq[26];
    int window[26];
    int len1 = strlen(s1);
    int len2 = strlen(s2);
    if(len1 > len2){
        return false;
    }
    
    for(int i=0;s1[i]!='\0';i++){
        freq[s1[i]-'a']++;
    }
    for(int i=0;s2[i]!='\0';i++){
        window[s2[i]-'a']++;
        if(i >= len1){
            window[s2[i-len1]-'a']--;
        }
        if(check_equal(freq,window)){
            return true;
        }
    }
    return false;
}
