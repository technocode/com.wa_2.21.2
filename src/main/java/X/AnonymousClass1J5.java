package X;

import android.widget.CompoundButton;
import com.whatsapp.SettingsChat;

/* renamed from: X.1J5  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1J5 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ SettingsChat A00;

    public /* synthetic */ AnonymousClass1J5(SettingsChat settingsChat) {
        this.A00 = settingsChat;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        AnonymousClass008.A0n(((ActivityC004702f) this.A00).A0J, "notify_new_message_for_archived_chats", z);
    }
}
