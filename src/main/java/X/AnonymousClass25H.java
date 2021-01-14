package X;

import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: X.25H  reason: invalid class name */
public class AnonymousClass25H extends AbstractC07100Vx {
    public static AnonymousClass11B A07 = new C33521gu();
    public static AnonymousClass11B A08 = new C33531gv();
    public static AnonymousClass11B A09 = new C33541gw();
    public static AnonymousClass11B A0A = new C33551gx();
    public int A00 = -1;
    public int A01 = 0;
    public long A02;
    public Drawable A03;
    public Drawable A04;
    public View.OnClickListener A05;
    public boolean A06 = true;

    public AnonymousClass25H(long j) {
        super(AnonymousClass11D.VIEW);
        this.A02 = j;
        AnonymousClass11C[] r2 = {new AnonymousClass11C(this, A07), new AnonymousClass11C(this, A08), new AnonymousClass11C(this, A0A), new AnonymousClass11C(this, A09)};
        for (int i = 0; i < 4; i++) {
            A07(r2[i]);
        }
    }
}
