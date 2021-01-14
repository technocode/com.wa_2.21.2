package X;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1gt  reason: invalid class name and case insensitive filesystem */
public class C33511gt implements AnonymousClass0W0, AbstractC223811h {
    public int A00;
    public int A01;
    public long A02 = Long.MIN_VALUE;
    public AnonymousClass0W0 A03;
    public boolean A04;
    public final C07080Vv A05;
    public final AbstractC07100Vx A06;
    public final C33501gs A07;
    public final AbstractC224011k A08;
    public final AbstractC008905s A09;
    public final List A0A;

    public C33511gt(C07080Vv r3, AbstractC008905s r4, AbstractC224011k r5, C33501gs r6, AbstractC07100Vx r7) {
        this.A09 = r4;
        this.A06 = r7;
        this.A08 = r5;
        this.A05 = r3;
        this.A0A = new ArrayList();
        this.A04 = false;
        this.A07 = r6;
    }

    @Override // X.AnonymousClass0W0
    public AnonymousClass0W0 A5E(int i) {
        AnonymousClass0W0 r0 = this.A03;
        if (r0 != null) {
            return r0.A5E(i);
        }
        return (AnonymousClass0W0) this.A0A.get(i);
    }

    @Override // X.AnonymousClass0W0
    public int A5I() {
        AnonymousClass0W0 r0 = this.A03;
        if (r0 != null) {
            return r0.A5I();
        }
        return this.A0A.size();
    }

    @Override // X.AnonymousClass0W0
    public int A6f() {
        if (this.A04) {
            return this.A00;
        }
        return View.MeasureSpec.makeMeasureSpec((int) this.A08.getLayoutHeight(), 1073741824);
    }

    @Override // X.AnonymousClass0W0
    public Object A73() {
        AnonymousClass0W0 r0 = this.A03;
        if (r0 != null) {
            return r0.A73();
        }
        return this.A08;
    }

    @Override // X.AnonymousClass0W0
    public int A7r() {
        AnonymousClass0W0 r0 = this.A03;
        if (r0 != null) {
            return r0.A7r();
        }
        return AnonymousClass11E.A00(this.A08.getLayoutPadding(EnumC223711e.BOTTOM));
    }

    @Override // X.AnonymousClass0W0
    public int A7s() {
        AnonymousClass0W0 r0 = this.A03;
        if (r0 != null) {
            return r0.A7s();
        }
        return AnonymousClass11E.A00(this.A08.getLayoutPadding(EnumC223711e.LEFT));
    }

    @Override // X.AnonymousClass0W0
    public int A7t() {
        AnonymousClass0W0 r0 = this.A03;
        if (r0 != null) {
            return r0.A7t();
        }
        return AnonymousClass11E.A00(this.A08.getLayoutPadding(EnumC223711e.RIGHT));
    }

    @Override // X.AnonymousClass0W0
    public int A7u() {
        AnonymousClass0W0 r0 = this.A03;
        if (r0 != null) {
            return r0.A7u();
        }
        return AnonymousClass11E.A00(this.A08.getLayoutPadding(EnumC223711e.TOP));
    }

    @Override // X.AnonymousClass0W0
    public AbstractC07100Vx A8i() {
        AnonymousClass0W0 r0 = this.A03;
        if (r0 != null) {
            return r0.A8i();
        }
        return this.A06;
    }

    @Override // X.AnonymousClass0W0
    public int A9u() {
        if (this.A04) {
            return this.A01;
        }
        return View.MeasureSpec.makeMeasureSpec((int) this.A08.getLayoutWidth(), 1073741824);
    }

    @Override // X.AnonymousClass0W0
    public int A9y(int i) {
        AnonymousClass0W0 r0 = this.A03;
        if (r0 != null) {
            return r0.A9y(i);
        }
        return (int) this.A08.getChildAt(i).getLayoutX();
    }

    @Override // X.AnonymousClass0W0
    public int A9z(int i) {
        AnonymousClass0W0 r0 = this.A03;
        if (r0 != null) {
            return r0.A9z(i);
        }
        return (int) this.A08.getChildAt(i).getLayoutY();
    }

    @Override // X.AbstractC223811h
    public long AC8(AbstractC224011k r5, float f, EnumC223911i r7, float f2, EnumC223911i r9) {
        int A012 = AnonymousClass11E.A01(f, r7);
        int A013 = AnonymousClass11E.A01(f2, r9);
        C33501gs r0 = this.A07;
        AnonymousClass0W0 A002 = r0.A00.A00(this.A05, A012, A013);
        this.A03 = A002;
        long A0N = AnonymousClass0N2.A0N(A002.getWidth(), A002.getHeight());
        this.A02 = A0N;
        return A0N;
    }

    @Override // X.AnonymousClass0W0
    public int getHeight() {
        AnonymousClass0W0 r0 = this.A03;
        if (r0 == null) {
            return (int) this.A08.getLayoutHeight();
        }
        int height = r0.getHeight();
        AbstractC224011k r1 = this.A08;
        return height + AnonymousClass11E.A00(r1.getLayoutPadding(EnumC223711e.TOP)) + AnonymousClass11E.A00(r1.getLayoutPadding(EnumC223711e.BOTTOM));
    }

    @Override // X.AnonymousClass0W0
    public int getWidth() {
        AnonymousClass0W0 r0 = this.A03;
        if (r0 == null) {
            return (int) this.A08.getLayoutWidth();
        }
        int width = r0.getWidth();
        AbstractC224011k r1 = this.A08;
        return width + AnonymousClass11E.A00(r1.getLayoutPadding(EnumC223711e.LEFT)) + AnonymousClass11E.A00(r1.getLayoutPadding(EnumC223711e.RIGHT));
    }
}
