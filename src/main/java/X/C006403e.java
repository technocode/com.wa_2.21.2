package X;

import android.util.Base64;
import com.whatsapp.net.tls13.WtCachedPsk;
import com.whatsapp.util.Log;
import com.whatsapp.watls13.WtPersistentSession;
import java.io.File;
import java.security.cert.Certificate;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Random;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;

/* renamed from: X.03e  reason: invalid class name and case insensitive filesystem */
public class C006403e implements SSLSessionContext {
    public static volatile C006403e A04;
    public C006503f A00;
    public final Map A01 = new C006603g(this);
    public volatile int A02 = 64;
    public volatile long A03 = 172800;

    public C006403e(C006503f r3) {
        this.A00 = r3;
    }

    @Override // javax.net.ssl.SSLSessionContext
    public Enumeration getIds() {
        SSLSession[] sSLSessionArr;
        Map map = this.A01;
        synchronized (map) {
            sSLSessionArr = (SSLSession[]) map.values().toArray(new SSLSession[0]);
        }
        return new AnonymousClass1YX(Arrays.asList(sSLSessionArr).iterator());
    }

    public synchronized SSLSession getSession(byte[] bArr) {
        WtCachedPsk[] wtCachedPskArr;
        AnonymousClass1YY r6 = new AnonymousClass1YY(bArr);
        try {
            Map map = this.A01;
            synchronized (map) {
                C29011Wq r4 = (C29011Wq) map.get(r6);
                if (r4 == null) {
                    C006503f r42 = this.A00;
                    if (r42 != null) {
                        synchronized (r42) {
                            if (r42.A02() != null) {
                                WtPersistentSession A002 = C006503f.A00(new File(r42.A02(), Base64.encodeToString(bArr, 10)));
                                if (A002 != null) {
                                    r4 = new C29011Wq(this, A002.sni, A002.port, A002.cipher);
                                    r4.A08 = A002.certs;
                                    r4.A07 = A002.psks;
                                    r4.A02 = System.currentTimeMillis();
                                    map.put(new AnonymousClass1YY(bArr), r4);
                                }
                            }
                        }
                    }
                }
                if (r4.isValid()) {
                    C29011Wq r3 = new C29011Wq(this, r4.getPeerHost(), r4.getPeerPort(), r4.getCipherSuite());
                    LinkedHashSet linkedHashSet = r4.A07;
                    WtCachedPsk wtCachedPsk = null;
                    if (linkedHashSet != null && !linkedHashSet.isEmpty()) {
                        Random random = new Random();
                        LinkedHashSet linkedHashSet2 = r4.A07;
                        if (!(linkedHashSet2 == null || (wtCachedPskArr = (WtCachedPsk[]) linkedHashSet2.toArray(new WtCachedPsk[0])) == null)) {
                            int nextInt = random.nextInt(wtCachedPskArr.length);
                            r4.A07.remove(wtCachedPskArr[nextInt]);
                            wtCachedPsk = wtCachedPskArr[nextInt];
                        }
                    }
                    Certificate[] certificateArr = (Certificate[]) r4.A08.get(Byte.valueOf(wtCachedPsk.certsID));
                    if (certificateArr != null) {
                        r3.A03 = wtCachedPsk;
                        r3.A01(certificateArr);
                    }
                    C006503f r1 = this.A00;
                    if (r1 != null) {
                        r1.A04(r6.A01, new WtPersistentSession(r4.getPeerHost(), r4.getPeerPort(), r4.getCipherSuite(), r4.A07, r4.A08));
                    }
                    return r3;
                }
                map.remove(r6);
                C006503f r12 = this.A00;
                if (r12 != null) {
                    r12.A03(r6.A01);
                }
            }
        } catch (C29001Wo e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Encountered Exception ");
            sb.append(e.toString());
            Log.e(sb.toString());
        }
        return null;
    }

    public int getSessionCacheSize() {
        return this.A02;
    }

    public int getSessionTimeout() {
        return (int) this.A03;
    }

    @Override // javax.net.ssl.SSLSessionContext
    public void setSessionCacheSize(int i) {
        if (i >= 0) {
            this.A02 = i;
            return;
        }
        throw new IllegalArgumentException("Cache size < 0");
    }

    @Override // javax.net.ssl.SSLSessionContext
    public void setSessionTimeout(int i) {
        if (i >= 0) {
            this.A03 = (long) i;
            Map map = this.A01;
            synchronized (map) {
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    SSLSession sSLSession = (SSLSession) it.next();
                    if (!sSLSession.isValid()) {
                        it.remove();
                        C006503f r1 = this.A00;
                        if (r1 != null) {
                            r1.A03(sSLSession.getId());
                        }
                    }
                }
            }
            return;
        }
        throw new IllegalArgumentException("Timeout < 0");
    }
}
