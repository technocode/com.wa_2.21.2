package X;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.1Oa  reason: invalid class name */
public class AnonymousClass1Oa extends Handler {
    public long A00;
    public final /* synthetic */ C27131Oe A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1Oa(C27131Oe r1, Looper looper) {
        super(looper);
        this.A01 = r1;
    }

    public void handleMessage(Message message) {
        AnonymousClass02N r2;
        C27131Oe r3 = this.A01;
        if (r3.A0d != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - r3.A09;
            int i = (int) (elapsedRealtime / 1000);
            if (i != r3.A06) {
                r3.A0O.setText(C002001d.A1W(r3.A12, (long) i));
                r3.A06 = i;
            }
            r3.A0o.sendEmptyMessageDelayed(0, 50);
            if (r3.A0Y == null && elapsedRealtime > 1000 && r3.A0d.A01.length() > 0) {
                r3.A0A = r3.A10.A05();
                C04420Kh r8 = r3.A17;
                File file = r3.A0d.A01;
                AnonymousClass02N r7 = r3.A0X;
                if (r8 != null) {
                    StringBuilder sb = new StringBuilder("app/mediajobmanager/enqueuevoicenoteupload enqueuing file: ");
                    sb.append(file);
                    Log.i(sb.toString());
                    AnonymousClass2TE A012 = AnonymousClass2TE.A01(new C50132Tn(true, false), 1, AnonymousClass1XO.A0D, Uri.fromFile(file), null, false, false, null, false);
                    AnonymousClass0EJ r5 = r8.A07;
                    C56862jJ A05 = r5.A05(A012, true);
                    A05.A00().A02(2);
                    A05.A00().A01();
                    A05.A0S = "mms";
                    A05.A07.A04(new AnonymousClass1WE(file, false));
                    A05.A09.A03(new C56502ij(r8, A05, r7), r8.A0I);
                    C56892jM r0 = new C56892jM(A05.A01(), A05);
                    r5.A0B(A05, r0);
                    r3.A0Y = r0;
                } else {
                    throw null;
                }
            }
            if (this.A00 + 1250 < System.currentTimeMillis() && (r2 = r3.A0X) != null) {
                this.A00 = System.currentTimeMillis();
                r3.A0v.A0D(r2, 1);
                if (r3.A0d.A01.length() > ((long) r3.A0u.A06(AbstractC000400g.A3a)) * 1048576) {
                    StringBuilder A0S = AnonymousClass008.A0S("voicenote/filelimit ");
                    A0S.append(r3.A0d.A01.length());
                    Log.i(A0S.toString());
                    r3.A0N(true, false, true);
                }
            }
        }
    }
}
