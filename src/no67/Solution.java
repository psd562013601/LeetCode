package no67;


public class Solution {
    public String addBinary(String a, String b) {
    	int alen = a.length();
    	int blen = b.length();
    	if(alen < blen) {
    		String tmp=a;
    		a=b;//aÊÇ³¤µÄ
    		b=tmp;
    		alen =alen+blen;
    		blen = alen-blen;
    		alen=alen-blen;
    	}
    	String ret="";
    	int carry=0;
    	for(int i=alen-1; i>=0; i--) {
    		int indexb=i+blen-alen;
    		if(indexb>=0) {
    			carry = Character.digit(a.charAt(i), 2) + Character.digit(b.charAt(indexb), 2) + carry;
    		} else {
    			carry = Character.digit(a.charAt(i), 2) +carry;
    		}
			ret = String.valueOf(carry%2) + ret;
			carry = carry/2;
    	}
    	if(0!= carry) {
    		ret = String.valueOf(carry) + ret;
    	}
    	return ret;
    	
    }
    
    
    public static void main(String[] args) {
		System.out.println(new Solution().addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101", "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"));
	}
}