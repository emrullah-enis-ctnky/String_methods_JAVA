# Java String Metotları

Bu dokümanda, Java'da **String** sınıfına ait çeşitli metotların nasıl kullanılacağını gösteren bir örnek incelenecektir.

## 📌 Kod Açıklaması

Aşağıda verilen kod, farklı String metotlarını kullanarak çeşitli işlemler gerçekleştirmektedir.

```java
public class func {

	public static void main(String[] args) {
		String mesajString = "Merhaba dünya";
		System.out.println(mesajString);
		
		// String uzunluğunu bulma
		System.out.println("Eleman sayısı:" + mesajString.length());
		
		// Belirli bir indexteki karakteri alma
		System.out.println("5.eleman:" + mesajString.charAt(4));
		
		// Metne başka bir string ekleme
		System.out.println(mesajString.concat(" Hello World"));
		
		// Belirli bir harf ile başlayıp başlamadığını kontrol etme
		System.out.println(mesajString.startsWith("A"));
		
		// Belirli bir harf ile bitip bitmediğini kontrol etme
		System.out.println(mesajString.endsWith("a"));
		
		// Belirli karakterleri bir diziye aktarma
		char[] karakterler = new char[5];
		mesajString.getChars(0, 4, karakterler, 0);
		System.out.println(karakterler);
		
		// Belirli bir karakterin ilk ve son indeksini bulma
		System.out.println(mesajString.indexOf("a"));
		System.out.println(mesajString.lastIndexOf("a"));
		
		// String içinde karakter değiştirme
		String newString = "Merhaba Dünya";
		System.out.println(newString.replace(' ', '-'));
		
		// Belirli bir aralıktaki substringi alma
		System.out.println(newString.substring(2, 4));
		
		// String'i belirli bir karaktere göre bölme
		for (String kelime : newString.split(" ")) {
			System.out.println(kelime);
		}
		
		// String'i küçük harfe ve büyük harfe çevirme
		System.out.println(newString.toLowerCase());
		System.out.println(newString.toUpperCase());
		
		// Başında ve sonunda boşluk olan bir string'in boşluklarını temizleme
		String myString = "   Merhaba dünya    ";
		System.out.println(myString.trim());
	}
}
```

## 📝 Kullanılan Metotlar ve Açıklamaları

| Metot | Açıklama |
|--------|-------------|
| `length()` | String'in uzunluğunu döndürür. |
| `charAt(int index)` | Belirtilen index'teki karakteri döndürür. |
| `concat(String str)` | String'in sonuna belirtilen metni ekler. |
| `startsWith(String prefix)` | String'in belirtilen ön ek ile başlayıp başlamadığını kontrol eder. |
| `endsWith(String suffix)` | String'in belirtilen son ek ile bitip bitmediğini kontrol eder. |
| `getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)` | String'in belirli bir bölümünü bir karakter dizisine kopyalar. |
| `indexOf(String str)` | Belirtilen karakterin ilk bulunduğu index'i döndürür. |
| `lastIndexOf(String str)` | Belirtilen karakterin son bulunduğu index'i döndürür. |
| `replace(char oldChar, char newChar)` | Belirtilen karakterleri değiştirir. |
| `substring(int beginIndex, int endIndex)` | Belirtilen aralıktaki alt string'i döndürür. |
| `split(String regex)` | String'i belirtilen karaktere göre böler ve bir dizi döndürür. |
| `toLowerCase()` | Tüm harfleri küçük harfe çevirir. |
| `toUpperCase()` | Tüm harfleri büyük harfe çevirir. |
| `trim()` | String'in başında ve sonunda bulunan boşlukları siler. |

## 🎯 Çıktı Örneği

Kodun çalıştırılması sonucu aşağıdaki çıktıyı alırsınız:

```
Merhaba dünya
Eleman sayısı:13
5.eleman:b
Merhaba dünya Hello World
false
true
Merh
4
11
Merhaba-Dünya
rh
Merhaba
Dünya
merhaba dünya
MERHABA DÜNYA
Merhaba dünya
```

Bu doküman, Java'daki **String** sınıfının temel metotlarını anlamanızı sağlayacak şekilde düzenlenmiştir. Daha fazla bilgi için [Java Resmi Dokümantasyonu](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html) kaynağını ziyaret edebilirsiniz. 🚀

