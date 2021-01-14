package X;

import android.os.Bundle;
import com.whatsapp.group.GroupChatInfo;
import java.lang.ref.WeakReference;

/* renamed from: X.0eU  reason: invalid class name and case insensitive filesystem */
public class C10350eU extends AnonymousClass0JW {
    public final C04490Ko A00;
    public final AnonymousClass02U A01;
    public final WeakReference A02;

    public C10350eU(AbstractC004502c r2, C04490Ko r3, AnonymousClass02U r4) {
        this.A02 = new WeakReference(r2);
        this.A00 = r3;
        this.A01 = r4;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        Number number = (Number) obj;
        AbstractC004502c r5 = (AbstractC004502c) this.A02.get();
        if (r5 != null) {
            r5.AMi();
            AnonymousClass02U r0 = this.A01;
            int intValue = number.intValue();
            GroupChatInfo.ExitGroupDialogFragment exitGroupDialogFragment = new GroupChatInfo.ExitGroupDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putString("jid", r0.getRawString());
            bundle.putInt("unsent_count", intValue);
            exitGroupDialogFragment.A0N(bundle);
            r5.APl(exitGroupDialogFragment, null);
        }
    }
}
