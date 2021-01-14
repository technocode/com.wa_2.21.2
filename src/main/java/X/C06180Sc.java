package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.AcceptInviteLinkActivity;
import com.whatsapp.deeplink.DeepLinkActivity;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.0Sc  reason: invalid class name and case insensitive filesystem */
public class C06180Sc implements AbstractC02790Dl {
    public static volatile C06180Sc A02;
    public final C02780Dk A00;
    public final C06190Sd A01;

    public C06180Sc(C02780Dk r1, C06190Sd r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public static C06180Sc A00() {
        if (A02 == null) {
            synchronized (C06180Sc.class) {
                if (A02 == null) {
                    A02 = new C06180Sc(C02780Dk.A02(), C06190Sd.A00());
                }
            }
        }
        return A02;
    }

    @Override // X.AbstractC02790Dl
    public void ANL(Context context, Uri uri) {
        if (uri == null) {
            Log.e("linklauncher/start-activity/uri-is-null");
            return;
        }
        String A04 = AcceptInviteLinkActivity.A04(uri);
        if (!TextUtils.isEmpty(A04)) {
            Intent intent = new Intent(context, AcceptInviteLinkActivity.class);
            intent.putExtra("code", A04);
            this.A00.A05(context, intent);
            return;
        }
        boolean z = true;
        if (this.A01.A03(uri) != 1) {
            Intent intent2 = new Intent(context, DeepLinkActivity.class);
            intent2.setData(uri);
            intent2.putExtra("source", 2);
            this.A00.A05(context, intent2);
            return;
        }
        if (AnonymousClass3AP.isLoaded()) {
            C73153Vr r4 = (C73153Vr) AnonymousClass3AP.lazy(C73153Vr.class).get();
            if (context != null) {
                List list = r4.A00;
                if (!list.isEmpty()) {
                    AnonymousClass3Ah r1 = (AnonymousClass3Ah) r4.A02.get();
                    if (r1 == null) {
                        throw null;
                    } else if (AnonymousClass3AP.isLoaded() && ((AbstractC000400g) r1.A00.get()).A0D(AbstractC000400g.A0X)) {
                        int i = 0;
                        while (true) {
                            if (i >= list.size()) {
                                break;
                            }
                            Intent ALv = ((AbstractC67773Ae) list.get(i)).ALv(context, uri);
                            if (ALv != null) {
                                ((AnonymousClass36H) r4.A03.get()).A01(context).A01(C73173Vt.class, r4, new AnonymousClass3VZ(r4, context, ALv));
                                r4.A00(context, ALv);
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
            z = false;
        } else {
            z = false;
        }
        if (!z) {
            this.A00.ANL(context, uri);
        }
    }
}
