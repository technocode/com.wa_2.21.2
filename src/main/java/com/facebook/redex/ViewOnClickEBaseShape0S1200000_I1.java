package com.facebook.redex;

import X.ActivityC004702f;
import android.view.View;
import android.widget.RadioButton;
import com.whatsapp.SuspiciousLinkWarningDialogFragment;
import com.whatsapp.backup.google.GoogleDriveNewUserSetupActivity;
import java.util.Set;

public class ViewOnClickEBaseShape0S1200000_I1 extends ViewOnClickEmptyBase implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public String A02;
    public final int A03;

    public ViewOnClickEBaseShape0S1200000_I1(Object obj, String str, Object obj2, int i) {
        this.A03 = i;
        this.A00 = obj;
        this.A02 = str;
        this.A01 = obj2;
    }

    public final void onClick(View view) {
        switch (this.A03) {
            case 0:
                ((GoogleDriveNewUserSetupActivity) this.A00).A0g(this.A02, (RadioButton) this.A01);
                return;
            case 1:
                ((ActivityC004702f) ((View) this.A00).getContext()).APm(SuspiciousLinkWarningDialogFragment.A00(this.A02, (Set) this.A01));
                return;
            default:
                return;
        }
    }
}
