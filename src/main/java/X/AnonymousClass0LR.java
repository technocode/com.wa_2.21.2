package X;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;

/* renamed from: X.0LR  reason: invalid class name */
public abstract class AnonymousClass0LR implements DialogInterface.OnClickListener {
    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            if (!(this instanceof C04620Lb)) {
                AnonymousClass0LZ r3 = (AnonymousClass0LZ) this;
                Intent intent = r3.A02;
                if (intent != null) {
                    r3.A01.startActivityForResult(intent, r3.A00);
                }
            } else {
                C04620Lb r32 = (C04620Lb) this;
                Intent intent2 = r32.A01;
                if (intent2 != null) {
                    r32.A02.startActivityForResult(intent2, r32.A00);
                }
            }
        } catch (ActivityNotFoundException e) {
            Log.e("DialogRedirect", "Failed to start resolution intent", e);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
