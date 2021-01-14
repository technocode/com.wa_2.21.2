package X;

import android.content.Context;
import android.preference.ListPreference;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.SettingsJidNotificationActivity;

/* renamed from: X.1Nb  reason: invalid class name and case insensitive filesystem */
public class C26891Nb extends ListPreference {
    public final /* synthetic */ int A00;
    public final /* synthetic */ SettingsJidNotificationActivity A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26891Nb(SettingsJidNotificationActivity settingsJidNotificationActivity, Context context, int i) {
        super(context);
        this.A01 = settingsJidNotificationActivity;
        this.A00 = i;
    }

    public void onBindView(View view) {
        super.onBindView(view);
        int i = this.A00;
        ((TextView) view.findViewById(16908310)).setTextColor(i);
        ((TextView) view.findViewById(16908304)).setTextColor(i);
    }

    public void onClick() {
        C002001d.A2O(this.A01, 0);
    }
}
