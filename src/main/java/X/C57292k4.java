package X;

import android.net.Uri;
import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.2k4  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C57292k4 implements AnonymousClass1W4 {
    public final /* synthetic */ C000300f A00;
    public final /* synthetic */ AnonymousClass2U8 A01;
    public final /* synthetic */ AnonymousClass3ZL A02;
    public final /* synthetic */ String A03;

    public /* synthetic */ C57292k4(AnonymousClass2U8 r1, C000300f r2, String str, AnonymousClass3ZL r4) {
        this.A01 = r1;
        this.A00 = r2;
        this.A03 = str;
        this.A02 = r4;
    }

    @Override // X.AnonymousClass1W4
    public final AnonymousClass1W3 AN8(AnonymousClass0J5 r14) {
        AnonymousClass2U8 r7 = this.A01;
        C000300f r6 = this.A00;
        String str = this.A03;
        AnonymousClass3ZL r5 = this.A02;
        AnonymousClass2U7 r2 = new AnonymousClass2U7();
        if (str != null) {
            boolean z = r5.A03;
            AnonymousClass00E.A08(z, "Should only set final hash for streaming uploads");
            r5.A00 = C003701u.A05(str);
            AnonymousClass00E.A08(z, "Should only finalize for streaming uploads");
            boolean z2 = false;
            if (r5.A00 != null) {
                z2 = true;
            }
            AnonymousClass00E.A08(z2, "Must set final hash before finalizing streaming upload");
            Uri.Builder A022 = r5.A02(r14);
            if (z) {
                A022.appendQueryParameter("stream", "1");
            }
            A022.appendQueryParameter("final_hash", r5.A00);
            AnonymousClass0J3 A012 = r7.A00.A01(A022.build().toString(), new C57342k9(r2, r5, r14, r6));
            try {
                int A013 = A012.A01(r14);
                r2.A01 = new AnonymousClass2U2(A012.A00, A012.A01, A012.A02, (long) A013);
                StringBuilder sb = new StringBuilder();
                sb.append("mediaupload/finalizeupload/got responseCode=");
                sb.append(A013);
                Log.d(sb.toString());
                r2.A00 = A013;
                if (A013 == 200) {
                    r2.A04 = true;
                }
            } catch (IOException e) {
                Log.e("Error while finalizing upload", e);
            }
        }
        if (r2.A04) {
            return AnonymousClass1W3.A02(r2);
        }
        return AnonymousClass1W3.A03(r2, r2.A00);
    }
}
