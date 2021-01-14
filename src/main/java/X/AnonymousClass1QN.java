package X;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import com.whatsapp.util.Log;

/* renamed from: X.1QN  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1QN implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Activity A02;

    public /* synthetic */ AnonymousClass1QN(int i, Activity activity, int i2) {
        this.A00 = i;
        this.A02 = activity;
        this.A01 = i2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        PendingIntent pendingIntent;
        int i2 = this.A00;
        Activity activity = this.A02;
        int i3 = this.A01;
        try {
            AnonymousClass0LQ r1 = AnonymousClass0LQ.A00;
            if (!(r1 instanceof AnonymousClass0LP)) {
                pendingIntent = null;
                Intent A012 = r1.A01(activity, i2, null);
                if (A012 != null) {
                    pendingIntent = PendingIntent.getActivity(activity, i3, A012, 134217728);
                }
            } else {
                pendingIntent = null;
                Intent A013 = r1.A01(activity, i2, null);
                if (A013 != null) {
                    pendingIntent = PendingIntent.getActivity(activity, i3, A013, 134217728);
                }
            }
            if (pendingIntent != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("gdrive-util/get-error-dialog starting resolution for ");
                sb.append(AnonymousClass0JJ.A04(i2));
                Log.e(sb.toString());
                C34661ix r12 = new C34661ix(i2, pendingIntent);
                if (r12.A01()) {
                    activity.startIntentSenderForResult(r12.A02.getIntentSender(), i3, null, 0, 0, 0);
                    return;
                }
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("gdrive-util/get-error-dialog pending intent is null for error code: ");
            sb2.append(AnonymousClass0JJ.A04(i2));
            Log.e(sb2.toString());
        } catch (IntentSender.SendIntentException e) {
            Log.e("gdrive-util/get-error-dialog", e);
        }
    }
}
