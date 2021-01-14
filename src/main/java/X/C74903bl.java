package X;

import android.content.Context;
import com.google.android.search.verification.client.R;
import java.util.List;

/* renamed from: X.3bl  reason: invalid class name and case insensitive filesystem */
public class C74903bl extends AnonymousClass3Za {
    public C74903bl(Context context, AnonymousClass00S r3, AnonymousClass01I r4, C02590Cr r5, C09610dF r6, AnonymousClass01A r7, AnonymousClass03P r8, C014308b r9, AnonymousClass01X r10, AnonymousClass31y r11, C09030cB r12, AnonymousClass022 r13) {
        super(context, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13);
        setId(R.id.gif_row);
    }

    @Override // X.AnonymousClass3OP
    public void A04(AbstractC007503q r2, List list) {
        AnonymousClass0M3 r22 = (AnonymousClass0M3) r2;
        super.A04(r22, list);
        ((AnonymousClass3Za) this).A00.setMessage(r22);
    }

    @Override // X.AnonymousClass3Za
    public String getDefaultMessageText() {
        return this.A0C.A03;
    }

    @Override // X.AnonymousClass3Za
    public int getDrawableRes() {
        return R.drawable.msg_status_gif;
    }

    @Override // X.AnonymousClass3Za
    public int getIconSizeIncrease() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.search_gif_icon_label_size_increase);
    }
}
