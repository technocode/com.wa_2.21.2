package X;

import android.app.Application;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: X.0Jr  reason: invalid class name and case insensitive filesystem */
public class C04260Jr {
    public static final Uri A08 = Uri.parse("");
    public static volatile C04260Jr A09;
    public AnonymousClass1Y0 A00;
    public ExecutorService A01;
    public final Handler A02 = new HandlerC04290Ju(this, Looper.getMainLooper());
    public final AnonymousClass02M A03;
    public final AnonymousClass0JX A04;
    public final AnonymousClass03P A05;
    public final AnonymousClass00G A06;
    public final C04270Js A07;

    public C04260Jr(AnonymousClass00G r9, AnonymousClass02M r10, AnonymousClass00T r11, AnonymousClass03P r12, AnonymousClass0JX r13, C04270Js r14) {
        this.A06 = r9;
        this.A03 = r10;
        this.A05 = r12;
        this.A04 = r13;
        this.A07 = r14;
        this.A01 = r11.A3T("AsyncAudioPlayer", 0, 1, 60, 0, new LinkedBlockingQueue());
    }

    public static C04260Jr A00() {
        if (A09 == null) {
            synchronized (C04260Jr.class) {
                if (A09 == null) {
                    A09 = new C04260Jr(AnonymousClass00G.A01, AnonymousClass02M.A00(), C002101e.A00(), AnonymousClass03P.A00(), AnonymousClass0JX.A02, C04270Js.A00());
                }
            }
        }
        return A09;
    }

    public void A01() {
        this.A01.submit(new RunnableEBaseShape4S0100000_I0_4(this, 30));
    }

    public void A02(Uri uri) {
        if (uri.compareTo(A08) != 0) {
            Handler handler = this.A02;
            handler.removeMessages(99);
            handler.sendEmptyMessageDelayed(99, 10000);
            A01();
            if (!this.A07.A00) {
                Application application = this.A06.A00;
                if (this.A04.A00) {
                    AudioManager A092 = this.A05.A09();
                    if (A092 == null || A092.getStreamVolume(5) > 0) {
                        this.A01.submit(new RunnableEBaseShape0S0301000_I0(this, application, 3, uri, 3));
                        return;
                    }
                    return;
                }
                AnonymousClass02M r2 = this.A03;
                r2.A02.post(new RunnableEBaseShape1S0300000_I0_1(this, application, uri, 10));
            }
        }
    }
}
