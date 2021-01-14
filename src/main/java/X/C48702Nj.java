package X;

import android.widget.RadioGroup;
import com.whatsapp.ephemeral.ChangeEphemeralSettingActivity;

/* renamed from: X.2Nj  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C48702Nj implements RadioGroup.OnCheckedChangeListener {
    public final /* synthetic */ ChangeEphemeralSettingActivity A00;

    public /* synthetic */ C48702Nj(ChangeEphemeralSettingActivity changeEphemeralSettingActivity) {
        this.A00 = changeEphemeralSettingActivity;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        this.A00.A01 = ((Number) AnonymousClass0Q7.A0D(radioGroup, i).getTag()).intValue();
    }
}
