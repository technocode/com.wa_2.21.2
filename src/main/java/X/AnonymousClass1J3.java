package X;

import android.content.DialogInterface;
import com.whatsapp.SetStatus;

/* renamed from: X.1J3  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1J3 implements DialogInterface.OnClickListener {
    public final /* synthetic */ SetStatus A00;

    public /* synthetic */ AnonymousClass1J3(SetStatus setStatus) {
        this.A00 = setStatus;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        SetStatus setStatus = this.A00;
        C002001d.A2N(setStatus, 3);
        SetStatus.A0A.clear();
        setStatus.A0U();
        setStatus.A01.notifyDataSetChanged();
    }
}
