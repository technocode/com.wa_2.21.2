package X;

import android.widget.CompoundButton;
import com.whatsapp.conversationslist.ArchiveNotificationSettingActivity;

/* renamed from: X.2JI  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2JI implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ ArchiveNotificationSettingActivity A00;

    public /* synthetic */ AnonymousClass2JI(ArchiveNotificationSettingActivity archiveNotificationSettingActivity) {
        this.A00 = archiveNotificationSettingActivity;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        AnonymousClass008.A0n(this.A00.A00, "auto_archive_inactive_chats", z);
    }
}
