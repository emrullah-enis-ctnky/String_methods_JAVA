public class func {

	public static void main(String[] args) {
		String mesajString = "Merhaba dünya";
		System.out.println(mesajString);
		System.out.println("Eleman sayısı:" + mesajString.length());// Eleman sayısını bulmak için kullanılır
		System.out.println("5.eleman:" + mesajString.charAt(4));// Belirli bir indexteki elemanı alır
		System.out.println(mesajString.concat(" Hello World"));// Başka bir string veriyien sonuna ekler
		System.out.println(mesajString.startsWith("A"));// Verilen değerle başlayıp başlamadığını kontrol eder.Eğer
														// verilen değerle başlıyorsa true döner.
		System.out.println(mesajString.endsWith("a"));// Verilen değerle bitiyorsa true döner.
		char[] karakterler = new char[5];
		mesajString.getChars(0, 4, karakterler, 0);// Karakterler dizisine verilen değer aralığındaki kısmı
													// ekler.Birinci paramatre başlangıç indexini ikinci paramatre
													// bitişten bir sonraki indexi gösterir.Üçüncü parametre üzerinde
													// işlem yapılacak karakter dizisini belirtir.Son parametre ise
													// üzerinde işlem yapılacak dizinin hangi elemanından başlayarak bu
													// işlemin gerçekleşeceğini belirtir.
		System.out.println(karakterler);
		System.out.println(mesajString.indexOf("a"));// Verilen değerin kaçıncı indexte olduğunu döndürür.
		System.out.println(mesajString.lastIndexOf("a"));// Verilen değerin sondan kaçıncı indexte olduğunu döndürür.

		String newString = "Merhaba Dünya";
		System.out.println(newString.replace(' ', '-'));// Stringdeki boşluk karakterlerini bulur yerlerine çizgi ekler.
		System.out.println(newString.substring(2, 4));// Birinci verilen indexten ikinci verilen indexe kadar olan
														// karakterleri alır.
		for (String kelime : newString.split(" ")) {// Bu döngü değişkeni verilen değerlere göre böler ve her parçayı
													// tek tek yazar.

			System.out.println(kelime);

		}

		System.out.println(newString.toLowerCase());// Bütün harfleri küçük harfe çevirir.
		System.out.println(newString.toUpperCase());// Bütün harfleri büyük harfe çevirir.

		String myString = "   Merhaba dünya    ";
		System.out.println(myString.trim());// Verilen string'de eğer başta ya da sonda boşluk varsa boşlukları siler.


	}

}
