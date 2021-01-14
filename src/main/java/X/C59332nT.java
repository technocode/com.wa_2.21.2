package X;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.SettingsPrivacy;

/* renamed from: X.2nT  reason: invalid class name and case insensitive filesystem */
public class C59332nT extends AbstractC39391rQ {
    public final /* synthetic */ ActivityC004802g A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59332nT(Context context, ActivityC004802g r3) {
        super(context, R.color.link_color);
        this.A00 = r3;
    }

    @Override // X.AbstractC05700Ps
    public void onClick(View view) {
        ActivityC004802g r3 = this.A00;
        Intent intent = new Intent(r3.getApplicationContext(), SettingsPrivacy.class);
        intent.putExtra("target_setting", "privacy_groupadd");
        r3.startActivity(intent);
    }
}
