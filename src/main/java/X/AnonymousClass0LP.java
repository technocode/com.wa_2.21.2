package X;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.IntentFilter;
import android.util.TypedValue;
import com.google.android.gms.common.SupportErrorDialogFragment;

/* renamed from: X.0LP  reason: invalid class name */
public class AnonymousClass0LP extends AnonymousClass0LQ {
    public static final AnonymousClass0LP A00 = new AnonymousClass0LP();
    public static final Object A01 = new Object();

    public static Dialog A00(Context context, int i, AnonymousClass0LR r6, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog.Builder builder;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        } else {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(AnonymousClass0LS.A02(context, i));
        builder.setOnCancelListener(onCancelListener);
        String A012 = AnonymousClass0LS.A01(context, i);
        if (A012 != null) {
            builder.setPositiveButton(A012, r6);
        }
        String A03 = AnonymousClass0LS.A03(context, i);
        if (A03 != null) {
            builder.setTitle(A03);
        }
        return builder.create();
    }

    public static final AnonymousClass0LU A01(Context context, AnonymousClass0LT r4) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        AnonymousClass0LU r1 = new AnonymousClass0LU(r4);
        context.registerReceiver(r1, intentFilter);
        r1.A00 = context;
        if (AnonymousClass0LV.A02(context)) {
            return r1;
        }
        r4.A00();
        r1.A00();
        return null;
    }

    public static void A02(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        if (activity instanceof ActivityC004902h) {
            AnonymousClass0LW A04 = ((ActivityC004902h) activity).A04();
            SupportErrorDialogFragment supportErrorDialogFragment = new SupportErrorDialogFragment();
            C001801b.A1R(dialog, "Cannot display null dialog");
            dialog.setOnCancelListener(null);
            dialog.setOnDismissListener(null);
            supportErrorDialogFragment.A00 = dialog;
            supportErrorDialogFragment.A01 = onCancelListener;
            supportErrorDialogFragment.A0u(A04, str);
            return;
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        AnonymousClass0LY r1 = new AnonymousClass0LY();
        C001801b.A1R(dialog, "Cannot display null dialog");
        dialog.setOnCancelListener(null);
        dialog.setOnDismissListener(null);
        r1.A00 = dialog;
        r1.A01 = onCancelListener;
        r1.show(fragmentManager, str);
    }

    public Dialog A03(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return A00(activity, i, new AnonymousClass0LZ(super.A01(activity, i, "d"), activity, i2), onCancelListener);
    }

    public final void A04(Activity activity, AbstractC04610La r4, int i, DialogInterface.OnCancelListener onCancelListener) {
        Dialog A002 = A00(activity, i, new C04620Lb(super.A01(activity, i, "d"), r4), onCancelListener);
        if (A002 != null) {
            A02(activity, A002, "GooglePlayServicesErrorDialog", onCancelListener);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ff, code lost:
        if (r11 == 3) goto L_0x0101;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(android.content.Context r10, int r11, android.app.PendingIntent r12) {
        /*
        // Method dump skipped, instructions count: 286
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0LP.A05(android.content.Context, int, android.app.PendingIntent):void");
    }
}
