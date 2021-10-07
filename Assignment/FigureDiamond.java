class FigureDiamond{
	
	public static void main(String... args){
		int  n=5;
	int str=1;
	int spc=n-1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=str;j++){
				System.out.print("*");
				for(int k=1;k<=spc;k++){
				System.out.print(" ");
			}
			}
			str++;
			spc--;
	}System.out.println();
}
}