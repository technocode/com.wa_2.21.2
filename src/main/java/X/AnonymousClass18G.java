package X;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import com.whatsapp.BlockList;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.18G  reason: invalid class name */
public final /* synthetic */ class AnonymousClass18G implements DialogInterface.OnClickListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ AnonymousClass0GG A01;
    public final /* synthetic */ List A02;

    public /* synthetic */ AnonymousClass18G(List list, AnonymousClass0GG r2, Activity activity) {
        this.A02 = list;
        this.A01 = r2;
        this.A00 = activity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        List list = this.A02;
        AnonymousClass0GG r3 = this.A01;
        Activity activity = this.A00;
        if (list.size() == 1) {
            Object obj = list.get(0);
            if (obj != null) {
                r3.A07(activity, null, (UserJid) obj);
                return;
            }
            throw null;
        }
        activity.startActivity(new Intent(activity, BlockList.class));
    }
}
