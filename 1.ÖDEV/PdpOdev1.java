/**
*
* @author BÜŞRA BAHAR busra.bahar89@gmail.com
* @since 01.03.2020
* <p>
* PDP 1. ODEV:
* </p>
*/
package pdpodev1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class PdpOdev1 {

    
    public static void main(String[] args) throws IOException
    {
        int sesliHarf = 0;
        int kelimeSayisi=0;
        int cumleSayisi=0;
        int mailSayisi=0;
        int webSiteSayisi=0;
        
          File file = new File("icerik.txt");
          BufferedReader reader = null;
          reader = new BufferedReader(new FileReader(file));
          String satir = reader.readLine();
          System.out.println("Text dosyasinin icerigi: ");
           while(satir!=null){ 
              System.out.println(satir);
                   

           //SESLI HARF SAYISI BULMA
          String sesliler = "aeıioöuü";
           for(int i=0;i<=satir.length()-1;i++)
           {
               for(int j=0;j<=7;j++)
               {
                if(satir.charAt(i) == sesliler.charAt(j))
                 {
                    sesliHarf++;
                 }              
               }             
            }
           
           //KELIME SAYISI BULMA
            for(int k=0;k<satir.length();k++)
            {
                if(satir.charAt(k)==' ')
                {
                    kelimeSayisi++;
                }
            }
            
            //CUMLE SAYİSİ BULMA
            
            for(int t=0;t<satir.length();t++)
            {
                if (satir.charAt(t)=='.'&& satir.charAt(t+1)==' ')
                {
                    cumleSayisi++;
                }
            }
            
            //MAIL SAYISI BULMA

            
            for(int t=0;t<satir.length();t++)
            {
                
                  if (satir.charAt(t)=='.'&& satir.charAt(t+1)=='e'&& satir.charAt(t+2)=='d'&& satir.charAt(t+3)=='u'&& satir.charAt(t+4)=='.'
                        && satir.charAt(t+5)=='t'&& satir.charAt(t+6)=='r'&&(satir.charAt(t-8)=='@'||satir.charAt(t-7)=='@'||satir.charAt(t-6)=='@'||satir.charAt(t-5)=='@'||satir.charAt(t-4)=='@'||satir.charAt(t-3)=='@'))
                   {
                       mailSayisi++;
                   } 
                  else if(satir.charAt(t)=='.'&& satir.charAt(t+1)=='c'&& satir.charAt(t+2)=='o'&& satir.charAt(t+3)=='m'&& satir.charAt(t+4)=='.'
                        && satir.charAt(t+5)=='t'&& satir.charAt(t+6)=='r'&&(satir.charAt(t-12)=='@'||satir.charAt(t-11)=='@'||satir.charAt(t-10)=='@'||satir.charAt(t-9)=='@'||satir.charAt(t-8)=='@'||satir.charAt(t-7)=='@'||satir.charAt(t-6)=='@'||satir.charAt(t-5)=='@'||satir.charAt(t-4)=='@'||satir.charAt(t-3)=='@'))
                   {
                       mailSayisi++;
                   } 
                   else if(satir.charAt(t)=='.'&& satir.charAt(t+1)=='c'&& satir.charAt(t+2)=='o'&& satir.charAt(t+3)=='m'&&(satir.charAt(t-8)=='@'||satir.charAt(t-7)=='@'||satir.charAt(t-6)=='@'||satir.charAt(t-5)=='@'||satir.charAt(t-4)=='@'||satir.charAt(t-3)=='@'))
                   {
                       mailSayisi++;
                   } 
            }
          
            //WEB SITESI BULMA
            
              
            for(int t=0;t<satir.length();t++)
            {
                
                  if ((satir.charAt(t)=='.'&& satir.charAt(t+1)=='e'&& satir.charAt(t+2)=='d'&& satir.charAt(t+3)=='u'&& satir.charAt(t+4)=='.' && satir.charAt(t+5)=='t'&& satir.charAt(t+6)=='r')
                          ||(satir.charAt(t)=='.'&& satir.charAt(t+1)=='e'&& satir.charAt(t+2)=='d'&& satir.charAt(t+3)=='u')
                          ||(satir.charAt(t)=='.'&& satir.charAt(t+1)=='c'&& satir.charAt(t+2)=='o'&& satir.charAt(t+3)=='m'&& satir.charAt(t+4)=='.' && satir.charAt(t+5)=='t'&& satir.charAt(t+6)=='r')
                          ||(satir.charAt(t)=='.'&& satir.charAt(t+1)=='c'&& satir.charAt(t+2)=='o'&& satir.charAt(t+3)=='m')
                          ||(satir.charAt(t)=='.'&& satir.charAt(t+1)=='n'&& satir.charAt(t+2)=='e'&& satir.charAt(t+3)=='t'&& satir.charAt(t+4)=='.' && satir.charAt(t+5)=='t'&& satir.charAt(t+6)=='r')
                          ||(satir.charAt(t)=='.'&& satir.charAt(t+1)=='n'&& satir.charAt(t+2)=='e'&& satir.charAt(t+3)=='t')
                          ||(satir.charAt(t)=='.'&& satir.charAt(t+1)=='o'&& satir.charAt(t+2)=='r'&& satir.charAt(t+3)=='g'&& satir.charAt(t+4)=='.' && satir.charAt(t+5)=='t'&& satir.charAt(t+6)=='r')
                          ||(satir.charAt(t)=='.'&& satir.charAt(t+1)=='o'&& satir.charAt(t+2)=='r'&& satir.charAt(t+3)=='g'))
                   {
                      webSiteSayisi++;
                      
                   } 
                 
            }
          
           
            
              satir = reader.readLine();
      
          }
          
      
          System.out.print("Toplam Sesli Harf Sayisi  :");
          System.out.println(sesliHarf+1);
          System.out.print("Toplam Kelime Sayisi      :");
          System.out.println(kelimeSayisi+1);
          System.out.print("Toplam Cumle Sayisi       :");
          System.out.println(cumleSayisi);
          System.out.print("Toplam Mail Sayisi        :");
          System.out.println(mailSayisi);
          System.out.print("Toplam Web Sitesi Sayisi  :");
          System.out.println(webSiteSayisi-mailSayisi);
          
          
    }
}
