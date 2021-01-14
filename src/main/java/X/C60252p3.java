package X;

import com.whatsapp.stickers.WebpUtils;
import java.io.File;

/* renamed from: X.2p3  reason: invalid class name and case insensitive filesystem */
public class C60252p3 extends AbstractRunnableC57132jl {
    public final AnonymousClass009 A00;
    public final AnonymousClass088 A01;
    public final AnonymousClass0B3 A02;
    public final C000300f A03;
    public final AnonymousClass00G A04;
    public final C02240Be A05;
    public final C57142jm A06;
    public final C02570Cp A07;
    public final WebpUtils A08;
    public final C02220Bc A09;

    public C60252p3(AnonymousClass009 r1, AnonymousClass00G r2, WebpUtils webpUtils, AnonymousClass088 r4, C000300f r5, C02220Bc r6, C02570Cp r7, C02240Be r8, AnonymousClass0B3 r9, C57142jm r10) {
        super(r10);
        this.A00 = r1;
        this.A04 = r2;
        this.A08 = webpUtils;
        this.A01 = r4;
        this.A03 = r5;
        this.A09 = r6;
        this.A07 = r7;
        this.A05 = r8;
        this.A02 = r9;
        this.A06 = r10;
    }

    public final byte[] A01(File file) {
        AnonymousClass2TL A002 = new AnonymousClass2TM(this.A08, this.A00, this.A03, this.A09, this.A07, this.A05).A00(new AnonymousClass2TK(AnonymousClass1XO.A0I, file, "image/webp", false));
        if (A002 != null) {
            return A002.A02;
        }
        return null;
    }
}
