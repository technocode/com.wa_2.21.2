package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.2AX  reason: invalid class name */
public class AnonymousClass2AX extends AnonymousClass07C {
    public float A00 = 0.0f;
    public float A01 = 0.0f;
    public float A02 = 0.0f;
    public float A03 = 0.0f;
    public int A04 = 0;
    public AnonymousClass277 A05;
    public C009405x A06;
    public C009405x A07;
    public EnumC25431Gy A08 = EnumC25431Gy.NONE;
    public EnumC25441Gz A09 = EnumC25441Gz.PAGER;
    public AbstractC009505y A0A;
    public AbstractC009505y A0B;
    public AbstractC009505y A0C;
    public AbstractC009505y A0D;
    public Boolean A0E;
    public Boolean A0F;
    public Boolean A0G;
    public Float A0H;
    public Integer A0I;
    public String A0J;
    public boolean A0K;
    public boolean A0L;
    public final AnonymousClass11H A0M = new AnonymousClass11H();
    public final AnonymousClass1GX A0N = new AnonymousClass1GX();

    public final int A07() {
        String str = this.A0J;
        if (str == null || str.equals("column")) {
            return 1;
        }
        if (str.equals("row")) {
            return 0;
        }
        StringBuilder A0S = AnonymousClass008.A0S("Unknown direction: ");
        A0S.append(str);
        throw new IllegalArgumentException(A0S.toString());
    }

    public void A08(int i, boolean z) {
        if (AnonymousClass0N2.A1a()) {
            AnonymousClass1GX r1 = this.A0N;
            RecyclerView recyclerView = r1.A06;
            if (recyclerView == null) {
                r1.A00 = i;
                r1.A08 = z;
            } else if (z) {
                recyclerView.A0Y(i);
            } else {
                recyclerView.A0X(i);
            }
        } else {
            throw new RuntimeException("Cannot doScrollTo off the main thread!");
        }
    }
}
