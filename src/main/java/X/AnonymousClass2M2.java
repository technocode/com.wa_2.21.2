package X;

import android.view.View;

/* renamed from: X.2M2  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2M2 implements View.OnLongClickListener {
    public final /* synthetic */ AnonymousClass2MQ A00;

    public /* synthetic */ AnonymousClass2M2(AnonymousClass2MQ r1) {
        this.A00 = r1;
    }

    public final boolean onLongClick(View view) {
        AnonymousClass2MQ r2 = this.A00;
        int i = (r2.A04 - 1) % 4;
        r2.A04 = i;
        r2.A0A.setFontStyle(i);
        r2.A0A.setTextColor(r2.A03);
        r2.A08.setTypeface(r2.A0A.getTypeface());
        return true;
    }
}
