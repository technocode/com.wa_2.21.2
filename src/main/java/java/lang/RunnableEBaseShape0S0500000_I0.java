package java.lang;

import X.AbstractC007503q;
import X.AbstractC12270hp;
import X.AnonymousClass008;
import X.AnonymousClass01K;
import X.AnonymousClass0CH;
import X.AnonymousClass0D9;
import X.AnonymousClass0JN;
import X.AnonymousClass0L0;
import X.AnonymousClass0M3;
import X.AnonymousClass0M4;
import X.AnonymousClass0X4;
import X.AnonymousClass1LO;
import X.AnonymousClass1XJ;
import X.AnonymousClass1XX;
import X.C001400w;
import X.C007303n;
import X.C04190Jk;
import X.C04450Kk;
import X.C12300hs;
import X.C20990xv;
import X.C49982Sy;
import X.C50492Ux;
import X.C60602pn;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.facebook.simplejni.NativeHolder;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class RunnableEBaseShape0S0500000_I0 extends RunnableEmptyBase implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    public RunnableEBaseShape0S0500000_I0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.A05 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = obj4;
        this.A04 = obj5;
    }

    public RunnableEBaseShape0S0500000_I0(AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
        this.A05 = 0;
        this.A02 = atomicReference;
        this.A00 = callable;
        this.A03 = reentrantLock;
        this.A04 = atomicBoolean;
        this.A01 = condition;
    }

    public void run() {
        boolean z;
        switch (this.A05) {
            case 0:
                try {
                    ((AtomicReference) this.A02).set(((Callable) this.A00).call());
                } catch (Exception unused) {
                }
                ReentrantLock reentrantLock = (ReentrantLock) this.A03;
                reentrantLock.lock();
                try {
                    ((AtomicBoolean) this.A04).set(false);
                    ((Condition) this.A01).signal();
                    return;
                } finally {
                    reentrantLock.unlock();
                }
            case 1:
                AnonymousClass0L0 r5 = (AnonymousClass0L0) this.A00;
                C007303n r3 = (C007303n) this.A01;
                AnonymousClass1XX r4 = (AnonymousClass1XX) this.A02;
                Object obj = this.A03;
                byte[] bArr = (byte[]) this.A04;
                AnonymousClass01K r8 = r5.A0M;
                AbstractC007503q A052 = r8.A0J.A05(r3);
                if (A052 instanceof AnonymousClass0M3) {
                    AnonymousClass0M3 r6 = (AnonymousClass0M3) A052;
                    AnonymousClass0M4 r7 = r6.A02;
                    if (r7 != null) {
                        StringBuilder sb = new StringBuilder("media auto download re-enabled; stanzaKey=");
                        sb.append(r4);
                        sb.append("; key=");
                        sb.append(r3);
                        Log.i(sb.toString());
                        try {
                            String str = r3.A01;
                            byte[] bArr2 = r7.A0U;
                            if (bArr2 != null) {
                                String str2 = null;
                                if (!(obj == null || bArr == null)) {
                                    C04450Kk.A01(bArr2, bArr);
                                    NativeHolder nativeHolder = (NativeHolder) JniBridge.jvidispatchOOOOO(3, str, obj, bArr2, bArr);
                                    if (nativeHolder != null) {
                                        C20990xv r2 = new C20990xv(nativeHolder);
                                        JniBridge instance = JniBridge.getInstance();
                                        NativeHolder nativeHolder2 = r2.A00;
                                        if (instance != null) {
                                            str2 = (String) JniBridge.jvidispatchOIO(1, (long) 22, nativeHolder2);
                                        } else {
                                            throw null;
                                        }
                                    } else {
                                        throw new C04190Jk("encrypted message id is different from the expected one");
                                    }
                                }
                                if (!TextUtils.isEmpty(str2)) {
                                    r7.A0G = str2;
                                }
                                r7.A0L = true;
                                r8.A0M(r6);
                                AnonymousClass0JN r32 = r5.A0S;
                                AnonymousClass0CH r82 = r32.A06;
                                AnonymousClass0M4 r72 = r6.A02;
                                if (r72 == null) {
                                    StringBuilder A0S = AnonymousClass008.A0S("MediaDownloadManager/resumeReuploadingDownload/MMS unable to resume download due to missing media data; message.key = ");
                                    A0S.append(r6.A0n);
                                    A0S.append(", message.mediaHash=");
                                    AnonymousClass008.A1T(A0S, r6.A06);
                                    z = false;
                                } else if (!r72.A0a) {
                                    StringBuilder A0S2 = AnonymousClass008.A0S("MediaDownloadManager/resumeReuploadingDownload/MMS unable to resume download; not transferring; message.key = ");
                                    A0S2.append(r6.A0n);
                                    A0S2.append(", message.mediaHash=");
                                    AnonymousClass008.A1T(A0S2, r6.A06);
                                    z = false;
                                } else {
                                    C60602pn A002 = r82.A0Q.A00(r72);
                                    if (A002 != null) {
                                        if (str2 != null) {
                                            AnonymousClass008.A1S(AnonymousClass008.A0Z("mediadownload/replacing direct path with ", str2, "; mediaHash="), A002.A0Z.A0C);
                                            C49982Sy r1 = A002.A0Y;
                                            synchronized (r1) {
                                                r1.A0G = str2;
                                            }
                                        }
                                        A002.A0n.countDown();
                                        z = true;
                                    } else {
                                        StringBuilder A0S3 = AnonymousClass008.A0S("MediaDownloadManager/resumeReuploadingDownload/MMS unable to resume download; downloader not found; message.key = ");
                                        A0S3.append(r6.A0n);
                                        A0S3.append(", message.mediaHash=");
                                        AnonymousClass008.A1T(A0S3, r6.A06);
                                        z = false;
                                    }
                                }
                                if (z) {
                                    Log.i("media retry notification; resume reuploading download");
                                } else {
                                    r32.A03(r6, false, r32.A02.A03(true));
                                    Log.i("media retry notification; queue auto download");
                                }
                            } else {
                                throw null;
                            }
                        } catch (C04190Jk e) {
                            Log.w("malformed encrypted data", e);
                            r5.A07.A07(r4);
                            return;
                        }
                    } else {
                        StringBuilder sb2 = new StringBuilder("missing media data for media message; stanzaKey=");
                        sb2.append(r4);
                        sb2.append("; key=");
                        sb2.append(r3);
                        Log.w(sb2.toString());
                    }
                }
                r5.A07.A07(r4);
                return;
            case 2:
                if (!((C12300hs) this.A04).A04) {
                    ImageView imageView = (ImageView) this.A01;
                    if (imageView.getTag() != null && imageView.getTag().equals(this.A03)) {
                        ((AbstractC12270hp) this.A02).APi(imageView, (Bitmap) this.A00, false);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                AnonymousClass0X4 r14 = (AnonymousClass0X4) this.A00;
                DeviceJid deviceJid = (DeviceJid) this.A01;
                AnonymousClass1XJ r13 = (AnonymousClass1XJ) this.A02;
                C50492Ux r12 = (C50492Ux) this.A03;
                Object obj2 = this.A04;
                try {
                    if (r14.A0i.A08(deviceJid, r13.A0U, r13.A07)) {
                        new AnonymousClass1LO(r14.A05, r14.A1F, r14.A0B, r14.A0m, r14.A0x, r14.A0f, r14.A0F, r14.A09, r14.A0D, r14.A06, r14.A0U, r14.A0V, r14.A0n, r13, r14.A0Z, r14.A07, r14.A0O, r14.A0Q, r14.A10, r14.A0o, r14.A01, r14.A0u, r14.A0I, r12, r14.A1B, r14.A0T).run();
                    } else if (!r14.A05.A08(deviceJid)) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("MessagingXmppHandler/onMessageForMe/invalid adv sender=");
                        sb3.append(deviceJid);
                        Log.e(sb3.toString());
                        r14.A06(r13);
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("MessagingXmppHandler/onMessageForMe/invalid self device identity, jid=");
                        sb4.append(deviceJid);
                        Log.e(sb4.toString());
                        if (r13.A00() != 7) {
                            C001400w r22 = r14.A0P;
                            r22.A00.execute(new RunnableEBaseShape3S0200000_I0_2(r14, r13, 44));
                        }
                    }
                    Set set = r14.A1H;
                    synchronized (set) {
                        set.remove(obj2);
                    }
                    return;
                } catch (Throwable th) {
                    Set set2 = r14.A1H;
                    synchronized (set2) {
                        set2.remove(obj2);
                        throw th;
                    }
                }
            case 4:
                Object obj3 = this.A00;
                View view = (View) this.A01;
                AnonymousClass0D9 r33 = (AnonymousClass0D9) this.A02;
                Bitmap bitmap = (Bitmap) this.A03;
                AbstractC007503q r15 = (AbstractC007503q) this.A04;
                if (obj3.equals(view.getTag())) {
                    r33.APh(view, bitmap, r15);
                    return;
                }
                return;
            case 5:
                Object obj4 = this.A00;
                View view2 = (View) this.A01;
                AnonymousClass0D9 r34 = (AnonymousClass0D9) this.A02;
                Bitmap bitmap2 = (Bitmap) this.A03;
                AbstractC007503q r16 = (AbstractC007503q) this.A04;
                if (obj4.equals(view2.getTag())) {
                    r34.APh(view2, bitmap2, r16);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
