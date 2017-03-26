
class mobil{
	//Atribut class pada mobil{
	String warna;
	String merk;
	String jenis;
	int tahunproduksi;
	
	void hidupkanMesin(){
		System.out.println("Mesin Mobil Hidup");
	}
	
	void maju(){
		System.out.println("Mobil Maju");
	}
	
	void berhenti(){
		System.out.println("Mobil Berhenti");
	}
	
	public static void main(String[] args){
		//Method class Mobil
		mobil Mobilku =new mobil(); //Kelas yang Dibuat
		Mobilku.warna="Hitam"; //Memakai data warna
		Mobilku.merk="Toyota"; //Memakai data Merk
		Mobilku.jenis="Minibus"; //Memakai data Type
		Mobilku.tahunproduksi=2006; //Memakai data Type
		
		System.out.println(Mobilku.warna);
		System.out.println(Mobilku.merk);
		System.out.println(Mobilku.jenis);
		System.out.println(Mobilku.tahunproduksi);
		
		//Memanghil method hidupkan mesin
		Mobilku.hidupkanMesin();
		//Memanggil Method Maju
		Mobilku.maju();
		//Memanggil Method berhenti
		Mobilku.berhenti();
	}
}