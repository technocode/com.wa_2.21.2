package X;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.1iZ  reason: invalid class name and case insensitive filesystem */
public final class C34491iZ implements AnonymousClass15E {
    public long A00;
    public Uri A01;
    public Map A02;
    public final AnonymousClass15E A03;

    public C34491iZ(AnonymousClass15E r2) {
        if (r2 != null) {
            this.A03 = r2;
            this.A01 = Uri.EMPTY;
            this.A02 = Collections.emptyMap();
            return;
        }
        throw null;
    }

    @Override // X.AnonymousClass15E
    public void A1u(AnonymousClass15U r2) {
        this.A03.A1u(r2);
    }

    @Override // X.AnonymousClass15E
    public Map A8n() {
        return this.A03.A8n();
    }

    @Override // X.AnonymousClass15E
    public Uri A9a() {
        return this.A03.A9a();
    }

    @Override // X.AnonymousClass15E
    public long ALs(AnonymousClass15G r4) {
        this.A01 = r4.A05;
        this.A02 = Collections.emptyMap();
        long ALs = this.A03.ALs(r4);
        Uri A9a = A9a();
        if (A9a != null) {
            this.A01 = A9a;
            this.A02 = A8n();
            return ALs;
        }
        throw null;
    }

    @Override // X.AnonymousClass15E
    public void close() {
        this.A03.close();
    }

    @Override // X.AnonymousClass15E
    public int read(byte[] bArr, int i, int i2) {
        int read = this.A03.read(bArr, i, i2);
        if (read != -1) {
            this.A00 += (long) read;
        }
        return read;
    }
}
