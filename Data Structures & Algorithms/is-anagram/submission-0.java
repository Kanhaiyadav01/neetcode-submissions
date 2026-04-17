class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        char temp_s[] = s.toCharArray();
        char temp_t[] = t.toCharArray();

        Arrays.sort(temp_s);
        Arrays.sort(temp_t);

        return Arrays.equals(temp_s , temp_t);

       
    }
}
