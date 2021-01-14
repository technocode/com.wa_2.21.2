package X;

import android.graphics.Bitmap;
import android.util.Pair;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: X.2iY  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C56392iY implements AbstractC03150Ez {
    public final /* synthetic */ AnonymousClass0EJ A00;
    public final /* synthetic */ C56862jJ A01;

    public /* synthetic */ C56392iY(AnonymousClass0EJ r1, C56862jJ r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    @Override // X.AbstractC03150Ez
    public final void A1e(Object obj) {
        boolean z;
        AnonymousClass02L A0n;
        Bitmap bitmap;
        Bitmap A0D;
        byte[] A012;
        AnonymousClass0EJ r5 = this.A00;
        C56862jJ r3 = this.A01;
        C50112Tl r4 = (C50112Tl) obj;
        AnonymousClass1XO r2 = r3.A02().A05;
        if (r5.A06.A0E(247) && r2 == AnonymousClass1XO.A07) {
            byte[] bArr = r3.A03;
            if (bArr == null) {
                Log.d("MediaJobManager/enqueueThumbnailUpload, thumbnail data on MediaJob is null");
                return;
            }
            try {
                File A002 = r5.A04.A04.A00("");
                C006803i.A0e(bArr, A002);
                StringBuilder sb = new StringBuilder();
                sb.append("MediaJobManager/enqueueThumbnailUpload, created thumbnail file at ");
                sb.append(A002.getAbsolutePath());
                Log.d(sb.toString());
                AnonymousClass2TF r14 = new AnonymousClass2TF(AnonymousClass1XO.A00(r3.A02().A05.A00), A002, 0, null, null, null, 0, true, "mms", true, false, null, 0, false, r4);
                AnonymousClass0CP r11 = r5.A08;
                byte b = r3.A02().A05.A00;
                int i = r3.A02().A01;
                AnonymousClass2T3 A003 = r3.A00();
                synchronized (A003) {
                    z = A003.A0F;
                }
                AnonymousClass1W6 r0 = r3.A0I;
                if (r0 != null) {
                    String str = r0.A09;
                    AnonymousClass0Ci r7 = r11.A0J;
                    AnonymousClass1W6 A03 = r7.A03(str, 2);
                    if (A03 == null) {
                        A03 = r7.A02(2, str);
                    } else {
                        A03.A02++;
                    }
                    AnonymousClass2T3 r42 = new AnonymousClass2T3(r11.A0Q, r7, A03, z);
                    synchronized (r42) {
                        r42.A05 = Integer.valueOf(C002001d.A00(b, i, false));
                    }
                    C56872jK r72 = new C56872jK(A03, r42);
                    AnonymousClass1XO r6 = r14.A05;
                    AnonymousClass2TK r43 = new AnonymousClass2TK(r6, A002, null, false);
                    AnonymousClass2TM r112 = new AnonymousClass2TM(r5.A0H, r5.A00, r5.A03, r5.A0I, r5.A0G, r5.A0C);
                    if (!(r43.A00 != AnonymousClass1XO.A08 || (bitmap = (A0n = C002001d.A0n(r43.A01, new AnonymousClass02K(96, 96, null, true, null))).A02) == null || (A012 = r112.A02.A01((A0D = C02230Bd.A0D(bitmap, null, 96, 96)), 48, false)) == null)) {
                        Pair pair = new Pair(Integer.valueOf(A0n.A01), Integer.valueOf(A0n.A00));
                        StringBuilder A0S = AnonymousClass008.A0S("ThumbnailGenerator/size=");
                        A0S.append(A012.length);
                        A0S.append(" width=");
                        A0S.append(A0D.getWidth());
                        A0S.append(" height=");
                        A0S.append(A0D.getHeight());
                        Log.d(A0S.toString());
                        r3.A04.A04(new AnonymousClass2TL(A012, pair, null, null));
                    }
                    AnonymousClass1WC r62 = new AnonymousClass1WC(r72.A00, r14, r3.A0K.A02, new C52482bC(r6));
                    r72.A01.A04(r62.A04);
                    r3.A01 = r72;
                    AnonymousClass0EL r44 = r5.A0F;
                    StringBuilder sb2 = new StringBuilder("mediauploadqueue/enqueue ");
                    sb2.append(r62);
                    Log.i(sb2.toString());
                    ((C60622pp) r44.A01(r72, r62)).A0E.A03(new C56562ip(r3), r5.A0K);
                    return;
                }
                throw null;
            } catch (IOException e) {
                Log.e("MediaJobManager/enqueueThumbnailUpload, exception when creating thumbnail file", e);
                r3.A03 = null;
            }
        }
    }
}
