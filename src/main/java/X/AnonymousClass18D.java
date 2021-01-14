package X;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.facebook.redex.ViewOnClickEmptyBase;
import com.whatsapp.biz.BusinessProfileFieldView;

/* renamed from: X.18D  reason: invalid class name */
public final /* synthetic */ class AnonymousClass18D extends ViewOnClickEmptyBase implements View.OnClickListener {
    public final /* synthetic */ Uri A00;
    public final /* synthetic */ C02780Dk A01;
    public final /* synthetic */ BusinessProfileFieldView A02;
    public final /* synthetic */ AnonymousClass00Y A03;
    public final /* synthetic */ boolean A04;

    public /* synthetic */ AnonymousClass18D(boolean z, AnonymousClass00Y r2, C02780Dk r3, BusinessProfileFieldView businessProfileFieldView, Uri uri) {
        this.A04 = z;
        this.A03 = r2;
        this.A01 = r3;
        this.A02 = businessProfileFieldView;
        this.A00 = uri;
    }

    public final void onClick(View view) {
        boolean z = this.A04;
        AnonymousClass00Y r6 = this.A03;
        C02780Dk r5 = this.A01;
        BusinessProfileFieldView businessProfileFieldView = this.A02;
        Uri uri = this.A00;
        AnonymousClass21P r2 = new AnonymousClass21P();
        int i = 2;
        r2.A00 = 2;
        if (!z) {
            i = 1;
        }
        r2.A01 = Integer.valueOf(i);
        r6.A0B(r2, null, false);
        r5.A05(businessProfileFieldView.getContext(), new Intent("android.intent.action.VIEW", uri));
    }
}
