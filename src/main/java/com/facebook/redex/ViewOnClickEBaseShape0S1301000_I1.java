package com.facebook.redex;

import X.AbstractC02280Bj;
import X.AnonymousClass00Y;
import X.AnonymousClass1VD;
import X.AnonymousClass21G;
import X.AnonymousClass34B;
import X.AnonymousClass3RW;
import X.AnonymousClass3RX;
import X.C28051Sr;
import android.view.View;
import com.whatsapp.storage.StorageUsageGalleryActivity;

public class ViewOnClickEBaseShape0S1301000_I1 extends ViewOnClickEmptyBase implements View.OnClickListener {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public String A04;
    public final int A05;

    public ViewOnClickEBaseShape0S1301000_I1(Object obj, String str, int i, Object obj2, Object obj3, int i2) {
        this.A05 = i2;
        this.A01 = obj;
        this.A04 = str;
        this.A00 = i;
        this.A02 = obj2;
        this.A03 = obj3;
    }

    public final void onClick(View view) {
        switch (this.A05) {
            case 0:
                AnonymousClass3RW r6 = (AnonymousClass3RW) this.A01;
                String str = this.A04;
                int i = this.A00;
                AnonymousClass1VD r5 = (AnonymousClass1VD) this.A02;
                AnonymousClass00Y r4 = r6.A07;
                AnonymousClass21G r2 = new AnonymousClass21G();
                C28051Sr.A1b(r2, 3, str, i);
                r4.A0B(r2, null, false);
                ((AbstractC02280Bj) this.A03).A07(StorageUsageGalleryActivity.A04(r6.A0H.getContext(), 0, r5.A01(), r5.A00.A0G, str, i));
                return;
            case 1:
                AnonymousClass3RX r62 = (AnonymousClass3RX) this.A01;
                String str2 = this.A04;
                int i2 = this.A00;
                AnonymousClass00Y r3 = r62.A06;
                AnonymousClass21G r22 = new AnonymousClass21G();
                C28051Sr.A1b(r22, 4, str2, i2);
                r3.A0B(r22, null, false);
                ((AbstractC02280Bj) this.A03).A07(StorageUsageGalleryActivity.A04(r62.A0H.getContext(), 2, null, ((AnonymousClass34B) this.A02).A01, str2, i2));
                return;
            case 2:
                AnonymousClass3RX r63 = (AnonymousClass3RX) this.A01;
                String str3 = this.A04;
                int i3 = this.A00;
                AnonymousClass00Y r32 = r63.A06;
                AnonymousClass21G r23 = new AnonymousClass21G();
                C28051Sr.A1b(r23, 5, str3, i3);
                r32.A0B(r23, null, false);
                ((AbstractC02280Bj) this.A03).A07(StorageUsageGalleryActivity.A04(r63.A0H.getContext(), 1, null, ((AnonymousClass34B) this.A02).A01, str3, i3));
                return;
            default:
                return;
        }
    }
}
