package com.whatsapp.gallery;

import X.AbstractC16300pa;
import X.AbstractC39901sI;
import X.AbstractC43421yL;
import X.AbstractC48922Oh;
import X.ActivityC004902h;
import X.AnonymousClass00T;
import X.AnonymousClass019;
import X.AnonymousClass01K;
import X.AnonymousClass01X;
import X.AnonymousClass02N;
import X.AnonymousClass03S;
import X.AnonymousClass0AC;
import X.AnonymousClass0Q7;
import X.C002101e;
import X.C08680bX;
import X.C10500ej;
import X.C10510ek;
import X.C53702dh;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaFragment;
import java.util.ArrayList;

public abstract class GalleryFragmentBase extends WaFragment implements AbstractC48922Oh {
    public int A00 = -1;
    public View A01;
    public RecyclerView A02;
    public AbstractC39901sI A03;
    public C08680bX A04 = new C08680bX();
    public C10510ek A05;
    public C10500ej A06;
    public AnonymousClass02N A07;
    public String A08 = "";
    public final AnonymousClass03S A09 = AnonymousClass03S.A00();
    public final AnonymousClass01X A0A = AnonymousClass01X.A00();
    public final AnonymousClass01K A0B = AnonymousClass01K.A00();
    public final AnonymousClass019 A0C = new C53702dh(this);
    public final AnonymousClass0AC A0D = AnonymousClass0AC.A00;
    public final AnonymousClass00T A0E = C002101e.A00();
    public final String A0F;
    public final ArrayList A0G = new ArrayList();

    public GalleryFragmentBase(String str) {
        this.A0F = str;
    }

    @Override // X.AnonymousClass037
    public View A0Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.gallery_fragment, viewGroup, false);
    }

    @Override // X.AnonymousClass037
    public void A0b(Bundle bundle) {
        this.A0U = true;
        ActivityC004902h A0A2 = A0A();
        if (A0A2 != null) {
            AnonymousClass02N A012 = AnonymousClass02N.A01(A0A2.getIntent().getStringExtra("jid"));
            if (A012 != null) {
                this.A07 = A012;
                View view = super.A0A;
                if (view != null) {
                    this.A01 = view.findViewById(16908292);
                    RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.grid);
                    this.A02 = recyclerView;
                    AnonymousClass0Q7.A0h(recyclerView, true);
                    AnonymousClass0Q7.A0h(super.A0A.findViewById(16908292), true);
                    ActivityC004902h A0A3 = A0A();
                    if (A0A3 instanceof MediaGalleryActivity) {
                        this.A02.A0l(((MediaGalleryActivity) A0A3).A0D);
                    }
                    this.A0D.A01(this.A0C);
                    View view2 = super.A0A;
                    if (view2 != null) {
                        view2.findViewById(R.id.progress_bar).setVisibility(0);
                    }
                    A0p();
                    return;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.AnonymousClass037
    public void A0c() {
        this.A0U = true;
        this.A0D.A00(this.A0C);
        Cursor A082 = this.A03.A08(null);
        if (A082 != null) {
            A082.close();
        }
        C10500ej r0 = this.A06;
        if (r0 != null) {
            r0.A04();
            this.A06 = null;
        }
        C10510ek r02 = this.A05;
        if (r02 != null) {
            r02.A04();
            this.A05 = null;
        }
    }

    @Override // X.AnonymousClass037
    public void A0e() {
        this.A0U = true;
        A0q();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00bc, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0156, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x015a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01cb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01cf, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0232, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0236, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.database.Cursor A0n(X.AnonymousClass02N r15, X.C08680bX r16, X.C04080Iy r17) {
        /*
        // Method dump skipped, instructions count: 567
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallery.GalleryFragmentBase.A0n(X.02N, X.0bX, X.0Iy):android.database.Cursor");
    }

    public AbstractC43421yL A0o() {
        AbstractC43421yL r0 = (AbstractC43421yL) A0A();
        if (r0 != null) {
            return r0;
        }
        throw null;
    }

    public final void A0p() {
        C10510ek r0 = this.A05;
        if (r0 != null) {
            r0.A04();
        }
        C10500ej r02 = this.A06;
        if (r02 != null) {
            r02.A04();
        }
        C10510ek r2 = new C10510ek(this, this.A07, this.A04);
        this.A05 = r2;
        this.A0E.ANC(r2, new Void[0]);
    }

    public final void A0q() {
        if (this.A00 == -1) {
            return;
        }
        if (!this.A09.A06() || this.A00 <= 0) {
            this.A01.setVisibility(0);
            this.A02.setVisibility(8);
            return;
        }
        this.A01.setVisibility(8);
        this.A02.setVisibility(0);
    }

    @Override // X.AbstractC48922Oh
    public void AJp(C08680bX r3) {
        if (!TextUtils.equals(this.A08, r3.A02())) {
            this.A08 = r3.A02();
            this.A04 = r3;
            A0p();
        }
    }

    @Override // X.AbstractC48922Oh
    public void AJv() {
        ((AbstractC16300pa) this.A03).A01.A00();
    }
}
