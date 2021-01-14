package X;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.google.android.search.verification.client.R;

/* renamed from: X.2Ix  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2Ix implements DialogInterface.OnClickListener {
    public final /* synthetic */ C52002aQ A00;

    public /* synthetic */ AnonymousClass2Ix(C52002aQ r1) {
        this.A00 = r1;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C52002aQ r4 = this.A00;
        ActivityC004802g r3 = r4.A02;
        C002001d.A2N(r3, r4.A0I.A09);
        try {
            r3.startActivity(new Intent("android.intent.action.DIAL", Uri.parse(AnonymousClass008.A0K("tel:", C12420i4.A00(r4.A0M.A02(r4.A0P))))));
        } catch (ActivityNotFoundException unused) {
            r4.A08.A06(R.string.activity_not_found, 0);
        }
    }
}
