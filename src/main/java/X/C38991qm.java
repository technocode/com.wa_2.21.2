package X;

import android.app.Activity;
import android.graphics.Bitmap;
import android.net.Uri;
import com.google.android.search.verification.client.R;
import com.whatsapp.GifHelper;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.List;
import org.json.JSONException;

/* renamed from: X.1qm  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C38991qm implements AnonymousClass35j {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Activity A01;
    public final /* synthetic */ Uri A02;
    public final /* synthetic */ AbstractC004502c A03;
    public final /* synthetic */ AnonymousClass1NW A04;
    public final /* synthetic */ C04350Ka A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ List A07;

    public /* synthetic */ C38991qm(C04350Ka r1, Uri uri, Activity activity, List list, int i, String str, AnonymousClass1NW r7, AbstractC004502c r8) {
        this.A05 = r1;
        this.A02 = uri;
        this.A01 = activity;
        this.A07 = list;
        this.A00 = i;
        this.A06 = str;
        this.A04 = r7;
        this.A03 = r8;
    }

    @Override // X.AnonymousClass35j
    public final void AG2(File file) {
        byte[] bArr;
        C04350Ka r5 = this.A05;
        Uri uri = this.A02;
        Activity activity = this.A01;
        List list = this.A07;
        String str = this.A06;
        AnonymousClass1NW r3 = this.A04;
        AbstractC004502c r4 = this.A03;
        try {
            String queryParameter = uri.getQueryParameter("doodle");
            AnonymousClass2Mt r9 = null;
            if (queryParameter != null) {
                r9 = new AnonymousClass2Mt();
                r9.A07(C02230Bd.A0K(r5.A00, queryParameter), activity, r5.A09, r5.A02, r5.A0A, r5.A06, r5.A0I);
                r9.A03 = queryParameter;
            }
            boolean A022 = GifHelper.A02(file);
            StringBuilder A0S = AnonymousClass008.A0S("sendmedia/sendmediafile src:");
            A0S.append(file.getAbsolutePath());
            A0S.append(" ");
            A0S.append(file.length());
            Log.i(A0S.toString());
            AnonymousClass0M4 r15 = new AnonymousClass0M4();
            r15.A0F = file;
            if (r9 == null) {
                bArr = C002001d.A3j(C002001d.A0V(file));
            } else {
                Bitmap A0V = C002001d.A0V(file);
                if (A0V == null || (!A0V.isMutable() && (A0V = A0V.copy(Bitmap.Config.ARGB_8888, true)) == null)) {
                    bArr = null;
                } else {
                    r9.A03(A0V, 0, false, false);
                    bArr = C002001d.A3j(A0V);
                }
                String str2 = r9.A03;
                if (str2 == null) {
                    String A0N = C02230Bd.A0N();
                    r15.A0H = A0N;
                    r9.A06(C02230Bd.A0K(r5.A00, A0N));
                } else {
                    r15.A0H = str2;
                }
            }
            C04360Kb r1 = r5.A03;
            AnonymousClass0CP r13 = r5.A0C;
            byte b = 3;
            if (A022) {
                b = 13;
            }
            r1.A07(r13.A01(list, r15, b, 0, str, null, null, null, false, 0, null), bArr);
            r3.ALY(uri);
        } catch (IOException e) {
            if (e.getMessage() == null || !e.getMessage().contains("No space")) {
                r5.A01.A06(R.string.share_failed, 0);
            } else {
                r5.A01.A0B(r4, r5.A06.A06(R.string.error_no_disc_space));
            }
            Log.e("sendmedia/sendvideo/ioerror ", e);
        } catch (JSONException e2) {
            r5.A01.A06(R.string.share_failed, 0);
            Log.e("sendmedia/sendvideo/json ", e2);
        }
    }
}
