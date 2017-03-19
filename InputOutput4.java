public class InputOutput4 {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		String nama;
		Char jenisKelamin;
		int tinggiBadan;
		boolean menikah;

		System.out.print ("Masukkan Nama :");
		nama = input.nextLine();
		System.out.print ("Masukkan jenis Kelamin :");
		jenisKelamin = input.next(). charAt(0);
		System.out.print ("Masukkan Nama Tinggi Badan:");
		tinggiBadan = input.nextInt();
		System.out.print ("Masukkan Nama Status Menikah:");
		menikah = input.nextBoolean();
		}
}