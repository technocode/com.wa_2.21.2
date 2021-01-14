package X;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.2dR  reason: invalid class name and case insensitive filesystem */
public class C53542dR implements AnonymousClass15E {
    public long A00;
    public Uri A01;
    public boolean A02;
    public final AnonymousClass15E A03;
    public final Object A04 = new Object();

    @Override // X.AnonymousClass15E
    public void A1u(AnonymousClass15U r1) {
    }

    public C53542dR(Context context, Uri uri) {
        this.A03 = new C455425g(context);
        this.A01 = uri;
    }

    @Override // X.AnonymousClass15E
    public /* synthetic */ Map A8n() {
        return Collections.emptyMap();
    }

    @Override // X.AnonymousClass15E
    public Uri A9a() {
        Uri uri;
        synchronized (this.A04) {
            uri = this.A01;
        }
        return uri;
    }

    @Override // X.AnonymousClass15E
    public long ALs(AnonymousClass15G r8) {
        long j;
        Uri uri;
        synchronized (this.A04) {
            j = r8.A04;
            this.A00 = j;
            uri = this.A01;
        }
        if (uri != null) {
            return this.A03.ALs(new AnonymousClass15G(uri, j, -1));
        }
        throw new IOException("Uri not set");
    }

    @Override // X.AnonymousClass15E
    public void close() {
        this.A03.close();
    }

    @Override // X.AnonymousClass15E
    public int read(byte[] bArr, int i, int i2) {
        long j;
        Uri uri;
        Object obj = this.A04;
        synchronized (obj) {
            j = this.A00;
            uri = null;
            if (this.A02) {
                this.A02 = false;
                uri = this.A01;
            }
        }
        if (uri != null) {
            AnonymousClass15E r0 = this.A03;
            r0.close();
            r0.ALs(new AnonymousClass15G(uri, j, -1));
        }
        int read = this.A03.read(bArr, i, i2);
        synchronized (obj) {
            this.A00 += (long) read;
        }
        return read;
    }
}
