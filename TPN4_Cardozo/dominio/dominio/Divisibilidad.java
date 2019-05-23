package dominio;

public class Divisibilidad {

		public static int num, prod=0, suma1=0, b=0, suma2=0;

		public static boolean esDivisiblePorDos(int i) {
			num=i%10;
			if(num%2==0)
				return true;
			else
				return false;
		}

		public static boolean esDivisiblePorTres(int i) {
			suma1=0;
			if(i<10)
				suma1=i;
			while(i>10) {
				b=i%10;
				i/=10;
				suma1+=b;
			}
			suma1+=i;
			if(suma1%3==0)
				return true;
			else
				return false;
		}

		public static boolean esDivisiblePorCuatro(int i) {
			if(i>100)
				i=i%100;
			if(i%4==0 || i==00)
				return true;
			else
				return false;
		}

		public static boolean esDivisiblePorCinco(int i) {
			if(i>10)
				num=i%10;
			if(num==0 || num==5)
				return true;
			else
				return false;
		}

		public static boolean esDivisiblePorSeis(int i) {
			if((i%2==0)&&(i%3==0))
				return true;
			else
				return false;
		}

		public static boolean esDivisiblePorSiete(int i) {
			if(i>10) {
				b=i%10;
				b*=2;
				i/=10;
			}
			if(b-i==0 || (b-i)%7==0)
				return true;
			else
				return false;
		}

		public static boolean esDivisiblePorOcho(int i) {
			if(i>1000)
				i=i%1000;
			if(i%8==0 || i==000)
				return true;
			else
				return false;
		}

		public static boolean esDivisiblePorNueve(int i) {
			if(i<10)
				suma1=i;
			while(i>10) {
				b=i%10;
				i/=10;
				suma1+=b;
			}
			suma1+=i;
			if(suma1%9==0)
				return true;
			else
				return false;
		}

		public static boolean esDivisiblePorDiez(int i) {
			if(i%10==0)
				return true;
			else
				return false;
		}

		public static boolean esDivisiblePorOnce(int i) {
			int cond=0, mod=0;
			if(num<10)
				suma1=num;
			while(num>10) {
				b=num%10;
				num/=10;
				suma1+=b;
				cond=1;
				if(num<10)
					break;
				mod=num%10;
				num/=10;
				suma2+=mod;
				cond=0;
			}
			if(cond==1)
				suma2+=num;
			else
				suma1+=num;
			if(suma1-suma2==0 || (suma1-suma2)%11==0)
				return true;
			else
				return false;
		}		
}