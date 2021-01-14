package X;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import javax.net.ssl.SSLSession;

/* renamed from: X.1YX  reason: invalid class name */
public class AnonymousClass1YX implements Enumeration {
    public SSLSession A00;
    public final /* synthetic */ Iterator A01;

    public AnonymousClass1YX(Iterator it) {
        this.A01 = it;
    }

    public boolean hasMoreElements() {
        SSLSession sSLSession;
        if (this.A00 != null) {
            return true;
        }
        do {
            Iterator it = this.A01;
            if (it.hasNext()) {
                sSLSession = (SSLSession) it.next();
            } else {
                this.A00 = null;
                return false;
            }
        } while (!sSLSession.isValid());
        this.A00 = sSLSession;
        return true;
    }

    @Override // java.util.Enumeration
    public Object nextElement() {
        if (hasMoreElements()) {
            byte[] id = this.A00.getId();
            this.A00 = null;
            return id;
        }
        throw new NoSuchElementException();
    }
}
