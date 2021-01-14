package X;

import android.widget.CompoundButton;
import com.whatsapp.conversationslist.ArchiveNotificationSettingActivity;

/* renamed from: X.2JJ  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2JJ implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ ArchiveNotificationSettingActivity A00;

    public /* synthetic */ AnonymousClass2JJ(ArchiveNotificationSettingActivity archiveNotificationSettingActivity) {
        this.A00 = archiveNotificationSettingActivity;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        AnonymousClass008.A0n(this.A00.A00, "notify_new_message_for_archived_chats", z);
    }
}
