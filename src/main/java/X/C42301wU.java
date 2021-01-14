package X;

import android.view.View;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.1wU  reason: invalid class name and case insensitive filesystem */
public final class C42301wU implements AnonymousClass1RQ {
    public int A00;
    public int A01;
    public List A02;
    public boolean A03;
    public final int A04;
    public final AnonymousClass1Rv A05;
    public final AbstractC27861Rw A06;
    public final AbstractC27871Rx A07;
    public final C48072Ku A08;
    public final WeakReference A09;

    @Override // X.AnonymousClass1RQ
    public int A4n() {
        return 1;
    }

    public C42301wU(C48072Ku r2, int i, AbstractC27871Rx r4, AnonymousClass1Rv r5, AbstractC27861Rw r6, int i2, int i3, ImageView imageView) {
        this.A08 = r2;
        this.A04 = i;
        this.A07 = r4;
        this.A05 = r5;
        this.A06 = r6;
        this.A01 = i2;
        this.A00 = i3;
        this.A09 = new WeakReference(imageView);
    }

    public boolean A00() {
        View view = (View) this.A09.get();
        if (view == null) {
            return !this.A03;
        }
        String str = (String) view.getTag(R.id.image_id);
        int intValue = ((Number) view.getTag(R.id.image_quality)).intValue();
        if (this.A03 || !str.equals(this.A08.A02)) {
            return false;
        }
        if (intValue == this.A04 || intValue == 1) {
            return true;
        }
        return false;
    }

    @Override // X.AnonymousClass1RQ
    public boolean A4C() {
        return this.A04 == 1;
    }

    @Override // X.AnonymousClass1RQ
    public int A7F() {
        return this.A00;
    }

    @Override // X.AnonymousClass1RQ
    public int A7H() {
        return this.A01;
    }

    @Override // X.AnonymousClass1RQ
    public Integer A7j() {
        return 5;
    }

    @Override // X.AnonymousClass1RQ
    public String A9c() {
        String str;
        return (this.A04 != 2 || (str = this.A08.A04) == null) ? this.A08.A03 : str;
    }

    @Override // X.AnonymousClass1RQ
    public String getId() {
        String str = this.A08.A02;
        int i = this.A04;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('_');
        if (i == 1) {
            i = 3;
        }
        sb.append(i);
        return sb.toString();
    }
}
