package FTEMockTest;

public class RevBinaryDigits {
	
	public static void main(String args[]) {
		RevBinaryDigits rbd = new RevBinaryDigits();
		System.out.println(rbd.revBinaryNum1(10));
	}
	
	public int revBinaryNum1(int num) {
		
		int result = 0;
		for(int i=0;i<32;i++) {
			result = result<<1;
			if((num>>i & 1) == 1)
				result++;
			
		}
		return result;
	}
public int revBinaryNum(int num) {
		
		num = (num & 0xaaaaaaaa)>>1 | ((num<<1) & 0xaaaaaaaa);
		num = (num & 0xcccccccc)>>2 | ((num<<2) & 0xcccccccc);
		num = (num & 0xf0f0f0f0)>>4 | ((num<<4) & 0xf0f0f0f0);
		num = (num & 0xff00ff00)>>8 | ((num<<8) & 0xff00ff00);
		num = (num & 0xffff0000)>>16 | ((num<<16) & 0xffff0000);
				
		return num;
	}
}
