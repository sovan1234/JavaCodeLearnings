package localedemo;

import java.util.Locale;

class LocaleDemo
{
    public static void main(String[] args)
    {
        Locale l = Locale.getDefault(); //default value of default locale of jvm
        System.out.println(l); 
        System.out.println(l.getDisplayCountry()); // name of the country
        System.out.println(l.getCountry()); // code of the country
        System.out.println(l.getDisplayLanguage()); // country language
        System.out.println(l.getLanguage()); // language code
    }
}