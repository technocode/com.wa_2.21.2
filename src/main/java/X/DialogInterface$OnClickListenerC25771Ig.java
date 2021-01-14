package X;

import android.content.DialogInterface;
import android.widget.CheckBox;
import com.whatsapp.MuteDialogFragment;
import java.util.List;

/* renamed from: X.1Ig  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC25771Ig implements DialogInterface.OnClickListener {
    public final /* synthetic */ CheckBox A00;
    public final /* synthetic */ MuteDialogFragment A01;
    public final /* synthetic */ AnonymousClass02N A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ int[] A05;

    public /* synthetic */ DialogInterface$OnClickListenerC25771Ig(MuteDialogFragment muteDialogFragment, CheckBox checkBox, int[] iArr, boolean z, List list, AnonymousClass02N r6) {
        this.A01 = muteDialogFragment;
        this.A00 = checkBox;
        this.A05 = iArr;
        this.A04 = z;
        this.A03 = list;
        this.A02 = r6;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        int[] iArr;
        long A012;
        MuteDialogFragment muteDialogFragment = this.A01;
        CheckBox checkBox = this.A00;
        int[] iArr2 = this.A05;
        boolean z = this.A04;
        List list = this.A03;
        AnonymousClass02N r13 = this.A02;
        boolean isChecked = checkBox.isChecked();
        int i2 = iArr2[0];
        if (muteDialogFragment.A01.A0D(AbstractC000400g.A1j)) {
            iArr = C667435r.A05;
        } else {
            iArr = C667435r.A04;
        }
        int i3 = iArr[i2];
        AnonymousClass00S r1 = muteDialogFragment.A05;
        if (i3 == -1) {
            A012 = -1;
        } else {
            A012 = (((long) i3) * 60000) + r1.A01();
        }
        AnonymousClass00D r0 = muteDialogFragment.A06;
        r0.A00.edit().putInt("last_mute_selection", iArr2[0]).putBoolean("last_mute_show_notifications", isChecked).apply();
        muteDialogFragment.A0A.ANF(new RunnableC25761If(muteDialogFragment, z, list, A012, isChecked, r13));
    }
}
