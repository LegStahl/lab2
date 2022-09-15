public class Matrix{

	private int [][] mtrx;

	public Matrix(int a){
		//boolean check = true;
		//if(n < 0){
		//	check = false;
			//n = - n;
		//}
		mtrx = new int[a][a];
		
		//int k = n;
		//int iBeg  = a;
		//int iEnd = 0;
		//int jBeg = 0;
		//int jEnd = a;
		//int step = 0;
		//while(step < a * a){
			//for(int i = --iBeg; i >= iEnd; i--){
			//	mtrx[i][jBeg] = k++;
			//	step++;
			//}
			//for(int i = ++jBeg; i < jEnd; i++){
			//	mtrx[iEnd][i] = k++;
			//	step++;
			//	System.out.println(this);
			//}
			//for(int i = ++iEnd; i < iBeg; i++){
			//	mtrx[i][jEnd - 1] = k++;
			//	step++;
			//	System.out.println(this);
			//}
			//for(int i = --jEnd; i >= jBeg; i--){
			//	mtrx[iBeg][i] = k++;
			//	step++;
			//	System.out.println(this);
			//}
		//}
		//if(!check){
		//	for(int i = 0; i < a; i++)
		//		for(int j = 0; j < a; j++)
		//			mtrx[i][j] = -mtrx[i][j];
		//}
		for( int i = 0; i < a; i++){
			for( int j = 0; j < a; j++){
				if( i == j ){
					mtrx[i][j] = 1;
				}
				else {
					mtrx[i][j] = 0;
				}
			}
		}
	}
	
	public int getMtrx(int row, int column){
		return mtrx[row][column];
	}
	
	public void setMtrx(int row, int column, int val){
		mtrx[row][column] = val;
	}
	
	public Matrix sum(Matrix a){
		Matrix time = new Matrix(mtrx.length);
		for( int i = 0; i < mtrx.length; i++){
			for( int j = 0; j < mtrx.length; j++){
				time.mtrx[i][j] = mtrx[i][j] + a.mtrx[i][j];
			}
		}
		return time;
	}

	public Matrix product(Matrix a){
		Matrix time = new Matrix(mtrx.length);
		int res = 0;
		for( int i = 0; i < mtrx.length; i++){
			for( int j = 0; j < mtrx.length; j++){
				for( int k = 0; k < mtrx.length; k++){
					res += mtrx[i][k] * a.mtrx[k][j];
				}
				time.mtrx[i][j] = res;
				res = 0;
			}
		}
		return time;
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		for( int i = 0; i < mtrx.length; i++){
			for( int j = 0; j < mtrx.length; j++){
				sb.append(mtrx[i][j]);
				sb.append(" ");
			} 
			sb.append("\n");
		}
		return sb.toString();
	
	}
}