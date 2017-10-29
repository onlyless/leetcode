class Solution {
    public int addDigits(int num) {
        List<Integer> list = new ArrayList<>();
        list.add(num);
        while(list.get(list.size()-1)>9){
            int temp = list.get(list.size()-1);
            int sum = 0;
            while(temp>9){
                sum += temp%10;
                temp /= 10;
            }
            sum += temp;
            list.add(sum);
        }
        return list.get(list.size()-1);
    }
}
