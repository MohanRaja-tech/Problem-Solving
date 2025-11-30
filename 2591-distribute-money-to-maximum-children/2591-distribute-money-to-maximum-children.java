class Solution {
    public int distMoney(int money, int children) {
        if (money < children) return -1; 
        if (money == 8 && children == 1) return 1; 
        if (money < 8) return 0; 

        int temp = money - children; 
        int count = 0;

        for (int i = 0; i < children; i++) {
            
            if (temp == 3 && (children - i) == 1) {
                count--;
                break;
            }
            if (temp < 7) break;

            temp -= 7;
            count++;
        }

        
        if (count == children && temp > 0) count--;

        return count;
    }
}