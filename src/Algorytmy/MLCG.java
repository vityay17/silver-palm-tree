package Algorytmy;

public class MLCG {
	private long m;
	private long a;
	private long x;

	public long genRand(){
		x = (a*x) % m;
		return x;
	}
	
	/**
	* generowanie liczb pseudolosowych LCG
	* @param m - wspolczynnik
	* @param a - wspolczynnik
	* @param x - wartosc ziarna x[1]
	* @param n - ile liczb pseudolosowych wylosowac
	* @param low - dolna wartosc zakresu generowanych liczb
	* @param high - gorna wartosc zakresu generowanych liczb
	*/
	public double[] main(long m,long a,long x,int n,long low,long high) {
		this.m = m;
		this.a = a;
		this.x = x;
		double[]k = new double[n];
		for (int i=0; i<n; i++) {
			k[i] = (double) (low + (genRand() % (high - low + 1)));
		}
		return k;
	}
}
