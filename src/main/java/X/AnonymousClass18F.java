package X;

import android.app.Activity;
import android.content.DialogInterface;
import com.google.android.search.verification.client.R;
import java.util.Collection;

/* renamed from: X.18F  reason: invalid class name */
public final /* synthetic */ class AnonymousClass18F implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00 = 13;
    public final /* synthetic */ Activity A01;
    public final /* synthetic */ AnonymousClass1LP A02;
    public final /* synthetic */ AnonymousClass02M A03;
    public final /* synthetic */ C04360Kb A04;
    public final /* synthetic */ AnonymousClass01X A05;
    public final /* synthetic */ Collection A06;

    public /* synthetic */ AnonymousClass18F(Activity activity, C04360Kb r3, Collection collection, AnonymousClass02M r5, AnonymousClass01X r6, AnonymousClass1LP r7) {
        this.A01 = activity;
        this.A04 = r3;
        this.A06 = collection;
        this.A03 = r5;
        this.A05 = r6;
        this.A02 = r7;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Activity activity = this.A01;
        int i2 = this.A00;
        C04360Kb r0 = this.A04;
        Collection collection = this.A06;
        AnonymousClass02M r8 = this.A03;
        AnonymousClass01X r7 = this.A05;
        AnonymousClass1LP r6 = this.A02;
        C002001d.A2N(activity, i2);
        r0.A0S(collection, true);
        if (collection.size() == 1) {
            r8.A06(R.string.status_deleted, 0);
        } else {
            r8.A0C(r7.A0A(R.plurals.statuses_deleted, (long) collection.size(), Integer.valueOf(collection.size())), 0);
        }
        r6.AEr();
    }
}
