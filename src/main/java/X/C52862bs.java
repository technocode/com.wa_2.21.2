package X;

import android.net.Uri;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.2bs  reason: invalid class name and case insensitive filesystem */
public class C52862bs implements AnonymousClass09O {
    public final AnonymousClass09H A00;
    public final WeakReference A01;

    public C52862bs(AbstractC48272Lo r2, AnonymousClass09H r3) {
        this.A01 = new WeakReference(r2);
        this.A00 = r3;
    }

    @Override // X.AnonymousClass09O
    public void AEv(String str) {
        Log.e("sendVerifyLinkRequest/delivery failure ");
        AbstractC48272Lo r1 = (AbstractC48272Lo) this.A01.get();
        if (r1 != null) {
            r1.AFY(500);
        }
    }

    @Override // X.AnonymousClass09O
    public void AFd(String str, AnonymousClass0M5 r4) {
        int A0E = C002001d.A0E(r4);
        AnonymousClass008.A0w("sendVerifyLinkRequest/response-error ", A0E);
        AbstractC48272Lo r0 = (AbstractC48272Lo) this.A01.get();
        if (r0 != null) {
            r0.AFY(A0E);
        }
    }

    @Override // X.AnonymousClass09O
    public void AKk(String str, AnonymousClass0M5 r9) {
        int i;
        String str2;
        AnonymousClass0M5 A0D = r9.A0D("response");
        AbstractC48272Lo r3 = (AbstractC48272Lo) this.A01.get();
        if (A0D == null) {
            int A0E = C002001d.A0E(r9);
            if (r3 != null) {
                r3.AFY(A0E);
            }
            AnonymousClass008.A0w("sendVerifyLinkRequest/response-error ", A0E);
            return;
        }
        AnonymousClass0M5 A0D2 = A0D.A0D("status");
        if (A0D2 == null) {
            if (r3 != null) {
                r3.AFY(-1);
            }
            Log.w("sendVerifyLinkRequest/response-error -1");
            return;
        }
        try {
            byte[] bArr = A0D2.A01;
            if (AnonymousClass0M5.A00(bArr) != null) {
                i = Integer.parseInt(AnonymousClass0M5.A00(bArr));
                if (i == 200) {
                    AnonymousClass0M5 A0D3 = A0D.A0D("url");
                    Uri uri = null;
                    if (A0D3 == null) {
                        str2 = null;
                    } else {
                        str2 = AnonymousClass0M5.A00(A0D3.A01);
                    }
                    if (r3 != null) {
                        if (!C003701u.A0E(str2)) {
                            uri = Uri.parse(str2);
                        }
                        r3.AKh(uri);
                        return;
                    }
                    return;
                }
            } else {
                i = 0;
            }
            if (r3 != null) {
                r3.AFY(i);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("sendVerifyLinkRequest/response-error ");
            sb.append(i);
            Log.w(sb.toString());
        } catch (NumberFormatException unused) {
            if (r3 != null) {
                r3.AFY(-1);
            }
            Log.w("sendVerifyLinkRequest/response-error -1");
        }
    }
}
