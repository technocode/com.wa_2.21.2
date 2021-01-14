package X;

import android.media.Image;
import android.media.ImageReader;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: X.0zM  reason: invalid class name and case insensitive filesystem */
public class C21810zM {
    public Image A00;
    public ImageReader A01;
    public C33251gR A02;
    public AnonymousClass0VM A03;
    public boolean A04;
    public final ImageReader.OnImageAvailableListener A05 = new C21790zK(this);
    public final C21120yD A06 = new C21120yD();
    public final C33231gP A07 = new C33231gP(this);
    public final C22070zn A08;
    public final C22170zz A09;
    public final Callable A0A = new CallableC21800zL(this);

    public C21810zM(C22170zz r2) {
        this.A09 = r2;
        this.A08 = new C22070zn();
    }

    public static void A00(C21810zM r18) {
        AnonymousClass0VM r3;
        Long l;
        if (!r18.A09.A08()) {
            throw new C21620z2("Method tryToNotifyCpuFrame() must run on the Optic Background Thread.");
        } else if (r18.A00 != null && r18.A03 != null) {
            C21120yD r2 = r18.A06;
            if (!r2.A00.isEmpty()) {
                C33251gR r4 = r18.A02;
                if (r4 == null || (r3 = r18.A03) == null || !((Boolean) r3.A00(AnonymousClass0VN.A0O)).booleanValue()) {
                    try {
                        C22070zn r11 = r18.A08;
                        r11.A01(r18.A00, r18.A04, null, null, null, null, null);
                        List list = r2.A00;
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            ((AbstractC21150yG) list.get(i)).AIn(r11);
                        }
                    } catch (RuntimeException unused) {
                    }
                    r18.A08.A00();
                    r18.A00.close();
                    r18.A00 = null;
                    return;
                }
                long timestamp = r18.A00.getTimestamp();
                C22050zl r7 = r4.A06;
                if (r7 != null) {
                    int i2 = 0;
                    do {
                        C22040zk r5 = r7.A01[i2];
                        if (r5 == null || (l = r5.A07) == null || l.longValue() != timestamp) {
                            i2++;
                        } else {
                            try {
                                C22070zn r6 = r18.A08;
                                r6.A01(r18.A00, r18.A04, r5.A09, r5.A00, r5.A06, r5.A02, r5.A05);
                                List list2 = r2.A00;
                                int size2 = list2.size();
                                for (int i3 = 0; i3 < size2; i3++) {
                                    ((AbstractC21150yG) list2.get(i3)).AIn(r6);
                                }
                            } catch (RuntimeException unused2) {
                            }
                            r18.A08.A00();
                            r18.A00.close();
                            r18.A00 = null;
                            return;
                        }
                    } while (i2 < 3);
                }
            }
        }
    }
}
