interface Calci{
	int sum(int n1, int n2);
}

public CalciImpl implements Calci{
	int sum(int n1, int n2){
		return n1+n2;
	}
}