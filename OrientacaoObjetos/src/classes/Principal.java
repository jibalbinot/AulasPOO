package classes;

import java.util.Arrays;
import java.util.Random;
import java.util.random.RandomGenerator;

public class Principal {
	public static void main(String[] args) {
		Aluno a = new Aluno();
		a.setId(0);
		a.setNome(null);
		a.setEmail(null);
		a.setSenha(null);
		// System.out.println(a.getId());

		final int TAM = 10;
		final boolean MOSTRA = true;
		int[] v = new int[TAM];
		long inicio, fim;

		v = geraVetor(v,TAM);
		System.out.println("Bubble Sort:");
		mostra(v,MOSTRA);
		inicio = System.currentTimeMillis();
		// bubble sort
		for (int i = 0; i < v.length - 1; i++) {
			for (int j = 0; j < v.length - i - 1; j++) {
				if (v[j] > v[j + 1]) {
					int temp = v[j];
					v[j] = v[j + 1];
					v[j + 1] = temp;
				}

			}
		}
		fim = System.currentTimeMillis();
		mostra(v,MOSTRA);
		System.out.println("Tempo: "+(fim-inicio));

		v = geraVetor(v,TAM);
		System.out.println("Shell Sort:");
		mostra(v,MOSTRA);
		inicio = System.currentTimeMillis();
		// shell sort
		int n = v.length;
		for (int gap = n / 2; gap > 0; gap /= 2) {// meio como gap e vai dividindo
			for (int i = gap; i < n; i++) {
				int aux = v[i];
				int j = i;
				while (j >= gap && aux < v[j - gap]) {
					v[j] = v[j - gap];
					j -= gap;
				}
				v[j] = aux;
			}
		}
		fim = System.currentTimeMillis();
		mostra(v,MOSTRA);
		System.out.println("Tempo: "+(fim-inicio));

		
		v = geraVetor(v,TAM);
		System.out.println("Merge Sort:");
		mostra(v,MOSTRA);
		inicio = System.currentTimeMillis();
		// merge sort
		int[] vaux = new int[v.length];
		mergeSort(v, vaux, 0, v.length - 1);
		fim = System.currentTimeMillis();
		mostra(v,MOSTRA);
		System.out.println("Tempo: "+(fim-inicio));
	}

	private static int[] geraVetor(int[] v, int TAM) {
		Random gerador = new Random();
		for (int i = 0; i < v.length; i++) {
			//v[i] = gerador.nextInt(TAM * 10);//medio
			v[i] = i;//ordem crescente
			//v[i] = i-TAM;//ordem decrescente
		}
		return v;
	}

	private static void mostra(int[] v, boolean flag) {
		if(flag)
		System.out.println(Arrays.toString(v));
	}

	private static void mergeSort(int[] v, int[] vaux, int ini, int fim) {
		if (ini < fim) {
			int meio = (ini + fim) / 2;
			mergeSort(v, vaux, ini, meio);
			mergeSort(v, vaux, meio + 1, fim);
			intercalar(v, vaux, ini, meio, fim);
		}

	}

	private static void intercalar(int[] v, int[] vaux, int ini, int meio, int fim) {
		// copia para o auxiliar
		for (int i = ini; i <= fim; i++)
			vaux[i] = v[i];

		int esq = ini;
		int dir = meio + 1;

		for (int j = ini; j <= fim; j++) {
			if (esq > meio)
				v[j] = vaux[dir++];// acabou da esquerda anda na direita
			else if (dir > fim)
				v[j] = vaux[esq++]; // acabou na direita anda na esquerda
			else if (vaux[esq] < vaux[dir]) //elemento esquerda menor
				v[j] = vaux[esq++];//ele vai pro vetor e anda o contador esq
			else
				v[j] = vaux[dir++];//ele vai pro vetor e anda o contador dir
		}
	}
}
