package X;

import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.1iR  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC34411iR implements AnonymousClass15E {
    public int A00;
    public AnonymousClass15G A01;
    public final ArrayList A02 = new ArrayList(1);
    public final boolean A03;

    public AbstractC34411iR(boolean z) {
        this.A03 = z;
    }

    public final void A00() {
        AnonymousClass15G r3 = this.A01;
        for (int i = 0; i < this.A00; i++) {
            ((AnonymousClass15U) this.A02.get(i)).ALD(this, r3, this.A03);
        }
        this.A01 = null;
    }

    public final void A01() {
        for (int i = 0; i < this.A00; i++) {
            this.A02.get(i);
        }
    }

    public final void A02(int i) {
        AnonymousClass15G r3 = this.A01;
        for (int i2 = 0; i2 < this.A00; i2++) {
            ((AnonymousClass15U) this.A02.get(i2)).ADd(this, r3, this.A03, i);
        }
    }

    public final void A03(AnonymousClass15G r4) {
        this.A01 = r4;
        for (int i = 0; i < this.A00; i++) {
            ((AnonymousClass15U) this.A02.get(i)).ALE(this, r4, this.A03);
        }
    }

    @Override // X.AnonymousClass15E
    public final void A1u(AnonymousClass15U r3) {
        ArrayList arrayList = this.A02;
        if (!arrayList.contains(r3)) {
            arrayList.add(r3);
            this.A00++;
        }
    }

    @Override // X.AnonymousClass15E
    public /* synthetic */ Map A8n() {
        if (!(this instanceof C455625i)) {
            return Collections.emptyMap();
        }
        HttpURLConnection httpURLConnection = ((C455625i) this).A06;
        return httpURLConnection == null ? Collections.emptyMap() : httpURLConnection.getHeaderFields();
    }
}
