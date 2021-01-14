package X;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.1Oq  reason: invalid class name and case insensitive filesystem */
public class C27221Oq {
    public int A00;
    public int A01;
    public int A02;
    public String A03;
    public ArrayList A04;
    public final C02660Cy A05;
    public final File A06;
    public final List A07 = Arrays.asList("es-AR", "en-AU", "de-AT", "nl-BE", "fr-BE", "pt-BR", "en-CA", "fr-CA", "es-CL", "da-DK", "fi-FI", "fr-FR", "de-DE", "zh-HK", "en-IN", "en-ID", "en-IE", "it-IT", "ja-JP", "ko-KR", "en-MY", "es-MX", "nl-NL", "en-NZ", "no-NO", "zh-CN", "pl-PL", "pt-PT", "en-PH", "ru-RU", "ar-SA", "en-ZA", "es-ES", "sv-SE", "fr-CH", "de-CH", "zh-TW", "tr-TR", "en-GB", "en-US", "es-US");

    public C27221Oq(AnonymousClass00G r4, C02660Cy r5, String str) {
        this.A05 = r5;
        this.A01 = 50;
        this.A03 = str;
        File file = new File(r4.A00.getCacheDir(), "Bing");
        this.A06 = file;
        file.mkdirs();
    }
}
