package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.33M  reason: invalid class name */
public final class AnonymousClass33M {
    public long A00;
    public long A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public List A0I;
    public List A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;

    public AnonymousClass33N A00() {
        if (TextUtils.isEmpty(this.A0B)) {
            this.A0B = this.A04;
        }
        if (TextUtils.isEmpty(this.A0D)) {
            this.A0D = this.A06;
        }
        if (TextUtils.isEmpty(this.A0F)) {
            this.A0F = this.A07;
        }
        if (TextUtils.isEmpty(this.A02)) {
            this.A02 = this.A03;
        }
        if (!this.A0O) {
            AnonymousClass00E.A04(this.A0B, "sticker pack id cannot be null");
            AnonymousClass00E.A04(this.A0D, "sticker pack name cannot be null");
            AnonymousClass00E.A04(this.A0F, "sticker pack publisher cannot be null");
        }
        if (this.A0I == null) {
            this.A0I = new ArrayList();
        }
        if (this.A0J == null) {
            this.A0J = new ArrayList();
        }
        return new AnonymousClass33N(this);
    }
}
