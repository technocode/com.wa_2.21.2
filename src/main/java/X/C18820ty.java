package X;

import java.util.List;

/* renamed from: X.0ty  reason: invalid class name and case insensitive filesystem */
public class C18820ty implements Cloneable {
    public long A00 = 0;
    public C18670tj A01;
    public C31901dz A02;
    public C18700tm A03;
    public C18700tm A04;
    public C18700tm A05;
    public EnumC18730tp A06;
    public EnumC18730tp A07;
    public EnumC18740tq A08;
    public EnumC18750tr A09;
    public EnumC18760ts A0A;
    public EnumC18770tt A0B;
    public EnumC18780tu A0C;
    public EnumC18790tv A0D;
    public EnumC18800tw A0E;
    public EnumC18810tx A0F;
    public AbstractC18860u2 A0G;
    public AbstractC18860u2 A0H;
    public AbstractC18860u2 A0I;
    public AbstractC18860u2 A0J;
    public AbstractC18860u2 A0K;
    public Boolean A0L;
    public Boolean A0M;
    public Boolean A0N;
    public Float A0O;
    public Float A0P;
    public Float A0Q;
    public Float A0R;
    public Float A0S;
    public Float A0T;
    public Float A0U;
    public Integer A0V;
    public String A0W;
    public String A0X;
    public String A0Y;
    public String A0Z;
    public String A0a;
    public List A0b;
    public C18700tm[] A0c;

    public static C18820ty A00() {
        EnumC18730tp r7 = EnumC18730tp.NonZero;
        C18820ty r5 = new C18820ty();
        r5.A00 = -1;
        C31901dz r6 = C31901dz.A01;
        r5.A0G = r6;
        r5.A07 = r7;
        Float valueOf = Float.valueOf(1.0f);
        r5.A0O = valueOf;
        r5.A0J = null;
        r5.A0T = valueOf;
        r5.A05 = new C18700tm(1.0f);
        r5.A09 = EnumC18750tr.Butt;
        r5.A0A = EnumC18760ts.Miter;
        r5.A0S = Float.valueOf(4.0f);
        r5.A0c = null;
        r5.A04 = new C18700tm(0.0f);
        r5.A0P = valueOf;
        r5.A02 = r6;
        r5.A0b = null;
        r5.A03 = new C18700tm(12.0f, EnumC18880u4.pt);
        r5.A0V = 400;
        r5.A08 = EnumC18740tq.Normal;
        r5.A0D = EnumC18790tv.None;
        r5.A0E = EnumC18800tw.LTR;
        r5.A0C = EnumC18780tu.Start;
        Boolean bool = Boolean.TRUE;
        r5.A0M = bool;
        r5.A01 = null;
        r5.A0Z = null;
        r5.A0Y = null;
        r5.A0X = null;
        r5.A0L = bool;
        r5.A0N = bool;
        r5.A0I = r6;
        r5.A0R = valueOf;
        r5.A0W = null;
        r5.A06 = r7;
        r5.A0a = null;
        r5.A0H = null;
        r5.A0Q = valueOf;
        r5.A0K = null;
        r5.A0U = valueOf;
        r5.A0F = EnumC18810tx.None;
        r5.A0B = EnumC18770tt.auto;
        return r5;
    }

    @Override // java.lang.Object
    public Object clone() {
        C18820ty r1 = (C18820ty) super.clone();
        C18700tm[] r0 = this.A0c;
        if (r0 != null) {
            r1.A0c = (C18700tm[]) r0.clone();
        }
        return r1;
    }
}
