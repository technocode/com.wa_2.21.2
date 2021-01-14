package X;

import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.08D  reason: invalid class name */
public class AnonymousClass08D implements AnonymousClass08E {
    public static final int A0I = ((int) ((Runtime.getRuntime().maxMemory() / 1024) / 16));
    public static volatile AnonymousClass08D A0J;
    public Handler A00;
    public AnonymousClass08V A01;
    public AnonymousClass0DD A02;
    public AnonymousClass0DD A03;
    public AnonymousClass1VZ A04;
    public AnonymousClass1VZ A05;
    public WeakReference A06;
    public final AnonymousClass08F A07;
    public final AnonymousClass00G A08;
    public final Object A09 = new Object();
    public final Object A0A = new Object();
    public final Object A0B = new Object();
    public final Object A0C = new Object();
    public final Object A0D = new Object();
    public final Object A0E = new Object();
    public final Object A0F = new Object();
    public final List A0G = new ArrayList();
    public volatile AnonymousClass0DD A0H;

    public AnonymousClass08D(AnonymousClass00G r2, AnonymousClass08F r3, AnonymousClass08G r4) {
        this.A08 = r2;
        this.A07 = r3;
        r4.A00(this);
    }

    public static AnonymousClass08D A00() {
        if (A0J == null) {
            synchronized (AnonymousClass08D.class) {
                if (A0J == null) {
                    A0J = new AnonymousClass08D(AnonymousClass00G.A01, AnonymousClass08F.A02, AnonymousClass08G.A00());
                }
            }
        }
        return A0J;
    }

    public final synchronized Handler A01() {
        Handler handler;
        handler = this.A00;
        if (handler == null) {
            HandlerThread handlerThread = new HandlerThread("cache-cleaner", 10);
            handlerThread.start();
            handler = new HandlerC12450i7(this, handlerThread.getLooper());
            this.A00 = handler;
        }
        return handler;
    }

    public AnonymousClass0DD A02() {
        AnonymousClass0DD r1;
        synchronized (this.A09) {
            r1 = this.A02;
            if (r1 == null) {
                r1 = new C12280hq(this, (int) (Runtime.getRuntime().maxMemory() / 8192));
                this.A02 = r1;
            }
        }
        return r1;
    }

    public AnonymousClass0DD A03() {
        AnonymousClass0DD r1;
        synchronized (this.A0D) {
            r1 = this.A03;
            if (r1 == null) {
                r1 = new AnonymousClass0DC(this, (int) ((Runtime.getRuntime().maxMemory() / 1024) / 6));
                this.A03 = r1;
            }
        }
        return r1;
    }

    public AnonymousClass0DD A04() {
        if (this.A0H == null) {
            synchronized (this.A0E) {
                if (this.A0H == null) {
                    this.A0H = new C43391yI(this, A0I);
                }
            }
        }
        return this.A0H;
    }

    public AnonymousClass1VZ A05() {
        AnonymousClass1VZ r3;
        synchronized (this.A0B) {
            r3 = this.A04;
            if (r3 == null) {
                r3 = new AnonymousClass1VZ(this.A08, 32, "gif_content_obj_store");
                this.A04 = r3;
            }
        }
        return r3;
    }

    public AnonymousClass1VZ A06() {
        AnonymousClass1VZ r3;
        synchronized (this.A0C) {
            r3 = this.A05;
            if (r3 == null) {
                r3 = new AnonymousClass1VZ(this.A08, 256, "gif_preview_obj_store");
                this.A05 = r3;
            }
        }
        return r3;
    }

    public List A07() {
        synchronized (this.A0A) {
            WeakReference weakReference = this.A06;
            if (weakReference == null) {
                return null;
            }
            return (List) weakReference.get();
        }
    }

    public final synchronized void A08(int i) {
        Log.d("Caches/handleLowMemory/cleanup started");
        A09(null);
        List A072 = A07();
        if (A072 != null) {
            A072.clear();
        }
        A02().A01(i);
        A03().A01(i);
        if (this.A0H != null) {
            this.A0H.A01(SearchActionVerificationClientService.NOTIFICATION_ID);
        }
        synchronized (this.A0F) {
            AnonymousClass08V r1 = this.A01;
            if (r1 != null) {
                r1.A06(-1);
            }
        }
        AnonymousClass08F r12 = this.A07;
        synchronized (r12) {
            r12.A01.clear();
        }
        Log.d("Caches/handleLowMemory/cleanup finished");
        A09(null);
    }

    public void A09(String str) {
        String str2;
        int size;
        Runtime runtime = Runtime.getRuntime();
        StringBuilder sb = new StringBuilder();
        if (str != null) {
            str2 = AnonymousClass008.A0K(str, "/");
        } else {
            str2 = "";
        }
        StringBuilder sb2 = new StringBuilder(AnonymousClass008.A0O(sb, str2, "caches/state m="));
        synchronized (this.A0D) {
            AnonymousClass0DD r0 = this.A03;
            if (r0 == null) {
                sb2.append("null");
            } else {
                sb2.append(r0.A00.A01());
                sb2.append("/");
                sb2.append(this.A03.A00.A00());
            }
        }
        sb2.append(" c=");
        synchronized (this.A09) {
            AnonymousClass0DD r02 = this.A02;
            if (r02 == null) {
                sb2.append("null");
            } else {
                sb2.append(r02.A00.A01());
                sb2.append("/");
                sb2.append(this.A02.A00.A00());
            }
        }
        sb2.append(" gp=");
        synchronized (this.A0C) {
            AnonymousClass1VZ r03 = this.A05;
            if (r03 == null) {
                sb2.append("null");
            } else {
                sb2.append(r03.A04.A01());
                sb2.append("/");
                sb2.append(this.A05.A04.A00());
            }
        }
        sb2.append(" gc=");
        synchronized (this.A0B) {
            AnonymousClass1VZ r04 = this.A04;
            if (r04 == null) {
                sb2.append("null");
            } else {
                sb2.append(r04.A04.A01());
                sb2.append("/");
                sb2.append(this.A04.A04.A00());
            }
        }
        sb2.append(" sc=");
        synchronized (this.A0F) {
            AnonymousClass08V r05 = this.A01;
            if (r05 == null) {
                sb2.append("null");
            } else {
                sb2.append(r05.A01());
                sb2.append("/");
                sb2.append(this.A01.A00());
            }
        }
        sb2.append(" sfc=");
        synchronized (this.A0E) {
            if (this.A0H == null) {
                sb2.append("null");
            } else {
                sb2.append(this.A0H.A00.A01());
                sb2.append("/");
                sb2.append(this.A0H.A00.A00());
            }
        }
        sb2.append(" a=");
        AnonymousClass08F r1 = this.A07;
        synchronized (r1) {
            size = r1.A01.size();
        }
        sb2.append(size);
        sb2.append(" s=");
        sb2.append(" m=");
        sb2.append(runtime.freeMemory() / 1024);
        sb2.append("/");
        sb2.append(runtime.totalMemory() / 1024);
        sb2.append("/");
        sb2.append(runtime.maxMemory() / 1024);
        Log.d(sb2.toString());
    }

    public void A0A(List list) {
        synchronized (this.A0A) {
            if (list != null) {
                this.A06 = new WeakReference(list);
            } else {
                this.A06 = null;
            }
        }
    }

    @Override // X.AnonymousClass08E
    public void ACu() {
        A08(0);
    }

    @Override // X.AnonymousClass08E
    public void ACv() {
        A08(SearchActionVerificationClientService.NOTIFICATION_ID);
    }
}
