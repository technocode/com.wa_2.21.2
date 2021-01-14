package X;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.1iT  reason: invalid class name and case insensitive filesystem */
public final class C34431iT implements AnonymousClass15E {
    public AnonymousClass15E A00;
    public AnonymousClass15E A01;
    public AnonymousClass15E A02;
    public AnonymousClass15E A03;
    public AnonymousClass15E A04;
    public AnonymousClass15E A05;
    public AnonymousClass15E A06;
    public final Context A07;
    public final AnonymousClass15E A08;
    public final List A09;

    public C34431iT(Context context, AnonymousClass15E r3) {
        this.A07 = context.getApplicationContext();
        if (r3 != null) {
            this.A08 = r3;
            this.A09 = new ArrayList();
            return;
        }
        throw null;
    }

    public final void A00(AnonymousClass15E r4) {
        int i = 0;
        while (true) {
            List list = this.A09;
            if (i < list.size()) {
                r4.A1u((AnonymousClass15U) list.get(i));
                i++;
            } else {
                return;
            }
        }
    }

    @Override // X.AnonymousClass15E
    public void A1u(AnonymousClass15U r2) {
        this.A08.A1u(r2);
        this.A09.add(r2);
        AnonymousClass15E r0 = this.A04;
        if (r0 != null) {
            r0.A1u(r2);
        }
        AnonymousClass15E r02 = this.A00;
        if (r02 != null) {
            r02.A1u(r2);
        }
        AnonymousClass15E r03 = this.A01;
        if (r03 != null) {
            r03.A1u(r2);
        }
        AnonymousClass15E r04 = this.A06;
        if (r04 != null) {
            r04.A1u(r2);
        }
        AnonymousClass15E r05 = this.A02;
        if (r05 != null) {
            r05.A1u(r2);
        }
        AnonymousClass15E r06 = this.A05;
        if (r06 != null) {
            r06.A1u(r2);
        }
    }

    @Override // X.AnonymousClass15E
    public Map A8n() {
        AnonymousClass15E r0 = this.A03;
        return r0 == null ? Collections.emptyMap() : r0.A8n();
    }

    @Override // X.AnonymousClass15E
    public Uri A9a() {
        AnonymousClass15E r0 = this.A03;
        if (r0 == null) {
            return null;
        }
        return r0.A9a();
    }

    @Override // X.AnonymousClass15E
    public long ALs(AnonymousClass15G r6) {
        AnonymousClass15E r0;
        boolean z = false;
        if (this.A03 == null) {
            z = true;
        }
        C002001d.A3A(z);
        Uri uri = r6.A05;
        String scheme = uri.getScheme();
        String scheme2 = uri.getScheme();
        if (TextUtils.isEmpty(scheme2) || "file".equals(scheme2)) {
            if (uri.getPath().startsWith("/android_asset/")) {
                if (this.A00 == null) {
                    C455325f r02 = new C455325f(this.A07);
                    this.A00 = r02;
                    A00(r02);
                }
                r0 = this.A00;
                this.A03 = r0;
            } else {
                if (this.A04 == null) {
                    C455825k r03 = new C455825k();
                    this.A04 = r03;
                    A00(r03);
                }
                r0 = this.A04;
                this.A03 = r0;
            }
        } else if ("asset".equals(scheme)) {
            if (this.A00 == null) {
                C455325f r04 = new C455325f(this.A07);
                this.A00 = r04;
                A00(r04);
            }
            r0 = this.A00;
            this.A03 = r0;
        } else if ("content".equals(scheme)) {
            if (this.A01 == null) {
                C455425g r05 = new C455425g(this.A07);
                this.A01 = r05;
                A00(r05);
            }
            r0 = this.A01;
            this.A03 = r0;
        } else if ("rtmp".equals(scheme)) {
            r0 = this.A06;
            if (r0 == null) {
                try {
                    AnonymousClass15E r06 = (AnonymousClass15E) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                    this.A06 = r06;
                    A00(r06);
                } catch (ClassNotFoundException unused) {
                    Log.w("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating RTMP extension", e);
                }
                r0 = this.A06;
                if (r0 == null) {
                    r0 = this.A08;
                    this.A06 = r0;
                }
            }
            this.A03 = r0;
        } else if ("data".equals(scheme)) {
            if (this.A02 == null) {
                C455525h r07 = new C455525h();
                this.A02 = r07;
                A00(r07);
            }
            r0 = this.A02;
            this.A03 = r0;
        } else if ("rawresource".equals(scheme)) {
            if (this.A05 == null) {
                C455925l r08 = new C455925l(this.A07);
                this.A05 = r08;
                A00(r08);
            }
            r0 = this.A05;
            this.A03 = r0;
        } else {
            r0 = this.A08;
            this.A03 = r0;
        }
        return r0.ALs(r6);
    }

    @Override // X.AnonymousClass15E
    public void close() {
        AnonymousClass15E r0 = this.A03;
        if (r0 != null) {
            try {
                r0.close();
            } finally {
                this.A03 = null;
            }
        }
    }

    @Override // X.AnonymousClass15E
    public int read(byte[] bArr, int i, int i2) {
        AnonymousClass15E r0 = this.A03;
        if (r0 != null) {
            return r0.read(bArr, i, i2);
        }
        throw null;
    }
}
