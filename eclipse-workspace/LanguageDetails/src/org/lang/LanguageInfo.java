package org.lang;
//c
public class LanguageInfo extends StateDetails{
	private void tamilLang() {
		System.out.println("Tamil");
	}
	private void engLang() {
		System.out.println("English");
	}
	private void hindiLang() {
		System.out.println("Hindi");
	}
	public static void main(String[] args) {
		LanguageInfo lang = new LanguageInfo();
		lang.tamilLang();
		lang.engLang();
		lang.hindiLang();
		StateDetails st = new StateDetails();
		st.southIndia();
		st.northIndia();
	}
}
