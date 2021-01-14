package X;

import android.view.View;
import com.facebook.redex.ViewOnClickEmptyBase;
import com.whatsapp.authentication.AppAuthSettingsActivity;

/* renamed from: X.1Pp  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1Pp extends ViewOnClickEmptyBase implements View.OnClickListener {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AppAuthSettingsActivity A01;

    public /* synthetic */ AnonymousClass1Pp(AppAuthSettingsActivity appAuthSettingsActivity, long j) {
        this.A01 = appAuthSettingsActivity;
        this.A00 = j;
    }

    public final void onClick(View view) {
        this.A01.A0U(this.A00);
    }
}
