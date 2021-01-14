package X;

import com.whatsapp.net.tls13.WtCachedPsk;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionBindingEvent;
import javax.net.ssl.SSLSessionBindingListener;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.CertificateException;
import javax.security.cert.X509Certificate;

/* renamed from: X.1Wq  reason: invalid class name and case insensitive filesystem */
public class C29011Wq implements SSLSession {
    public int A00;
    public long A01;
    public long A02;
    public WtCachedPsk A03;
    public C006403e A04;
    public String A05;
    public String A06;
    public LinkedHashSet A07 = new LinkedHashSet();
    public Map A08 = new HashMap();
    public boolean A09 = true;
    public byte[] A0A;
    public Certificate[] A0B;
    public final Map A0C = new HashMap();

    public int getApplicationBufferSize() {
        return 16384;
    }

    public Certificate[] getLocalCertificates() {
        return null;
    }

    public Principal getLocalPrincipal() {
        return null;
    }

    public int getPacketBufferSize() {
        return 16645;
    }

    public final String getProtocol() {
        return "TLSv1.3";
    }

    public C29011Wq(C006403e r3, String str, int i, String str2) {
        long currentTimeMillis = System.currentTimeMillis();
        this.A02 = currentTimeMillis;
        this.A01 = currentTimeMillis;
        this.A04 = r3;
        this.A06 = str;
        this.A00 = i;
        this.A05 = str2;
        this.A0A = C28051Sr.A27(str, i, str2);
    }

    public Byte A00() {
        Certificate[] certificateArr = this.A0B;
        if (certificateArr == null) {
            return null;
        }
        byte b = 0;
        for (Certificate certificate : certificateArr) {
            for (byte b2 : certificate.getPublicKey().getEncoded()) {
                b = (byte) (b ^ b2);
            }
        }
        return Byte.valueOf(b);
    }

    public void A01(Certificate[] certificateArr) {
        if (certificateArr != null) {
            this.A0B = (Certificate[]) certificateArr.clone();
        } else {
            this.A0B = null;
        }
    }

    public String getCipherSuite() {
        return this.A05;
    }

    public long getCreationTime() {
        return this.A01;
    }

    public byte[] getId() {
        byte[] bArr = this.A0A;
        if (bArr != null) {
            return (byte[]) bArr.clone();
        }
        return null;
    }

    public long getLastAccessedTime() {
        return this.A02;
    }

    @Override // javax.net.ssl.SSLSession
    public X509Certificate[] getPeerCertificateChain() {
        Certificate[] certificateArr = this.A0B;
        if (certificateArr == null || (r7 = certificateArr.length) == 0) {
            throw new SSLPeerUnverifiedException("No peer certificates found");
        }
        ArrayList arrayList = new ArrayList();
        for (Certificate certificate : certificateArr) {
            try {
                arrayList.add(X509Certificate.getInstance(certificate.getEncoded()));
            } catch (CertificateEncodingException | CertificateException e) {
                AnonymousClass2VU r2 = AnonymousClass2VU.DEBUG;
                StringBuilder sb = new StringBuilder("Could not parse certificates. Exception ");
                sb.append(e);
                AnonymousClass2VT.A00(r2, sb.toString());
            }
        }
        return (X509Certificate[]) arrayList.toArray(new X509Certificate[0]);
    }

    @Override // javax.net.ssl.SSLSession
    public Certificate[] getPeerCertificates() {
        Certificate[] certificateArr = this.A0B;
        if (certificateArr != null) {
            return (Certificate[]) certificateArr.clone();
        }
        return null;
    }

    public String getPeerHost() {
        return this.A06;
    }

    public int getPeerPort() {
        return this.A00;
    }

    @Override // javax.net.ssl.SSLSession
    public Principal getPeerPrincipal() {
        Certificate[] certificateArr = this.A0B;
        if (certificateArr != null && certificateArr.length != 0) {
            return ((java.security.cert.X509Certificate) certificateArr[0]).getSubjectX500Principal();
        }
        throw new SSLPeerUnverifiedException("No peer certificates found.");
    }

    public SSLSessionContext getSessionContext() {
        return this.A04;
    }

    public Object getValue(String str) {
        if (str != null) {
            return this.A0C.get(str);
        }
        throw new IllegalArgumentException("key cannot be null.");
    }

    public String[] getValueNames() {
        return (String[]) this.A0C.keySet().toArray(new String[0]);
    }

    public void invalidate() {
        this.A09 = false;
    }

    public boolean isValid() {
        WtCachedPsk[] wtCachedPskArr;
        long currentTimeMillis;
        boolean z = this.A09;
        if (!z) {
            return z;
        }
        HashSet hashSet = new HashSet();
        LinkedHashSet linkedHashSet = this.A07;
        if (!(linkedHashSet == null || (wtCachedPskArr = (WtCachedPsk[]) linkedHashSet.toArray(new WtCachedPsk[0])) == null)) {
            for (WtCachedPsk wtCachedPsk : wtCachedPskArr) {
                if (wtCachedPsk.useTestTime) {
                    currentTimeMillis = 3600000;
                } else {
                    currentTimeMillis = System.currentTimeMillis();
                }
                if (currentTimeMillis - wtCachedPsk.ticketIssuedTime > wtCachedPsk.ticketLifetime || !wtCachedPsk.sni.equals(this.A06)) {
                    this.A07.remove(wtCachedPsk);
                } else {
                    hashSet.add(Byte.valueOf(wtCachedPsk.certsID));
                }
            }
        }
        Iterator it = this.A08.keySet().iterator();
        while (it.hasNext()) {
            if (!hashSet.contains(it.next())) {
                it.remove();
            }
        }
        LinkedHashSet linkedHashSet2 = this.A07;
        if (linkedHashSet2 == null || linkedHashSet2.isEmpty()) {
            this.A09 = false;
        }
        return this.A09;
    }

    public void putValue(String str, Object obj) {
        if (str == null || obj == null) {
            throw new IllegalArgumentException("key and value cannot be null.");
        }
        Object put = this.A0C.put(str, obj);
        if (put instanceof SSLSessionBindingListener) {
            ((SSLSessionBindingListener) put).valueUnbound(new SSLSessionBindingEvent(this, str));
        }
        if (obj instanceof SSLSessionBindingListener) {
            ((SSLSessionBindingListener) obj).valueBound(new SSLSessionBindingEvent(this, str));
        }
    }

    public void removeValue(String str) {
        if (str != null) {
            Object remove = this.A0C.remove(str);
            if (remove instanceof SSLSessionBindingListener) {
                ((SSLSessionBindingListener) remove).valueUnbound(new SSLSessionBindingEvent(this, str));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("key cannot be null");
    }
}
